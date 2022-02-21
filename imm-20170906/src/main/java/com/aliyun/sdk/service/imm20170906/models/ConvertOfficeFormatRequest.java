// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertOfficeFormatRequest} extends {@link RequestModel}
 *
 * <p>ConvertOfficeFormatRequest</p>
 */
public class ConvertOfficeFormatRequest extends Request {
    @Query
    @NameInMap("EndPage")
    private Long endPage;

    @Query
    @NameInMap("FitToPagesTall")
    private Boolean fitToPagesTall;

    @Query
    @NameInMap("FitToPagesWide")
    private Boolean fitToPagesWide;

    @Query
    @NameInMap("Hidecomments")
    private Boolean hidecomments;

    @Query
    @NameInMap("MaxSheetCol")
    private Long maxSheetCol;

    @Query
    @NameInMap("MaxSheetCount")
    private Long maxSheetCount;

    @Query
    @NameInMap("MaxSheetRow")
    private Long maxSheetRow;

    @Query
    @NameInMap("ModelId")
    private String modelId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("PdfVector")
    private Boolean pdfVector;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SheetOnePage")
    private Boolean sheetOnePage;

    @Query
    @NameInMap("SrcType")
    private String srcType;

    @Query
    @NameInMap("SrcUri")
    @Validation(required = true)
    private String srcUri;

    @Query
    @NameInMap("StartPage")
    private Long startPage;

    @Query
    @NameInMap("TgtFilePages")
    private String tgtFilePages;

    @Query
    @NameInMap("TgtFilePrefix")
    private String tgtFilePrefix;

    @Query
    @NameInMap("TgtFileSuffix")
    private String tgtFileSuffix;

    @Query
    @NameInMap("TgtType")
    private String tgtType;

    @Query
    @NameInMap("TgtUri")
    @Validation(required = true)
    private String tgtUri;

