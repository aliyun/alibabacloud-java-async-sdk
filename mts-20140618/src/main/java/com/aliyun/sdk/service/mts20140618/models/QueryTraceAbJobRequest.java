// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryTraceAbJobRequest} extends {@link RequestModel}
 *
 * <p>QueryTraceAbJobRequest</p>
 */
public class QueryTraceAbJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    private QueryTraceAbJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceAbJobRequest create() {
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

    public static final class Builder extends Request.Builder<QueryTraceAbJobRequest, Builder> {
        private String jobId; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTraceAbJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.mediaId = request.mediaId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public QueryTraceAbJobRequest build() {
            return new QueryTraceAbJobRequest(this);
        } 

    } 

}
