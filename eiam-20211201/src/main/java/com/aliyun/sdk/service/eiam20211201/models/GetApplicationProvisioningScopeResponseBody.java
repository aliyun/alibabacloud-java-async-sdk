// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationProvisioningScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningScopeResponseBody</p>
 */
public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisioningScope")
    private ApplicationProvisioningScope applicationProvisioningScope;

    @NameInMap("RequestId")
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
        @NameInMap("OrganizationalUnitIds")
        private java.util.List < String > organizationalUnitIds;

        private ApplicationProvisioningScope(Builder builder) {
            this.organizationalUnitIds = builder.organizationalUnitIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationProvisioningScope create() {
            return builder().build();
        }

        /**
         * @return organizationalUnitIds
         */
        public java.util.List < String > getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        public static final class Builder {
            private java.util.List < String > organizationalUnitIds; 

            /**
             * The list of organizational units that are authorized for account synchronization.
             */
            public Builder organizationalUnitIds(java.util.List < String > organizationalUnitIds) {
                this.organizationalUnitIds = organizationalUnitIds;
                return this;
            }

            public ApplicationProvisioningScope build() {
                return new ApplicationProvisioningScope(this);
            } 

        } 

    }
}
