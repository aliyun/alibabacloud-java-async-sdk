// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterOnlineConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterOnlineConfigRequest</p>
 */
public class ModifyClusterOnlineConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusters")
    private java.util.List < String > clusters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
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
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The cluster information.
         */
        public Builder clusters(java.util.List < String > clusters) {
            this.putBodyParameter("clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * The configuration information.
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
