// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateMediaWorkflowRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaWorkflowRequest</p>
 */
public class UpdateMediaWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaWorkflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @com.aliyun.core.annotation.NameInMap("Topology")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topology;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerMode")
    private String triggerMode;

    private UpdateMediaWorkflowRequest(Builder builder) {
        super(builder);
        this.mediaWorkflowId = builder.mediaWorkflowId;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.topology = builder.topology;
        this.triggerMode = builder.triggerMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaWorkflowId
     */
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return topology
     */
    public String getTopology() {
        return this.topology;
    }

    /**
     * @return triggerMode
     */
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public static final class Builder extends Request.Builder<UpdateMediaWorkflowRequest, Builder> {
        private String mediaWorkflowId; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String topology; 
        private String triggerMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaWorkflowRequest request) {
            super(request);
            this.mediaWorkflowId = request.mediaWorkflowId;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.topology = request.topology;
            this.triggerMode = request.triggerMode;
        } 

        /**
         * <p>The ID of the media workflow that you want to update. To obtain the ID of the media workflow, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Workflow Settings</strong> in the left-side navigation pane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6307eb0d3f85477882d205aa040f****</p>
         */
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.putQueryParameter("MediaWorkflowId", mediaWorkflowId);
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The new topology of the media workflow. The value is a JSON object that contains the activity list and activity dependencies.</p>
         * <blockquote>
         * <p>The Object Storage Service (OSS) bucket must reside in the same region as your MPS service.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Activities&quot;: {
         *             &quot;Act-Start&quot;: {
         *                   &quot;Parameters&quot;: {
         *                         &quot;PipelineId&quot;: &quot;130266f58161436a80bf07cb12c8****&quot;,
         *                         &quot;InputFile&quot;: &quot;{&quot;Bucket&quot;: &quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;: &quot;cn-shanghai&quot;}&quot;
         *                   },
         *                   &quot;Type&quot;: &quot;Start&quot;
         *             },
         *             &quot;Act-Report&quot;: {
         *                   &quot;Parameters&quot;: {},
         *                   &quot;Type&quot;: &quot;Report&quot;
         *             },
         *             &quot;Act-Transcode-M3U8&quot;: {
         *                   &quot;Parameters&quot;: {
         *                         &quot;Outputs&quot;: &quot;[{&quot;Object&quot;:&quot;transcode/{ObjectPrefix}{FileName}&quot;,&quot;TemplateId&quot;: &quot;957d1719ee85ed6527b90cf62726</strong></strong>&quot;}]&quot;,
         *                         &quot;OutputBucket&quot;: &quot;example-bucket-****&quot;,
         *                         &quot;OutputLocation&quot;: &quot;cn-shanghai&quot;
         *                   },
         *                   &quot;Type&quot;: &quot;Transcode&quot;
         *             }
         *       },
         *       &quot;Dependencies&quot;: {
         *             &quot;Act-Start&quot;: [
         *                   &quot;Act-Transcode-M3U8&quot;
         *             ],
         *             &quot;Act-Report&quot;: [],
         *             &quot;Act-Transcode-M3U8&quot;: [
         *                   &quot;Act-Report&quot;
         *             ]
         *       }
         * }</p>
         */
        public Builder topology(String topology) {
            this.putQueryParameter("Topology", topology);
            this.topology = topology;
            return this;
        }

        /**
         * TriggerMode.
         */
        public Builder triggerMode(String triggerMode) {
            this.putQueryParameter("TriggerMode", triggerMode);
            this.triggerMode = triggerMode;
            return this;
        }

        @Override
        public UpdateMediaWorkflowRequest build() {
            return new UpdateMediaWorkflowRequest(this);
        } 

    } 

}
