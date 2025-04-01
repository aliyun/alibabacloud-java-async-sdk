// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSecurityIpsResponseBody model) {
            this.requestId = model.requestId;
            this.securityIpGroups = model.securityIpGroups;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EFC9161F-15E3-4A6E-8A99-C09916D1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The whitelists of the instance.</p>
         */
        public Builder securityIpGroups(SecurityIpGroups securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
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

            private Builder() {
            } 

            private Builder(SecurityIpGroup model) {
                this.securityIpGroupAttribute = model.securityIpGroupAttribute;
                this.securityIpGroupName = model.securityIpGroupName;
                this.securityIpList = model.securityIpList;
            } 

            /**
             * <p>The attribute of the whitelist. This parameter is empty by default.</p>
             * <blockquote>
             * <p> If the instance is authorized to use a service such as Database Autonomy Service (DAS), Data Management (DMS), or Data Transmission Service (DTS), this service automatically generates a <strong>hidden</strong> whitelist for the instance. This type of whitelists cannot be modified or deleted.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hidden</p>
             */
            public Builder securityIpGroupAttribute(String securityIpGroupAttribute) {
                this.securityIpGroupAttribute = securityIpGroupAttribute;
                return this;
            }

            /**
             * <p>The name of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist. A maximum of 1,000 IP addresses can be specified in a whitelist.</p>
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
        private java.util.List<SecurityIpGroup> securityIpGroup;

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
        public java.util.List<SecurityIpGroup> getSecurityIpGroup() {
            return this.securityIpGroup;
        }

        public static final class Builder {
            private java.util.List<SecurityIpGroup> securityIpGroup; 

            private Builder() {
            } 

            private Builder(SecurityIpGroups model) {
                this.securityIpGroup = model.securityIpGroup;
            } 

            /**
             * SecurityIpGroup.
             */
            public Builder securityIpGroup(java.util.List<SecurityIpGroup> securityIpGroup) {
                this.securityIpGroup = securityIpGroup;
                return this;
            }

            public SecurityIpGroups build() {
                return new SecurityIpGroups(this);
            } 

        } 

    }
}
