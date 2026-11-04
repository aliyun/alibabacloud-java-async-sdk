// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link GetPictureSearchJobStatusRequest} extends {@link RequestModel}
 *
 * <p>GetPictureSearchJobStatusRequest</p>
 */
public class GetPictureSearchJobStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private GetPictureSearchJobStatusRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPictureSearchJobStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<GetPictureSearchJobStatusRequest, Builder> {
        private String appInstanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetPictureSearchJobStatusRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>892f97c9518548469d319d955d98****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The ID of the image search task. You can call the <a href="https://help.aliyun.com/document_detail/206778.html">QueryPictureSearchJob</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b3786935a71442efae014c7b2212****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetPictureSearchJobStatusRequest build() {
            return new GetPictureSearchJobStatusRequest(this);
        } 

    } 

}
