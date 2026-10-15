// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link GetPayAsYouGoPriceRequest} extends {@link RequestModel}
 *
 * <p>GetPayAsYouGoPriceRequest</p>
 */
public class GetPayAsYouGoPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ModuleList> moduleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionType;

    private GetPayAsYouGoPriceRequest(Builder builder) {
        super(builder);
        this.moduleList = builder.moduleList;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.region = builder.region;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPayAsYouGoPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleList
     */
    public java.util.List<ModuleList> getModuleList() {
        return this.moduleList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<GetPayAsYouGoPriceRequest, Builder> {
        private java.util.List<ModuleList> moduleList; 
        private Long ownerId; 
        private String productCode; 
        private String productType; 
        private String region; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(GetPayAsYouGoPriceRequest request) {
            super(request);
            this.moduleList = request.moduleList;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.region = request.region;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * <p>The list of pricing modules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder moduleList(java.util.List<ModuleList> moduleList) {
            this.putQueryParameter("ModuleList", moduleList);
            this.moduleList = moduleList;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The product code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The subscription type. Valid values: PayAsYouGo.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public GetPayAsYouGoPriceRequest build() {
            return new GetPayAsYouGoPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetPayAsYouGoPriceRequest} extends {@link TeaModel}
     *
     * <p>GetPayAsYouGoPriceRequest</p>
     */
    public static class ModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        @com.aliyun.core.annotation.Validation(required = true)
        private String config;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("PriceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String priceType;

        private ModuleList(Builder builder) {
            this.config = builder.config;
            this.moduleCode = builder.moduleCode;
            this.priceType = builder.priceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        public static final class Builder {
            private String config; 
            private String moduleCode; 
            private String priceType; 

            private Builder() {
            } 

            private Builder(ModuleList model) {
                this.config = model.config;
                this.moduleCode = model.moduleCode;
                this.priceType = model.priceType;
            } 

            /**
             * <p>The configuration of the Nth pricing module. The value of N ranges from 1 to 50. Format: &quot;AA:aa,BB:bb&quot;, where AA and BB are the property codes of the pricing module, and aa and bb are the corresponding property values.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a> operation to obtain the Module parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceType:ecs.g5.xlarge,IoOptimized:IoOptimized,ImageOs:linux</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The module code of the Nth pricing module.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a> operation to obtain the Module parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceType</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The price type of the Nth pricing module. Valid values:</p>
             * <ul>
             * <li>Hour: hourly price.</li>
             * <li>Usage: usage-based price.</li>
             * <li>Month: monthly price.</li>
             * <li>Year: yearly price.</li>
             * </ul>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a> operation to obtain the Module parameter.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Hour</p>
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            public ModuleList build() {
                return new ModuleList(this);
            } 

        } 

    }
}
