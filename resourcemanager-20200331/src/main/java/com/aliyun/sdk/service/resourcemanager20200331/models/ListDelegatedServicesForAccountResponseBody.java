// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDelegatedServicesForAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListDelegatedServicesForAccountResponseBody</p>
 */
public class ListDelegatedServicesForAccountResponseBody extends TeaModel {
    @NameInMap("DelegatedServices")
    private DelegatedServices delegatedServices;

    @NameInMap("RequestId")
    private String requestId;

    private ListDelegatedServicesForAccountResponseBody(Builder builder) {
        this.delegatedServices = builder.delegatedServices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDelegatedServicesForAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return delegatedServices
     */
    public DelegatedServices getDelegatedServices() {
        return this.delegatedServices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DelegatedServices delegatedServices; 
        private String requestId; 

        /**
         * DelegatedServices.
         */
        public Builder delegatedServices(DelegatedServices delegatedServices) {
            this.delegatedServices = delegatedServices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDelegatedServicesForAccountResponseBody build() {
            return new ListDelegatedServicesForAccountResponseBody(this);
        } 

    } 

    public static class DelegatedService extends TeaModel {
        @NameInMap("DelegationEnabledTime")
        private String delegationEnabledTime;

        @NameInMap("ServicePrincipal")
        private String servicePrincipal;

        @NameInMap("Status")
        private String status;

        private DelegatedService(Builder builder) {
            this.delegationEnabledTime = builder.delegationEnabledTime;
            this.servicePrincipal = builder.servicePrincipal;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelegatedService create() {
            return builder().build();
        }

        /**
         * @return delegationEnabledTime
         */
        public String getDelegationEnabledTime() {
            return this.delegationEnabledTime;
        }

        /**
         * @return servicePrincipal
         */
        public String getServicePrincipal() {
            return this.servicePrincipal;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String delegationEnabledTime; 
            private String servicePrincipal; 
            private String status; 

            /**
             * DelegationEnabledTime.
             */
            public Builder delegationEnabledTime(String delegationEnabledTime) {
                this.delegationEnabledTime = delegationEnabledTime;
                return this;
            }

            /**
             * ServicePrincipal.
             */
            public Builder servicePrincipal(String servicePrincipal) {
                this.servicePrincipal = servicePrincipal;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DelegatedService build() {
                return new DelegatedService(this);
            } 

        } 

    }
    public static class DelegatedServices extends TeaModel {
        @NameInMap("DelegatedService")
        private java.util.List < DelegatedService> delegatedService;

        private DelegatedServices(Builder builder) {
            this.delegatedService = builder.delegatedService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelegatedServices create() {
            return builder().build();
        }

        /**
         * @return delegatedService
         */
        public java.util.List < DelegatedService> getDelegatedService() {
            return this.delegatedService;
        }

        public static final class Builder {
            private java.util.List < DelegatedService> delegatedService; 

            /**
             * DelegatedService.
             */
            public Builder delegatedService(java.util.List < DelegatedService> delegatedService) {
                this.delegatedService = delegatedService;
                return this;
            }

            public DelegatedServices build() {
                return new DelegatedServices(this);
            } 

        } 

    }
}
