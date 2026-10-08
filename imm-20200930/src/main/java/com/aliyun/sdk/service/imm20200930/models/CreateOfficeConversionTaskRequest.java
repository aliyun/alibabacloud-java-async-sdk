// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOfficeConversionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOfficeConversionTaskRequest</p>
 */
public class CreateOfficeConversionTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndPage")
    private Long endPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstPage")
    private Boolean firstPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FitToHeight")
    private Boolean fitToHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FitToWidth")
    private Boolean fitToWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoldLineFeed")
    private Boolean holdLineFeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageDPI")
    private Long imageDPI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LongPicture")
    private Boolean longPicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LongText")
    private Boolean longText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSheetColumn")
    private Long maxSheetColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSheetRow")
    private Long maxSheetRow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pages")
    private String pages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaperHorizontal")
    private Boolean paperHorizontal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaperSize")
    private String paperSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quality")
    private Long quality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalePercentage")
    private Long scalePercentage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SheetCount")
    private Long sheetCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SheetIndex")
    private Long sheetIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowComments")
    private Boolean showComments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    private String sourceURI;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sources")
    private java.util.List<Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartPage")
    private Long startPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    private String targetURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURIPrefix")
    private String targetURIPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrimPolicy")
    private TrimPolicy trimPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateOfficeConversionTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.endPage = builder.endPage;
        this.firstPage = builder.firstPage;
        this.fitToHeight = builder.fitToHeight;
        this.fitToWidth = builder.fitToWidth;
        this.holdLineFeed = builder.holdLineFeed;
        this.imageDPI = builder.imageDPI;
        this.longPicture = builder.longPicture;
        this.longText = builder.longText;
        this.maxSheetColumn = builder.maxSheetColumn;
        this.maxSheetRow = builder.maxSheetRow;
        this.notification = builder.notification;
        this.pages = builder.pages;
        this.paperHorizontal = builder.paperHorizontal;
        this.paperSize = builder.paperSize;
        this.password = builder.password;
        this.projectName = builder.projectName;
        this.quality = builder.quality;
        this.scalePercentage = builder.scalePercentage;
        this.sheetCount = builder.sheetCount;
        this.sheetIndex = builder.sheetIndex;
        this.showComments = builder.showComments;
        this.sourceType = builder.sourceType;
        this.sourceURI = builder.sourceURI;
        this.sources = builder.sources;
        this.startPage = builder.startPage;
        this.tags = builder.tags;
        this.targetType = builder.targetType;
        this.targetURI = builder.targetURI;
        this.targetURIPrefix = builder.targetURIPrefix;
        this.trimPolicy = builder.trimPolicy;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOfficeConversionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return endPage
     */
    public Long getEndPage() {
        return this.endPage;
    }

    /**
     * @return firstPage
     */
    public Boolean getFirstPage() {
        return this.firstPage;
    }

    /**
     * @return fitToHeight
     */
    public Boolean getFitToHeight() {
        return this.fitToHeight;
    }

    /**
     * @return fitToWidth
     */
    public Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    /**
     * @return holdLineFeed
     */
    public Boolean getHoldLineFeed() {
        return this.holdLineFeed;
    }

    /**
     * @return imageDPI
     */
    public Long getImageDPI() {
        return this.imageDPI;
    }

    /**
     * @return longPicture
     */
    public Boolean getLongPicture() {
        return this.longPicture;
    }

    /**
     * @return longText
     */
    public Boolean getLongText() {
        return this.longText;
    }

    /**
     * @return maxSheetColumn
     */
    public Long getMaxSheetColumn() {
        return this.maxSheetColumn;
    }

    /**
     * @return maxSheetRow
     */
    public Long getMaxSheetRow() {
        return this.maxSheetRow;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return pages
     */
    public String getPages() {
        return this.pages;
    }

    /**
     * @return paperHorizontal
     */
    public Boolean getPaperHorizontal() {
        return this.paperHorizontal;
    }

    /**
     * @return paperSize
     */
    public String getPaperSize() {
        return this.paperSize;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return quality
     */
    public Long getQuality() {
        return this.quality;
    }

    /**
     * @return scalePercentage
     */
    public Long getScalePercentage() {
        return this.scalePercentage;
    }

    /**
     * @return sheetCount
     */
    public Long getSheetCount() {
        return this.sheetCount;
    }

    /**
     * @return sheetIndex
     */
    public Long getSheetIndex() {
        return this.sheetIndex;
    }

    /**
     * @return showComments
     */
    public Boolean getShowComments() {
        return this.showComments;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return sources
     */
    public java.util.List<Sources> getSources() {
        return this.sources;
    }

    /**
     * @return startPage
     */
    public Long getStartPage() {
        return this.startPage;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    /**
     * @return targetURIPrefix
     */
    public String getTargetURIPrefix() {
        return this.targetURIPrefix;
    }

    /**
     * @return trimPolicy
     */
    public TrimPolicy getTrimPolicy() {
        return this.trimPolicy;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateOfficeConversionTaskRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private Long endPage; 
        private Boolean firstPage; 
        private Boolean fitToHeight; 
        private Boolean fitToWidth; 
        private Boolean holdLineFeed; 
        private Long imageDPI; 
        private Boolean longPicture; 
        private Boolean longText; 
        private Long maxSheetColumn; 
        private Long maxSheetRow; 
        private Notification notification; 
        private String pages; 
        private Boolean paperHorizontal; 
        private String paperSize; 
        private String password; 
        private String projectName; 
        private Long quality; 
        private Long scalePercentage; 
        private Long sheetCount; 
        private Long sheetIndex; 
        private Boolean showComments; 
        private String sourceType; 
        private String sourceURI; 
        private java.util.List<Sources> sources; 
        private Long startPage; 
        private java.util.Map<String, ?> tags; 
        private String targetType; 
        private String targetURI; 
        private String targetURIPrefix; 
        private TrimPolicy trimPolicy; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateOfficeConversionTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.endPage = request.endPage;
            this.firstPage = request.firstPage;
            this.fitToHeight = request.fitToHeight;
            this.fitToWidth = request.fitToWidth;
            this.holdLineFeed = request.holdLineFeed;
            this.imageDPI = request.imageDPI;
            this.longPicture = request.longPicture;
            this.longText = request.longText;
            this.maxSheetColumn = request.maxSheetColumn;
            this.maxSheetRow = request.maxSheetRow;
            this.notification = request.notification;
            this.pages = request.pages;
            this.paperHorizontal = request.paperHorizontal;
            this.paperSize = request.paperSize;
            this.password = request.password;
            this.projectName = request.projectName;
            this.quality = request.quality;
            this.scalePercentage = request.scalePercentage;
            this.sheetCount = request.sheetCount;
            this.sheetIndex = request.sheetIndex;
            this.showComments = request.showComments;
            this.sourceType = request.sourceType;
            this.sourceURI = request.sourceURI;
            this.sources = request.sources;
            this.startPage = request.startPage;
            this.tags = request.tags;
            this.targetType = request.targetType;
            this.targetURI = request.targetURI;
            this.targetURIPrefix = request.targetURIPrefix;
            this.trimPolicy = request.trimPolicy;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
         * <p>The chained authorization configuration. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The end page for the document conversion. The default value is -1, which indicates that all pages from the start page to the last page are converted.</p>
         * <blockquote>
         * <ul>
         * <li><p>If the source file is a spreadsheet, you must specify the worksheet number (\<code>SheetIndex\\</code>).</p>
         * </li>
         * <li><p>If the document has many pages, we recommend that you convert them in batches. Otherwise, the conversion may time out.</p>
         * </li>
         * <li><p>This parameter takes effect only when you convert the document to images. It does not take effect when you convert the document to a PDF file or a text file.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder endPage(Long endPage) {
            this.putQueryParameter("EndPage", endPage);
            this.endPage = endPage;
            return this;
        }

        /**
         * <p>When you convert a spreadsheet document to images, specifies whether to return only the first image of the conversion result. The number of rows and columns in the image is the result of automatic splitting. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. All images are returned.</p>
         * </li>
         * <li><p>true: Yes. Only the first image is returned. This is used to extract a thumbnail.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only if you set the <strong>LongPicture</strong> parameter to <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder firstPage(Boolean firstPage) {
            this.putQueryParameter("FirstPage", firstPage);
            this.firstPage = firstPage;
            return this;
        }

        /**
         * <p>When you convert a spreadsheet document to images or a PDF file, specifies whether to render all rows on a single image or PDF page. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. The content is rendered on multiple images or PDF pages.</p>
         * </li>
         * <li><p>true: Yes. The content is rendered on a single image or PDF page.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fitToHeight(Boolean fitToHeight) {
            this.putQueryParameter("FitToHeight", fitToHeight);
            this.fitToHeight = fitToHeight;
            return this;
        }

        /**
         * <p>When you convert a spreadsheet document to images or a PDF file, specifies whether to render all columns on a single image or PDF page. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. The content is rendered on multiple images or PDF pages.</p>
         * </li>
         * <li><p>true: Yes. The content is rendered on a single image or PDF page.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fitToWidth(Boolean fitToWidth) {
            this.putQueryParameter("FitToWidth", fitToWidth);
            this.fitToWidth = fitToWidth;
            return this;
        }

        /**
         * <p>When you convert a document to text, specifies whether to keep the line feeds in the document. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. Line feeds are not kept.</p>
         * </li>
         * <li><p>true: Yes. Line feeds are kept.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder holdLineFeed(Boolean holdLineFeed) {
            this.putQueryParameter("HoldLineFeed", holdLineFeed);
            this.holdLineFeed = holdLineFeed;
            return this;
        }

        /**
         * <p>The DPI of the output image. Valid values: 96 to 600. The default value is 96.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder imageDPI(Long imageDPI) {
            this.putQueryParameter("ImageDPI", imageDPI);
            this.imageDPI = imageDPI;
            return this;
        }

        /**
         * <p>When you convert a document to images, specifies whether to convert it into a long image. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. The document is converted into multiple images.</p>
         * </li>
         * <li><p>true: Yes. The document is converted into a long image.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can combine a maximum of 20 pages into a long image. If the number of pages exceeds this limit, the conversion task may fail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder longPicture(Boolean longPicture) {
            this.putQueryParameter("LongPicture", longPicture);
            this.longPicture = longPicture;
            return this;
        }

        /**
         * <p>When you convert a document to text, specifies whether to convert it into a long text file. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. Each page of the document is converted into a separate text file.</p>
         * </li>
         * <li><p>true: Yes. All content is placed in a single text file.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder longText(Boolean longText) {
            this.putQueryParameter("LongText", longText);
            this.longText = longText;
            return this;
        }

        /**
         * <p>The maximum number of columns to convert when you convert a spreadsheet document to images. By default, all columns are converted.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you set <strong>LongPicture</strong> to <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxSheetColumn(Long maxSheetColumn) {
            this.putQueryParameter("MaxSheetColumn", maxSheetColumn);
            this.maxSheetColumn = maxSheetColumn;
            return this;
        }

        /**
         * <p>The maximum number of rows to convert when you convert a spreadsheet document to images. By default, all rows are converted.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you set <strong>LongPicture</strong> to <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxSheetRow(Long maxSheetRow) {
            this.putQueryParameter("MaxSheetRow", maxSheetRow);
            this.maxSheetRow = maxSheetRow;
            return this;
        }

        /**
         * <p>The message notification configuration. For more information, click Notification. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The page numbers to convert. This parameter has a higher priority than the \<code>StartPage\\</code> and \<code>EndPage\\</code> parameters. The format is as follows:</p>
         * <ul>
         * <li><p>Separate multiple page numbers with commas (,), for example, 1,2.</p>
         * </li>
         * <li><p>Specify a range of consecutive pages with a hyphen (-), for example, 1,2-4,7.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2-4,7</p>
         */
        public Builder pages(String pages) {
            this.putQueryParameter("Pages", pages);
            this.pages = pages;
            return this;
        }

        /**
         * <p>When you convert a spreadsheet document to images, specifies whether to place the paper horizontally. The output image is similar to a printed page. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. The paper is placed vertically.</p>
         * </li>
         * <li><p>true: Yes. The paper is placed horizontally.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder paperHorizontal(Boolean paperHorizontal) {
            this.putQueryParameter("PaperHorizontal", paperHorizontal);
            this.paperHorizontal = paperHorizontal;
            return this;
        }

        /**
         * <p>The paper size for converting a spreadsheet document to images. The output image is similar to a printed page. Valid values:</p>
         * <ul>
         * <li><p>A0</p>
         * </li>
         * <li><p>A2</p>
         * </li>
         * <li><p>A4 (default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when you use it with the <strong>FitToHeight</strong> and <strong>FitToWidth</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>A4</p>
         */
        public Builder paperSize(String paperSize) {
            this.putQueryParameter("PaperSize", paperSize);
            this.paperSize = paperSize;
            return this;
        }

        /**
         * <p>The password to open the document. Set this parameter if you want to convert a password-protected document.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The quality of the converted file. Valid values: 0 to 100. A value of 0 indicates the lowest quality and the best performance. A value of 100 indicates the highest quality and the poorest performance. By default, the system sets an appropriate value based on the document content to balance quality and performance.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder quality(Long quality) {
            this.putQueryParameter("Quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * <p>The scaling ratio of the document. Valid values: 20 to 199. The default value is 100, which indicates that the document is not scaled.</p>
         * <blockquote>
         * <p>A value less than 100 indicates that the document is scaled down. A value greater than 100 indicates that the document is scaled up.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder scalePercentage(Long scalePercentage) {
            this.putQueryParameter("ScalePercentage", scalePercentage);
            this.scalePercentage = scalePercentage;
            return this;
        }

        /**
         * <p>The number of worksheets to convert to images in the spreadsheet document. By default, all worksheets are converted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sheetCount(Long sheetCount) {
            this.putQueryParameter("SheetCount", sheetCount);
            this.sheetCount = sheetCount;
            return this;
        }

        /**
         * <p>The number of the worksheet to convert to images in the spreadsheet document. Valid values: 1 to the number of the last worksheet. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sheetIndex(Long sheetIndex) {
            this.putQueryParameter("SheetIndex", sheetIndex);
            this.sheetIndex = sheetIndex;
            return this;
        }

        /**
         * <p>When you convert a word processor document to images, specifies whether to show comments. Valid values:</p>
         * <ul>
         * <li><p>false (default): No. Comments are not shown.</p>
         * </li>
         * <li><p>true: Yes. Comments are shown.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showComments(Boolean showComments) {
            this.putQueryParameter("ShowComments", showComments);
            this.showComments = showComments;
            return this;
        }

        /**
         * <p>The extension type of the source data. By default, the type of the source data is determined by the extension of the OSS object. If the OSS object does not have an extension, you can set this parameter. Valid values:</p>
         * <ul>
         * <li><p>Word processor documents (Word): doc, docx, wps, wpss, docm, dotm, dot, and dotx</p>
         * </li>
         * <li><p>Presentation documents (PowerPoint): pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss</p>
         * </li>
         * <li><p>Spreadsheet documents (Excel): xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets</p>
         * </li>
         * <li><p>PDF documents: pdf</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>doc</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The storage address of the source data.</p>
         * <p>The OSS address must be in the oss\://${Bucket}/${Object} format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>A list of input images. The images are converted in the order of their URIs in the list. (<strong>This parameter is not yet published. Do not use it.</strong>)</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/test.pptx</p>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putBodyParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The start page for the document conversion. The default value is 1.</p>
         * <blockquote>
         * <ul>
         * <li><p>If the source file is a spreadsheet, you must specify the worksheet number.</p>
         * </li>
         * <li><p>This parameter takes effect only when you convert the document to images. It does not take effect when you convert the document to a PDF file or a text file.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder startPage(Long startPage) {
            this.putQueryParameter("StartPage", startPage);
            this.startPage = startPage;
            return this;
        }

        /**
         * <p>The custom tags. The value is a dictionary. You can use tags to search for tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key&quot;: &quot;value&quot;
         * }</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ul>
         * <li><p>png: Converts the document to PNG images.</p>
         * </li>
         * <li><p>jpg: Converts the document to JPG images.</p>
         * </li>
         * <li><p>pdf: Converts the document to a PDF file.</p>
         * </li>
         * <li><p>txt: Converts the document to a text-only file. This is mainly used to extract text content from the file. This option is supported only for presentation documents, word processor documents, and spreadsheet documents. When you convert a spreadsheet document, a single txt file is generated, and settings for sheet-related variables do not take effect.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>png</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The template for the output address of the converted document.</p>
         * <p>The address must be in the <code>oss://{bucket}/{tags.custom}/{dirname}/{barename}.{autoext}</code> format. For more information, see <a href="https://help.aliyun.com/document_detail/465762.html">TargetURI templates</a>.</p>
         * <blockquote>
         * <p>Specify either this parameter or \<code>TargetURIPrefix\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/outputDocument.pdf</p>
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * <p>The prefix of the storage address for the output file after document conversion.</p>
         * <p>The prefix must be in the <code>oss://${Bucket}/${Prefix}/</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Prefix}\\</code> is the prefix of the storage address for the output file.</p>
         * <blockquote>
         * <p>Specify either this parameter or \<code>TargetURI\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/outputprefix/</p>
         */
        public Builder targetURIPrefix(String targetURIPrefix) {
            this.putQueryParameter("TargetURIPrefix", targetURIPrefix);
            this.targetURIPrefix = targetURIPrefix;
            return this;
        }

        /**
         * <p>The trimming policy for spreadsheet conversion. For example, if a spreadsheet contains many empty rows and columns, a large amount of white space may be generated if no trimming policy is specified.</p>
         */
        public Builder trimPolicy(TrimPolicy trimPolicy) {
            String trimPolicyShrink = shrink(trimPolicy, "TrimPolicy", "json");
            this.putQueryParameter("TrimPolicy", trimPolicyShrink);
            this.trimPolicy = trimPolicy;
            return this;
        }

        /**
         * <p>The custom information. This information is returned in the asynchronous notification message to help you associate the notification with your services. The value can be up to 2,048 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;id&quot;: &quot;test-id&quot;,
         *       &quot;name&quot;: &quot;test-name&quot;
         * }</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateOfficeConversionTaskRequest build() {
            return new CreateOfficeConversionTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOfficeConversionTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOfficeConversionTaskRequest</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rotate")
        private Long rotate;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Sources(Builder builder) {
            this.rotate = builder.rotate;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return rotate
         */
        public Long getRotate() {
            return this.rotate;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private Long rotate; 
            private String URI; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.rotate = model.rotate;
                this.URI = model.URI;
            } 

            /**
             * <p>The rotation angle of the image. Valid values:</p>
             * <ul>
             * <li><p>0 (default)</p>
             * </li>
             * <li><p>90</p>
             * </li>
             * <li><p>180</p>
             * </li>
             * <li><p>270</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder rotate(Long rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * <p>The OSS address of the source image.</p>
             * <p>The OSS address must be in the oss\://${Bucket}/${Object} format. ${Bucket} is the name of the OSS bucket that is in the same region as the current project. ${Object} is the full path of the file, including the file name extension.</p>
             * <p>Supported image formats: jpg, jp2, png, tiff, webp, bmp, and svg.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://examplebucket/sampleobject.jpg</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
}
