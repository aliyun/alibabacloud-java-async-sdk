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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDomainRecordInfoResponseBody model) {
            this.domainId = model.domainId;
            this.domainName = model.domainName;
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.line = model.line;
            this.locked = model.locked;
            this.priority = model.priority;
            this.punyCode = model.punyCode;
            this.rr = model.rr;
            this.recordId = model.recordId;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.status = model.status;
            this.TTL = model.TTL;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>The ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>00efd71a-770e-4255-b54e-6fe5659baffe</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>dns-example.top</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2223</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyGroup</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
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
         * <p>The lock state of the DNS record. Valid values: <strong>true and false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder locked(Boolean locked) {
            this.locked = locked;
            return this;
        }

        /**
         * <p>The priority of the mail exchanger (MX) record.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The Punycode for the domain name. This parameter is returned only for Chinese domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>xn--fsq270a.com</p>
         */
        public Builder punyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>@</p>
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
         * <p>The description of your DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * <p>The status of the DNS record. Valid values:</p>
         * <p>Enable: enabled</p>
         * <p>Disable: disabled</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time for which the DNS record is cached in a local DNS system.</p>
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
         * <p>MX</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The record value.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
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
