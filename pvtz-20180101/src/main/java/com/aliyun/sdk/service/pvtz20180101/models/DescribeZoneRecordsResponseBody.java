// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZoneRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZoneRecordsResponseBody</p>
 */
public class DescribeZoneRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Records")
    private Records records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeZoneRecordsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZoneRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return records
     */
    public Records getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private Records records; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The returned DNS records.
         */
        public Builder records(Records records) {
            this.records = records;
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
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of returned pages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeZoneRecordsResponseBody build() {
            return new DescribeZoneRecordsResponseBody(this);
        } 

    } 

    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Rr")
        private String rr;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Record(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.line = builder.line;
            this.priority = builder.priority;
            this.recordId = builder.recordId;
            this.remark = builder.remark;
            this.rr = builder.rr;
            this.status = builder.status;
            this.ttl = builder.ttl;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.value = builder.value;
            this.weight = builder.weight;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Record create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
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

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private String line; 
            private Integer priority; 
            private Long recordId; 
            private String remark; 
            private String rr; 
            private String status; 
            private Integer ttl; 
            private String type; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String value; 
            private Integer weight; 
            private String zoneId; 

            /**
             * The time when the DNS record was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the DNS record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
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
             * The priority of the mail exchanger (MX) record.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the DNS record.
             */
            public Builder recordId(Long recordId) {
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
             * The state of the DNS record. Valid values:
             * <p>
             * 
             * *   ENABLE: The DNS record is enabled.
             * *   DISABLE: The DNS record is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time-to-live (TTL) of the DNS record.
             */
            public Builder ttl(Integer ttl) {
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
             * The time when the DNS record was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The time when the DNS record was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
             * The weight of the address.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Record build() {
                return new Record(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List < Record> record;

        private Records(Builder builder) {
            this.record = builder.record;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
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

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
