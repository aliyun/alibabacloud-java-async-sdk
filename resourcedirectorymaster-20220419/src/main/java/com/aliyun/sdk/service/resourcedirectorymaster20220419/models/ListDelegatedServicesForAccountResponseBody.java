// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link ListDelegatedServicesForAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListDelegatedServicesForAccountResponseBody</p>
 */
public class ListDelegatedServicesForAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DelegatedServices")
    private DelegatedServices delegatedServices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the trusted services.</p>
         * <blockquote>
         * <p>If the value of this parameter is empty, the member is not specified as a delegated administrator account.</p>
         * </blockquote>
         */
        public Builder delegatedServices(DelegatedServices delegatedServices) {
            this.delegatedServices = delegatedServices;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D9C03B94-9396-4794-A74B-13DC437556A6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDelegatedServicesForAccountResponseBody build() {
            return new ListDelegatedServicesForAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDelegatedServicesForAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListDelegatedServicesForAccountResponseBody</p>
     */
    public static class DelegatedService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelegationEnabledTime")
        private String delegationEnabledTime;

        @com.aliyun.core.annotation.NameInMap("ServicePrincipal")
        private String servicePrincipal;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The time when the member was specified as a delegated administrator account.</p>
             * 
             * <strong>example:</strong>
             * <p>1616652684164</p>
             */
            public Builder delegationEnabledTime(String delegationEnabledTime) {
                this.delegationEnabledTime = delegationEnabledTime;
                return this;
            }

            /**
             * <p>The identifier of the trusted service.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudfw.aliyuncs.com</p>
             */
            public Builder servicePrincipal(String servicePrincipal) {
                this.servicePrincipal = servicePrincipal;
                return this;
            }

            /**
             * <p>The status of the trusted service. Valid values:</p>
             * <ul>
             * <li>ENABLED: enabled</li>
             * <li>DISABLED: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
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
    /**
     * 
     * {@link ListDelegatedServicesForAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListDelegatedServicesForAccountResponseBody</p>
     */
    public static class DelegatedServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelegatedService")
        private java.util.List<DelegatedService> delegatedService;

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
        public java.util.List<DelegatedService> getDelegatedService() {
            return this.delegatedService;
        }

        public static final class Builder {
            private java.util.List<DelegatedService> delegatedService; 

            /**
             * DelegatedService.
             */
            public Builder delegatedService(java.util.List<DelegatedService> delegatedService) {
                this.delegatedService = delegatedService;
                return this;
            }

            public DelegatedServices build() {
                return new DelegatedServices(this);
            } 

        } 

    }
}
