
package org.deeplearning4j.ui.views.html.training

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object TrainingModel_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class TrainingModel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[org.deeplearning4j.ui.api.I18N,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i18n: org.deeplearning4j.ui.api.I18N):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <title>"""),_display_(/*7.17*/i18n/*7.21*/.getMessage("train.pagetitle")),format.raw/*7.51*/("""</title>
            <!-- start: Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- end: Mobile Specific -->

        <link id="bootstrap-style" href="/assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="/assets/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link id="base-style" href="/assets/css/style.css" rel="stylesheet">
        <link id="base-style-responsive" href="/assets/css/style-responsive.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="shortcut icon" href="/assets/img/favicon.ico">

            <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="/assets/css/ie.css" rel="stylesheet"/>
	<![endif]-->

            <!--[if IE 9]>
		<link id="ie9style" href="/assets/css/ie9.css" rel="stylesheet"/>
	<![endif]-->
    </head>

    <body>
            <!-- Start Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="index.html"><span>"""),_display_(/*40.63*/i18n/*40.67*/.getMessage("train.pagetitle")),format.raw/*40.97*/("""</span></a>
                </div>
            </div>
        </div>
            <!-- End Header -->

        <div class="container-fluid-full">
            <div class="row-fluid">

                    <!-- Start Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><a href="overview"><i class="icon-bar-chart"></i> <span class="hidden-tablet">"""),_display_(/*53.112*/i18n/*53.116*/.getMessage("train.nav.overview")),format.raw/*53.149*/("""</span></a></li>
                            <li class="active"><a href="javascript:void(0);"><i class="icon-tasks"></i> <span class="hidden-tablet">"""),_display_(/*54.134*/i18n/*54.138*/.getMessage("train.nav.model")),format.raw/*54.168*/("""</span></a></li>
                            <li><a href="system"><i class="icon-dashboard"></i> <span class="hidden-tablet">"""),_display_(/*55.110*/i18n/*55.114*/.getMessage("train.nav.system")),format.raw/*55.145*/("""</span></a></li>
                            <li><a href="help"><i class="icon-star"></i> <span class="hidden-tablet">"""),_display_(/*56.103*/i18n/*56.107*/.getMessage("train.nav.userguide")),format.raw/*56.141*/("""</span></a></li>
                            <li>
                                <a class="dropmenu" href="javascript:void(0);"><i class="icon-folder-close-alt"></i> <span class="hidden-tablet"> Language</span></a>
                                <ul>
                                    <li><a class="submenu" href="javascript:void(0);" onclick="languageSelect('en', 'model')"><i class="icon-file-alt"></i> <span class="hidden-tablet"> English</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);" onclick="languageSelect('ja', 'model')"><i class="icon-file-alt"></i> <span class="hidden-tablet"> 日本語</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);" onclick="languageSelect('zh', 'model')"><i class="icon-file-alt"></i> <span class="hidden-tablet"> 中文</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);" onclick="languageSelect('ko', 'model')"><i class="icon-file-alt"></i> <span class="hidden-tablet"> 한글</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);" onclick="languageSelect('ru', 'model')"><i class="icon-file-alt"></i> <span class="hidden-tablet"> русский</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);" onclick="languageSelect('uk', 'model')"><i class="icon-file-alt"></i> <span class="hidden-tablet"> український</span></a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                    <!-- End Main Menu -->

                <noscript>
                    <div class="alert alert-block span10">
                        <h4 class="alert-heading">Warning!</h4>
                        <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a>
                            enabled to use this site.</p>
                    </div>
                </noscript>

                <style>
                /* Graph */
                #layers """),format.raw/*83.25*/("""{"""),format.raw/*83.26*/("""
                    """),format.raw/*84.21*/("""height: 725px; /* IE8 */
                    height: 90vh;
                    width: 100%;
                    border: 2px solid #eee;
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""
                """),format.raw/*89.17*/("""</style>

                    <!-- Start Content -->
                <div id="content" class="span10">

                    <div class="row-fluid span6">
                        <div id="layers"></div>
                    </div>
                        <!-- Start Layer Details -->
                    <div class="row-fluid span6" id="layerDetails">

                        <div class="box">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*102.41*/i18n/*102.45*/.getMessage("train.model.layerInfoTable.title")),format.raw/*102.92*/("""</b></h2>
                            </div>
                            <div class="box-content">
                                <table class="table table-bordered table-striped table-condensed" id="layerInfo"></table>
                            </div>
                        </div>

                        <div class="box">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*111.41*/i18n/*111.45*/.getMessage("train.overview.chart.updateRatioTitle")),format.raw/*111.97*/(""": log<sub>10</sub></b></h2>
                                """),format.raw/*112.171*/("""
                                """),format.raw/*113.169*/("""
                                """),format.raw/*114.33*/("""<div style="float: right">
                                    <p class="stackControls center">
                                        <input class="btn btn-small" type="button" value=""""),_display_(/*116.92*/i18n/*116.96*/.getMessage("train.model.meanmag.btn.ratio")),format.raw/*116.140*/("""" onclick="setSelectMeanMagChart('ratios')">
                                        <input class="btn btn-small" type="button" value=""""),_display_(/*117.92*/i18n/*117.96*/.getMessage("train.model.meanmag.btn.param")),format.raw/*117.140*/("""" onclick="setSelectMeanMagChart('paramMM')">
                                        <input class="btn btn-small" type="button" value=""""),_display_(/*118.92*/i18n/*118.96*/.getMessage("train.model.meanmag.btn.update")),format.raw/*118.141*/("""" onclick="setSelectMeanMagChart('updateMM')">
                                    </p>
                                </div>
                            </div>
                            <div class="box-content">
                                <div id="meanmag" class="center" style="height: 300px;" ></div>
                                <p id="hoverdata"><span id="updateRatioTitleSmallLog10"><b>log<sub>10</sub> """),_display_(/*124.110*/i18n/*124.114*/.getMessage("train.overview.chart.updateRatioTitleShort")),format.raw/*124.171*/("""</b></span> <span id="yMeanMagnitudes">0</span>
                                    , <b>"""),_display_(/*125.43*/i18n/*125.47*/.getMessage("train.overview.charts.iteration")),format.raw/*125.93*/(""":</b> <span id="xMeanMagnitudes">0</span></p>
                            </div>
                        </div>

                        <div class="box">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*131.41*/i18n/*131.45*/.getMessage("train.model.activationsChart.title")),format.raw/*131.94*/("""</b></h2>
                            </div>
                            <div class="box-content">
                                <div id="activations" class="center" style="height: 300px;" ></div>
                                <p id="hoverdata"><b>"""),_display_(/*135.55*/i18n/*135.59*/.getMessage("train.model.activationsChart.titleShort")),format.raw/*135.113*/(""":</b> <span id="yActivations">0</span>
                                    , <b>"""),_display_(/*136.43*/i18n/*136.47*/.getMessage("train.overview.charts.iteration")),format.raw/*136.93*/(""":</b> <span id="xActivations">0</span></p>
                            </div>
                        </div>

                        <div class="box">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*142.41*/i18n/*142.45*/.getMessage("train.model.lrChart.title")),format.raw/*142.85*/("""</b></h2>
                            </div>
                            <div class="box-content">
                                <div id="learningrate" class="center" style="height: 300px;" ></div>
                                <p id="hoverdata"><b>"""),_display_(/*146.55*/i18n/*146.59*/.getMessage("train.model.lrChart.titleShort")),format.raw/*146.104*/(""":</b> <span id="yLearningRate">0</span>
                                    , <b>"""),_display_(/*147.43*/i18n/*147.47*/.getMessage("train.overview.charts.iteration")),format.raw/*147.93*/(""":</b> <span id="xLearningRate">0</span></p>
                            </div>
                        </div>

                        <div class="box">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*153.41*/i18n/*153.45*/.getMessage("train.model.paramHistChart.title")),format.raw/*153.92*/("""</b></h2>
                                <div id="paramhistSelected" style="float:left"></div>
                                <div id="paramHistButtonsDiv" style="float:right"></div>
                            </div>
                            <div class="box-content">
                                <div id="parametershistogram" class="center" style="height: 300px;"></div>
                            </div>
                        </div>

                        <div class="box">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*164.41*/i18n/*164.45*/.getMessage("train.model.updateHistChart.title")),format.raw/*164.93*/("""</b></h2>
                                <div id="updatehistSelected" style="float:left"></div>
                                <div id="updateHistButtonsDiv" style="float:right"></div>
                            </div>
                            <div class="box-content">
                                <div id="updateshistogram" class="center" style="height: 300px;"></div>
                            </div>
                        </div>

                    </div>
                    <!-- End Layer Details-->

                    <!-- Begin Zero State -->
                    <div class="row-fluid span6" id="zeroState">
                        <div class="box">
                            <div class="box-header">
                                <h2><b>Getting Started</b></h2>
                            </div>
                            <div class="box-content">
                                <div class="page-header">
                                    <h1>Layer Visualization UI</h1>
                                </div>
                                <div class="row-fluid">
                                    <div class="span12">
                                        <h2>Overview</h2>
                                        <p>
                                            The layer visualization UI renders network structure dynamically. Users can inspect node layer parameters by clicking on the various elements of the GUI to see general information as well as overall network information such as performance.
                                        </p>
                                        <h2>Actions</h2>
                                        <p>On the <b>left</b>, you will find an interactive layer visualization.</p>
                                        <p>
                                        <ul>
                                            <li><b>Clicking</b> - Click on a layer to load network performance metrics.</li>
                                            <li><b>Scrolling</b> - Drag the GUI with your mouse or touchpad to move the model around. </li>
                                        </ul>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- End Zero State-->
                </div>
                    <!-- End Content -->
            </div> <!-- End Container -->
        </div> <!-- End Row Fluid-->

        <!-- Start JavaScript-->
        <script src="/assets/js/jquery-1.9.1.min.js"></script>
        <script src="/assets/js/jquery-migrate-1.0.0.min.js"></script>
        <script src="/assets/js/jquery-ui-1.10.0.custom.min.js"></script>
        <script src="/assets/js/jquery.ui.touch-punch.js"></script>
        <script src="/assets/js/modernizr.js"></script>
        <script src="/assets/js/bootstrap.min.js"></script>
        <script src="/assets/js/jquery.cookie.js"></script>
        <script src="/assets/js/fullcalendar.min.js"></script>
        <script src="/assets/js/jquery.dataTables.min.js"></script>
        <script src="/assets/js/excanvas.js"></script>
        <script src="/assets/js/jquery.flot.js"></script>
        <script src="/assets/js/jquery.flot.pie.js"></script>
        <script src="/assets/js/jquery.flot.stack.js"></script>
        <script src="/assets/js/jquery.flot.resize.min.js"></script>
        <script src="/assets/js/jquery.chosen.min.js"></script>
        <script src="/assets/js/jquery.uniform.min.js"></script>
        <script src="/assets/js/jquery.cleditor.min.js"></script>
        <script src="/assets/js/jquery.noty.js"></script>
        <script src="/assets/js/jquery.elfinder.min.js"></script>
        <script src="/assets/js/jquery.raty.min.js"></script>
        <script src="/assets/js/jquery.iphone.toggle.js"></script>
        <script src="/assets/js/jquery.uploadify-3.1.min.js"></script>
        <script src="/assets/js/jquery.gritter.min.js"></script>
        <script src="/assets/js/jquery.imagesloaded.js"></script>
        <script src="/assets/js/jquery.masonry.min.js"></script>
        <script src="/assets/js/jquery.knob.modified.js"></script>
        <script src="/assets/js/jquery.sparkline.min.js"></script>
        <script src="/assets/js/counter.js"></script>
        <script src="/assets/js/retina.js"></script>
        <script src="/assets/js/custom.js"></script>
        <script src="/assets/js/cytoscape.min.js"></script>
        <script src="/assets/js/dagre.min.js"></script>
        <script src="/assets/js/cytoscape-dagre.js"></script>
        <script src="/assets/js/train/model.js"></script> <!-- Charts and tables are generated here! -->
        <script src="/assets/js/train/model-graph.js"></script> <!-- Layer graph generated here! -->
        <script src="/assets/js/train/train.js"></script> <!-- Common (lang selection, etc) -->

        <!-- Execute once on page load -->
        <script>
				$(document).ready(function () """),format.raw/*251.35*/("""{"""),format.raw/*251.36*/("""
                    """),format.raw/*252.21*/("""renderModelGraph();
                    renderModelPage();
                """),format.raw/*254.17*/("""}"""),format.raw/*254.18*/(""");
		</script>

            <!-- Execute periodically (every 2 sec) -->
        <script>
				setInterval(function () """),format.raw/*259.29*/("""{"""),format.raw/*259.30*/("""
                    """),format.raw/*260.21*/("""renderModelPage();
                """),format.raw/*261.17*/("""}"""),format.raw/*261.18*/(""", 2000);
		</script>
    </body>
</html>
"""))
      }
    }
  }

  def render(i18n:org.deeplearning4j.ui.api.I18N): play.twirl.api.HtmlFormat.Appendable = apply(i18n)

  def f:((org.deeplearning4j.ui.api.I18N) => play.twirl.api.HtmlFormat.Appendable) = (i18n) => apply(i18n)

  def ref: this.type = this

}


}

/**/
object TrainingModel extends TrainingModel_Scope0.TrainingModel
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 00:01:17 AEDT 2016
                  SOURCE: C:/DL4J/Git/deeplearning4j/deeplearning4j-ui-parent/deeplearning4j-play/src/main/views/org/deeplearning4j/ui/views/training/TrainingModel.scala.html
                  HASH: 1b00dbee2cd385cb49d00c609caff24c9b027d09
                  MATRIX: 598->1|731->39|759->41|882->138|894->142|944->172|2729->1930|2742->1934|2793->1964|3357->2500|3371->2504|3426->2537|3605->2688|3619->2692|3671->2722|3826->2849|3840->2853|3893->2884|4041->3004|4055->3008|4111->3042|6324->5227|6353->5228|6403->5250|6587->5406|6616->5407|6662->5425|7189->5924|7203->5928|7272->5975|7732->6407|7746->6411|7820->6463|7911->6662|7975->6832|8038->6866|8255->7055|8269->7059|8336->7103|8501->7240|8515->7244|8582->7288|8748->7426|8762->7430|8830->7475|9286->7902|9301->7906|9381->7963|9500->8054|9514->8058|9582->8104|9864->8358|9878->8362|9949->8411|10234->8668|10248->8672|10325->8726|10435->8808|10449->8812|10517->8858|10796->9109|10810->9113|10872->9153|11158->9411|11172->9415|11240->9460|11351->9543|11365->9547|11433->9593|11713->9845|11727->9849|11796->9896|12418->10490|12432->10494|12502->10542|17696->15707|17726->15708|17777->15730|17883->15807|17913->15808|18064->15930|18094->15931|18145->15953|18210->15989|18240->15990
                  LINES: 20->1|25->1|26->2|31->7|31->7|31->7|64->40|64->40|64->40|77->53|77->53|77->53|78->54|78->54|78->54|79->55|79->55|79->55|80->56|80->56|80->56|107->83|107->83|108->84|112->88|112->88|113->89|126->102|126->102|126->102|135->111|135->111|135->111|136->112|137->113|138->114|140->116|140->116|140->116|141->117|141->117|141->117|142->118|142->118|142->118|148->124|148->124|148->124|149->125|149->125|149->125|155->131|155->131|155->131|159->135|159->135|159->135|160->136|160->136|160->136|166->142|166->142|166->142|170->146|170->146|170->146|171->147|171->147|171->147|177->153|177->153|177->153|188->164|188->164|188->164|275->251|275->251|276->252|278->254|278->254|283->259|283->259|284->260|285->261|285->261
                  -- GENERATED --
              */
          