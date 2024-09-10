// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerServiceK8sClusterNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerServiceK8sClusterNamespacesResponseBody</p>
 */
public class DescribeContainerServiceK8sClusterNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("K8sClusterNamespaces")
    private java.util.List < K8sClusterNamespaces> k8sClusterNamespaces;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerServiceK8sClusterNamespacesResponseBody(Builder builder) {
        this.k8sClusterNamespaces = builder.k8sClusterNamespaces;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerServiceK8sClusterNamespacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return k8sClusterNamespaces
     */
    public java.util.List < K8sClusterNamespaces> getK8sClusterNamespaces() {
        return this.k8sClusterNamespaces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < K8sClusterNamespaces> k8sClusterNamespaces; 
        private String requestId; 

        /**
         * The namespaces.
         */
        public Builder k8sClusterNamespaces(java.util.List < K8sClusterNamespaces> k8sClusterNamespaces) {
            this.k8sClusterNamespaces = k8sClusterNamespaces;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerServiceK8sClusterNamespacesResponseBody build() {
            return new DescribeContainerServiceK8sClusterNamespacesResponseBody(this);
        } 

    } 

    public static class K8sClusterNamespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private K8sClusterNamespaces(Builder builder) {
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sClusterNamespaces create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String namespace; 

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public K8sClusterNamespaces build() {
                return new K8sClusterNamespaces(this);
            } 

        } 

    }
}