    private ConvertOfficeFormatRequest(Builder builder) {
        super(builder);
        this.endPage = builder.endPage;
        this.fitToPagesTall = builder.fitToPagesTall;
        this.fitToPagesWide = builder.fitToPagesWide;
        this.hidecomments = builder.hidecomments;
        this.maxSheetCol = builder.maxSheetCol;
        this.maxSheetCount = builder.maxSheetCount;
        this.maxSheetRow = builder.maxSheetRow;
        this.modelId = builder.modelId;
        this.password = builder.password;
        this.pdfVector = builder.pdfVector;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.sheetOnePage = builder.sheetOnePage;
        this.srcType = builder.srcType;
        this.srcUri = builder.srcUri;
        this.startPage = builder.startPage;
        this.tgtFilePages = builder.tgtFilePages;
        this.tgtFilePrefix = builder.tgtFilePrefix;
        this.tgtFileSuffix = builder.tgtFileSuffix;
        this.tgtType = builder.tgtType;
        this.tgtUri = builder.tgtUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertOfficeFormatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endPage
     */
    public Long getEndPage() {
        return this.endPage;
    }

    /**
     * @return fitToPagesTall
     */
    public Boolean getFitToPagesTall() {
        return this.fitToPagesTall;
    }

    /**
     * @return fitToPagesWide
     */
    public Boolean getFitToPagesWide() {
        return this.fitToPagesWide;
    }

    /**
     * @return hidecomments
     */
    public Boolean getHidecomments() {
        return this.hidecomments;
    }

    /**
     * @return maxSheetCol
     */
    public Long getMaxSheetCol() {
        return this.maxSheetCol;
    }

    /**
     * @return maxSheetCount
     */
    public Long getMaxSheetCount() {
        return this.maxSheetCount;
    }

    /**
     * @return maxSheetRow
     */
    public Long getMaxSheetRow() {
        return this.maxSheetRow;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return pdfVector
     */
    public Boolean getPdfVector() {
        return this.pdfVector;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sheetOnePage
     */
    public Boolean getSheetOnePage() {
        return this.sheetOnePage;
    }

    /**
     * @return srcType
     */
    public String getSrcType() {
        return this.srcType;
    }

    /**
     * @return srcUri
     */
    public String getSrcUri() {
        return this.srcUri;
    }

    /**
     * @return startPage
     */
    public Long getStartPage() {
        return this.startPage;
    }

    /**
     * @return tgtFilePages
     */
    public String getTgtFilePages() {
        return this.tgtFilePages;
    }

    /**
     * @return tgtFilePrefix
     */
    public String getTgtFilePrefix() {
        return this.tgtFilePrefix;
    }

    /**
     * @return tgtFileSuffix
     */
    public String getTgtFileSuffix() {
        return this.tgtFileSuffix;
    }

    /**
     * @return tgtType
     */
    public String getTgtType() {
        return this.tgtType;
    }

    /**
     * @return tgtUri
     */
    public String getTgtUri() {
        return this.tgtUri;
    }

    public static final class Builder extends Request.Builder<ConvertOfficeFormatRequest, Builder> {
        private Long endPage; 
        private Boolean fitToPagesTall; 
        private Boolean fitToPagesWide; 
        private Boolean hidecomments; 
        private Long maxSheetCol; 
        private Long maxSheetCount; 
        private Long maxSheetRow; 
        private String modelId; 
        private String password; 
        private Boolean pdfVector; 
        private String project; 
        private String regionId; 
        private Boolean sheetOnePage; 
        private String srcType; 
        private String srcUri; 
        private Long startPage; 
        private String tgtFilePages; 
        private String tgtFilePrefix; 
        private String tgtFileSuffix; 
        private String tgtType; 
        private String tgtUri; 

        private Builder() {
            super();
        } 

        private Builder(ConvertOfficeFormatRequest response) {
            super(response);
            this.endPage = response.endPage;
            this.fitToPagesTall = response.fitToPagesTall;
            this.fitToPagesWide = response.fitToPagesWide;
            this.hidecomments = response.hidecomments;
            this.maxSheetCol = response.maxSheetCol;
            this.maxSheetCount = response.maxSheetCount;
            this.maxSheetRow = response.maxSheetRow;
            this.modelId = response.modelId;
            this.password = response.password;
            this.pdfVector = response.pdfVector;
            this.project = response.project;
            this.regionId = response.regionId;
            this.sheetOnePage = response.sheetOnePage;
            this.srcType = response.srcType;
            this.srcUri = response.srcUri;
            this.startPage = response.startPage;
            this.tgtFilePages = response.tgtFilePages;
            this.tgtFilePrefix = response.tgtFilePrefix;
            this.tgtFileSuffix = response.tgtFileSuffix;
            this.tgtType = response.tgtType;
            this.tgtUri = response.tgtUri;
        } 

        /**
         * EndPage.
         */
        public Builder endPage(Long endPage) {
            this.putQueryParameter("EndPage", endPage);
            this.endPage = endPage;
            return this;
        }

        /**
         * FitToPagesTall.
         */
        public Builder fitToPagesTall(Boolean fitToPagesTall) {
            this.putQueryParameter("FitToPagesTall", fitToPagesTall);
            this.fitToPagesTall = fitToPagesTall;
            return this;
        }

        /**
         * FitToPagesWide.
         */
        public Builder fitToPagesWide(Boolean fitToPagesWide) {
            this.putQueryParameter("FitToPagesWide", fitToPagesWide);
            this.fitToPagesWide = fitToPagesWide;
            return this;
        }

        /**
         * Hidecomments.
         */
        public Builder hidecomments(Boolean hidecomments) {
            this.putQueryParameter("Hidecomments", hidecomments);
            this.hidecomments = hidecomments;
            return this;
        }

        /**
         * MaxSheetCol.
         */
        public Builder maxSheetCol(Long maxSheetCol) {
            this.putQueryParameter("MaxSheetCol", maxSheetCol);
            this.maxSheetCol = maxSheetCol;
            return this;
        }

        /**
         * MaxSheetCount.
         */
        public Builder maxSheetCount(Long maxSheetCount) {
            this.putQueryParameter("MaxSheetCount", maxSheetCount);
            this.maxSheetCount = maxSheetCount;
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
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
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
         * PdfVector.
         */
        public Builder pdfVector(Boolean pdfVector) {
            this.putQueryParameter("PdfVector", pdfVector);
            this.pdfVector = pdfVector;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
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
         * SheetOnePage.
         */
        public Builder sheetOnePage(Boolean sheetOnePage) {
            this.putQueryParameter("SheetOnePage", sheetOnePage);
            this.sheetOnePage = sheetOnePage;
            return this;
        }

        /**
         * SrcType.
         */
        public Builder srcType(String srcType) {
            this.putQueryParameter("SrcType", srcType);
            this.srcType = srcType;
            return this;
        }

        /**
         * SrcUri.
         */
        public Builder srcUri(String srcUri) {
            this.putQueryParameter("SrcUri", srcUri);
            this.srcUri = srcUri;
            return this;
        }

        /**
         * StartPage.
         */
        public Builder startPage(Long startPage) {
            this.putQueryParameter("StartPage", startPage);
            this.startPage = startPage;
            return this;
        }

        /**
         * TgtFilePages.
         */
        public Builder tgtFilePages(String tgtFilePages) {
            this.putQueryParameter("TgtFilePages", tgtFilePages);
            this.tgtFilePages = tgtFilePages;
            return this;
        }

        /**
         * TgtFilePrefix.
         */
        public Builder tgtFilePrefix(String tgtFilePrefix) {
            this.putQueryParameter("TgtFilePrefix", tgtFilePrefix);
            this.tgtFilePrefix = tgtFilePrefix;
            return this;
        }

        /**
         * TgtFileSuffix.
         */
        public Builder tgtFileSuffix(String tgtFileSuffix) {
            this.putQueryParameter("TgtFileSuffix", tgtFileSuffix);
            this.tgtFileSuffix = tgtFileSuffix;
            return this;
        }

        /**
         * TgtType.
         */
        public Builder tgtType(String tgtType) {
            this.putQueryParameter("TgtType", tgtType);
            this.tgtType = tgtType;
            return this;
        }

        /**
         * TgtUri.
         */
        public Builder tgtUri(String tgtUri) {
            this.putQueryParameter("TgtUri", tgtUri);
            this.tgtUri = tgtUri;
            return this;
        }

        @Override
        public ConvertOfficeFormatRequest build() {
            return new ConvertOfficeFormatRequest(this);
        } 

    } 

}
