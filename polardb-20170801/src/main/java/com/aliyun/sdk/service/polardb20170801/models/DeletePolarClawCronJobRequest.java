// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarClawCronJobRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarClawCronJobRequest</p>
 */
public class DeletePolarClawCronJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    private DeletePolarClawCronJobRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.jobId = builder.jobId;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarClawCronJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    public static final class Builder extends Request.Builder<DeletePolarClawCronJobRequest, Builder> {
        private String applicationId; 
        private String jobId; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarClawCronJobRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.jobId = request.jobId;
            this.restart = request.restart;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        @Override
        public DeletePolarClawCronJobRequest build() {
            return new DeletePolarClawCronJobRequest(this);
        } 

    } 

}
