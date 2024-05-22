// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRecordInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRecordInfoResponseBody</p>
 */
public class DescribeDomainRecordInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("Line")
    private String line;

    @com.aliyun.core.annotation.NameInMap("Locked")
    private Boolean locked;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.NameInMap("PunyCode")
    private String punyCode;

    @com.aliyun.core.annotation.NameInMap("RR")
    private String rr;

    @com.aliyun.core.annotation.NameInMap("RecordId")
    private String recordId;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TTL")
    private Long TTL;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeDomainRecordInfoResponseBody(Builder builder) {
        this.domainId = builder.domainId;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.line = builder.line;
        this.locked = builder.locked;
        this.priority = builder.priority;
        this.punyCode = builder.punyCode;
        this.rr = builder.rr;
        this.recordId = builder.recordId;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.TTL = builder.TTL;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRecordInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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
     * @return punyCode
     */
    public String getPunyCode() {
        return this.punyCode;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String domainId; 
        private String domainName; 
        private String groupId; 
        private String groupName; 
        private String line; 
        private Boolean locked; 
        private Long priority; 
        private String punyCode; 
        private String rr; 
        private String recordId; 
        private String remark; 
        private String requestId; 
        private String status; 
        private Long TTL; 
        private String type; 
        private String value; 

        /**
         * The ID of the domain name.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
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
         * The ID of the domain name group.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the domain name group.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The DNS resolution line.
         */
        public Builder line(String line) {
            this.line = line;
            return this;
        }

        /**
         * The lock state of the DNS record. Valid values: **true and false**.
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
         * The Punycode for the domain name. This parameter is returned only for Chinese domain names.
         */
        public Builder punyCode(String punyCode) {
            this.punyCode = punyCode;
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
         * The description of your DNS record.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * The state of the DNS records. Valid values: **Enable and Disable**.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time-to-live (TTL) of the DNS record.
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
         * The record value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public DescribeDomainRecordInfoResponseBody build() {
            return new DescribeDomainRecordInfoResponseBody(this);
        } 

    } 

}
