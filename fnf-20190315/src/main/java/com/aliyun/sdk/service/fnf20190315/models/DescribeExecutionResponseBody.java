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
 * {@link DescribeExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExecutionResponseBody</p>
 */
public class DescribeExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowDefinition")
    private String flowDefinition;

    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartedTime")
    private String startedTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StoppedTime")
    private String stoppedTime;

    private DescribeExecutionResponseBody(Builder builder) {
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

    public static DescribeExecutionResponseBody create() {
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
         * <p>The definition of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n - type: pass\n name: mypass</p>
         */
        public Builder flowDefinition(String flowDefinition) {
            this.flowDefinition = flowDefinition;
            return this;
        }

        /**
         * <p>The name of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The input of the execution, which is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder input(String input) {
            this.input = input;
            return this;
        }

        /**
         * <p>The name of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exec</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The execution result, which is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the execution started.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        public Builder startedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * <p>The execution status. Valid values:</p>
         * <ul>
         * <li><strong>Starting</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Stopped</strong></li>
         * <li><strong>Succeeded</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>TimedOut</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the execution stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        public Builder stoppedTime(String stoppedTime) {
            this.stoppedTime = stoppedTime;
            return this;
        }

        public DescribeExecutionResponseBody build() {
            return new DescribeExecutionResponseBody(this);
        } 

    } 

}
