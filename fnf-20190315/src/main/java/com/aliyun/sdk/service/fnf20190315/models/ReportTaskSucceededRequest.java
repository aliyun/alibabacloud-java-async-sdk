// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportTaskSucceededRequest} extends {@link RequestModel}
 *
 * <p>ReportTaskSucceededRequest</p>
 */
public class ReportTaskSucceededRequest extends Request {
    @Body
    @NameInMap("Output")
    @Validation(required = true)
    private String output;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("TaskToken")
    @Validation(required = true)
    private String taskToken;

    private ReportTaskSucceededRequest(Builder builder) {
        super(builder);
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.taskToken = builder.taskToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportTaskSucceededRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
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

    public static final class Builder extends Request.Builder<ReportTaskSucceededRequest, Builder> {
        private String output; 
        private String requestId; 
        private String taskToken; 

        private Builder() {
            super();
        } 

        private Builder(ReportTaskSucceededRequest request) {
            super(request);
            this.output = request.output;
            this.requestId = request.requestId;
            this.taskToken = request.taskToken;
        } 

        /**
         * The output information of the task whose execution success you want to report.
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
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
         * The token of the task whose execution success you want to report. If this parameter appears in **waitforCallback** mode, the parameter is passed to the called service, such as Message Service (MNS) or Function Compute. For MNS, the value of this parameter can be obtained from the message. For Function Compute, the value of this parameter can be obtained from the event.
         */
        public Builder taskToken(String taskToken) {
            this.putQueryParameter("TaskToken", taskToken);
            this.taskToken = taskToken;
            return this;
        }

        @Override
        public ReportTaskSucceededRequest build() {
            return new ReportTaskSucceededRequest(this);
        } 

    } 

}
