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
 * {@link TestLargeModelRequest} extends {@link RequestModel}
 *
 * <p>TestLargeModelRequest</p>
 */
public class TestLargeModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseModel")
    private java.util.List<String> baseModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    private String modelCode;

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
    @com.aliyun.core.annotation.NameInMap("UserDialogContent")
    private String userDialogContent;

    private TestLargeModelRequest(Builder builder) {
        super(builder);
        this.baseModel = builder.baseModel;
        this.modelCode = builder.modelCode;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userDialogContent = builder.userDialogContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestLargeModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseModel
     */
    public java.util.List<String> getBaseModel() {
        return this.baseModel;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
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
     * @return userDialogContent
     */
    public String getUserDialogContent() {
        return this.userDialogContent;
    }

    public static final class Builder extends Request.Builder<TestLargeModelRequest, Builder> {
        private java.util.List<String> baseModel; 
        private String modelCode; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String userDialogContent; 

        private Builder() {
            super();
        } 

        private Builder(TestLargeModelRequest request) {
            super(request);
            this.baseModel = request.baseModel;
            this.modelCode = request.modelCode;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.userDialogContent = request.userDialogContent;
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
         * <p>场景ID</p>
         * 
         * <strong>example:</strong>
         * <p>1232</p>
         */
        public Builder modelCode(String modelCode) {
            this.putQueryParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
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
         * <p>用户对话内容</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder userDialogContent(String userDialogContent) {
            this.putQueryParameter("UserDialogContent", userDialogContent);
            this.userDialogContent = userDialogContent;
            return this;
        }

        @Override
        public TestLargeModelRequest build() {
            return new TestLargeModelRequest(this);
        } 

    } 

}
