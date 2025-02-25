// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeZoneRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZoneRecordResponseBody</p>
 */
public class DescribeZoneRecordResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private DescribeZoneRecordResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.line = builder.line;
        this.priority = builder.priority;
        this.recordId = builder.recordId;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
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

    public static DescribeZoneRecordResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
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
         * <p>The time when the DNS record was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-23T03:15Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the DNS record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1516775741000</p>
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
         * <p>5</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>5808</p>
         */
        public Builder recordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The description of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>test record</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <li><strong>ENABLE</strong>: The DNS record is enabled.</li>
         * <li><strong>DISABLE</strong>: The DNS record is disabled.</li>
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
         * <p>The time to live (TTL) of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ttl(Integer ttl) {
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
         * <p>The time when the DNS record was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-24T06:35Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The time when the DNS record was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1516775741000</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * <p>The record value.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * <p>The weight value of the DNS record.</p>
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
         * <p>CAgICA1OA_58</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeZoneRecordResponseBody build() {
            return new DescribeZoneRecordResponseBody(this);
        } 

    } 

}
