// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshKubeconfigResponseBody</p>
 */
public class DescribeServiceMeshKubeconfigResponseBody extends TeaModel {
    @NameInMap("Kubeconfig")
    private String kubeconfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshKubeconfigResponseBody(Builder builder) {
        this.kubeconfig = builder.kubeconfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshKubeconfigResponseBody create() {
        return builder().build();
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
        private String kubeconfig; 
        private String requestId; 

        /**
         * The content of the kubeconfig file of the cluster.
         */
        public Builder kubeconfig(String kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshKubeconfigResponseBody build() {
            return new DescribeServiceMeshKubeconfigResponseBody(this);
        } 

    } 

}
