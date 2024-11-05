// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIpsResponseBody</p>
 */
public class DescribeSecurityIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpGroups")
    private SecurityIpGroups securityIpGroups;

    @com.aliyun.core.annotation.NameInMap("SecurityIps")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FC724D23-2962-479E-ABB1-606C935AE7FD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the information of IP whitelists.</p>
         */
        public Builder securityIpGroups(SecurityIpGroups securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }

        /**
         * <p>The IP addresses in the default whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>47.xxx.xxx.xx,100.xxx.xxx.0/24</p>
         */
        public Builder securityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }

        public DescribeSecurityIpsResponseBody build() {
            return new DescribeSecurityIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIpsResponseBody</p>
     */
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
             * <p>The attribute of the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>hidden</p>
             */
            public Builder securityIpGroupAttribute(String securityIpGroupAttribute) {
                this.securityIpGroupAttribute = securityIpGroupAttribute;
                return this;
            }

            /**
             * <p>The name of the IP whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * <p>The name of the IP whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>47.xxx.xxx.xx,100.xxx.xxx.0/24</p>
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
    /**
     * 
     * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIpsResponseBody</p>
     */
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
