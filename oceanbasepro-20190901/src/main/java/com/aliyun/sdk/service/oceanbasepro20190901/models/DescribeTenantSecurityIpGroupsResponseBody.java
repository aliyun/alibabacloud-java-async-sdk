// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantSecurityIpGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantSecurityIpGroupsResponseBody</p>
 */
public class DescribeTenantSecurityIpGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpGroups")
    private java.util.List < SecurityIpGroups> securityIpGroups;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTenantSecurityIpGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroups = builder.securityIpGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantSecurityIpGroupsResponseBody create() {
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
    public java.util.List < SecurityIpGroups> getSecurityIpGroups() {
        return this.securityIpGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecurityIpGroups> securityIpGroups; 
        private Integer totalCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of the whitelist groups.
         */
        public Builder securityIpGroups(java.util.List < SecurityIpGroups> securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }

        /**
         * The total number of the whitelist groups.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantSecurityIpGroupsResponseBody build() {
            return new DescribeTenantSecurityIpGroupsResponseBody(this);
        } 

    } 

    public static class SecurityIpGroups extends TeaModel {
        @NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @NameInMap("SecurityIpGroupType")
        private String securityIpGroupType;

        @NameInMap("SecurityIps")
        private String securityIps;

        @NameInMap("TenantId")
        private String tenantId;

        private SecurityIpGroups(Builder builder) {
            this.securityIpGroupName = builder.securityIpGroupName;
            this.securityIpGroupType = builder.securityIpGroupType;
            this.securityIps = builder.securityIps;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpGroups create() {
            return builder().build();
        }

        /**
         * @return securityIpGroupName
         */
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        /**
         * @return securityIpGroupType
         */
        public String getSecurityIpGroupType() {
            return this.securityIpGroupType;
        }

        /**
         * @return securityIps
         */
        public String getSecurityIps() {
            return this.securityIps;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String securityIpGroupName; 
            private String securityIpGroupType; 
            private String securityIps; 
            private String tenantId; 

            /**
             * The group name.
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * The whitelist group type.
             * <p>
             * - instance: the whitelist group from the cluster.
             * - tenant: the whitelist group of the current tenant.
             */
            public Builder securityIpGroupType(String securityIpGroupType) {
                this.securityIpGroupType = securityIpGroupType;
                return this;
            }

            /**
             * The whitelist of IP addresses. It is a string separated by commas, and each object is an IP string or a CIDR block.
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public SecurityIpGroups build() {
                return new SecurityIpGroups(this);
            } 

        } 

    }
}
