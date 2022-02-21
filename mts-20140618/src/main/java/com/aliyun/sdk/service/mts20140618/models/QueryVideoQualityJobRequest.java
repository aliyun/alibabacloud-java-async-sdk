// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVideoQualityJobRequest} extends {@link RequestModel}
 *
 * <p>QueryVideoQualityJobRequest</p>
 */
public class QueryVideoQualityJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("UserId")
    @Validation()
    private Long userId;

    private QueryVideoQualityJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoQualityJobRequest create() {
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
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryVideoQualityJobRequest, Builder> {
        private String jobId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryVideoQualityJobRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.userId = response.userId;
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
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryVideoQualityJobRequest build() {
            return new QueryVideoQualityJobRequest(this);
        } 

    } 

}
