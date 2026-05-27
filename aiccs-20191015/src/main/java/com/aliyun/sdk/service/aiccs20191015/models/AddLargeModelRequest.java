// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link AddLargeModelRequest} extends {@link RequestModel}
 *
 * <p>AddLargeModelRequest</p>
 */
public class AddLargeModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseModel")
    private java.util.List<String> baseModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelUrl")
    private String modelUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Temperature")
    private Double temperature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Long topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopP")
    private Double topP;

    private AddLargeModelRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.baseModel = builder.baseModel;
        this.modelName = builder.modelName;
        this.modelUrl = builder.modelUrl;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.temperature = builder.temperature;
        this.topK = builder.topK;
        this.topP = builder.topP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLargeModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return baseModel
     */
    public java.util.List<String> getBaseModel() {
        return this.baseModel;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelUrl
     */
    public String getModelUrl() {
        return this.modelUrl;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return temperature
     */
    public Double getTemperature() {
        return this.temperature;
    }

    /**
     * @return topK
     */
    public Long getTopK() {
        return this.topK;
    }

    /**
     * @return topP
     */
    public Double getTopP() {
        return this.topP;
    }

    public static final class Builder extends Request.Builder<AddLargeModelRequest, Builder> {
        private String authCode; 
        private java.util.List<String> baseModel; 
        private String modelName; 
        private String modelUrl; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Double temperature; 
        private Long topK; 
        private Double topP; 

        private Builder() {
            super();
        } 

        private Builder(AddLargeModelRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.baseModel = request.baseModel;
            this.modelName = request.modelName;
            this.modelUrl = request.modelUrl;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.temperature = request.temperature;
            this.topK = request.topK;
            this.topP = request.topP;
        } 

        /**
         * <p>授权码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>基础模型</p>
         */
        public Builder baseModel(java.util.List<String> baseModel) {
            String baseModelShrink = shrink(baseModel, "BaseModel", "json");
            this.putQueryParameter("BaseModel", baseModelShrink);
            this.baseModel = baseModel;
            return this;
        }

        /**
         * <p>模型名称</p>
         * 
         * <strong>example:</strong>
         * <p>Test Model Name</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>模型地址</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder modelUrl(String modelUrl) {
            this.putQueryParameter("ModelUrl", modelUrl);
            this.modelUrl = modelUrl;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>温度</p>
         * 
         * <strong>example:</strong>
         * <p>16.46</p>
         */
        public Builder temperature(Double temperature) {
            this.putQueryParameter("Temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * <p>topK</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        public Builder topK(Long topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>topP</p>
         * 
         * <strong>example:</strong>
         * <p>73.64386</p>
         */
        public Builder topP(Double topP) {
            this.putQueryParameter("TopP", topP);
            this.topP = topP;
            return this;
        }

        @Override
        public AddLargeModelRequest build() {
            return new AddLargeModelRequest(this);
        } 

    } 

}
