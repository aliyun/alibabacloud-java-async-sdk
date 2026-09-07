// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetVideoDetextJobRequest} extends {@link RequestModel}
 *
 * <p>GetVideoDetextJobRequest</p>
 */
public class GetVideoDetextJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private GetVideoDetextJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoDetextJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetVideoDetextJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoDetextJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The video text erasure task ID returned by SubmitVideoDetextJob.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vdt_0123456789abcdef0123456789abcdef</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetVideoDetextJobRequest build() {
            return new GetVideoDetextJobRequest(this);
        } 

    } 

}
