// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSnapshotJobRequest</p>
 */
public class SubmitSnapshotJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitSnapshotJobRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotConfig = builder.snapshotConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSnapshotJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
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
     * @return snapshotConfig
     */
    public String getSnapshotConfig() {
        return this.snapshotConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitSnapshotJobRequest, Builder> {
        private String input; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSnapshotJobRequest request) {
            super(request);
            this.input = request.input;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotConfig = request.snapshotConfig;
            this.userData = request.userData;
        } 

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
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
         * SnapshotConfig.
         */
        public Builder snapshotConfig(String snapshotConfig) {
            this.putQueryParameter("SnapshotConfig", snapshotConfig);
            this.snapshotConfig = snapshotConfig;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitSnapshotJobRequest build() {
            return new SubmitSnapshotJobRequest(this);
        } 

    } 

}
