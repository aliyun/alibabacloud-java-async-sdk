// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeBatchResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBatchResultDetailResponseBody</p>
 */
public class DescribeBatchResultDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchResultDetails")
    private BatchResultDetails batchResultDetails;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeBatchResultDetailResponseBody(Builder builder) {
        this.batchResultDetails = builder.batchResultDetails;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchResultDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchResultDetails
     */
    public BatchResultDetails getBatchResultDetails() {
        return this.batchResultDetails;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private BatchResultDetails batchResultDetails; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The detailed results of the batch operation.</p>
         */
        public Builder batchResultDetails(BatchResultDetails batchResultDetails) {
            this.batchResultDetails = batchResultDetails;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75446CC1-FC9A-4595-8D96-089D73D7A63D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBatchResultDetailResponseBody build() {
            return new DescribeBatchResultDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBatchResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchResultDetailResponseBody</p>
     */
    public static class BatchResultDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchType")
        private String batchType;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("NewRr")
        private String newRr;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OperateDateStr")
        private String operateDateStr;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Rr")
        private String rr;

        @com.aliyun.core.annotation.NameInMap("RrStatus")
        private String rrStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private String ttl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private BatchResultDetail(Builder builder) {
            this.batchType = builder.batchType;
            this.domain = builder.domain;
            this.line = builder.line;
            this.newRr = builder.newRr;
            this.newValue = builder.newValue;
            this.operateDateStr = builder.operateDateStr;
            this.priority = builder.priority;
            this.reason = builder.reason;
            this.recordId = builder.recordId;
            this.remark = builder.remark;
            this.rr = builder.rr;
            this.rrStatus = builder.rrStatus;
            this.status = builder.status;
            this.ttl = builder.ttl;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchResultDetail create() {
            return builder().build();
        }

        /**
         * @return batchType
         */
        public String getBatchType() {
            return this.batchType;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return newRr
         */
        public String getNewRr() {
            return this.newRr;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return operateDateStr
         */
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return rr
         */
        public String getRr() {
            return this.rr;
        }

        /**
         * @return rrStatus
         */
        public String getRrStatus() {
            return this.rrStatus;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return ttl
         */
        public String getTtl() {
            return this.ttl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String batchType; 
            private String domain; 
            private String line; 
            private String newRr; 
            private String newValue; 
            private String operateDateStr; 
            private String priority; 
            private String reason; 
            private String recordId; 
            private String remark; 
            private String rr; 
            private String rrStatus; 
            private Boolean status; 
            private String ttl; 
            private String type; 
            private String value; 

            /**
             * <p>The type of the batch operation.</p>
             * 
             * <strong>example:</strong>
             * <p>DOMAIN_ADD</p>
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The line code.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * <p>The new hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-batch-7</p>
             */
            public Builder newRr(String newRr) {
                this.newRr = newRr;
                return this;
            }

            /**
             * <p>The new record value.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.254</p>
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * <p>The time when the operation was performed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-22 18:02:58</p>
             */
            public Builder operateDateStr(String operateDateStr) {
                this.operateDateStr = operateDateStr;
                return this;
            }

            /**
             * <p>The priority of the mail exchanger (MX) record.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The cause of the execution failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Task lock fail</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The ID of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The description of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>remark</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>www</p>
             */
            public Builder rr(String rr) {
                this.rr = rr;
                return this;
            }

            /**
             * <p>The status of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder rrStatus(String rrStatus) {
                this.rrStatus = rrStatus;
                return this;
            }

            /**
             * <p>The execution result of the batch operation. Valid values: <strong>true</strong>: The operation succeeded. <strong>false</strong>: The operation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time-to-live (TTL) of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder ttl(String ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The type of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The record value.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public BatchResultDetail build() {
                return new BatchResultDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBatchResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchResultDetailResponseBody</p>
     */
    public static class BatchResultDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchResultDetail")
        private java.util.List<BatchResultDetail> batchResultDetail;

        private BatchResultDetails(Builder builder) {
            this.batchResultDetail = builder.batchResultDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchResultDetails create() {
            return builder().build();
        }

        /**
         * @return batchResultDetail
         */
        public java.util.List<BatchResultDetail> getBatchResultDetail() {
            return this.batchResultDetail;
        }

        public static final class Builder {
            private java.util.List<BatchResultDetail> batchResultDetail; 

            /**
             * BatchResultDetail.
             */
            public Builder batchResultDetail(java.util.List<BatchResultDetail> batchResultDetail) {
                this.batchResultDetail = batchResultDetail;
                return this;
            }

            public BatchResultDetails build() {
                return new BatchResultDetails(this);
            } 

        } 

    }
}
