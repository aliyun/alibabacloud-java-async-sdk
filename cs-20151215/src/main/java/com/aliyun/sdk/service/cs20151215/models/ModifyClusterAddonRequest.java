// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterAddonRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterAddonRequest</p>
 */
public class ModifyClusterAddonRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    private String clusterId;

    @Path
    @NameInMap("component_id")
    private String componentId;

    @Body
    @NameInMap("config")
    private String config;

    private ModifyClusterAddonRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentId = builder.componentId;
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterAddonRequest create() {
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
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    public static final class Builder extends Request.Builder<ModifyClusterAddonRequest, Builder> {
        private String clusterId; 
        private String componentId; 
        private String config; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterAddonRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentId = request.componentId;
            this.config = request.config;
        } 

        /**
         * 集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 组件ID
         */
        public Builder componentId(String componentId) {
            this.putPathParameter("component_id", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * 自定义参数设置
         */
        public Builder config(String config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        @Override
        public ModifyClusterAddonRequest build() {
            return new ModifyClusterAddonRequest(this);
        } 

    } 

}
