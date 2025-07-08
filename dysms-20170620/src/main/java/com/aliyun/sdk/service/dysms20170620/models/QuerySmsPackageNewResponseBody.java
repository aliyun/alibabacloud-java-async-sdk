// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsPackageNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsPackageNewResponseBody</p>
 */
public class QuerySmsPackageNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QuerySmsPackageNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsPackageNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private List list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QuerySmsPackageNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuerySmsPackageNewResponseBody build() {
            return new QuerySmsPackageNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsPackageNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsPackageNewResponseBody</p>
     */
    public static class SmsPackageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyTime")
        private String buyTime;

        @com.aliyun.core.annotation.NameInMap("DetailOrderId")
        private String detailOrderId;

        @com.aliyun.core.annotation.NameInMap("EffTime")
        private String effTime;

        @com.aliyun.core.annotation.NameInMap("ExpTime")
        private String expTime;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PayPrice")
        private Float payPrice;

        @com.aliyun.core.annotation.NameInMap("PkgId")
        private Long pkgId;

        @com.aliyun.core.annotation.NameInMap("RefundStatus")
        private Integer refundStatus;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Long usage;

        private SmsPackageInfo(Builder builder) {
            this.buyTime = builder.buyTime;
            this.detailOrderId = builder.detailOrderId;
            this.effTime = builder.effTime;
            this.expTime = builder.expTime;
            this.orderId = builder.orderId;
            this.packageName = builder.packageName;
            this.packageType = builder.packageType;
            this.payPrice = builder.payPrice;
            this.pkgId = builder.pkgId;
            this.refundStatus = builder.refundStatus;
            this.state = builder.state;
            this.total = builder.total;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsPackageInfo create() {
            return builder().build();
        }

        /**
         * @return buyTime
         */
        public String getBuyTime() {
            return this.buyTime;
        }

        /**
         * @return detailOrderId
         */
        public String getDetailOrderId() {
            return this.detailOrderId;
        }

        /**
         * @return effTime
         */
        public String getEffTime() {
            return this.effTime;
        }

        /**
         * @return expTime
         */
        public String getExpTime() {
            return this.expTime;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return payPrice
         */
        public Float getPayPrice() {
            return this.payPrice;
        }

        /**
         * @return pkgId
         */
        public Long getPkgId() {
            return this.pkgId;
        }

        /**
         * @return refundStatus
         */
        public Integer getRefundStatus() {
            return this.refundStatus;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return usage
         */
        public Long getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String buyTime; 
            private String detailOrderId; 
            private String effTime; 
            private String expTime; 
            private String orderId; 
            private String packageName; 
            private String packageType; 
            private Float payPrice; 
            private Long pkgId; 
            private Integer refundStatus; 
            private Integer state; 
            private Long total; 
            private Long usage; 

            private Builder() {
            } 

            private Builder(SmsPackageInfo model) {
                this.buyTime = model.buyTime;
                this.detailOrderId = model.detailOrderId;
                this.effTime = model.effTime;
                this.expTime = model.expTime;
                this.orderId = model.orderId;
                this.packageName = model.packageName;
                this.packageType = model.packageType;
                this.payPrice = model.payPrice;
                this.pkgId = model.pkgId;
                this.refundStatus = model.refundStatus;
                this.state = model.state;
                this.total = model.total;
                this.usage = model.usage;
            } 

            /**
             * BuyTime.
             */
            public Builder buyTime(String buyTime) {
                this.buyTime = buyTime;
                return this;
            }

            /**
             * DetailOrderId.
             */
            public Builder detailOrderId(String detailOrderId) {
                this.detailOrderId = detailOrderId;
                return this;
            }

            /**
             * EffTime.
             */
            public Builder effTime(String effTime) {
                this.effTime = effTime;
                return this;
            }

            /**
             * ExpTime.
             */
            public Builder expTime(String expTime) {
                this.expTime = expTime;
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
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PayPrice.
             */
            public Builder payPrice(Float payPrice) {
                this.payPrice = payPrice;
                return this;
            }

            /**
             * PkgId.
             */
            public Builder pkgId(Long pkgId) {
                this.pkgId = pkgId;
                return this;
            }

            /**
             * RefundStatus.
             */
            public Builder refundStatus(Integer refundStatus) {
                this.refundStatus = refundStatus;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(Long usage) {
                this.usage = usage;
                return this;
            }

            public SmsPackageInfo build() {
                return new SmsPackageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsPackageNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsPackageNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsPackageInfo")
        private java.util.List<SmsPackageInfo> smsPackageInfo;

        private List(Builder builder) {
            this.smsPackageInfo = builder.smsPackageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return smsPackageInfo
         */
        public java.util.List<SmsPackageInfo> getSmsPackageInfo() {
            return this.smsPackageInfo;
        }

        public static final class Builder {
            private java.util.List<SmsPackageInfo> smsPackageInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.smsPackageInfo = model.smsPackageInfo;
            } 

            /**
             * SmsPackageInfo.
             */
            public Builder smsPackageInfo(java.util.List<SmsPackageInfo> smsPackageInfo) {
                this.smsPackageInfo = smsPackageInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
