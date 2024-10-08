// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIpsResponseBody</p>
 */
public class DescribeSecurityIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpGroups")
    private SecurityIpGroups securityIpGroups;

    private DescribeSecurityIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroups = builder.securityIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIpGroups
     */
    public SecurityIpGroups getSecurityIpGroups() {
        return this.securityIpGroups;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityIpGroups securityIpGroups; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The whitelists of the instance.
         */
        public Builder securityIpGroups(SecurityIpGroups securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }

        public DescribeSecurityIpsResponseBody build() {
            return new DescribeSecurityIpsResponseBody(this);
        } 

    } 

    public static class SecurityIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIpGroupAttribute")
        private String securityIpGroupAttribute;

        @com.aliyun.core.annotation.NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIpList")
        private String securityIpList;

        private SecurityIpGroup(Builder builder) {
            this.securityIpGroupAttribute = builder.securityIpGroupAttribute;
            this.securityIpGroupName = builder.securityIpGroupName;
            this.securityIpList = builder.securityIpList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpGroup create() {
            return builder().build();
        }

        /**
         * @return securityIpGroupAttribute
         */
        public String getSecurityIpGroupAttribute() {
            return this.securityIpGroupAttribute;
        }

        /**
         * @return securityIpGroupName
         */
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        /**
         * @return securityIpList
         */
        public String getSecurityIpList() {
            return this.securityIpList;
        }

        public static final class Builder {
            private String securityIpGroupAttribute; 
            private String securityIpGroupName; 
            private String securityIpList; 

            /**
             * The attribute of the whitelist. This parameter is empty by default.
             * <p>
             * 
             * >  If the instance is authorized to use a service such as Database Autonomy Service (DAS), Data Management (DMS), or Data Transmission Service (DTS), this service automatically generates a **hidden** whitelist for the instance. This type of whitelists cannot be modified or deleted.
             */
            public Builder securityIpGroupAttribute(String securityIpGroupAttribute) {
                this.securityIpGroupAttribute = securityIpGroupAttribute;
                return this;
            }

            /**
             * The name of the whitelist.
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * The IP addresses in the whitelist. A maximum of 1,000 IP addresses can be specified in a whitelist.
             */
            public Builder securityIpList(String securityIpList) {
                this.securityIpList = securityIpList;
                return this;
            }

            public SecurityIpGroup build() {
                return new SecurityIpGroup(this);
            } 

        } 

    }
    public static class SecurityIpGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIpGroup")
        private java.util.List < SecurityIpGroup> securityIpGroup;

        private SecurityIpGroups(Builder builder) {
            this.securityIpGroup = builder.securityIpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpGroups create() {
            return builder().build();
        }

        /**
         * @return securityIpGroup
         */
        public java.util.List < SecurityIpGroup> getSecurityIpGroup() {
            return this.securityIpGroup;
        }

        public static final class Builder {
            private java.util.List < SecurityIpGroup> securityIpGroup; 

            /**
             * SecurityIpGroup.
             */
            public Builder securityIpGroup(java.util.List < SecurityIpGroup> securityIpGroup) {
                this.securityIpGroup = securityIpGroup;
                return this;
            }

            public SecurityIpGroups build() {
                return new SecurityIpGroups(this);
            } 

        } 

    }
}
