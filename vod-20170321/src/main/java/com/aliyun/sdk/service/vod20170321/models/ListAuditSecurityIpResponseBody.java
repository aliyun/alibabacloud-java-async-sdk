// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuditSecurityIpResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuditSecurityIpResponseBody</p>
 */
public class ListAuditSecurityIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpList")
    private java.util.List < SecurityIpList> securityIpList;

    private ListAuditSecurityIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpList = builder.securityIpList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuditSecurityIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIpList
     */
    public java.util.List < SecurityIpList> getSecurityIpList() {
        return this.securityIpList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecurityIpList> securityIpList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the review security group.
         */
        public Builder securityIpList(java.util.List < SecurityIpList> securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }

        public ListAuditSecurityIpResponseBody build() {
            return new ListAuditSecurityIpResponseBody(this);
        } 

    } 

    public static class SecurityIpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private String ips;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        private SecurityIpList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ips = builder.ips;
            this.modificationTime = builder.modificationTime;
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ips
         */
        public String getIps() {
            return this.ips;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String creationTime; 
            private String ips; 
            private String modificationTime; 
            private String securityGroupName; 

            /**
             * The time when the review security group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The IP addresses in the review security group.
             */
            public Builder ips(String ips) {
                this.ips = ips;
                return this;
            }

            /**
             * The time when the review security group was last modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The name of the review security group.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            public SecurityIpList build() {
                return new SecurityIpList(this);
            } 

        } 

    }
}
