// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteTranscodeTemplateGroupRequest</p>
 */
public class DeleteTranscodeTemplateGroupRequest extends Request {
    @Query
    @NameInMap("ForceDelGroup")
    private String forceDelGroup;

    @Query
    @NameInMap("TranscodeTemplateGroupId")
    @Validation(required = true)
    private String transcodeTemplateGroupId;

    @Query
    @NameInMap("TranscodeTemplateIds")
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
         * Specifies whether to forcibly delete the entire transcoding template group. Valid values:
         * <p>
         * 
         * *   **true**: deletes the entire transcoding template group and its transcoding templates.
         * *   **false**: removes the specified transcoding templates from the transcoding template group. This is the default value.
         */
        public Builder forceDelGroup(String forceDelGroup) {
            this.putQueryParameter("ForceDelGroup", forceDelGroup);
            this.forceDelGroup = forceDelGroup;
            return this;
        }

        /**
         * The ID of the transcoding template group.
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * The IDs of the transcoding templates that you want to remove.
         * <p>
         * 
         * *   Separate multiple IDs with commas (,).
         * *   You can specify a maximum of 10 IDs.
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
