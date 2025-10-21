// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link CreateModelInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateModelInstanceRequest</p>
 */
public class CreateModelInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EasServiceId")
    private String easServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EasServiceName")
    private String easServiceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCallName")
    private String modelCallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCategoryId")
    private Long modelCategoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelToken")
    private String modelToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelUrl")
    private String modelUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelVpcUrl")
    private String modelVpcUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private CreateModelInstanceRequest(Builder builder) {
        super(builder);
        this.easServiceId = builder.easServiceId;
        this.easServiceName = builder.easServiceName;
        this.modelCallName = builder.modelCallName;
        this.modelCategoryId = builder.modelCategoryId;
        this.modelToken = builder.modelToken;
        this.modelUrl = builder.modelUrl;
        this.modelVpcUrl = builder.modelVpcUrl;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return easServiceId
     */
    public String getEasServiceId() {
        return this.easServiceId;
    }

    /**
     * @return easServiceName
     */
    public String getEasServiceName() {
        return this.easServiceName;
    }

    /**
     * @return modelCallName
     */
    public String getModelCallName() {
        return this.modelCallName;
    }

    /**
     * @return modelCategoryId
     */
    public Long getModelCategoryId() {
        return this.modelCategoryId;
    }

    /**
     * @return modelToken
     */
    public String getModelToken() {
        return this.modelToken;
    }

    /**
     * @return modelUrl
     */
    public String getModelUrl() {
        return this.modelUrl;
    }

    /**
     * @return modelVpcUrl
     */
    public String getModelVpcUrl() {
        return this.modelVpcUrl;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateModelInstanceRequest, Builder> {
        private String easServiceId; 
        private String easServiceName; 
        private String modelCallName; 
        private Long modelCategoryId; 
        private String modelToken; 
        private String modelUrl; 
        private String modelVpcUrl; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelInstanceRequest request) {
            super(request);
            this.easServiceId = request.easServiceId;
            this.easServiceName = request.easServiceName;
            this.modelCallName = request.modelCallName;
            this.modelCategoryId = request.modelCategoryId;
            this.modelToken = request.modelToken;
            this.modelUrl = request.modelUrl;
            this.modelVpcUrl = request.modelVpcUrl;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * EasServiceId.
         */
        public Builder easServiceId(String easServiceId) {
            this.putQueryParameter("EasServiceId", easServiceId);
            this.easServiceId = easServiceId;
            return this;
        }

        /**
         * EasServiceName.
         */
        public Builder easServiceName(String easServiceName) {
            this.putQueryParameter("EasServiceName", easServiceName);
            this.easServiceName = easServiceName;
            return this;
        }

        /**
         * ModelCallName.
         */
        public Builder modelCallName(String modelCallName) {
            this.putQueryParameter("ModelCallName", modelCallName);
            this.modelCallName = modelCallName;
            return this;
        }

        /**
         * ModelCategoryId.
         */
        public Builder modelCategoryId(Long modelCategoryId) {
            this.putQueryParameter("ModelCategoryId", modelCategoryId);
            this.modelCategoryId = modelCategoryId;
            return this;
        }

        /**
         * <p>EAS Token</p>
         * 
         * <strong>example:</strong>
         * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
         */
        public Builder modelToken(String modelToken) {
            this.putQueryParameter("ModelToken", modelToken);
            this.modelToken = modelToken;
            return this;
        }

        /**
         * ModelUrl.
         */
        public Builder modelUrl(String modelUrl) {
            this.putQueryParameter("ModelUrl", modelUrl);
            this.modelUrl = modelUrl;
            return this;
        }

        /**
         * ModelVpcUrl.
         */
        public Builder modelVpcUrl(String modelVpcUrl) {
            this.putQueryParameter("ModelVpcUrl", modelVpcUrl);
            this.modelVpcUrl = modelVpcUrl;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateModelInstanceRequest build() {
            return new CreateModelInstanceRequest(this);
        } 

    } 

}
