// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteSparkStatementRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSparkStatementRequest</p>
 */
public class ExecuteSparkStatementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Kind")
    private String kind;

    private ExecuteSparkStatementRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.jobId = builder.jobId;
        this.kind = builder.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSparkStatementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    public static final class Builder extends Request.Builder<ExecuteSparkStatementRequest, Builder> {
        private String code; 
        private String jobId; 
        private String kind; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteSparkStatementRequest request) {
            super(request);
            this.code = request.code;
            this.jobId = request.jobId;
            this.kind = request.kind;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>print(2+2)\n</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
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
         * Kind.
         */
        public Builder kind(String kind) {
            this.putBodyParameter("Kind", kind);
            this.kind = kind;
            return this;
        }

        @Override
        public ExecuteSparkStatementRequest build() {
            return new ExecuteSparkStatementRequest(this);
        } 

    } 

}
