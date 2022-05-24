// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceAbRequest} extends {@link RequestModel}
 *
 * <p>QueryTraceAbRequest</p>
 */
public class QueryTraceAbRequest extends Request {
    @Body
    @NameInMap("JobId")
    private String jobId;

    @Body
    @NameInMap("MediaId")
    private String mediaId;

    private QueryTraceAbRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceAbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    public static final class Builder extends Request.Builder<QueryTraceAbRequest, Builder> {
        private String jobId; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTraceAbRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.mediaId = request.mediaId;
        } 

        /**
         * 任务id
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * 媒体id
         */
        public Builder mediaId(String mediaId) {
            this.putBodyParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public QueryTraceAbRequest build() {
            return new QueryTraceAbRequest(this);
        } 

    } 

}
