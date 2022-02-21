// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultTranscodeTemplateGroupRequest</p>
 */
public class SetDefaultTranscodeTemplateGroupRequest extends Request {
    @Query
    @NameInMap("TranscodeTemplateGroupId")
    @Validation(required = true)
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

        private Builder(SetDefaultTranscodeTemplateGroupRequest response) {
            super(response);
            this.transcodeTemplateGroupId = response.transcodeTemplateGroupId;
        } 

        /**
         * TranscodeTemplateGroupId.
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
