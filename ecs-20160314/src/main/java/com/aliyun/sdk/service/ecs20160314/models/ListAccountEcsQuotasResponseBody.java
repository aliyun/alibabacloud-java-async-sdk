// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountEcsQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountEcsQuotasResponseBody</p>
 */
public class ListAccountEcsQuotasResponseBody extends TeaModel {
    @NameInMap("EcsQuotas")
    private EcsQuotas ecsQuotas;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListAccountEcsQuotasResponseBody(Builder builder) {
        this.ecsQuotas = builder.ecsQuotas;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountEcsQuotasResponseBody create() {
        return builder().build();
    }

    /**
     * @return ecsQuotas
     */
    public EcsQuotas getEcsQuotas() {
        return this.ecsQuotas;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EcsQuotas ecsQuotas; 
        private String nextToken; 
        private String requestId; 

        /**
         * EcsQuotas.
         */
        public Builder ecsQuotas(EcsQuotas ecsQuotas) {
            this.ecsQuotas = ecsQuotas;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccountEcsQuotasResponseBody build() {
            return new ListAccountEcsQuotasResponseBody(this);
        } 

    } 

    public static class EcsQuota extends TeaModel {
        @NameInMap("ApplicationStatus")
        private String applicationStatus;

        @NameInMap("BaseQuota")
        private Long baseQuota;

        @NameInMap("BaseQuotaUsage")
        private Long baseQuotaUsage;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("QuotaResourceName")
        private String quotaResourceName;

        @NameInMap("QuotaResourceType")
        private String quotaResourceType;

        @NameInMap("QuotaUnit")
        private String quotaUnit;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReservedQuota")
        private Long reservedQuota;

        @NameInMap("ReservedQuotaUsage")
        private Long reservedQuotaUsage;

        @NameInMap("TotalQuota")
        private Long totalQuota;

        @NameInMap("TotalQuotaUsage")
        private Long totalQuotaUsage;

        @NameInMap("ZoneId")
        private String zoneId;

        private EcsQuota(Builder builder) {
            this.applicationStatus = builder.applicationStatus;
            this.baseQuota = builder.baseQuota;
            this.baseQuotaUsage = builder.baseQuotaUsage;
            this.chargeType = builder.chargeType;
            this.networkType = builder.networkType;
            this.quotaResourceName = builder.quotaResourceName;
            this.quotaResourceType = builder.quotaResourceType;
            this.quotaUnit = builder.quotaUnit;
            this.regionId = builder.regionId;
            this.reservedQuota = builder.reservedQuota;
            this.reservedQuotaUsage = builder.reservedQuotaUsage;
            this.totalQuota = builder.totalQuota;
            this.totalQuotaUsage = builder.totalQuotaUsage;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsQuota create() {
            return builder().build();
        }

        /**
         * @return applicationStatus
         */
        public String getApplicationStatus() {
            return this.applicationStatus;
        }

        /**
         * @return baseQuota
         */
        public Long getBaseQuota() {
            return this.baseQuota;
        }

        /**
         * @return baseQuotaUsage
         */
        public Long getBaseQuotaUsage() {
            return this.baseQuotaUsage;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return quotaResourceName
         */
        public String getQuotaResourceName() {
            return this.quotaResourceName;
        }

        /**
         * @return quotaResourceType
         */
        public String getQuotaResourceType() {
            return this.quotaResourceType;
        }

        /**
         * @return quotaUnit
         */
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservedQuota
         */
        public Long getReservedQuota() {
            return this.reservedQuota;
        }

        /**
         * @return reservedQuotaUsage
         */
        public Long getReservedQuotaUsage() {
            return this.reservedQuotaUsage;
        }

        /**
         * @return totalQuota
         */
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return totalQuotaUsage
         */
        public Long getTotalQuotaUsage() {
            return this.totalQuotaUsage;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String applicationStatus; 
            private Long baseQuota; 
            private Long baseQuotaUsage; 
            private String chargeType; 
            private String networkType; 
            private String quotaResourceName; 
            private String quotaResourceType; 
            private String quotaUnit; 
            private String regionId; 
            private Long reservedQuota; 
            private Long reservedQuotaUsage; 
            private Long totalQuota; 
            private Long totalQuotaUsage; 
            private String zoneId; 

            /**
             * ApplicationStatus.
             */
            public Builder applicationStatus(String applicationStatus) {
                this.applicationStatus = applicationStatus;
                return this;
            }

            /**
             * BaseQuota.
             */
            public Builder baseQuota(Long baseQuota) {
                this.baseQuota = baseQuota;
                return this;
            }

            /**
             * BaseQuotaUsage.
             */
            public Builder baseQuotaUsage(Long baseQuotaUsage) {
                this.baseQuotaUsage = baseQuotaUsage;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * QuotaResourceName.
             */
            public Builder quotaResourceName(String quotaResourceName) {
                this.quotaResourceName = quotaResourceName;
                return this;
            }

            /**
             * QuotaResourceType.
             */
            public Builder quotaResourceType(String quotaResourceType) {
                this.quotaResourceType = quotaResourceType;
                return this;
            }

            /**
             * QuotaUnit.
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
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
             * ReservedQuota.
             */
            public Builder reservedQuota(Long reservedQuota) {
                this.reservedQuota = reservedQuota;
                return this;
            }

            /**
             * ReservedQuotaUsage.
             */
            public Builder reservedQuotaUsage(Long reservedQuotaUsage) {
                this.reservedQuotaUsage = reservedQuotaUsage;
                return this;
            }

            /**
             * TotalQuota.
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * TotalQuotaUsage.
             */
            public Builder totalQuotaUsage(Long totalQuotaUsage) {
                this.totalQuotaUsage = totalQuotaUsage;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public EcsQuota build() {
                return new EcsQuota(this);
            } 

        } 

    }
    public static class EcsQuotas extends TeaModel {
        @NameInMap("EcsQuota")
        private java.util.List < EcsQuota> ecsQuota;

        private EcsQuotas(Builder builder) {
            this.ecsQuota = builder.ecsQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsQuotas create() {
            return builder().build();
        }

        /**
         * @return ecsQuota
         */
        public java.util.List < EcsQuota> getEcsQuota() {
            return this.ecsQuota;
        }

        public static final class Builder {
            private java.util.List < EcsQuota> ecsQuota; 

            /**
             * EcsQuota.
             */
            public Builder ecsQuota(java.util.List < EcsQuota> ecsQuota) {
                this.ecsQuota = ecsQuota;
                return this;
            }

            public EcsQuotas build() {
                return new EcsQuotas(this);
            } 

        } 

    }
}
