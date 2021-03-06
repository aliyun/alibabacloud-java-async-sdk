// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClusterKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHubClusterKubeconfigResponseBody</p>
 */
public class DescribeHubClusterKubeconfigResponseBody extends TeaModel {
    @NameInMap("Kubeconfig")
    private String kubeconfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHubClusterKubeconfigResponseBody(Builder builder) {
        this.kubeconfig = builder.kubeconfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClusterKubeconfigResponseBody create() {
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

        public DescribeHubClusterKubeconfigResponseBody build() {
            return new DescribeHubClusterKubeconfigResponseBody(this);
        } 

    } 

}
