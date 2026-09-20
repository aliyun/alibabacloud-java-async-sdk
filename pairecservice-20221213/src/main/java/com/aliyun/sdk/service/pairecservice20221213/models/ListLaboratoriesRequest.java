// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListLaboratoriesRequest} extends {@link RequestModel}
 *
 * <p>ListLaboratoriesRequest</p>
 */
public class ListLaboratoriesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListLaboratoriesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLaboratoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListLaboratoriesRequest, Builder> {
        private String regionId; 
        private String environment; 
        private String instanceId; 
        private String sceneId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListLaboratoriesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.sceneId = request.sceneId;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The laboratory environment.</p>
         * <ul>
         * <li><p><code>Daily</code>: the daily environment</p>
         * </li>
         * <li><p><code>Pre</code>: the pre-production environment</p>
         * </li>
         * <li><p><code>Prod</code>: the production environment</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The ID of the instance. You can obtain this ID by calling the <code>ListInstances</code> API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the scene. You can obtain this ID by calling the <code>ListScenes</code> API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The laboratory status.</p>
         * <ul>
         * <li><p><code>Offline</code>: The laboratory is offline.</p>
         * </li>
         * <li><p><code>Online</code>: The laboratory is online.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Offline</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListLaboratoriesRequest build() {
            return new ListLaboratoriesRequest(this);
        } 

    } 

}
