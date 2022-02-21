// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitComplexJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitComplexJobRequest</p>
 */
public class SubmitComplexJobRequest extends Request {
    @Query
    @NameInMap("ComplexConfigs")
    @Validation(required = true)
    private String complexConfigs;

    @Query
    @NameInMap("Inputs")
    @Validation(required = true)
    private String inputs;

    @Query
    @NameInMap("OutputBucket")
    @Validation(required = true)
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
    @Validation(required = true)
    private String pipelineId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TranscodeOutput")
    @Validation(required = true)
    private String transcodeOutput;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitComplexJobRequest(Builder builder) {
        super(builder);
        this.complexConfigs = builder.complexConfigs;
        this.inputs = builder.inputs;
        this.outputBucket = builder.outputBucket;
        this.outputLocation = builder.outputLocation;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transcodeOutput = builder.transcodeOutput;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitComplexJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return complexConfigs
     */
    public String getComplexConfigs() {
        return this.complexConfigs;
    }

    /**
     * @return inputs
     */
    public String getInputs() {
        return this.inputs;
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

    /**
     * @return transcodeOutput
     */
    public String getTranscodeOutput() {
        return this.transcodeOutput;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitComplexJobRequest, Builder> {
        private String complexConfigs; 
        private String inputs; 
        private String outputBucket; 
        private String outputLocation; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transcodeOutput; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitComplexJobRequest response) {
            super(response);
            this.complexConfigs = response.complexConfigs;
            this.inputs = response.inputs;
            this.outputBucket = response.outputBucket;
            this.outputLocation = response.outputLocation;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pipelineId = response.pipelineId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.transcodeOutput = response.transcodeOutput;
            this.userData = response.userData;
        } 

        /**
         * ComplexConfigs.
         */
        public Builder complexConfigs(String complexConfigs) {
            this.putQueryParameter("ComplexConfigs", complexConfigs);
            this.complexConfigs = complexConfigs;
            return this;
        }

        /**
         * Inputs.
         */
        public Builder inputs(String inputs) {
            this.putQueryParameter("Inputs", inputs);
            this.inputs = inputs;
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

        /**
         * TranscodeOutput.
         */
        public Builder transcodeOutput(String transcodeOutput) {
            this.putQueryParameter("TranscodeOutput", transcodeOutput);
            this.transcodeOutput = transcodeOutput;
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
        public SubmitComplexJobRequest build() {
            return new SubmitComplexJobRequest(this);
        } 

    } 

}
