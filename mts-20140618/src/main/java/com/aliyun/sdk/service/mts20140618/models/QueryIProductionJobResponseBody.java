// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIProductionJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIProductionJobResponseBody</p>
 */
public class QueryIProductionJobResponseBody extends TeaModel {
    @NameInMap("FunctionName")
    private String functionName;

    @NameInMap("Input")
    private String input;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobParams")
    private String jobParams;

    @NameInMap("Output")
    private String output;

    @NameInMap("PipelineId")
    private String pipelineId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("State")
    private String state;

    @NameInMap("UserData")
    private String userData;

    private QueryIProductionJobResponseBody(Builder builder) {
        this.functionName = builder.functionName;
        this.input = builder.input;
        this.jobId = builder.jobId;
        this.jobParams = builder.jobParams;
        this.output = builder.output;
        this.pipelineId = builder.pipelineId;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.state = builder.state;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIProductionJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String functionName; 
        private String input; 
        private String jobId; 
        private String jobParams; 
        private String output; 
        private String pipelineId; 
        private String requestId; 
        private String result; 
        private String state; 
        private String userData; 

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.input = input;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobParams.
         */
        public Builder jobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public QueryIProductionJobResponseBody build() {
            return new QueryIProductionJobResponseBody(this);
        } 

    } 

}
