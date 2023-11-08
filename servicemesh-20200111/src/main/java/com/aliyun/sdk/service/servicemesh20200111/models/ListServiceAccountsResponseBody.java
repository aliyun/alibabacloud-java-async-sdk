// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceAccountsResponseBody</p>
 */
public class ListServiceAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceAccounts")
    private java.util.List < ServiceAccounts> serviceAccounts;

    private ListServiceAccountsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceAccounts = builder.serviceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceAccounts
     */
    public java.util.List < ServiceAccounts> getServiceAccounts() {
        return this.serviceAccounts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ServiceAccounts> serviceAccounts; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceAccounts.
         */
        public Builder serviceAccounts(java.util.List < ServiceAccounts> serviceAccounts) {
            this.serviceAccounts = serviceAccounts;
            return this;
        }

        public ListServiceAccountsResponseBody build() {
            return new ListServiceAccountsResponseBody(this);
        } 

    } 

    public static class ServiceAccounts extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        private ServiceAccounts(Builder builder) {
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceAccounts create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String name; 
            private String namespace; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public ServiceAccounts build() {
                return new ServiceAccounts(this);
            } 

        } 

    }
}
