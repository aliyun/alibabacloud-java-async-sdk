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
 * {@link ReportTaskSucceededRequest} extends {@link RequestModel}
 *
 * <p>ReportTaskSucceededRequest</p>
 */
public class ReportTaskSucceededRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private String output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskToken;

    private ReportTaskSucceededRequest(Builder builder) {
        super(builder);
        this.output = builder.output;
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
     * @return taskToken
     */
    public String getTaskToken() {
        return this.taskToken;
    }

    public static final class Builder extends Request.Builder<ReportTaskSucceededRequest, Builder> {
        private String output; 
        private String taskToken; 

        private Builder() {
            super();
        } 

        private Builder(ReportTaskSucceededRequest request) {
            super(request);
            this.output = request.output;
            this.taskToken = request.taskToken;
        } 

        /**
         * <p>The output information of the task whose execution success you want to report.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
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
        public ReportTaskSucceededRequest build() {
            return new ReportTaskSucceededRequest(this);
        } 

    } 

}
