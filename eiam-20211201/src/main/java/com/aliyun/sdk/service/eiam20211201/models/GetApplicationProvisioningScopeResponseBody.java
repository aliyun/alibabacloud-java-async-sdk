// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationProvisioningScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningScopeResponseBody</p>
 */
public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationProvisioningScope")
    private ApplicationProvisioningScope applicationProvisioningScope;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationProvisioningScopeResponseBody(Builder builder) {
        this.applicationProvisioningScope = builder.applicationProvisioningScope;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationProvisioningScopeResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationProvisioningScope
     */
    public ApplicationProvisioningScope getApplicationProvisioningScope() {
        return this.applicationProvisioningScope;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationProvisioningScope applicationProvisioningScope; 
        private String requestId; 

        /**
         * The scope of account synchronization.
         */
        public Builder applicationProvisioningScope(ApplicationProvisioningScope applicationProvisioningScope) {
            this.applicationProvisioningScope = applicationProvisioningScope;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationProvisioningScopeResponseBody build() {
            return new GetApplicationProvisioningScopeResponseBody(this);
        } 

    } 

    public static class ApplicationProvisioningScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIds")
        private java.util.List < String > groupIds;

        @com.aliyun.core.annotation.NameInMap("MaxQuota")
        private Integer maxQuota;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
        private java.util.List < String > organizationalUnitIds;

        @com.aliyun.core.annotation.NameInMap("UsedQuota")
        private Integer usedQuota;

        private ApplicationProvisioningScope(Builder builder) {
            this.groupIds = builder.groupIds;
            this.maxQuota = builder.maxQuota;
            this.organizationalUnitIds = builder.organizationalUnitIds;
            this.usedQuota = builder.usedQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationProvisioningScope create() {
            return builder().build();
        }

        /**
         * @return groupIds
         */
        public java.util.List < String > getGroupIds() {
            return this.groupIds;
        }

        /**
         * @return maxQuota
         */
        public Integer getMaxQuota() {
            return this.maxQuota;
        }

        /**
         * @return organizationalUnitIds
         */
        public java.util.List < String > getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        /**
         * @return usedQuota
         */
        public Integer getUsedQuota() {
            return this.usedQuota;
        }

        public static final class Builder {
            private java.util.List < String > groupIds; 
            private Integer maxQuota; 
            private java.util.List < String > organizationalUnitIds; 
            private Integer usedQuota; 

            /**
             * 同步授权的组列表
             */
            public Builder groupIds(java.util.List < String > groupIds) {
                this.groupIds = groupIds;
                return this;
            }

            /**
             * 租户最大授权主体quota数量
             */
            public Builder maxQuota(Integer maxQuota) {
                this.maxQuota = maxQuota;
                return this;
            }

            /**
             * The list of organizational units that are authorized for account synchronization.
             */
            public Builder organizationalUnitIds(java.util.List < String > organizationalUnitIds) {
                this.organizationalUnitIds = organizationalUnitIds;
                return this;
            }

            /**
             * 已使用授权主体quota数量
             */
            public Builder usedQuota(Integer usedQuota) {
                this.usedQuota = usedQuota;
                return this;
            }

            public ApplicationProvisioningScope build() {
                return new ApplicationProvisioningScope(this);
            } 

        } 

    }
}
