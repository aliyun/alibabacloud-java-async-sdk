// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartExecutionResponseBody</p>
 */
public class StartExecutionResponseBody extends TeaModel {
    @NameInMap("FlowDefinition")
    private String flowDefinition;

    @NameInMap("FlowName")
    private String flowName;

    @NameInMap("Input")
    private String input;

    @NameInMap("Name")
    private String name;

    @NameInMap("Output")
    private String output;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartedTime")
    private String startedTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("StoppedTime")
    private String stoppedTime;

    private StartExecutionResponseBody(Builder builder) {
        this.flowDefinition = builder.flowDefinition;
        this.flowName = builder.flowName;
        this.input = builder.input;
        this.name = builder.name;
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.startedTime = builder.startedTime;
        this.status = builder.status;
        this.stoppedTime = builder.stoppedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartExecutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowDefinition
     */
    public String getFlowDefinition() {
        return this.flowDefinition;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return startedTime
     */
    public String getStartedTime() {
        return this.startedTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stoppedTime
     */
    public String getStoppedTime() {
        return this.stoppedTime;
    }

    public static final class Builder {
        private String flowDefinition; 
        private String flowName; 
        private String input; 
        private String name; 
        private String output; 
        private String requestId; 
        private String startedTime; 
        private String status; 
        private String stoppedTime; 

        /**
         * FlowDefinition.
         */
        public Builder flowDefinition(String flowDefinition) {
            this.flowDefinition = flowDefinition;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartedTime.
         */
        public Builder startedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StoppedTime.
         */
        public Builder stoppedTime(String stoppedTime) {
            this.stoppedTime = stoppedTime;
            return this;
        }

        public StartExecutionResponseBody build() {
            return new StartExecutionResponseBody(this);
        } 

    } 

}
