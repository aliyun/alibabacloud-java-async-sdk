// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The detailed results of the batch operation.
         */
        public Builder batchResultDetails(BatchResultDetails batchResultDetails) {
            this.batchResultDetails = batchResultDetails;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBatchResultDetailResponseBody build() {
            return new DescribeBatchResultDetailResponseBody(this);
        } 

    } 

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
             * The type of the batch operation.
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The line code.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * The new hostname.
             */
            public Builder newRr(String newRr) {
                this.newRr = newRr;
                return this;
            }

            /**
             * The new record value.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * The time when the operation was performed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder operateDateStr(String operateDateStr) {
                this.operateDateStr = operateDateStr;
                return this;
            }

            /**
             * The priority of the mail exchanger (MX) record.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The cause of the execution failure.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The ID of the DNS record.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * The description of the DNS record.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The hostname.
             */
            public Builder rr(String rr) {
                this.rr = rr;
                return this;
            }

            /**
             * The status of the DNS record.
             */
            public Builder rrStatus(String rrStatus) {
                this.rrStatus = rrStatus;
                return this;
            }

            /**
             * The execution result of the batch operation. Valid values: **true**: The operation succeeded. **false**: The operation failed.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * The time-to-live (TTL) of the DNS record.
             */
            public Builder ttl(String ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * The type of the DNS record.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The record value.
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
    public static class BatchResultDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchResultDetail")
        private java.util.List < BatchResultDetail> batchResultDetail;

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
        public java.util.List < BatchResultDetail> getBatchResultDetail() {
            return this.batchResultDetail;
        }

        public static final class Builder {
            private java.util.List < BatchResultDetail> batchResultDetail; 

            /**
             * BatchResultDetail.
             */
            public Builder batchResultDetail(java.util.List < BatchResultDetail> batchResultDetail) {
                this.batchResultDetail = batchResultDetail;
                return this;
            }

            public BatchResultDetails build() {
                return new BatchResultDetails(this);
            } 

        } 

    }
}
