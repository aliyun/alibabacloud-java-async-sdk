// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterKubeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterKubeConfigResponseBody</p>
 */
public class DescribeClusterKubeConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Kubeconfig")
    private String kubeconfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterKubeConfigResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.kubeconfig = builder.kubeconfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterKubeConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return kubeconfig
     */
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String kubeconfig; 
        private String requestId; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Kubeconfig.
         */
        public Builder kubeconfig(String kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterKubeConfigResponseBody build() {
            return new DescribeClusterKubeConfigResponseBody(this);
        } 

    } 

}
