// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterOnlineConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterOnlineConfigRequest</p>
 */
public class ModifyClusterOnlineConfigRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("clusters")
    private java.util.List < String > clusters;

    @Body
    @NameInMap("config")
    private java.util.Map < String, Integer > config;

    private ModifyClusterOnlineConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clusters = builder.clusters;
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterOnlineConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clusters
     */
    public java.util.List < String > getClusters() {
        return this.clusters;
    }

    /**
     * @return config
     */
    public java.util.Map < String, Integer > getConfig() {
        return this.config;
    }

    public static final class Builder extends Request.Builder<ModifyClusterOnlineConfigRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > clusters; 
        private java.util.Map < String, Integer > config; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterOnlineConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clusters = request.clusters;
            this.config = request.config;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The information about the cluster
         */
        public Builder clusters(java.util.List < String > clusters) {
            this.putBodyParameter("clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * 配置信息
         */
        public Builder config(java.util.Map < String, Integer > config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        @Override
        public ModifyClusterOnlineConfigRequest build() {
            return new ModifyClusterOnlineConfigRequest(this);
        } 

    } 

}
