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
 * {@link GetSignalRequest} extends {@link RequestModel}
 *
 * <p>GetSignalRequest</p>
 */
public class GetSignalRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SignalId")
    private String signalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetSignalRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.signalId = builder.signalId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSignalRequest create() {
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
     * @return signalId
     */
    public String getSignalId() {
        return this.signalId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetSignalRequest, Builder> {
        private String jobId; 
        private String signalId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetSignalRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.signalId = request.signalId;
            this.token = request.token;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * SignalId.
         */
        public Builder signalId(String signalId) {
            this.putPathParameter("SignalId", signalId);
            this.signalId = signalId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetSignalRequest build() {
            return new GetSignalRequest(this);
        } 

    } 

}
