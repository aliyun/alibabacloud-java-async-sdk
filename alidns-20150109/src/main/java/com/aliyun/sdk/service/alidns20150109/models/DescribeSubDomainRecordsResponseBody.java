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
 * {@link DescribeSubDomainRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubDomainRecordsResponseBody</p>
 */
public class DescribeSubDomainRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainRecords")
    private DomainRecords domainRecords;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSubDomainRecordsResponseBody(Builder builder) {
        this.domainRecords = builder.domainRecords;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubDomainRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainRecords
     */
    public DomainRecords getDomainRecords() {
        return this.domainRecords;
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
        private DomainRecords domainRecords; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSubDomainRecordsResponseBody model) {
            this.domainRecords = model.domainRecords;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned Domain Name System (DNS) records.</p>
         */
        public Builder domainRecords(DomainRecords domainRecords) {
            this.domainRecords = domainRecords;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>2</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSubDomainRecordsResponseBody build() {
            return new DescribeSubDomainRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSubDomainRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubDomainRecordsResponseBody</p>
     */
    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("Locked")
        private Boolean locked;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("RR")
        private String rr;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TTL")
        private Long TTL;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Record(Builder builder) {
            this.domainName = builder.domainName;
            this.line = builder.line;
            this.locked = builder.locked;
            this.priority = builder.priority;
            this.rr = builder.rr;
            this.recordId = builder.recordId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.TTL = builder.TTL;
            this.type = builder.type;
            this.value = builder.value;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Record create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return locked
         */
        public Boolean getLocked() {
            return this.locked;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return rr
         */
        public String getRr() {
            return this.rr;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return TTL
         */
        public Long getTTL() {
            return this.TTL;
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

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String domainName; 
            private String line; 
            private Boolean locked; 
            private Long priority; 
            private String rr; 
            private String recordId; 
            private String remark; 
            private String status; 
            private Long TTL; 
            private String type; 
            private String value; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Record model) {
                this.domainName = model.domainName;
                this.line = model.line;
                this.locked = model.locked;
                this.priority = model.priority;
                this.rr = model.rr;
                this.recordId = model.recordId;
                this.remark = model.remark;
                this.status = model.status;
                this.TTL = model.TTL;
                this.type = model.type;
                this.value = model.value;
                this.weight = model.weight;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The DNS resolution line.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * <p>The lock status of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * <p>The priority of the mail exchanger (MX) record.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
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
             * <p>The ID of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>9999985</p>
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The description of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time-to-live (TTL) of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder TTL(Long TTL) {
                this.TTL = TTL;
                return this;
            }

            /**
             * <p>The type of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>CNAME</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The record value.</p>
             * 
             * <strong>example:</strong>
             * <p>example.net</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The weight of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Record build() {
                return new Record(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSubDomainRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubDomainRecordsResponseBody</p>
     */
    public static class DomainRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List<Record> record;

        private DomainRecords(Builder builder) {
            this.record = builder.record;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainRecords create() {
            return builder().build();
        }

        /**
         * @return record
         */
        public java.util.List<Record> getRecord() {
            return this.record;
        }

        public static final class Builder {
            private java.util.List<Record> record; 

            private Builder() {
            } 

            private Builder(DomainRecords model) {
                this.record = model.record;
            } 

            /**
             * Record.
             */
            public Builder record(java.util.List<Record> record) {
                this.record = record;
                return this;
            }

            public DomainRecords build() {
                return new DomainRecords(this);
            } 

        } 

    }
}
