// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link QueryServicePackAndPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryServicePackAndPriceResponseBody</p>
 */
public class QueryServicePackAndPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeAmount")
    private Integer chargeAmount;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("DiscountPrice")
    private Float discountPrice;

    @com.aliyun.core.annotation.NameInMap("OriginalAmount")
    private Integer originalAmount;

    @com.aliyun.core.annotation.NameInMap("OriginalPrice")
    private Float originalPrice;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServicePack")
    private ServicePack servicePack;

    @com.aliyun.core.annotation.NameInMap("TradePrice")
    private Float tradePrice;

    private QueryServicePackAndPriceResponseBody(Builder builder) {
        this.chargeAmount = builder.chargeAmount;
        this.currency = builder.currency;
        this.discountPrice = builder.discountPrice;
        this.originalAmount = builder.originalAmount;
        this.originalPrice = builder.originalPrice;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.servicePack = builder.servicePack;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryServicePackAndPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeAmount
     */
    public Integer getChargeAmount() {
        return this.chargeAmount;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return discountPrice
     */
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    /**
     * @return originalAmount
     */
    public Integer getOriginalAmount() {
        return this.originalAmount;
    }

    /**
     * @return originalPrice
     */
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servicePack
     */
    public ServicePack getServicePack() {
        return this.servicePack;
    }

    /**
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private Integer chargeAmount; 
        private String currency; 
        private Float discountPrice; 
        private Integer originalAmount; 
        private Float originalPrice; 
        private String regionId; 
        private String requestId; 
        private ServicePack servicePack; 
        private Float tradePrice; 

        private Builder() {
        } 

        private Builder(QueryServicePackAndPriceResponseBody model) {
            this.chargeAmount = model.chargeAmount;
            this.currency = model.currency;
            this.discountPrice = model.discountPrice;
            this.originalAmount = model.originalAmount;
            this.originalPrice = model.originalPrice;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.servicePack = model.servicePack;
            this.tradePrice = model.tradePrice;
        } 

        /**
         * ChargeAmount.
         */
        public Builder chargeAmount(Integer chargeAmount) {
            this.chargeAmount = chargeAmount;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * DiscountPrice.
         */
        public Builder discountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }

        /**
         * OriginalAmount.
         */
        public Builder originalAmount(Integer originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * OriginalPrice.
         */
        public Builder originalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServicePack.
         */
        public Builder servicePack(ServicePack servicePack) {
            this.servicePack = servicePack;
            return this;
        }

        /**
         * TradePrice.
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public QueryServicePackAndPriceResponseBody build() {
            return new QueryServicePackAndPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryServicePackAndPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryServicePackAndPriceResponseBody</p>
     */
    public static class ServicePackInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Integer capacity;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        private ServicePackInfo(Builder builder) {
            this.capacity = builder.capacity;
            this.endTime = builder.endTime;
            this.instanceName = builder.instanceName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServicePackInfo create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Integer getCapacity() {
            return this.capacity;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer capacity; 
            private Integer endTime; 
            private String instanceName; 
            private Integer startTime; 

            private Builder() {
            } 

            private Builder(ServicePackInfo model) {
                this.capacity = model.capacity;
                this.endTime = model.endTime;
                this.instanceName = model.instanceName;
                this.startTime = model.startTime;
            } 

            /**
             * Capacity.
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            public ServicePackInfo build() {
                return new ServicePackInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryServicePackAndPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryServicePackAndPriceResponseBody</p>
     */
    public static class ServicePack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServicePackInfo")
        private java.util.List<ServicePackInfo> servicePackInfo;

        private ServicePack(Builder builder) {
            this.servicePackInfo = builder.servicePackInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServicePack create() {
            return builder().build();
        }

        /**
         * @return servicePackInfo
         */
        public java.util.List<ServicePackInfo> getServicePackInfo() {
            return this.servicePackInfo;
        }

        public static final class Builder {
            private java.util.List<ServicePackInfo> servicePackInfo; 

            private Builder() {
            } 

            private Builder(ServicePack model) {
                this.servicePackInfo = model.servicePackInfo;
            } 

            /**
             * ServicePackInfo.
             */
            public Builder servicePackInfo(java.util.List<ServicePackInfo> servicePackInfo) {
                this.servicePackInfo = servicePackInfo;
                return this;
            }

            public ServicePack build() {
                return new ServicePack(this);
            } 

        } 

    }
}
