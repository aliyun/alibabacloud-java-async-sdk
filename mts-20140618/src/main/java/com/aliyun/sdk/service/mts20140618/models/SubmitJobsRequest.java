// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitJobsRequest</p>
 */
public class SubmitJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputLocation")
    private String outputLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Outputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputs;

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

    private SubmitJobsRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.outputBucket = builder.outputBucket;
        this.outputLocation = builder.outputLocation;
        this.outputs = builder.outputs;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitJobsRequest create() {
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
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
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

    public static final class Builder extends Request.Builder<SubmitJobsRequest, Builder> {
        private String input; 
        private String outputBucket; 
        private String outputLocation; 
        private String outputs; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitJobsRequest request) {
            super(request);
            this.input = request.input;
            this.outputBucket = request.outputBucket;
            this.outputLocation = request.outputLocation;
            this.outputs = request.outputs;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The information about the input file. For more information, see the "Input" section of the [Parameter details](~~29253~~) topic.
         * <p>
         * 
         * > 
         * 
         * *   The path of an Object Storage Service (OSS) object must be URL-encoded in UTF-8 before you use the path in MPS.
         * 
         * *   The OSS bucket must reside in the same region as your MPS service.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * The name of the OSS bucket that stores the output file.
         * <p>
         * 
         * *   For more information about the term bucket, see [Terms](~~31827~~).
         */
        public Builder outputBucket(String outputBucket) {
            this.putQueryParameter("OutputBucket", outputBucket);
            this.outputBucket = outputBucket;
            return this;
        }

        /**
         * The region in which the OSS bucket that stores the output file resides.
         * <p>
         * 
         * *   The OSS bucket must reside in the same region as MPS.
         * *   For more information about the term bucket, see [Terms](~~31827~~).
         */
        public Builder outputLocation(String outputLocation) {
            this.putQueryParameter("OutputLocation", outputLocation);
            this.outputLocation = outputLocation;
            return this;
        }

        /**
         * The job output configurations. For more information, see the "Output" section of the [Parameter details](~~29253~~) topic.
         * <p>
         * 
         * *   Specify the value in a JSON array of Output objects. You can specify up to 30 Output objects.
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("Outputs", outputs);
            this.outputs = outputs;
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
         * The ID of the MPS queue. For more information, see [Terms](~~31827~~).
         * <p>
         * 
         * *   To obtain the ID of an MPS queue, you can log on to the [MPS console](https://mps.console.aliyun.com/overview) and choose **Global Settings** > **MPS Queue and Callback** in the left-side navigation pane.
         * *   If you want to receive asynchronous message notifications, associate an MNS queue or topic with the MPS queue. For more information, see [Receive notifications](https://www.alibabacloud.com/help/zh/apsaravideo-for-media-processing/latest/receive-message-notifications).
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
        public SubmitJobsRequest build() {
            return new SubmitJobsRequest(this);
        } 

    } 

}
