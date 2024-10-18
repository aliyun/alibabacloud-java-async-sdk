// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    private java.util.List < Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartPage")
    private Long startPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

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
    public java.util.List < Sources> getSources() {
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
    public java.util.Map < String, ? > getTags() {
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
        private java.util.List < Sources> sources; 
        private Long startPage; 
        private java.util.Map < String, ? > tags; 
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
         * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
         * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The end page of the conversion. The default value is -1, which converts the file until the last page of the file.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the source is a spreadsheet file, you need to specify the SheetIndex parameter.</p>
         * </li>
         * <li><p>If the number of pages is large, we recommend that you convert only part of the file at a time. Otherwise, the conversion task may time out.</p>
         * </li>
         * <li><p>This parameter takes effect only when you convert the file into an image. It does not take effect when you convert the file into a PDF or TXT file.</p>
         * </li>
         * </ul>
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
         * FirstPage.
         */
        public Builder firstPage(Boolean firstPage) {
            this.putQueryParameter("FirstPage", firstPage);
            this.firstPage = firstPage;
            return this;
        }

        /**
         * <p>Specifies whether to convert all rows of a table document to one single image or a single-page PDF document when you convert the table document to an image or a PDF document. Valid values:</p>
         * <ul>
         * <li>false: converts the document to multiple images or a multi-page PDF document. This is the default value.</li>
         * <li>true: converts the document to one single image or a single-page PDF document.</li>
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
         * <p>Specifies whether to convert all columns of a table document to one single image or a single-page PDF document when you convert the table document to an image or a PDF document. Valid values:</p>
         * <ul>
         * <li>false: converts the document to multiple images or a multi-page PDF document. This is the default value.</li>
         * <li>true: converts the document to one single image or a single-page PDF document.</li>
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
         * HoldLineFeed.
         */
        public Builder holdLineFeed(Boolean holdLineFeed) {
            this.putQueryParameter("HoldLineFeed", holdLineFeed);
            this.holdLineFeed = holdLineFeed;
            return this;
        }

        /**
         * ImageDPI.
         */
        public Builder imageDPI(Long imageDPI) {
            this.putQueryParameter("ImageDPI", imageDPI);
            this.imageDPI = imageDPI;
            return this;
        }

        /**
         * LongPicture.
         */
        public Builder longPicture(Boolean longPicture) {
            this.putQueryParameter("LongPicture", longPicture);
            this.longPicture = longPicture;
            return this;
        }

        /**
         * LongText.
         */
        public Builder longText(Boolean longText) {
            this.putQueryParameter("LongText", longText);
            this.longText = longText;
            return this;
        }

        /**
         * MaxSheetColumn.
         */
        public Builder maxSheetColumn(Long maxSheetColumn) {
            this.putQueryParameter("MaxSheetColumn", maxSheetColumn);
            this.maxSheetColumn = maxSheetColumn;
            return this;
        }

        /**
         * MaxSheetRow.
         */
        public Builder maxSheetRow(Long maxSheetRow) {
            this.putQueryParameter("MaxSheetRow", maxSheetRow);
            this.maxSheetRow = maxSheetRow;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * Pages.
         */
        public Builder pages(String pages) {
            this.putQueryParameter("Pages", pages);
            this.pages = pages;
            return this;
        }

        /**
         * PaperHorizontal.
         */
        public Builder paperHorizontal(Boolean paperHorizontal) {
            this.putQueryParameter("PaperHorizontal", paperHorizontal);
            this.paperHorizontal = paperHorizontal;
            return this;
        }

        /**
         * PaperSize.
         */
        public Builder paperSize(String paperSize) {
            this.putQueryParameter("PaperSize", paperSize);
            this.paperSize = paperSize;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Quality.
         */
        public Builder quality(Long quality) {
            this.putQueryParameter("Quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * ScalePercentage.
         */
        public Builder scalePercentage(Long scalePercentage) {
            this.putQueryParameter("ScalePercentage", scalePercentage);
            this.scalePercentage = scalePercentage;
            return this;
        }

        /**
         * SheetCount.
         */
        public Builder sheetCount(Long sheetCount) {
            this.putQueryParameter("SheetCount", sheetCount);
            this.sheetCount = sheetCount;
            return this;
        }

        /**
         * SheetIndex.
         */
        public Builder sheetIndex(Long sheetIndex) {
            this.putQueryParameter("SheetIndex", sheetIndex);
            this.sheetIndex = sheetIndex;
            return this;
        }

        /**
         * ShowComments.
         */
        public Builder showComments(Boolean showComments) {
            this.putQueryParameter("ShowComments", showComments);
            this.showComments = showComments;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * SourceURI.
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * Sources.
         */
        public Builder sources(java.util.List < Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putBodyParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The start page of document conversion. Default value: 1.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the document is a table file, specify the page number of the worksheet.</p>
         * </li>
         * <li><p>This parameter takes effect only when you convert the document into an image. It does not take effect when you convert the document into a PDF or TXT file.</p>
         * </li>
         * </ul>
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
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
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
         * <p>The URI of the output file.</p>
         * <p>Specify the URI in the <code>oss://{bucket}/{tags.custom}/{dirname}/{barename}.{autoext}</code> format. For more information, see <a href="https://help.aliyun.com/document_detail/465762.html">TargetURI template</a>.</p>
         * <blockquote>
         * <p> TargetURI and TargetURIPrefix cannot be empty at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://{bucket}/{tags.custom}/{dirname}/{barename}.{autoext}</p>
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * <p>The URI prefix of the output file.</p>
         * <p>Specify the prefix in the <code>oss://${Bucket}/${Prefix}/</code> format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Prefix}</code> is the URI prefix of the output file.</p>
         * <blockquote>
         * <p> TargetURI and TargetURIPrefix cannot be empty at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1/</p>
         */
        public Builder targetURIPrefix(String targetURIPrefix) {
            this.putQueryParameter("TargetURIPrefix", targetURIPrefix);
            this.targetURIPrefix = targetURIPrefix;
            return this;
        }

        /**
         * TrimPolicy.
         */
        public Builder trimPolicy(TrimPolicy trimPolicy) {
            String trimPolicyShrink = shrink(trimPolicy, "TrimPolicy", "json");
            this.putQueryParameter("TrimPolicy", trimPolicyShrink);
            this.trimPolicy = trimPolicy;
            return this;
        }

        /**
         * UserData.
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
        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Sources(Builder builder) {
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String URI; 

            /**
             * URI.
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
