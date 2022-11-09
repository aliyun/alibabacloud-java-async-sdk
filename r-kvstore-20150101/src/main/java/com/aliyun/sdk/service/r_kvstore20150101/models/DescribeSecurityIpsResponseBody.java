// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityIpGroups.
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
             * SecurityIpGroupAttribute.
             */
            public Builder securityIpGroupAttribute(String securityIpGroupAttribute) {
                this.securityIpGroupAttribute = securityIpGroupAttribute;
                return this;
            }

            /**
             * SecurityIpGroupName.
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * SecurityIpList.
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
