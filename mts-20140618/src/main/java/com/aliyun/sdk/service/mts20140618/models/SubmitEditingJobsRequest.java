// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitEditingJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitEditingJobsRequest</p>
 */
public class SubmitEditingJobsRequest extends Request {
    @Query
    @NameInMap("EditingInputs")
    private String editingInputs;

    @Query
    @NameInMap("EditingJobOssFileRoleArn")
    private String editingJobOssFileRoleArn;

    @Query
    @NameInMap("EditingJobOssFileUid")
    private Long editingJobOssFileUid;

    @Query
    @NameInMap("EditingJobOutputs")
    private String editingJobOutputs;

    @Query
    @NameInMap("EditingJobURL")
    private String editingJobURL;

    @Query
    @NameInMap("OutputBucket")
    private String outputBucket;

    @Query
    @NameInMap("OutputLocation")
    private String outputLocation;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SubmitEditingJobsRequest(Builder builder) {
        super(builder);
        this.editingInputs = builder.editingInputs;
        this.editingJobOssFileRoleArn = builder.editingJobOssFileRoleArn;
        this.editingJobOssFileUid = builder.editingJobOssFileUid;
        this.editingJobOutputs = builder.editingJobOutputs;
        this.editingJobURL = builder.editingJobURL;
        this.outputBucket = builder.outputBucket;
        this.outputLocation = builder.outputLocation;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEditingJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return editingInputs
     */
    public String getEditingInputs() {
        return this.editingInputs;
    }

    /**
     * @return editingJobOssFileRoleArn
     */
    public String getEditingJobOssFileRoleArn() {
        return this.editingJobOssFileRoleArn;
    }

    /**
     * @return editingJobOssFileUid
     */
    public Long getEditingJobOssFileUid() {
        return this.editingJobOssFileUid;
    }

    /**
     * @return editingJobOutputs
     */
    public String getEditingJobOutputs() {
        return this.editingJobOutputs;
    }

    /**
     * @return editingJobURL
     */
    public String getEditingJobURL() {
        return this.editingJobURL;
    }

    /**
     * @return outputBucket
     */
    public String getOutputBucket() {
        return this.outputBucket;
    }

    /**
     * @return outputLocation
     */
    public String getOutputLocation() {
        return this.outputLocation;
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

    public static final class Builder extends Request.Builder<SubmitEditingJobsRequest, Builder> {
        private String editingInputs; 
        private String editingJobOssFileRoleArn; 
        private Long editingJobOssFileUid; 
        private String editingJobOutputs; 
        private String editingJobURL; 
        private String outputBucket; 
        private String outputLocation; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitEditingJobsRequest request) {
            super(request);
            this.editingInputs = request.editingInputs;
            this.editingJobOssFileRoleArn = request.editingJobOssFileRoleArn;
            this.editingJobOssFileUid = request.editingJobOssFileUid;
            this.editingJobOutputs = request.editingJobOutputs;
            this.editingJobURL = request.editingJobURL;
            this.outputBucket = request.outputBucket;
            this.outputLocation = request.outputLocation;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * EditingInputs.
         */
        public Builder editingInputs(String editingInputs) {
            this.putQueryParameter("EditingInputs", editingInputs);
            this.editingInputs = editingInputs;
            return this;
        }

        /**
         * EditingJobOssFileRoleArn.
         */
        public Builder editingJobOssFileRoleArn(String editingJobOssFileRoleArn) {
            this.putQueryParameter("EditingJobOssFileRoleArn", editingJobOssFileRoleArn);
            this.editingJobOssFileRoleArn = editingJobOssFileRoleArn;
            return this;
        }

        /**
         * EditingJobOssFileUid.
         */
        public Builder editingJobOssFileUid(Long editingJobOssFileUid) {
            this.putQueryParameter("EditingJobOssFileUid", editingJobOssFileUid);
            this.editingJobOssFileUid = editingJobOssFileUid;
            return this;
        }

        /**
         * EditingJobOutputs.
         */
        public Builder editingJobOutputs(String editingJobOutputs) {
            this.putQueryParameter("EditingJobOutputs", editingJobOutputs);
            this.editingJobOutputs = editingJobOutputs;
            return this;
        }

        /**
         * EditingJobURL.
         */
        public Builder editingJobURL(String editingJobURL) {
            this.putQueryParameter("EditingJobURL", editingJobURL);
            this.editingJobURL = editingJobURL;
            return this;
        }

        /**
         * OutputBucket.
         */
        public Builder outputBucket(String outputBucket) {
            this.putQueryParameter("OutputBucket", outputBucket);
            this.outputBucket = outputBucket;
            return this;
        }

        /**
         * OutputLocation.
         */
        public Builder outputLocation(String outputLocation) {
            this.putQueryParameter("OutputLocation", outputLocation);
            this.outputLocation = outputLocation;
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

        @Override
        public SubmitEditingJobsRequest build() {
            return new SubmitEditingJobsRequest(this);
        } 

    } 

}
