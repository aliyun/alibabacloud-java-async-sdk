// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link QueryMonthlySlaListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMonthlySlaListResponseBody</p>
 */
public class QueryMonthlySlaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryMonthlySlaListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlySlaListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Object metadata; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(QueryMonthlySlaListResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.metadata = model.metadata;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryMonthlySlaListResponseBody build() {
            return new QueryMonthlySlaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMonthlySlaListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMonthlySlaListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableRate")
        private Double availableRate;

        @com.aliyun.core.annotation.NameInMap("DamagedId")
        private String damagedId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("MonthlyServiceCharge")
        private Double monthlyServiceCharge;

        @com.aliyun.core.annotation.NameInMap("PayDescription")
        private String payDescription;

        @com.aliyun.core.annotation.NameInMap("PayRate")
        private Double payRate;

        @com.aliyun.core.annotation.NameInMap("PayStatus")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ShouldPaySum")
        private Double shouldPaySum;

        private Data(Builder builder) {
            this.availableRate = builder.availableRate;
            this.damagedId = builder.damagedId;
            this.instanceId = builder.instanceId;
            this.month = builder.month;
            this.monthlyServiceCharge = builder.monthlyServiceCharge;
            this.payDescription = builder.payDescription;
            this.payRate = builder.payRate;
            this.payStatus = builder.payStatus;
            this.productCode = builder.productCode;
            this.shouldPaySum = builder.shouldPaySum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableRate
         */
        public Double getAvailableRate() {
            return this.availableRate;
        }

        /**
         * @return damagedId
         */
        public String getDamagedId() {
            return this.damagedId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return month
         */
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return monthlyServiceCharge
         */
        public Double getMonthlyServiceCharge() {
            return this.monthlyServiceCharge;
        }

        /**
         * @return payDescription
         */
        public String getPayDescription() {
            return this.payDescription;
        }

        /**
         * @return payRate
         */
        public Double getPayRate() {
            return this.payRate;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return shouldPaySum
         */
        public Double getShouldPaySum() {
            return this.shouldPaySum;
        }

        public static final class Builder {
            private Double availableRate; 
            private String damagedId; 
            private String instanceId; 
            private Integer month; 
            private Double monthlyServiceCharge; 
            private String payDescription; 
            private Double payRate; 
            private Integer payStatus; 
            private String productCode; 
            private Double shouldPaySum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.availableRate = model.availableRate;
                this.damagedId = model.damagedId;
                this.instanceId = model.instanceId;
                this.month = model.month;
                this.monthlyServiceCharge = model.monthlyServiceCharge;
                this.payDescription = model.payDescription;
                this.payRate = model.payRate;
                this.payStatus = model.payStatus;
                this.productCode = model.productCode;
                this.shouldPaySum = model.shouldPaySum;
            } 

            /**
             * AvailableRate.
             */
            public Builder availableRate(Double availableRate) {
                this.availableRate = availableRate;
                return this;
            }

            /**
             * DamagedId.
             */
            public Builder damagedId(String damagedId) {
                this.damagedId = damagedId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * MonthlyServiceCharge.
             */
            public Builder monthlyServiceCharge(Double monthlyServiceCharge) {
                this.monthlyServiceCharge = monthlyServiceCharge;
                return this;
            }

            /**
             * PayDescription.
             */
            public Builder payDescription(String payDescription) {
                this.payDescription = payDescription;
                return this;
            }

            /**
             * PayRate.
             */
            public Builder payRate(Double payRate) {
                this.payRate = payRate;
                return this;
            }

            /**
             * PayStatus.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
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
             * ShouldPaySum.
             */
            public Builder shouldPaySum(Double shouldPaySum) {
                this.shouldPaySum = shouldPaySum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
