// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLaboratoriesRequest} extends {@link RequestModel}
 *
 * <p>ListLaboratoriesRequest</p>
 */
public class ListLaboratoriesRequest extends Request {
    @Query
    @NameInMap("Environment")
    private String environment;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("Status")
    private String status;

    private ListLaboratoriesRequest(Builder builder) {
        super(builder);
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
        private String environment; 
        private String instanceId; 
        private String sceneId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListLaboratoriesRequest request) {
            super(request);
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.sceneId = request.sceneId;
            this.status = request.status;
        } 

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Status.
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
