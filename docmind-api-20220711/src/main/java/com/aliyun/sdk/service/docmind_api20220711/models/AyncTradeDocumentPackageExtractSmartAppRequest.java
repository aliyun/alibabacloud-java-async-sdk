// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AyncTradeDocumentPackageExtractSmartAppRequest} extends {@link RequestModel}
 *
 * <p>AyncTradeDocumentPackageExtractSmartAppRequest</p>
 */
public class AyncTradeDocumentPackageExtractSmartAppRequest extends Request {
    @Query
    @NameInMap("CustomExtractionRange")
    private java.util.List < String > customExtractionRange;

    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("FileUrl")
    @Validation(required = true)
    private String fileUrl;

    @Query
    @NameInMap("Option")
    private String option;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    private AyncTradeDocumentPackageExtractSmartAppRequest(Builder builder) {
        super(builder);
        this.customExtractionRange = builder.customExtractionRange;
        this.fileName = builder.fileName;
        this.fileUrl = builder.fileUrl;
        this.option = builder.option;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AyncTradeDocumentPackageExtractSmartAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customExtractionRange
     */
    public java.util.List < String > getCustomExtractionRange() {
        return this.customExtractionRange;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<AyncTradeDocumentPackageExtractSmartAppRequest, Builder> {
        private java.util.List < String > customExtractionRange; 
        private String fileName; 
        private String fileUrl; 
        private String option; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(AyncTradeDocumentPackageExtractSmartAppRequest request) {
            super(request);
            this.customExtractionRange = request.customExtractionRange;
            this.fileName = request.fileName;
            this.fileUrl = request.fileUrl;
            this.option = request.option;
            this.templateName = request.templateName;
        } 

        /**
         * CustomExtractionRange.
         */
        public Builder customExtractionRange(java.util.List < String > customExtractionRange) {
            String customExtractionRangeShrink = shrink(customExtractionRange, "CustomExtractionRange", "json");
            this.putQueryParameter("CustomExtractionRange", customExtractionRangeShrink);
            this.customExtractionRange = customExtractionRange;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * Option.
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public AyncTradeDocumentPackageExtractSmartAppRequest build() {
            return new AyncTradeDocumentPackageExtractSmartAppRequest(this);
        } 

    } 

}
