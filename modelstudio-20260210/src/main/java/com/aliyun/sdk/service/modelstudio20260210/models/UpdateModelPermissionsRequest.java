// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link UpdateModelPermissionsRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelPermissionsRequest</p>
 */
public class UpdateModelPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accessAllEntities")
    private String accessAllEntities;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("models")
    private java.util.List<Models> models;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String workspaceId;

    private UpdateModelPermissionsRequest(Builder builder) {
        super(builder);
        this.accessAllEntities = builder.accessAllEntities;
        this.models = builder.models;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessAllEntities
     */
    public String getAccessAllEntities() {
        return this.accessAllEntities;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateModelPermissionsRequest, Builder> {
        private String accessAllEntities; 
        private java.util.List<Models> models; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelPermissionsRequest request) {
            super(request);
            this.accessAllEntities = request.accessAllEntities;
            this.models = request.models;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * accessAllEntities.
         */
        public Builder accessAllEntities(String accessAllEntities) {
            this.putBodyParameter("accessAllEntities", accessAllEntities);
            this.accessAllEntities = accessAllEntities;
            return this;
        }

        /**
         * models.
         */
        public Builder models(java.util.List<Models> models) {
            this.putBodyParameter("models", models);
            this.models = models;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-32klhjk2312334jkh</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateModelPermissionsRequest build() {
            return new UpdateModelPermissionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelPermissionsRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelPermissionsRequest</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploy")
        private Boolean deploy;

        @com.aliyun.core.annotation.NameInMap("fineTune")
        private Boolean fineTune;

        @com.aliyun.core.annotation.NameInMap("inference")
        private Boolean inference;

        @com.aliyun.core.annotation.NameInMap("model")
        @com.aliyun.core.annotation.Validation(required = true)
        private String model;

        private Models(Builder builder) {
            this.deploy = builder.deploy;
            this.fineTune = builder.fineTune;
            this.inference = builder.inference;
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return deploy
         */
        public Boolean getDeploy() {
            return this.deploy;
        }

        /**
         * @return fineTune
         */
        public Boolean getFineTune() {
            return this.fineTune;
        }

        /**
         * @return inference
         */
        public Boolean getInference() {
            return this.inference;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private Boolean deploy; 
            private Boolean fineTune; 
            private Boolean inference; 
            private String model; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.deploy = model.deploy;
                this.fineTune = model.fineTune;
                this.inference = model.inference;
                this.model = model.model;
            } 

            /**
             * deploy.
             */
            public Builder deploy(Boolean deploy) {
                this.deploy = deploy;
                return this;
            }

            /**
             * fineTune.
             */
            public Builder fineTune(Boolean fineTune) {
                this.fineTune = fineTune;
                return this;
            }

            /**
             * inference.
             */
            public Builder inference(Boolean inference) {
                this.inference = inference;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
