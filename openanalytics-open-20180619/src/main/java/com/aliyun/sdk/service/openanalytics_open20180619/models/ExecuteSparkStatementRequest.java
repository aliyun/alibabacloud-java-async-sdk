// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteSparkStatementRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSparkStatementRequest</p>
 */
public class ExecuteSparkStatementRequest extends Request {
    @Body
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Body
    @NameInMap("Kind")
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

        private Builder(ExecuteSparkStatementRequest response) {
            super(response);
            this.code = response.code;
            this.jobId = response.jobId;
            this.kind = response.kind;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
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
