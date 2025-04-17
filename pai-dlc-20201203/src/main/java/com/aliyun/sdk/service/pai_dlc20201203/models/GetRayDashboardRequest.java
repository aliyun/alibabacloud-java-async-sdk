// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetRayDashboardRequest} extends {@link RequestModel}
 *
 * <p>GetRayDashboardRequest</p>
 */
public class GetRayDashboardRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isShared")
    private Boolean isShared;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    private GetRayDashboardRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.isShared = builder.isShared;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayDashboardRequest create() {
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
     * @return isShared
     */
    public Boolean getIsShared() {
        return this.isShared;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetRayDashboardRequest, Builder> {
        private String jobId; 
        private Boolean isShared; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetRayDashboardRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.isShared = request.isShared;
            this.token = request.token;
        } 

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * isShared.
         */
        public Builder isShared(Boolean isShared) {
            this.putQueryParameter("isShared", isShared);
            this.isShared = isShared;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.putQueryParameter("token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetRayDashboardRequest build() {
            return new GetRayDashboardRequest(this);
        } 

    } 

}
