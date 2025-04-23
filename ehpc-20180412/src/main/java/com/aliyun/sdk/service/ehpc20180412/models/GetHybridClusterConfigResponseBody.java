// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetHybridClusterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetHybridClusterConfigResponseBody</p>
 */
public class GetHybridClusterConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterConfig")
    private String clusterConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetHybridClusterConfigResponseBody model) {
            this.clusterConfig = model.clusterConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configurations returned.</p>
         * <ul>
         * <li>If the parameter Node is null, you can obtain the configurations of the hybrid cloud cluster.</li>
         * <li>If the parameter Node is a specified on-premises compute node, you can obtain the configurations of the on-premises compute node.</li>
         * </ul>
         * <p>This parameter is returned in the ini format. You can use this parameter to configure on-premises cluster nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>ClNjaGcyI6W119Cg****</p>
         */
        public Builder clusterConfig(String clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
