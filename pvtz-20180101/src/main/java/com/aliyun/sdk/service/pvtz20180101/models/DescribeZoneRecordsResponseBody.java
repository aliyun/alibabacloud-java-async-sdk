// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DNS records.</p>
         */
        public Builder records(Records records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B07FBC3-3A53-4939-A3C6-2BDFE407BAB2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeZoneRecordsResponseBody build() {
            return new DescribeZoneRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeZoneRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZoneRecordsResponseBody</p>
     */
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
             * <p>The time when the DNS record was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-14T03:47Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the DNS record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1672740294000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The resolution line.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * <p>The priority of the mail exchanger (MX) record.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the DNS record.</p>
             * 
             * <strong>example:</strong>
             * <p>246959****</p>
             */
            public Builder recordId(Long recordId) {
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
             * <p>The state of the DNS record. Valid values:</p>
             * <ul>
             * <li>ENABLE: The DNS record is enabled.</li>
             * <li>DISABLE: The DNS record is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time to live (TTL) period.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The type of the DNS record. Valid values:</p>
             * <ul>
             * <li><strong>A</strong>: An A record points a domain name to an IPv4 address.</li>
             * <li><strong>AAAA</strong>: An AAAA record points a domain name to an IPv6 address.</li>
             * <li><strong>CNAME</strong>: A canonical name (CNAME) record points a domain name to another domain name.</li>
             * <li><strong>TXT</strong>: A text (TXT) record usually serves as a Sender Policy Framework (SPF) record to prevent email spam. The record value of the TXT record can be up to 255 characters in length.</li>
             * <li><strong>MX</strong>: A mail exchanger (MX) record points a domain name to a mail server address.</li>
             * <li><strong>PTR</strong>: A pointer (PTR) points an IP address to a domain name.</li>
             * <li><strong>SRV</strong>: A service (SRV) record specifies a server that hosts a specific service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the DNS record was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-08T02:31Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The time when the DNS record was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1654777678000</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>The record value.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.XX.XX</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The weight value of the address. You can set a different weight value for each address. This way, addresses are returned based on the weight values for DNS requests. A weight value must be an integer that ranges from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a49f55537f3b0b1e6e43add0bf5f****</p>
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
    /**
     * 
     * {@link DescribeZoneRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZoneRecordsResponseBody</p>
     */
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
