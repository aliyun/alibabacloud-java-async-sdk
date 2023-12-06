// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPayAsYouGoPriceData} extends {@link TeaModel}
 *
 * <p>GetPayAsYouGoPriceData</p>
 */
public class GetPayAsYouGoPriceData extends TeaModel {
    @NameInMap("ModuleList")
    private java.util.List < ModuleList> moduleList;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("ProductCode")
    private String productCode;

    @NameInMap("ProductType")
    private String productType;

    @NameInMap("Region")
    private String region;

    @NameInMap("SubscriptionType")
    private String subscriptionType;

    private GetPayAsYouGoPriceData(Builder builder) {
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

    public static GetPayAsYouGoPriceData create() {
        return builder().build();
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
    public String getOwnerId() {
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

    public static final class Builder {
        private java.util.List < ModuleList> moduleList; 
        private String ownerId; 
        private String productCode; 
        private String productType; 
        private String region; 
        private String subscriptionType; 

        /**
         * ModuleList.
         */
        public Builder moduleList(java.util.List < ModuleList> moduleList) {
            this.moduleList = moduleList;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }

        public GetPayAsYouGoPriceData build() {
            return new GetPayAsYouGoPriceData(this);
        } 

    } 

    public static class ModuleList extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("ModuleCode")
        private String moduleCode;

        @NameInMap("PriceType")
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
