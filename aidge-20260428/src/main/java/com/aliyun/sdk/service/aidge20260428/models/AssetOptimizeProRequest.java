// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link AssetOptimizeProRequest} extends {@link RequestModel}
 *
 * <p>AssetOptimizeProRequest</p>
 */
public class AssetOptimizeProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnNameList")
    private java.util.List<String> columnNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Glossary")
    private String glossary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludingProductArea")
    private Boolean includingProductArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanguageModel")
    private String languageModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedTrans")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean needTrans;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    private String targetLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Double threshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranslatingBrandInTheProduct")
    private Boolean translatingBrandInTheProduct;

    private AssetOptimizeProRequest(Builder builder) {
        super(builder);
        this.columnNameList = builder.columnNameList;
        this.glossary = builder.glossary;
        this.includingProductArea = builder.includingProductArea;
        this.languageModel = builder.languageModel;
        this.needTrans = builder.needTrans;
        this.productUrl = builder.productUrl;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourcePlatform = builder.sourcePlatform;
        this.targetLanguage = builder.targetLanguage;
        this.targetPlatform = builder.targetPlatform;
        this.threshold = builder.threshold;
        this.translatingBrandInTheProduct = builder.translatingBrandInTheProduct;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssetOptimizeProRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnNameList
     */
    public java.util.List<String> getColumnNameList() {
        return this.columnNameList;
    }

    /**
     * @return glossary
     */
    public String getGlossary() {
        return this.glossary;
    }

    /**
     * @return includingProductArea
     */
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
    }

    /**
     * @return languageModel
     */
    public String getLanguageModel() {
        return this.languageModel;
    }

    /**
     * @return needTrans
     */
    public Boolean getNeedTrans() {
        return this.needTrans;
    }

    /**
     * @return productUrl
     */
    public String getProductUrl() {
        return this.productUrl;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return sourcePlatform
     */
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return targetPlatform
     */
    public String getTargetPlatform() {
        return this.targetPlatform;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * @return translatingBrandInTheProduct
     */
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    public static final class Builder extends Request.Builder<AssetOptimizeProRequest, Builder> {
        private java.util.List<String> columnNameList; 
        private String glossary; 
        private Boolean includingProductArea; 
        private String languageModel; 
        private Boolean needTrans; 
        private String productUrl; 
        private String sourceLanguage; 
        private String sourcePlatform; 
        private String targetLanguage; 
        private String targetPlatform; 
        private Double threshold; 
        private Boolean translatingBrandInTheProduct; 

        private Builder() {
            super();
        } 

        private Builder(AssetOptimizeProRequest request) {
            super(request);
            this.columnNameList = request.columnNameList;
            this.glossary = request.glossary;
            this.includingProductArea = request.includingProductArea;
            this.languageModel = request.languageModel;
            this.needTrans = request.needTrans;
            this.productUrl = request.productUrl;
            this.sourceLanguage = request.sourceLanguage;
            this.sourcePlatform = request.sourcePlatform;
            this.targetLanguage = request.targetLanguage;
            this.targetPlatform = request.targetPlatform;
            this.threshold = request.threshold;
            this.translatingBrandInTheProduct = request.translatingBrandInTheProduct;
        } 

        /**
         * <p>The list of column names to recognize in size chart images. Optional.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Bust&quot;,&quot;Waist&quot;,&quot;Hip&quot;]</p>
         */
        public Builder columnNameList(java.util.List<String> columnNameList) {
            String columnNameListShrink = shrink(columnNameList, "ColumnNameList", "json");
            this.putQueryParameter("ColumnNameList", columnNameListShrink);
            this.columnNameList = columnNameList;
            return this;
        }

        /**
         * <p>The glossary ID. Optional. Create a glossary in the console and provide its ID. If left empty, translation results are not modified by any glossary.</p>
         * 
         * <strong>example:</strong>
         * <p>glossary_1</p>
         */
        public Builder glossary(String glossary) {
            this.putQueryParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * <p>Specifies whether to translate text on the product subject area of images. Setting this to false helps protect embedded information such as product names from being translated. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includingProductArea(Boolean includingProductArea) {
            this.putQueryParameter("IncludingProductArea", includingProductArea);
            this.includingProductArea = includingProductArea;
            return this;
        }

        /**
         * <p>The output language format for size chart images. If not specified, the original format is used. Set to en for English output or cn for Chinese output.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder languageModel(String languageModel) {
            this.putQueryParameter("LanguageModel", languageModel);
            this.languageModel = languageModel;
            return this;
        }

        /**
         * <p>Specifies whether translation is required (true/false). If set to true, SourceLanguage and TargetLanguage are required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needTrans(Boolean needTrans) {
            this.putQueryParameter("NeedTrans", needTrans);
            this.needTrans = needTrans;
            return this;
        }

        /**
         * <p>The product URL. This parameter is required. Only 1688 product links are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://detail.1688.com/offer/771024907536.html">https://detail.1688.com/offer/771024907536.html</a></p>
         */
        public Builder productUrl(String productUrl) {
            this.putQueryParameter("ProductUrl", productUrl);
            this.productUrl = productUrl;
            return this;
        }

        /**
         * <p>The source language code. Optional. For supported language pairs, refer to the supported translation language list. This parameter is required if NeedTrans is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The source platform. Only 1688 is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1688</p>
         */
        public Builder sourcePlatform(String sourcePlatform) {
            this.putQueryParameter("SourcePlatform", sourcePlatform);
            this.sourcePlatform = sourcePlatform;
            return this;
        }

        /**
         * <p>The target language code. Optional. For supported language pairs, refer to the supported translation language list. This parameter is required if NeedTrans is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putQueryParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>The target listing platform. Only temu is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>temu</p>
         */
        public Builder targetPlatform(String targetPlatform) {
            this.putQueryParameter("TargetPlatform", targetPlatform);
            this.targetPlatform = targetPlatform;
            return this;
        }

        /**
         * <p>The confidence threshold for size chart detection. Default value: 0.4. A value of 0 treats all images as size charts. A value of 1 treats no images as size charts.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        public Builder threshold(Double threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>Specifies whether to translate brand names on images. Optional. Default value: false. Setting this to false helps protect brand name information from being translated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder translatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
            this.putQueryParameter("TranslatingBrandInTheProduct", translatingBrandInTheProduct);
            this.translatingBrandInTheProduct = translatingBrandInTheProduct;
            return this;
        }

        @Override
        public AssetOptimizeProRequest build() {
            return new AssetOptimizeProRequest(this);
        } 

    } 

}
