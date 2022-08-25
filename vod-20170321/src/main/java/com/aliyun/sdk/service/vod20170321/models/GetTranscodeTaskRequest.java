// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeTaskRequest</p>
 */
public class GetTranscodeTaskRequest extends Request {
    @Query
    @NameInMap("TranscodeTaskId")
    @Validation(required = true)
    private String transcodeTaskId;

    private GetTranscodeTaskRequest(Builder builder) {
        super(builder);
        this.transcodeTaskId = builder.transcodeTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return transcodeTaskId
     */
    public String getTranscodeTaskId() {
        return this.transcodeTaskId;
    }

    public static final class Builder extends Request.Builder<GetTranscodeTaskRequest, Builder> {
        private String transcodeTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTranscodeTaskRequest request) {
            super(request);
            this.transcodeTaskId = request.transcodeTaskId;
        } 

        /**
         * TranscodeTaskId.
         */
        public Builder transcodeTaskId(String transcodeTaskId) {
            this.putQueryParameter("TranscodeTaskId", transcodeTaskId);
            this.transcodeTaskId = transcodeTaskId;
            return this;
        }

        @Override
        public GetTranscodeTaskRequest build() {
            return new GetTranscodeTaskRequest(this);
        } 

    } 

}
