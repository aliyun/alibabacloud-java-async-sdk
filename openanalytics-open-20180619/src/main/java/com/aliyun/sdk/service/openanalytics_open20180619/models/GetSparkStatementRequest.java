// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkStatementRequest} extends {@link RequestModel}
 *
 * <p>GetSparkStatementRequest</p>
 */
public class GetSparkStatementRequest extends Request {
    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Body
    @NameInMap("StatementId")
    @Validation(required = true)
    private Integer statementId;

    private GetSparkStatementRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.statementId = builder.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkStatementRequest create() {
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
    public Integer getStatementId() {
        return this.statementId;
    }

    public static final class Builder extends Request.Builder<GetSparkStatementRequest, Builder> {
        private String jobId; 
        private Integer statementId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkStatementRequest response) {
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
        public Builder statementId(Integer statementId) {
            this.putBodyParameter("StatementId", statementId);
            this.statementId = statementId;
            return this;
        }

        @Override
        public GetSparkStatementRequest build() {
            return new GetSparkStatementRequest(this);
        } 

    } 

}
