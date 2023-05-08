// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAgentInstallStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgentInstallStatusResponseBody</p>
 */
public class DescribeAgentInstallStatusResponseBody extends TeaModel {
    @NameInMap("AegisClientInvokeStatusResponseList")
    private java.util.List < AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAgentInstallStatusResponseBody(Builder builder) {
        this.aegisClientInvokeStatusResponseList = builder.aegisClientInvokeStatusResponseList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgentInstallStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return aegisClientInvokeStatusResponseList
     */
    public java.util.List < AegisClientInvokeStatusResponseList> getAegisClientInvokeStatusResponseList() {
        return this.aegisClientInvokeStatusResponseList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList; 
        private String requestId; 

        /**
         * An array that consists of the installation results for the servers.
         */
        public Builder aegisClientInvokeStatusResponseList(java.util.List < AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList) {
            this.aegisClientInvokeStatusResponseList = aegisClientInvokeStatusResponseList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAgentInstallStatusResponseBody build() {
            return new DescribeAgentInstallStatusResponseBody(this);
        } 

    } 

    public static class AegisClientInvokeStatusResponseList extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("ResuleCode")
        private String resuleCode;

        @NameInMap("Result")
        private Integer result;

        @NameInMap("Uuid")
        private String uuid;

        private AegisClientInvokeStatusResponseList(Builder builder) {
            this.message = builder.message;
            this.resuleCode = builder.resuleCode;
            this.result = builder.result;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AegisClientInvokeStatusResponseList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return resuleCode
         */
        public String getResuleCode() {
            return this.resuleCode;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String message; 
            private String resuleCode; 
            private Integer result; 
            private String uuid; 

            /**
             * The message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The result code returned. Valid values:
             * <p>
             * 
             * *   **-1**: The agent is not installed.
             * *   **0**: The agent is installed.
             * *   **1**: The directory of the agent failed to be created.
             * *   **2**: The installation package failed to be downloaded.
             * *   **3**: The installation file does not exist.
             * *   **4**: The verification information about the installation file does not exist.
             * *   **5**: The installation file failed to pass the verification.
             * *   **6**: The installation file failed to be executed.
             * *   **7**: The agent failed to be installed because the required permissions are not granted.
             * *   **8**: No process of the agent was detected.
             * *   **100**: The agent failed to be installed because an unknown error occurred.
             * *   **1001**: The agent failed to be installed because the automatic installation of the agent is not supported in the region.
             * *   **1002**: The agent failed to be installed because the agent cannot be installed on servers outside the cloud. You can install the agent only on supported servers.
             * *   **1003**: The agent failed to be installed because the operating system type of the server is not supported.
             * *   **1004**: An internal error occurred. Try again later.
             * *   **1005**: The Elastic Compute Service (ECS) instance is not running. Start the ECS instance and try again.
             * *   **1006**: The automatic installation of the agent is not supported on an ECS instance that resides in the classic network.
             * *   **1007**: The process of the installation command is manually stopped.
             * *   **1008**: The agent failed to be installed because Cloud Assistant is not installed.
             * *   **1009**: The execution of the installation command timed out. Try again later.
             * *   **1010**: The agent on the server is already online. You do not need to install the agent.
             */
            public Builder resuleCode(String resuleCode) {
                this.resuleCode = resuleCode;
                return this;
            }

            /**
             * The installation result. Valid value:
             * <p>
             * 
             * *   **-1**: not installed
             * *   **0**: being installed
             * *   **1**: installed
             * *   **2**: installation failed
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AegisClientInvokeStatusResponseList build() {
                return new AegisClientInvokeStatusResponseList(this);
            } 

        } 

    }
}
