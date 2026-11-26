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
 * {@link GetMediaConvertTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>GetMediaConvertTemplateGroupRequest</p>
 */
public class GetMediaConvertTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transcodeTemplateGroupId;

    private GetMediaConvertTemplateGroupRequest(Builder builder) {
        super(builder);
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConvertTemplateGroupRequest create() {
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

    public static final class Builder extends Request.Builder<GetMediaConvertTemplateGroupRequest, Builder> {
        private String transcodeTemplateGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaConvertTemplateGroupRequest request) {
            super(request);
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
        } 

        /**
         * <p>The ID of the transcoding template group. Only MC transcoding template groups created by calling AddMediaConvertTemplateGroup can be queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c71a339fe52b4fa6f4527****</p>
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        @Override
        public GetMediaConvertTemplateGroupRequest build() {
            return new GetMediaConvertTemplateGroupRequest(this);
        } 

    } 

}
