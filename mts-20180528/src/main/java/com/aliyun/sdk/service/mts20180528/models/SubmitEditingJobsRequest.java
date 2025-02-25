// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitEditingJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitEditingJobsRequest</p>
 */
public class SubmitEditingJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditingInputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String editingInputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditingJobOutputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String editingJobOutputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputLocation")
    private String outputLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SubmitEditingJobsRequest(Builder builder) {
        super(builder);
        this.editingInputs = builder.editingInputs;
        this.editingJobOutputs = builder.editingJobOutputs;
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
     * @return editingJobOutputs
     */
    public String getEditingJobOutputs() {
        return this.editingJobOutputs;
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
        private String editingJobOutputs; 
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
            this.editingJobOutputs = request.editingJobOutputs;
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
         * EditingJobOutputs.
         */
        public Builder editingJobOutputs(String editingJobOutputs) {
            this.putQueryParameter("EditingJobOutputs", editingJobOutputs);
            this.editingJobOutputs = editingJobOutputs;
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
