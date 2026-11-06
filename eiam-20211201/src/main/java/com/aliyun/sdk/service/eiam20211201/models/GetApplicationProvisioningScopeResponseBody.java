// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetApplicationProvisioningScopeResponseBody model) {
            this.applicationProvisioningScope = model.applicationProvisioningScope;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The account synchronization scope.</p>
         */
        public Builder applicationProvisioningScope(ApplicationProvisioningScope applicationProvisioningScope) {
            this.applicationProvisioningScope = applicationProvisioningScope;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationProvisioningScopeResponseBody build() {
            return new GetApplicationProvisioningScopeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationProvisioningScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationProvisioningScopeResponseBody</p>
     */
    public static class ApplicationProvisioningScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIds")
        private java.util.List<String> groupIds;

        @com.aliyun.core.annotation.NameInMap("MaxQuota")
        private Integer maxQuota;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
        private java.util.List<String> organizationalUnitIds;

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
        public java.util.List<String> getGroupIds() {
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
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        /**
         * @return usedQuota
         */
        public Integer getUsedQuota() {
            return this.usedQuota;
        }

        public static final class Builder {
            private java.util.List<String> groupIds; 
            private Integer maxQuota; 
            private java.util.List<String> organizationalUnitIds; 
            private Integer usedQuota; 

            private Builder() {
            } 

            private Builder(ApplicationProvisioningScope model) {
                this.groupIds = model.groupIds;
                this.maxQuota = model.maxQuota;
                this.organizationalUnitIds = model.organizationalUnitIds;
                this.usedQuota = model.usedQuota;
            } 

            /**
             * <p>The list of groups authorized for synchronization.</p>
             */
            public Builder groupIds(java.util.List<String> groupIds) {
                this.groupIds = groupIds;
                return this;
            }

            /**
             * <p>The maximum quota of authorized principals for the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxQuota(Integer maxQuota) {
                this.maxQuota = maxQuota;
                return this;
            }

            /**
             * <p>The list of organizational unit scopes authorized for account synchronization.</p>
             */
            public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
                this.organizationalUnitIds = organizationalUnitIds;
                return this;
            }

            /**
             * <p>The used quota of authorized principals.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
