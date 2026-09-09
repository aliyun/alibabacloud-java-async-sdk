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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The data list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response struct metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
             * <p>The service availability.</p>
             * 
             * <strong>example:</strong>
             * <p>99.9155</p>
             */
            public Builder availableRate(Double availableRate) {
                this.availableRate = availableRate;
                return this;
            }

            /**
             * <p>The unique ID of the damage record, used for targeted claims.</p>
             * 
             * <strong>example:</strong>
             * <p>9b7***9413</p>
             */
            public Builder damagedId(String damagedId) {
                this.damagedId = damagedId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>OSSBAG-cn-0xl0n****003</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The month in yyyyMM format.</p>
             * 
             * <strong>example:</strong>
             * <p>202603</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>The monthly service fee.</p>
             * 
             * <strong>example:</strong>
             * <p>365.00</p>
             */
            public Builder monthlyServiceCharge(Double monthlyServiceCharge) {
                this.monthlyServiceCharge = monthlyServiceCharge;
                return this;
            }

            /**
             * <p>The compensation description.</p>
             * 
             * <strong>example:</strong>
             * <p>SLA compensation</p>
             */
            public Builder payDescription(String payDescription) {
                this.payDescription = payDescription;
                return this;
            }

            /**
             * <p>The compensation ratio, in percentage (%).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder payRate(Double payRate) {
                this.payRate = payRate;
                return this;
            }

            /**
             * <p>The compensation status. Valid values:</p>
             * <ul>
             * <li>0: not compensated.</li>
             * <li>1: compensated.</li>
             * <li>2: no compensation required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * <p>The product code.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The compensation amount that should be paid.</p>
             * 
             * <strong>example:</strong>
             * <p>36.5</p>
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
