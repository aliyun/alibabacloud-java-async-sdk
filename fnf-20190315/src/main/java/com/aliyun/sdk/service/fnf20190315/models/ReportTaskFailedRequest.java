// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportTaskFailedRequest} extends {@link RequestModel}
 *
 * <p>ReportTaskFailedRequest</p>
 */
public class ReportTaskFailedRequest extends Request {
    @Body
    @NameInMap("Cause")
    private String cause;

    @Body
    @NameInMap("Error")
    @Validation(required = true)
    private String error;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("TaskToken")
    @Validation(required = true)
    private String taskToken;

    private ReportTaskFailedRequest(Builder builder) {
        super(builder);
        this.cause = builder.cause;
        this.error = builder.error;
        this.requestId = builder.requestId;
        this.taskToken = builder.taskToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportTaskFailedRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cause
     */
    public String getCause() {
        return this.cause;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskToken
     */
    public String getTaskToken() {
        return this.taskToken;
    }

    public static final class Builder extends Request.Builder<ReportTaskFailedRequest, Builder> {
        private String cause; 
        private String error; 
        private String requestId; 
        private String taskToken; 

        private Builder() {
            super();
        } 

        private Builder(ReportTaskFailedRequest request) {
            super(request);
            this.cause = request.cause;
            this.error = request.error;
            this.requestId = request.requestId;
            this.taskToken = request.taskToken;
        } 

        /**
         * Cause.
         */
        public Builder cause(String cause) {
            this.putBodyParameter("Cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.putBodyParameter("Error", error);
            this.error = error;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskToken.
         */
        public Builder taskToken(String taskToken) {
            this.putQueryParameter("TaskToken", taskToken);
            this.taskToken = taskToken;
            return this;
        }

        @Override
        public ReportTaskFailedRequest build() {
            return new ReportTaskFailedRequest(this);
        } 

    } 

}
