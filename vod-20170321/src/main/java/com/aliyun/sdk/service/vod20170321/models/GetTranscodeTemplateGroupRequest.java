// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeTemplateGroupRequest</p>
 */
public class GetTranscodeTemplateGroupRequest extends Request {
    @Query
    @NameInMap("TranscodeTemplateGroupId")
    @Validation(required = true)
    private String transcodeTemplateGroupId;

    private GetTranscodeTemplateGroupRequest(Builder builder) {
        super(builder);
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeTemplateGroupRequest create() {
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

    public static final class Builder extends Request.Builder<GetTranscodeTemplateGroupRequest, Builder> {
        private String transcodeTemplateGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetTranscodeTemplateGroupRequest request) {
            super(request);
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
        } 

        /**
         * The ID of the transcoding template group.
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        @Override
        public GetTranscodeTemplateGroupRequest build() {
            return new GetTranscodeTemplateGroupRequest(this);
        } 

    } 

}
