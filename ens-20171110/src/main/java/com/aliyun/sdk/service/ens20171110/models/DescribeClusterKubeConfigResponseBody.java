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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c8f0377146d104687ac562eef9403****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1
         * clusters:</p>
         * <ul>
         * <li>cluster:
         *   certificate-authority-data:***
         *   server: https://****:6443
         * name: kubernetes
         * contexts:</li>
         * <li>context:
         *   cluster: kubernetes
         *   user: &quot;2580306074811*****&quot;
         * name: 258*******
         * kind: Config
         * users:</li>
         * <li>name: &quot;2580306074811*****&quot;
         * user:
         *   client-certificate-data:***
         *   client-key-data: ***</li>
         * </ul>
         */
        public Builder kubeconfig(String kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
