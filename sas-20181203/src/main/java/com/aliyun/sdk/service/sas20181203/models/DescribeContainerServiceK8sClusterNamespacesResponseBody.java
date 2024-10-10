// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The namespaces.</p>
         */
        public Builder k8sClusterNamespaces(java.util.List < K8sClusterNamespaces> k8sClusterNamespaces) {
            this.k8sClusterNamespaces = k8sClusterNamespaces;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerServiceK8sClusterNamespacesResponseBody build() {
            return new DescribeContainerServiceK8sClusterNamespacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerServiceK8sClusterNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerServiceK8sClusterNamespacesResponseBody</p>
     */
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
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
