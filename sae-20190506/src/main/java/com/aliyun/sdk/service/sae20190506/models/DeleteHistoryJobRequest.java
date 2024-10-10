// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteHistoryJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteHistoryJobRequest</p>
 */
public class DeleteHistoryJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private DeleteHistoryJobRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHistoryJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DeleteHistoryJobRequest, Builder> {
        private String appId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHistoryJobRequest request) {
            super(request);
            this.appId = request.appId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the job template to which the job that you want to delete belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>manual-3db7a8fa-5d40-4edc-92e4-49d50eab****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DeleteHistoryJobRequest build() {
            return new DeleteHistoryJobRequest(this);
        } 

    } 

}
