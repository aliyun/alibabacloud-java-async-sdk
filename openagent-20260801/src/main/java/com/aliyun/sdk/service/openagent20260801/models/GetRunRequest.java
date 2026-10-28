// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link GetRunRequest} extends {@link RequestModel}
 *
 * <p>GetRunRequest</p>
 */
public class GetRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("runId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    private GetRunRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.runId = builder.runId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    public static final class Builder extends Request.Builder<GetRunRequest, Builder> {
        private String sessionId; 
        private String runId; 

        private Builder() {
            super();
        } 

        private Builder(GetRunRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.runId = request.runId;
        } 

        /**
         * <p>The session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The run ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        @Override
        public GetRunRequest build() {
            return new GetRunRequest(this);
        } 

    } 

}
