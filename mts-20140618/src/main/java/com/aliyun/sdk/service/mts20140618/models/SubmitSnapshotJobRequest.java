// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the job input. The value must be a JSON object. You must add the Object Storage Service (OSS) bucket that stores the OSS object to be used as the job input as a media bucket in the MPS console. To add an OSS bucket as a media bucket, you can log on to the MPS console, choose Workflows &gt; Media Buckets in the left-side navigation pane, and then click Add Bucket. After the OSS bucket is added as a media bucket, you must perform URL encoding for the OSS object. Example: <code>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;example%2Ftest.flv&quot;}</code>. This example indicates the <code>&quot;example-bucket.example-location.aliyuncs.com/example/test.flv&quot;</code> object.</p>
         * <blockquote>
         * <p>The OSS bucket must reside in the same region as your MPS service.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;example%2Ftest.flv&quot;}</p>
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
         * <p>The ID of the MPS queue to which you want to submit the snapshot job. To obtain the ID, you can log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane.</p>
         * <blockquote>
         * <p>Make sure that an available Message Service (MNS) topic is bound to the specified MPS queue. Otherwise, the relevant messages may fail to be sent as expected.</p>
         * </blockquote>
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

        /**
         * <p>The snapshot configurations. For more information, see the &quot;AliyunSnapshotConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Data types</a> topic.</p>
         * <blockquote>
         * <p>If you set the Interval parameter that is nested under SnapshotConfig, snapshots are captured at the specified intervals. The default value of the Interval parameter is 10, in seconds. If an input video is short but you specify large values for both the Num and Interval parameters, the actual number of snapshots captured may be smaller than the specified number. For example, if you set the Num parameter to 5 and the Interval parameter to 3 for a video of 10 seconds, the number of snapshots captured cannot reach 5.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OutputFile&quot;:{&quot;Bucket&quot;:&quot;example-001&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;{Count}.jpg&quot;},&quot;Time&quot;:&quot;5&quot;,&quot;Num&quot;:&quot;10&quot;,&quot;Interval&quot;:&quot;20&quot;}</p>
         */
        public Builder snapshotConfig(String snapshotConfig) {
            this.putQueryParameter("SnapshotConfig", snapshotConfig);
            this.snapshotConfig = snapshotConfig;
            return this;
        }

        /**
         * <p>The custom data. The custom data can contain letters, digits, and hyphens (-) and be up to 1,024 bytes in size. The custom data cannot start with a special character.</p>
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
        public SubmitSnapshotJobRequest build() {
            return new SubmitSnapshotJobRequest(this);
        } 

    } 

}
