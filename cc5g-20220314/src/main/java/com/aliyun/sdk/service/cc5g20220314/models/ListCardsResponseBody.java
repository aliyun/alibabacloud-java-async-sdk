// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCardsResponseBody</p>
 */
public class ListCardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cards")
    private java.util.List < Cards> cards;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListCardsResponseBody(Builder builder) {
        this.cards = builder.cards;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cards
     */
    public java.util.List < Cards> getCards() {
        return this.cards;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
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

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Cards> cards; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * Cards.
         */
        public Builder cards(java.util.List < Cards> cards) {
            this.cards = cards;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCardsResponseBody build() {
            return new ListCardsResponseBody(this);
        } 

    } 

    public static class Cards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APN")
        private String APN;

        @com.aliyun.core.annotation.NameInMap("ActivatedTime")
        private String activatedTime;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("Iccid")
        private String iccid;

        @com.aliyun.core.annotation.NameInMap("Imei")
        private String imei;

        @com.aliyun.core.annotation.NameInMap("Imsi")
        private String imsi;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Lock")
        private Boolean lock;

        @com.aliyun.core.annotation.NameInMap("Msisdn")
        private String msisdn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UsageDataMonth")
        private Long usageDataMonth;

        @com.aliyun.core.annotation.NameInMap("UsageDataTotal")
        private String usageDataTotal;

        private Cards(Builder builder) {
            this.APN = builder.APN;
            this.activatedTime = builder.activatedTime;
            this.businessStatus = builder.businessStatus;
            this.description = builder.description;
            this.ISP = builder.ISP;
            this.iccid = builder.iccid;
            this.imei = builder.imei;
            this.imsi = builder.imsi;
            this.ipAddress = builder.ipAddress;
            this.lock = builder.lock;
            this.msisdn = builder.msisdn;
            this.name = builder.name;
            this.netType = builder.netType;
            this.orderId = builder.orderId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.usageDataMonth = builder.usageDataMonth;
            this.usageDataTotal = builder.usageDataTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cards create() {
            return builder().build();
        }

        /**
         * @return APN
         */
        public String getAPN() {
            return this.APN;
        }

        /**
         * @return activatedTime
         */
        public String getActivatedTime() {
            return this.activatedTime;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return iccid
         */
        public String getIccid() {
            return this.iccid;
        }

        /**
         * @return imei
         */
        public String getImei() {
            return this.imei;
        }

        /**
         * @return imsi
         */
        public String getImsi() {
            return this.imsi;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return lock
         */
        public Boolean getLock() {
            return this.lock;
        }

        /**
         * @return msisdn
         */
        public String getMsisdn() {
            return this.msisdn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usageDataMonth
         */
        public Long getUsageDataMonth() {
            return this.usageDataMonth;
        }

        /**
         * @return usageDataTotal
         */
        public String getUsageDataTotal() {
            return this.usageDataTotal;
        }

        public static final class Builder {
            private String APN; 
            private String activatedTime; 
            private String businessStatus; 
            private String description; 
            private String ISP; 
            private String iccid; 
            private String imei; 
            private String imsi; 
            private String ipAddress; 
            private Boolean lock; 
            private String msisdn; 
            private String name; 
            private String netType; 
            private String orderId; 
            private String spec; 
            private String status; 
            private Long usageDataMonth; 
            private String usageDataTotal; 

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder APN(String APN) {
                this.APN = APN;
                return this;
            }

            /**
             * ActivatedTime.
             */
            public Builder activatedTime(String activatedTime) {
                this.activatedTime = activatedTime;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder iccid(String iccid) {
                this.iccid = iccid;
                return this;
            }

            /**
             * Imei.
             */
            public Builder imei(String imei) {
                this.imei = imei;
                return this;
            }

            /**
             * Imsi.
             */
            public Builder imsi(String imsi) {
                this.imsi = imsi;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Lock.
             */
            public Builder lock(Boolean lock) {
                this.lock = lock;
                return this;
            }

            /**
             * Msisdn.
             */
            public Builder msisdn(String msisdn) {
                this.msisdn = msisdn;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UsageDataMonth.
             */
            public Builder usageDataMonth(Long usageDataMonth) {
                this.usageDataMonth = usageDataMonth;
                return this;
            }

            /**
             * UsageDataTotal.
             */
            public Builder usageDataTotal(String usageDataTotal) {
                this.usageDataTotal = usageDataTotal;
                return this;
            }

            public Cards build() {
                return new Cards(this);
            } 

        } 

    }
}
