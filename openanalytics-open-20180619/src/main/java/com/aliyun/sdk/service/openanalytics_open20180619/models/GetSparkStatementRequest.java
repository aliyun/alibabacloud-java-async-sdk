// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSparkStatementRequest} extends {@link RequestModel}
 *
 * <p>GetSparkStatementRequest</p>
 */
public class GetSparkStatementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatementId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetSparkStatementRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.statementId = request.statementId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>j202106071620hangzhou00000000001</p>
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
         * <p>1</p>
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
