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
         * Output.
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
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
        public ReportTaskSucceededRequest build() {
            return new ReportTaskSucceededRequest(this);
        } 

    } 

}
