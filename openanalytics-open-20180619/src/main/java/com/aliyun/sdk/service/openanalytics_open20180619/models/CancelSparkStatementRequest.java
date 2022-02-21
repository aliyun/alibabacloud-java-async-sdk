// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSparkStatementRequest} extends {@link RequestModel}
 *
 * <p>CancelSparkStatementRequest</p>
 */
public class CancelSparkStatementRequest extends Request {
    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Body
    @NameInMap("StatementId")
    @Validation(required = true)
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

        private Builder(CancelSparkStatementRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.statementId = response.statementId;
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
         * StatementId.
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
