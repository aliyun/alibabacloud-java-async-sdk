// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDefaultTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultTranscodeTemplateGroupRequest</p>
 */
public class SetDefaultTranscodeTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transcodeTemplateGroupId;

    private SetDefaultTranscodeTemplateGroupRequest(Builder builder) {
        super(builder);
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultTranscodeTemplateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return transcodeTemplateGroupId
     */
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public static final class Builder extends Request.Builder<SetDefaultTranscodeTemplateGroupRequest, Builder> {
        private String transcodeTemplateGroupId; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultTranscodeTemplateGroupRequest request) {
            super(request);
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
        } 

        /**
         * <p>The ID of the transcoding template group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d58079958be8d*****b699ab7ab6e1bf</p>
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        @Override
        public SetDefaultTranscodeTemplateGroupRequest build() {
            return new SetDefaultTranscodeTemplateGroupRequest(this);
        } 

    } 

}
