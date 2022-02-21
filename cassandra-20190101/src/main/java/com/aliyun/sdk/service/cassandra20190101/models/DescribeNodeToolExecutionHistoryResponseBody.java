// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeToolExecutionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeToolExecutionHistoryResponseBody</p>
 */
public class DescribeNodeToolExecutionHistoryResponseBody extends TeaModel {
    @NameInMap("Arguments")
    private String arguments;

    @NameInMap("Command")
    private String command;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("DataCenterId")
    private String dataCenterId;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("IsEnded")
    private Boolean isEnded;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("ModifyTime")
    private Long modifyTime;

    @NameInMap("Nodes")
    private String nodes;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    private DescribeNodeToolExecutionHistoryResponseBody(Builder builder) {
        this.arguments = builder.arguments;
        this.command = builder.command;
        this.createTime = builder.createTime;
        this.dataCenterId = builder.dataCenterId;
        this.errorMessage = builder.errorMessage;
        this.isEnded = builder.isEnded;
        this.jobId = builder.jobId;
        this.modifyTime = builder.modifyTime;
        this.nodes = builder.nodes;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeToolExecutionHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return arguments
     */
    public String getArguments() {
        return this.arguments;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return isEnded
     */
    public Boolean getIsEnded() {
        return this.isEnded;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return nodes
     */
    public String getNodes() {
        return this.nodes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder {
        private String arguments; 
        private String command; 
        private Long createTime; 
        private String dataCenterId; 
        private String errorMessage; 
        private Boolean isEnded; 
        private String jobId; 
        private Long modifyTime; 
        private String nodes; 
        private String regionId; 
        private String requestId; 
        private String result; 

        /**
         * Arguments.
         */
        public Builder arguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * Command.
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * IsEnded.
         */
        public Builder isEnded(Boolean isEnded) {
            this.isEnded = isEnded;
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
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(String nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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

        public DescribeNodeToolExecutionHistoryResponseBody build() {
            return new DescribeNodeToolExecutionHistoryResponseBody(this);
        } 

    } 

}
