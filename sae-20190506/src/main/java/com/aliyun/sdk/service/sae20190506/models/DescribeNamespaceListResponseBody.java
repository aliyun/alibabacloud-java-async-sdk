// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeNamespaceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceListResponseBody</p>
 */
public class DescribeNamespaceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeNamespaceListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The namespaces.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
         * <li>An error code: If the call fails, an error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the list of namespaces was queried. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The list was queried.</li>
         * <li><strong>false</strong>: The list failed to be queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID that is used to query the details of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1a0b2215622920113732501e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeNamespaceListResponseBody build() {
            return new DescribeNamespaceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNamespaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentInstall")
        private String agentInstall;

        @com.aliyun.core.annotation.NameInMap("Current")
        private Boolean current;

        @com.aliyun.core.annotation.NameInMap("Custom")
        private Boolean custom;

        @com.aliyun.core.annotation.NameInMap("HybridCloudEnable")
        private Boolean hybridCloudEnable;

        @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
        private String nameSpaceShortId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentInstall = model.agentInstall;
                this.current = model.current;
                this.custom = model.custom;
                this.hybridCloudEnable = model.hybridCloudEnable;
                this.nameSpaceShortId = model.nameSpaceShortId;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The command that was run to install the agent.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://edas-bj.oss-cn-beijing-internal.aliyuncs.com/test/install.sh">http://edas-bj.oss-cn-beijing-internal.aliyuncs.com/test/install.sh</a></p>
             */
            public Builder agentInstall(String agentInstall) {
                this.agentInstall = agentInstall;
                return this;
            }

            /**
             * <p>This parameter is no longer valid.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder current(Boolean current) {
                this.current = current;
                return this;
            }

            /**
             * <p>Indicates whether custom namespaces are returned. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Custom namespaces are returned.</li>
             * <li><strong>false</strong>: Custom namespaces are not returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder custom(Boolean custom) {
                this.custom = custom;
                return this;
            }

            /**
             * <p>Indicates whether hybrid cloud namespaces are excluded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Hybrid cloud namespaces are excluded.</li>
             * <li><strong>false</strong>: Hybrid cloud namespaces are included.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hybridCloudEnable(Boolean hybridCloudEnable) {
                this.hybridCloudEnable = hybridCloudEnable;
                return this;
            }

            /**
             * <p>The short ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nameSpaceShortId(String nameSpaceShortId) {
                this.nameSpaceShortId = nameSpaceShortId;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The region to which the namespace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz969ngg2e49q5i4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze559r1z1bpwqxwp****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze0i263cnn311nvj****</p>
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
