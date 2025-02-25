// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigClusterNameRequest} extends {@link RequestModel}
 *
 * <p>ConfigClusterNameRequest</p>
 */
public class ConfigClusterNameRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    private ConfigClusterNameRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigClusterNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    public static final class Builder extends Request.Builder<ConfigClusterNameRequest, Builder> {
        private String clusterId; 
        private String clusterName; 

        private Builder() {
            super();
        } 

        private Builder(ConfigClusterNameRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The cluster name.
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        @Override
        public ConfigClusterNameRequest build() {
            return new ConfigClusterNameRequest(this);
        } 

    } 

}
