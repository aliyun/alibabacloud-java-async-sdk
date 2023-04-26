// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuditSecurityIpResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuditSecurityIpResponseBody</p>
 */
public class ListAuditSecurityIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpList")
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
         * The name of the review security group.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
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
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Ips")
        private String ips;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("SecurityGroupName")
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
             * The operation that you want to perform. Set the value to **ListAuditSecurityIp**.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Queries the IP addresses in a review security group.
             */
            public Builder ips(String ips) {
                this.ips = ips;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * SecurityGroupName.
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
