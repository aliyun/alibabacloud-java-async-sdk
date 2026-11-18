// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteTranscodeTemplateGroupRequest</p>
 */
public class DeleteTranscodeTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDelGroup")
    private String forceDelGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transcodeTemplateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateIds")
    private String transcodeTemplateIds;

    private DeleteTranscodeTemplateGroupRequest(Builder builder) {
        super(builder);
        this.forceDelGroup = builder.forceDelGroup;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        this.transcodeTemplateIds = builder.transcodeTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTranscodeTemplateGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDelGroup
     */
    public String getForceDelGroup() {
        return this.forceDelGroup;
    }

    /**
     * @return transcodeTemplateGroupId
     */
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    /**
     * @return transcodeTemplateIds
     */
    public String getTranscodeTemplateIds() {
        return this.transcodeTemplateIds;
    }

    public static final class Builder extends Request.Builder<DeleteTranscodeTemplateGroupRequest, Builder> {
        private String forceDelGroup; 
        private String transcodeTemplateGroupId; 
        private String transcodeTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTranscodeTemplateGroupRequest request) {
            super(request);
            this.forceDelGroup = request.forceDelGroup;
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
            this.transcodeTemplateIds = request.transcodeTemplateIds;
        } 

        /**
         * <p>Indicates whether to force delete the entire transcoding template group. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Force deletes the entire template group and all its transcoding templates.</li>
         * <li><strong>false</strong> (default): Deletes only the specified transcoding templates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceDelGroup(String forceDelGroup) {
            this.putQueryParameter("ForceDelGroup", forceDelGroup);
            this.forceDelGroup = forceDelGroup;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c71a339fec*****152b4fa6f4527</p>
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * <p>The IDs of the transcoding templates that you want to delete.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,).</li>
         * <li>A maximum of 10 template IDs are supported.</li>
         * <li>This parameter is required if the ForceDelGroup parameter is empty or set to false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;613702defdc4<em><strong><strong>6a3b94cace1129e&quot;,&quot;bfd6c90253a2</strong></strong></em>7fc054d7c5825&quot;]</p>
         */
        public Builder transcodeTemplateIds(String transcodeTemplateIds) {
            this.putQueryParameter("TranscodeTemplateIds", transcodeTemplateIds);
            this.transcodeTemplateIds = transcodeTemplateIds;
            return this;
        }

        @Override
        public DeleteTranscodeTemplateGroupRequest build() {
            return new DeleteTranscodeTemplateGroupRequest(this);
        } 

    } 

}
