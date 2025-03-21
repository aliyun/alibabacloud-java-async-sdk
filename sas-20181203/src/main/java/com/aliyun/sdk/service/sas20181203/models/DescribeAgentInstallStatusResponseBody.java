// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAgentInstallStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgentInstallStatusResponseBody</p>
 */
public class DescribeAgentInstallStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AegisClientInvokeStatusResponseList")
    private java.util.List<AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<AegisClientInvokeStatusResponseList> getAegisClientInvokeStatusResponseList() {
        return this.aegisClientInvokeStatusResponseList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList; 
        private String requestId; 

        /**
         * <p>The status of servers.</p>
         */
        public Builder aegisClientInvokeStatusResponseList(java.util.List<AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList) {
            this.aegisClientInvokeStatusResponseList = aegisClientInvokeStatusResponseList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAgentInstallStatusResponseBody build() {
            return new DescribeAgentInstallStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgentInstallStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgentInstallStatusResponseBody</p>
     */
    public static class AegisClientInvokeStatusResponseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ResuleCode")
        private String resuleCode;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>Installed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The installation status. Valid value:</p>
             * <ul>
             * <li><strong>-1</strong>: The agent is not installed.</li>
             * <li><strong>0</strong>: The agent is installed.</li>
             * <li><strong>1</strong>: Failed to create a directory in the client.</li>
             * <li><strong>2</strong>: Failed to download the installation package.</li>
             * <li><strong>3</strong>: The installation file does not exist.</li>
             * <li><strong>4</strong>: The verification information of the installation file does not exist.</li>
             * <li><strong>5</strong>: Failed to verify the installation file.</li>
             * <li><strong>6</strong>: Failed to execute the installation file.</li>
             * <li><strong>7</strong>: You do not have the required permissions. The installation failed.</li>
             * <li><strong>8</strong>: No client process is detected.</li>
             * <li><strong>100</strong>: The installation failed due to an unknown error.</li>
             * <li><strong>1001</strong>: The installation failed. One-click installation is not supported in this region.</li>
             * <li><strong>1002</strong>: The installation failed. Servers that are not provided by Alibaba Cloud are not supported. Install the agent by executing a script on the server.</li>
             * <li><strong>1003</strong>: The installation failed. The operating system is not supported.</li>
             * <li><strong>1004</strong>: An internal error occurred. Try again later.</li>
             * <li><strong>1005</strong>: The Elastic Compute Service (ECS) instance is not started. Start the ECS instance and try again.</li>
             * <li><strong>1006</strong>: One-click installation is not supported for ECS instances of the classic network type.</li>
             * <li><strong>1007</strong>: The running command is manually stopped.</li>
             * <li><strong>1008</strong>: Cloud Assistant is not installed. You cannot install the client.</li>
             * <li><strong>1009</strong>: The command execution timed out. Try again later.</li>
             * <li><strong>1010</strong>: The machine is already online. You do not need to install a client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resuleCode(String resuleCode) {
                this.resuleCode = resuleCode;
                return this;
            }

            /**
             * <p>The installation result. Valid value:</p>
             * <ul>
             * <li><strong>-1</strong>: The agent is not installed.</li>
             * <li><strong>0</strong>: The agent is being installed.</li>
             * <li><strong>1</strong>: The agent is installed.</li>
             * <li><strong>2</strong>: The installation failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>d123f6ae-9749-4338-8c7f-3c2c1ead****</p>
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
