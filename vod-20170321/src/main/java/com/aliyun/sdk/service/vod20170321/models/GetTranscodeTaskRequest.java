// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTranscodeTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeTaskRequest</p>
 */
public class GetTranscodeTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the transcoding task. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Obtain the value of TranscodeTaskId from the response to the <a href="https://help.aliyun.com/document_detail/68570.html">SubmitTranscodeJobs</a> operation.</li>
         * <li>Obtain the value of TranscodeTaskId from the response to the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b1b65ab107e14*****3dbb900f6c1fe0</p>
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
