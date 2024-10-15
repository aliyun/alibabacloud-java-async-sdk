// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyClusterAddonRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterAddonRequest</p>
 */
public class ModifyClusterAddonRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("component_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c71d616e629ff40d5b42d7bb87770****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The component ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coredns</p>
         */
        public Builder componentId(String componentId) {
            this.putPathParameter("component_id", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The custom parameter settings that you want to use.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CpuRequest&quot;:&quot;800m&quot;}</p>
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
