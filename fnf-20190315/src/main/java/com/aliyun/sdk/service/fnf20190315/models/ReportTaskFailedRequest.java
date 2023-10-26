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
         * The cause of the failure. The value must be 1 to 4,096 characters in length.
         */
        public Builder cause(String cause) {
            this.putBodyParameter("Cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * The error code for the failed task. The value must be 1 to 128 characters in length.
         */
        public Builder error(String error) {
            this.putBodyParameter("Error", error);
            this.error = error;
            return this;
        }

        /**
         * The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * The token of the specified task that you want to report. If this parameter appears in **waitforCallback** mode, the parameter is passed to the called service, such as Message Service (MNS) or Function Compute. For MNS, the value of this parameter can be obtained from a message. For Function Compute, the value of this parameter can be obtained from an event.
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
