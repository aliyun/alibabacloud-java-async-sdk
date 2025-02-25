// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMotionShopVideoDetectResultRequest} extends {@link RequestModel}
 *
 * <p>QueryMotionShopVideoDetectResultRequest</p>
 */
public class QueryMotionShopVideoDetectResultRequest extends Request {
    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    private QueryMotionShopVideoDetectResultRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMotionShopVideoDetectResultRequest create() {
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
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<QueryMotionShopVideoDetectResultRequest, Builder> {
        private String jobId; 
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryMotionShopVideoDetectResultRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.jwtToken = request.jwtToken;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public QueryMotionShopVideoDetectResultRequest build() {
            return new QueryMotionShopVideoDetectResultRequest(this);
        } 

    } 

}
