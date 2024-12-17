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
 * {@link GetTranscodeTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeTaskRequest</p>
 */
public class GetTranscodeTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private String jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTaskId")
    private String transcodeTaskId;

    private GetTranscodeTaskRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
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
     * @return jobIds
     */
    public String getJobIds() {
        return this.jobIds;
    }

    /**
     * @return transcodeTaskId
     */
    public String getTranscodeTaskId() {
        return this.transcodeTaskId;
    }

    public static final class Builder extends Request.Builder<GetTranscodeTaskRequest, Builder> {
        private String jobIds; 
        private String transcodeTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTranscodeTaskRequest request) {
            super(request);
            this.jobIds = request.jobIds;
            this.transcodeTaskId = request.transcodeTaskId;
        } 

        /**
         * JobIds.
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The ID of the transcoding task. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Obtain the value of TranscodeTaskId from the response to the <a href="https://help.aliyun.com/document_detail/68570.html">SubmitTranscodeJobs</a> operation.</li>
         * <li>Obtain the value of TranscodeTaskId from the response to the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation.</li>
         * </ul>
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
