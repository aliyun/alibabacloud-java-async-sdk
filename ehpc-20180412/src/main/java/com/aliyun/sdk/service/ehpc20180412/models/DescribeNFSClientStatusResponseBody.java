// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNFSClientStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNFSClientStatusResponseBody</p>
 */
public class DescribeNFSClientStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Status")
    private String status;

    private DescribeNFSClientStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNFSClientStatusResponseBody create() {
        return builder().build();
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
    public Result getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private String status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of results.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * The deployment status of the NFS client. Valid values:
         * <p>
         * 
         * *   NotInstalled: The client is not installed.
         * *   Running: The client is being installed.
         * *   Finished: The client is installed on the instance.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeNFSClientStatusResponseBody build() {
            return new DescribeNFSClientStatusResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ExitCode")
        private Integer exitCode;

        @NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @NameInMap("Output")
        private String output;

        private Result(Builder builder) {
            this.exitCode = builder.exitCode;
            this.invokeRecordStatus = builder.invokeRecordStatus;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return exitCode
         */
        public Integer getExitCode() {
            return this.exitCode;
        }

        /**
         * @return invokeRecordStatus
         */
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private Integer exitCode; 
            private String invokeRecordStatus; 
            private String output; 

            /**
             * The Base64-decoded Output parameter value. A True in the last line indicates successful installation. Otherwise, the installation fails.
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The status of the invocation record, which is the same as the value of the Status parameter.
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
                return this;
            }

            /**
             * The execution result of the command.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
