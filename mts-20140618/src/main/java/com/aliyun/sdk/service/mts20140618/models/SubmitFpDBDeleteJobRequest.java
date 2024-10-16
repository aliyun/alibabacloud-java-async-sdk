// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitFpDBDeleteJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitFpDBDeleteJobRequest</p>
 */
public class SubmitFpDBDeleteJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelType")
    private String delType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FpDBId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fpDBId;

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
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitFpDBDeleteJobRequest(Builder builder) {
        super(builder);
        this.delType = builder.delType;
        this.fpDBId = builder.fpDBId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitFpDBDeleteJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delType
     */
    public String getDelType() {
        return this.delType;
    }

    /**
     * @return fpDBId
     */
    public String getFpDBId() {
        return this.fpDBId;
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitFpDBDeleteJobRequest, Builder> {
        private String delType; 
        private String fpDBId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitFpDBDeleteJobRequest request) {
            super(request);
            this.delType = request.delType;
            this.fpDBId = request.fpDBId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.userData = request.userData;
        } 

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><strong>Purge</strong>: clears the media fingerprint library. The content in the library is deleted, but the library is not deleted.</li>
         * <li><strong>Delete</strong>: deletes the media fingerprint library. Both the library and its content are deleted.</li>
         * <li>Default value: <strong>Purge</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Purge</p>
         */
        public Builder delType(String delType) {
            this.putQueryParameter("DelType", delType);
            this.delType = delType;
            return this;
        }

        /**
         * <p>The ID of the media fingerprint library. You can obtain the library ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/170149.html">CreateFpShotDB</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        public Builder fpDBId(String fpDBId) {
            this.putQueryParameter("FpDBId", fpDBId);
            this.fpDBId = fpDBId;
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue. This ID can be used to associate the job with a notification method. To view the MPS queue ID, log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane.</p>
         * 
         * <strong>example:</strong>
         * <p>fb712a6890464059b1b2ea7c8647****</p>
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
         * <p>The custom data. The value can contain letters and digits and can be up to 128 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>example data</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitFpDBDeleteJobRequest build() {
            return new SubmitFpDBDeleteJobRequest(this);
        } 

    } 

}
