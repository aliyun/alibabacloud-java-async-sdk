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
 * {@link GetTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeTemplateGroupRequest</p>
 */
public class GetTranscodeTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the transcoding template group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a591f697c7167*****6ae1502142d0</p>
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
