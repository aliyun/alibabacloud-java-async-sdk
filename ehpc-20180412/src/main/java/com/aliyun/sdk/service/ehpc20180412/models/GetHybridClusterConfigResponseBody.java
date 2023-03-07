// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHybridClusterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetHybridClusterConfigResponseBody</p>
 */
public class GetHybridClusterConfigResponseBody extends TeaModel {
    @NameInMap("ClusterConfig")
    private String clusterConfig;

    @NameInMap("RequestId")
    private String requestId;

    private GetHybridClusterConfigResponseBody(Builder builder) {
        this.clusterConfig = builder.clusterConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHybridClusterConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterConfig
     */
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterConfig; 
        private String requestId; 

        /**
         * The configurations returned.
         * <p>
         * 
         * *   If the parameter Node is null, you can obtain the configurations of the hybrid cloud cluster.
         * *   If the parameter Node is a specified on-premises compute node, you can obtain the configurations of the on-premises compute node.
         * 
         * This parameter is returned in the ini format. You can use this parameter to configure on-premises cluster nodes.
         */
        public Builder clusterConfig(String clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHybridClusterConfigResponseBody build() {
            return new GetHybridClusterConfigResponseBody(this);
        } 

    } 

}
