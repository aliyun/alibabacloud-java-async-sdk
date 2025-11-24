// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link ListServiceAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceAccountsResponseBody</p>
 */
public class ListServiceAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceAccounts")
    private java.util.List<ServiceAccounts> serviceAccounts;

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
     * @return serviceAccounts
     */
    public java.util.List<ServiceAccounts> getServiceAccounts() {
        return this.serviceAccounts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ServiceAccounts> serviceAccounts; 

        private Builder() {
        } 

        private Builder(ListServiceAccountsResponseBody model) {
            this.requestId = model.requestId;
            this.serviceAccounts = model.serviceAccounts;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8349374D-0F22-5CAB-9DE3-8CCE8EFA71FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of service accounts.</p>
         */
        public Builder serviceAccounts(java.util.List<ServiceAccounts> serviceAccounts) {
            this.serviceAccounts = serviceAccounts;
            return this;
        }

        public ListServiceAccountsResponseBody build() {
            return new ListServiceAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceAccountsResponseBody</p>
     */
    public static class ServiceAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
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

            private Builder() {
            } 

            private Builder(ServiceAccounts model) {
                this.name = model.name;
                this.namespace = model.namespace;
            } 

            /**
             * <p>The name of the service account.</p>
             * 
             * <strong>example:</strong>
             * <p>bookinfo-reviews</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace where the service account resides.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
