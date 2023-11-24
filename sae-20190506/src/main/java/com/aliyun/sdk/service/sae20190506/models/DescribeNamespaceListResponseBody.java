// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceListResponseBody</p>
 */
public class DescribeNamespaceListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeNamespaceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespaceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: The call was successful.
         * *   **3xx**: The call was redirected.
         * *   **4xx**: The call failed.
         * *   **5xx**: A server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The list of namespaces.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error code. Valid values:
         * <p>
         * 
         * *   If the call is successful, the **ErrorCode** parameter is not returned.
         * *   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned information. Valid values:
         * <p>
         * 
         * *   success: If the call is successful, **success** is returned.
         * *   An error code: If the call fails, an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the namespaces were obtained. Valid values:
         * <p>
         * 
         * *   **true**: The namespaces were obtained.
         * *   **false**: The namespaces failed to be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The trace ID that is used to query the details of the request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeNamespaceListResponseBody build() {
            return new DescribeNamespaceListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AgentInstall")
        private String agentInstall;

        @NameInMap("Current")
        private Boolean current;

        @NameInMap("Custom")
        private Boolean custom;

        @NameInMap("HybridCloudEnable")
        private Boolean hybridCloudEnable;

        @NameInMap("NameSpaceShortId")
        private String nameSpaceShortId;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("NamespaceName")
        private String namespaceName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.agentInstall = builder.agentInstall;
            this.current = builder.current;
            this.custom = builder.custom;
            this.hybridCloudEnable = builder.hybridCloudEnable;
            this.nameSpaceShortId = builder.nameSpaceShortId;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentInstall
         */
        public String getAgentInstall() {
            return this.agentInstall;
        }

        /**
         * @return current
         */
        public Boolean getCurrent() {
            return this.current;
        }

        /**
         * @return custom
         */
        public Boolean getCustom() {
            return this.custom;
        }

        /**
         * @return hybridCloudEnable
         */
        public Boolean getHybridCloudEnable() {
            return this.hybridCloudEnable;
        }

        /**
         * @return nameSpaceShortId
         */
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String agentInstall; 
            private Boolean current; 
            private Boolean custom; 
            private Boolean hybridCloudEnable; 
            private String nameSpaceShortId; 
            private String namespaceId; 
            private String namespaceName; 
            private String regionId; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The command that was run to install the agent.
             */
            public Builder agentInstall(String agentInstall) {
                this.agentInstall = agentInstall;
                return this;
            }

            /**
             * This parameter is no longer valid.
             */
            public Builder current(Boolean current) {
                this.current = current;
                return this;
            }

            /**
             * Indicates whether custom namespaces are returned. Valid values:
             * <p>
             * 
             * *   **true**: Custom namespaces are returned.
             * *   **false**: Custom namespaces are not returned.
             */
            public Builder custom(Boolean custom) {
                this.custom = custom;
                return this;
            }

            /**
             * Specifies whether hybrid cloud namespaces are excluded. Valid values:
             * <p>
             * 
             * *   **true**: Hybrid cloud namespaces are excluded.
             * *   **false**: Hybrid cloud namespaces are included.
             */
            public Builder hybridCloudEnable(Boolean hybridCloudEnable) {
                this.hybridCloudEnable = hybridCloudEnable;
                return this;
            }

            /**
             * NameSpaceShortId.
             */
            public Builder nameSpaceShortId(String nameSpaceShortId) {
                this.nameSpaceShortId = nameSpaceShortId;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * The region to which the namespace belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
