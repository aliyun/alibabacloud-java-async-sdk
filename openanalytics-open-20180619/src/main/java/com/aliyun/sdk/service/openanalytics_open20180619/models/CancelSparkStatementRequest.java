// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelSparkStatementRequest} extends {@link RequestModel}
 *
 * <p>CancelSparkStatementRequest</p>
 */
public class CancelSparkStatementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatementId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statementId;

    private CancelSparkStatementRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.statementId = builder.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSparkStatementRequest create() {
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
     * @return statementId
     */
    public String getStatementId() {
        return this.statementId;
    }

    public static final class Builder extends Request.Builder<CancelSparkStatementRequest, Builder> {
        private String jobId; 
        private String statementId; 

        private Builder() {
            super();
        } 

        private Builder(CancelSparkStatementRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.statementId = request.statementId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>j202106071620hangzhou****</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026****</p>
         */
        public Builder statementId(String statementId) {
            this.putBodyParameter("StatementId", statementId);
            this.statementId = statementId;
            return this;
        }

        @Override
        public CancelSparkStatementRequest build() {
            return new CancelSparkStatementRequest(this);
        } 

    } 

}
