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
         * The status of servers.
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
             * The returned message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The installation status. Valid value:
             * <p>
             * 
             * *   **-1**: The agent is not installed.
             * *   **0**: The agent is installed.
             * *   **1**: Failed to create a directory in the client.
             * *   **2**: Failed to download the installation package.
             * *   **3**: The installation file does not exist.
             * *   **4**: The verification information of the installation file does not exist.
             * *   **5**: Failed to verify the installation file.
             * *   **6**: Failed to execute the installation file.
             * *   **7**: You do not have the required permissions. The installation failed.
             * *   **8**: No client process is detected.
             * *   **100**: The installation failed due to an unknown error.
             * *   **1001**: The installation failed. One-click installation is not supported in this region.
             * *   **1002**: The installation failed. Servers that are not provided by Alibaba Cloud are not supported. Install the agent by executing a script on the server.
             * *   **1003**: The installation failed. The operating system is not supported.
             * *   **1004**: An internal error occurred. Try again later.
             * *   **1005**: The Elastic Compute Service (ECS) instance is not started. Start the ECS instance and try again.
             * *   **1006**: One-click installation is not supported for ECS instances of the classic network type.
             * *   **1007**: The running command is manually stopped.
             * *   **1008**: Cloud Assistant is not installed. You cannot install the client.
             * *   **1009**: The command execution timed out. Try again later.
             * *   **1010**: The machine is already online. You do not need to install a client.
             */
            public Builder resuleCode(String resuleCode) {
                this.resuleCode = resuleCode;
                return this;
            }

            /**
             * The installation result. Valid value:
             * <p>
             * 
             * *   **-1**: The agent is not installed.
             * *   **0**: The agent is being installed.
             * *   **1**: The agent is installed.
             * *   **2**: The installation failed.
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
