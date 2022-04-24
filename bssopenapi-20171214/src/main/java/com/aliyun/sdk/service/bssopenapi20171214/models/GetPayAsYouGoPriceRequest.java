// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPayAsYouGoPriceRequest} extends {@link RequestModel}
 *
 * <p>GetPayAsYouGoPriceRequest</p>
 */
public class GetPayAsYouGoPriceRequest extends Request {
    @Query
    @NameInMap("ModuleList")
    @Validation(required = true)
    private java.util.List < ModuleList> moduleList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("SubscriptionType")
    @Validation(required = true)
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
    public java.util.List < ModuleList> getModuleList() {
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
        private java.util.List < ModuleList> moduleList; 
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
         * ModuleList.
         */
        public Builder moduleList(java.util.List < ModuleList> moduleList) {
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * SubscriptionType.
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

    public static class ModuleList extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        private String config;

        @NameInMap("ModuleCode")
        @Validation(required = true)
        private String moduleCode;

        @NameInMap("PriceType")
        @Validation(required = true)
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

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * PriceType.
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
