// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitAnalysisJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAnalysisJobRequest</p>
 */
public class SubmitAnalysisJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnalysisConfig")
    private String analysisConfig;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitAnalysisJobRequest(Builder builder) {
        super(builder);
        this.analysisConfig = builder.analysisConfig;
        this.input = builder.input;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.priority = builder.priority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAnalysisJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisConfig
     */
    public String getAnalysisConfig() {
        return this.analysisConfig;
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
     * @return priority
     */
    public String getPriority() {
        return this.priority;
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

    public static final class Builder extends Request.Builder<SubmitAnalysisJobRequest, Builder> {
        private String analysisConfig; 
        private String input; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAnalysisJobRequest request) {
            super(request);
            this.analysisConfig = request.analysisConfig;
            this.input = request.input;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.priority = request.priority;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.userData = request.userData;
        } 

        /**
         * <p>The job configurations. Set this parameter as required. For more information, see the &quot;AnalysisConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;QualityControl&quot;:{&quot;RateQuality&quot;:25,&quot;MethodStreaming&quot;:&quot;network&quot;}}</p>
         */
        public Builder analysisConfig(String analysisConfig) {
            this.putQueryParameter("AnalysisConfig", analysisConfig);
            this.analysisConfig = analysisConfig;
            return this;
        }

        /**
         * <p>The input information about the preset template analysis job to be submitted. The value must be a JSON object. You must log on to the Object Storage Service (OSS) console to grant the read permissions on the specified OSS bucket to MPS. For more information, see the &quot;Input&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         * <blockquote>
         * <p>The OSS bucket must reside in the same region as your MPS service.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;,&quot;Object&quot;:&quot;example.flv&quot;}</p>
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
         * <p>The ID of the MPS queue to which the job is submitted. To view the ID of the MPS queue, log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane. If you want to enable asynchronous notifications, make sure that the MPS queue is bound to a Message Service (MNS) topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bb558c1cc25b45309aab5be44d19****</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The priority of the job in the MPS queue to which the job is submitted.</p>
         * <ul>
         * <li>Valid values: <strong>1 to 10</strong>. A value of 10 indicates the highest priority.</li>
         * <li>Default value: <strong>6</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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
         * <p>The custom data. The custom data can contain letters, digits, and hyphens (-), and can be up to 1,024 bytes in length. The custom data cannot start with a special character.</p>
         * 
         * <strong>example:</strong>
         * <p>testid-001</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitAnalysisJobRequest build() {
            return new SubmitAnalysisJobRequest(this);
        } 

    } 

}
