// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link StopMmsJobRequest} extends {@link RequestModel}
 *
 * <p>StopMmsJobRequest</p>
 */
public class StopMmsJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    private StopMmsJobRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopMmsJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<StopMmsJobRequest, Builder> {
        private Long sourceId; 
        private Long jobId; 

        private Builder() {
            super();
        } 

        private Builder(StopMmsJobRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        public Builder jobId(Long jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public StopMmsJobRequest build() {
            return new StopMmsJobRequest(this);
        } 

    } 

}
