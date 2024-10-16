// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the input file. For more information, see the &quot;Input&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The path of an Object Storage Service (OSS) object must be URL-encoded in UTF-8 before you use the path in MPS.</p>
         * </li>
         * <li><p>The OSS bucket must reside in the same region as your MPS service.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a/b/c/test-cn.srt</p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The name of the OSS bucket that stores the output file.</p>
         * <ul>
         * <li>For more information about the term bucket, see <a href="https://help.aliyun.com/document_detail/31827.html">Terms</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleBucket</p>
         */
        public Builder outputBucket(String outputBucket) {
            this.putQueryParameter("OutputBucket", outputBucket);
            this.outputBucket = outputBucket;
            return this;
        }

        /**
         * <p>The region in which the OSS bucket that stores the output file resides.</p>
         * <ul>
         * <li>The OSS bucket must reside in the same region as MPS.</li>
         * <li>For more information about the term bucket, see <a href="https://help.aliyun.com/document_detail/31827.html">Terms</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        public Builder outputLocation(String outputLocation) {
            this.putQueryParameter("OutputLocation", outputLocation);
            this.outputLocation = outputLocation;
            return this;
        }

        /**
         * <p>The job output configurations. For more information, see the &quot;Output&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         * <ul>
         * <li>Specify the value in a JSON array of Output objects. You can specify up to 30 Output objects.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;OutputObject&quot;:&quot;exampleOutput.mp4&quot;,&quot;TemplateId&quot;:&quot;6181666213ab41b9bc21da8ff5ff****&quot;,&quot;WaterMarks&quot;:[{&quot;InputFile&quot;:{&quot;Bucket&quot;:&quot;exampleBucket&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;,&quot;Object&quot;:&quot;image_01.png&quot;},&quot;WaterMarkTemplateId&quot;:&quot;9b772ce2740d4d55876d8b542d47****&quot;}],&quot;UserData&quot;:&quot;testid-001&quot;}]</p>
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
         * <p>The ID of the MPS queue. For more information, see <a href="https://help.aliyun.com/document_detail/31827.html">Terms</a>.</p>
         * <ul>
         * <li>To obtain the ID of an MPS queue, you can log on to the <a href="https://mps.console.aliyun.com/overview">MPS console</a> and choose <strong>Global Settings</strong> &gt; <strong>MPS Queue and Callback</strong> in the left-side navigation pane.</li>
         * <li>If you want to receive asynchronous message notifications, associate an MNS queue or topic with the MPS queue. For more information, see <a href="https://help.aliyun.com/document_detail/42618.html">Receive notifications</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dd3dae411e704030b921e52698e5****</p>
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
