// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIpsResponseBody</p>
 */
public class DescribeSecurityIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpGroups")
    private SecurityIpGroups securityIpGroups;

    @NameInMap("SecurityIps")
    private String securityIps;

    private DescribeSecurityIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroups = builder.securityIpGroups;
        this.securityIps = builder.securityIps;
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

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityIpGroups securityIpGroups; 
        private String securityIps; 

        /**
         * Whether to display DAS whitelist information.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The IP addresses in the default whitelist.
         */
        public Builder securityIpGroups(SecurityIpGroups securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder securityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }

        public DescribeSecurityIpsResponseBody build() {
            return new DescribeSecurityIpsResponseBody(this);
        } 

    } 

    public static class SecurityIpGroup extends TeaModel {
        @NameInMap("SecurityIpGroupAttribute")
        private String securityIpGroupAttribute;

        @NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @NameInMap("SecurityIpList")
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
             * An array that consists of the information of IP whitelists.
             */
            public Builder securityIpGroupAttribute(String securityIpGroupAttribute) {
                this.securityIpGroupAttribute = securityIpGroupAttribute;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * The name of the IP whitelist.
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
        @NameInMap("SecurityIpGroup")
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
