// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantSecurityIpGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantSecurityIpGroupsResponseBody</p>
 */
public class DescribeTenantSecurityIpGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpGroups")
    private java.util.List<SecurityIpGroups> securityIpGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<SecurityIpGroups> getSecurityIpGroups() {
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
        private java.util.List<SecurityIpGroups> securityIpGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTenantSecurityIpGroupsResponseBody model) {
            this.requestId = model.requestId;
            this.securityIpGroups = model.securityIpGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469**-AA6F-4D**-B3DB-A***********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of the whitelist groups.</p>
         */
        public Builder securityIpGroups(java.util.List<SecurityIpGroups> securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }

        /**
         * <p>The total number of the whitelist groups.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantSecurityIpGroupsResponseBody build() {
            return new DescribeTenantSecurityIpGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTenantSecurityIpGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantSecurityIpGroupsResponseBody</p>
     */
    public static class SecurityIpGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIpGroupType")
        private String securityIpGroupType;

        @com.aliyun.core.annotation.NameInMap("SecurityIps")
        private String securityIps;

        @com.aliyun.core.annotation.NameInMap("TenantId")
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

            private Builder() {
            } 

            private Builder(SecurityIpGroups model) {
                this.securityIpGroupName = model.securityIpGroupName;
                this.securityIpGroupType = model.securityIpGroupType;
                this.securityIps = model.securityIps;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * <p>The whitelist group type.</p>
             * <ul>
             * <li>instance: the whitelist group from the cluster.</li>
             * <li>tenant: the whitelist group of the current tenant.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tenant</p>
             */
            public Builder securityIpGroupType(String securityIpGroupType) {
                this.securityIpGroupType = securityIpGroupType;
                return this;
            }

            /**
             * <p>The whitelist of IP addresses. It is a string separated by commas, and each object is an IP string or a CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.***.<em>.</em>&quot;</p>
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>t4louaeei****</p>
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
