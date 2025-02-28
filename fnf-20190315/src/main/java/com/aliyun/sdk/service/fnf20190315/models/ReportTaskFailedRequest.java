// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link ReportTaskFailedRequest} extends {@link RequestModel}
 *
 * <p>ReportTaskFailedRequest</p>
 */
public class ReportTaskFailedRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cause")
    private String cause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Error")
    @com.aliyun.core.annotation.Validation(required = true)
    private String error;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskToken;

    private ReportTaskFailedRequest(Builder builder) {
        super(builder);
        this.cause = builder.cause;
        this.error = builder.error;
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
     * @return taskToken
     */
    public String getTaskToken() {
        return this.taskToken;
    }

    public static final class Builder extends Request.Builder<ReportTaskFailedRequest, Builder> {
        private String cause; 
        private String error; 
        private String taskToken; 

        private Builder() {
            super();
        } 

        private Builder(ReportTaskFailedRequest request) {
            super(request);
            this.cause = request.cause;
            this.error = request.error;
            this.taskToken = request.taskToken;
        } 

        /**
         * <p>The cause of the failure. The value must be 1 to 4,096 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>emptyString</p>
         */
        public Builder cause(String cause) {
            this.putBodyParameter("Cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * <p>The error code for the failed task. The error code must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nill</p>
         */
        public Builder error(String error) {
            this.putBodyParameter("Error", error);
            this.error = error;
            return this;
        }

        /**
         * <p>The token of the task whose execution you want to report. The task token is passed to the called service, such as Message Service (MNS) or Function Compute. For MNS, the value of this parameter can be obtained from a message. For Function Compute, the value of this parameter can be obtained from an event. For more information, see <a href="https://help.aliyun.com/document_detail/2592915.html">Service integration modes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>emptyString</p>
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
