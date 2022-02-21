// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRecordInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRecordInfoResponseBody</p>
 */
public class DescribeDomainRecordInfoResponseBody extends TeaModel {
    @NameInMap("DomainId")
    private String domainId;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("Line")
    private String line;

    @NameInMap("Locked")
    private Boolean locked;

    @NameInMap("Priority")
    private Long priority;

    @NameInMap("PunyCode")
    private String punyCode;

    @NameInMap("RR")
    private String RR;

    @NameInMap("RecordId")
    private String recordId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("TTL")
    private Long TTL;

    @NameInMap("Type")
    private String type;

    @NameInMap("Value")
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
        this.RR = builder.RR;
        this.recordId = builder.recordId;
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
     * @return RR
     */
    public String getRR() {
        return this.RR;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
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
        private String RR; 
        private String recordId; 
        private String requestId; 
        private String status; 
        private Long TTL; 
        private String type; 
        private String value; 

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Line.
         */
        public Builder line(String line) {
            this.line = line;
            return this;
        }

        /**
         * Locked.
         */
        public Builder locked(Boolean locked) {
            this.locked = locked;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * PunyCode.
         */
        public Builder punyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }

        /**
         * RR.
         */
        public Builder RR(String RR) {
            this.RR = RR;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TTL.
         */
        public Builder TTL(Long TTL) {
            this.TTL = TTL;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Value.
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
