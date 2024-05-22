// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRecordsResponseBody</p>
 */
public class DescribeDomainRecordsResponseBody extends TeaModel {
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

    private DescribeDomainRecordsResponseBody(Builder builder) {
        this.domainRecords = builder.domainRecords;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRecordsResponseBody create() {
        return builder().build();
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

        /**
         * The returned Domain Name System (DNS) records.
         */
        public Builder domainRecords(DomainRecords domainRecords) {
            this.domainRecords = domainRecords;
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

        public DescribeDomainRecordsResponseBody build() {
            return new DescribeDomainRecordsResponseBody(this);
        } 

    } 

    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

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

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Record(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
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
            this.updateTimestamp = builder.updateTimestamp;
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
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
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
            private Long createTimestamp; 
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
            private Long updateTimestamp; 
            private String value; 
            private Integer weight; 

            /**
             * The time when the DNS record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The resolution line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * Indicates whether the DNS record is locked.
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * The priority of the mail exchanger (MX) record.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
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
             * The status of the DNS record.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time-to-live (TTL) of the cached DNS record. Unit: seconds.
             */
            public Builder TTL(Long TTL) {
                this.TTL = TTL;
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
             * The time when the DNS record was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * The record value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The weight of the DNS record.
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
    public static class DomainRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List < Record> record;

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
        public java.util.List < Record> getRecord() {
            return this.record;
        }

        public static final class Builder {
            private java.util.List < Record> record; 

            /**
             * Record.
             */
            public Builder record(java.util.List < Record> record) {
                this.record = record;
                return this;
            }

            public DomainRecords build() {
                return new DomainRecords(this);
            } 

        } 

    }
}
