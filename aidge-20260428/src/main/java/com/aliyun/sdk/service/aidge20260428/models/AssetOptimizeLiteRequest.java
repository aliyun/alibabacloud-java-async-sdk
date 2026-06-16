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
 * {@link AssetOptimizeLiteRequest} extends {@link RequestModel}
 *
 * <p>AssetOptimizeLiteRequest</p>
 */
public class AssetOptimizeLiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Glossary")
    private String glossary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludingProductArea")
    private Boolean includingProductArea;

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
    @com.aliyun.core.annotation.NameInMap("TranslatingBrandInTheProduct")
    private Boolean translatingBrandInTheProduct;

    private AssetOptimizeLiteRequest(Builder builder) {
        super(builder);
        this.glossary = builder.glossary;
        this.includingProductArea = builder.includingProductArea;
        this.needTrans = builder.needTrans;
        this.productUrl = builder.productUrl;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourcePlatform = builder.sourcePlatform;
        this.targetLanguage = builder.targetLanguage;
        this.targetPlatform = builder.targetPlatform;
        this.translatingBrandInTheProduct = builder.translatingBrandInTheProduct;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssetOptimizeLiteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return translatingBrandInTheProduct
     */
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    public static final class Builder extends Request.Builder<AssetOptimizeLiteRequest, Builder> {
        private String glossary; 
        private Boolean includingProductArea; 
        private Boolean needTrans; 
        private String productUrl; 
        private String sourceLanguage; 
        private String sourcePlatform; 
        private String targetLanguage; 
        private String targetPlatform; 
        private Boolean translatingBrandInTheProduct; 

        private Builder() {
            super();
        } 

        private Builder(AssetOptimizeLiteRequest request) {
            super(request);
            this.glossary = request.glossary;
            this.includingProductArea = request.includingProductArea;
            this.needTrans = request.needTrans;
            this.productUrl = request.productUrl;
            this.sourceLanguage = request.sourceLanguage;
            this.sourcePlatform = request.sourcePlatform;
            this.targetLanguage = request.targetLanguage;
            this.targetPlatform = request.targetPlatform;
            this.translatingBrandInTheProduct = request.translatingBrandInTheProduct;
        } 

        /**
         * Glossary.
         */
        public Builder glossary(String glossary) {
            this.putQueryParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * IncludingProductArea.
         */
        public Builder includingProductArea(Boolean includingProductArea) {
            this.putQueryParameter("IncludingProductArea", includingProductArea);
            this.includingProductArea = includingProductArea;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://detail.1688.com/offer/631960323816.html">https://detail.1688.com/offer/631960323816.html</a></p>
         */
        public Builder productUrl(String productUrl) {
            this.putQueryParameter("ProductUrl", productUrl);
            this.productUrl = productUrl;
            return this;
        }

        /**
         * SourceLanguage.
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
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
         * TargetLanguage.
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putQueryParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
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
         * TranslatingBrandInTheProduct.
         */
        public Builder translatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
            this.putQueryParameter("TranslatingBrandInTheProduct", translatingBrandInTheProduct);
            this.translatingBrandInTheProduct = translatingBrandInTheProduct;
            return this;
        }

        @Override
        public AssetOptimizeLiteRequest build() {
            return new AssetOptimizeLiteRequest(this);
        } 

    } 

}
