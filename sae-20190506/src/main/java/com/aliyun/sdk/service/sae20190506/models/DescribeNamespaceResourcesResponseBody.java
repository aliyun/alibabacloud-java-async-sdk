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
 * {@link DescribeNamespaceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceResourcesResponseBody</p>
 */
public class DescribeNamespaceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private DescribeNamespaceResourcesResponseBody(Builder builder) {
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

    public static DescribeNamespaceResourcesResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeNamespaceResourcesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: Success.</li>
         * <li><strong>3xx</strong>: Redirect.</li>
         * <li><strong>4xx</strong>: Request error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
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
         * <p>The response result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>Successful request: The <strong>ErrorCode</strong> field is not returned.</li>
         * <li>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.Obviously</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The request is normal.</li>
         * <li>Specific error code: The request is abnormal.</li>
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
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the namespace resource information was queried successfully. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The query was successful.</li>
         * <li><strong>false</strong>: The query failed.</li>
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
         * <p>The trace ID, which is used to accurately query call information.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeNamespaceResourcesResponseBody build() {
            return new DescribeNamespaceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNamespaceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespaceResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApmJavaAgentVersion")
        private String apmJavaAgentVersion;

        @com.aliyun.core.annotation.NameInMap("AppCount")
        private Long appCount;

        @com.aliyun.core.annotation.NameInMap("BelongRegion")
        private String belongRegion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("JumpServerAppId")
        private String jumpServerAppId;

        @com.aliyun.core.annotation.NameInMap("JumpServerIp")
        private String jumpServerIp;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderId")
        private String lastChangeOrderId;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderRunning")
        private Boolean lastChangeOrderRunning;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderStatus")
        private String lastChangeOrderStatus;

        @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
        private String nameSpaceShortId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("NotificationExpired")
        private Boolean notificationExpired;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SlsConfigs")
        private String slsConfigs;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private Data(Builder builder) {
            this.apmJavaAgentVersion = builder.apmJavaAgentVersion;
            this.appCount = builder.appCount;
            this.belongRegion = builder.belongRegion;
            this.description = builder.description;
            this.jumpServerAppId = builder.jumpServerAppId;
            this.jumpServerIp = builder.jumpServerIp;
            this.lastChangeOrderId = builder.lastChangeOrderId;
            this.lastChangeOrderRunning = builder.lastChangeOrderRunning;
            this.lastChangeOrderStatus = builder.lastChangeOrderStatus;
            this.nameSpaceShortId = builder.nameSpaceShortId;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.notificationExpired = builder.notificationExpired;
            this.securityGroupId = builder.securityGroupId;
            this.slsConfigs = builder.slsConfigs;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apmJavaAgentVersion
         */
        public String getApmJavaAgentVersion() {
            return this.apmJavaAgentVersion;
        }

        /**
         * @return appCount
         */
        public Long getAppCount() {
            return this.appCount;
        }

        /**
         * @return belongRegion
         */
        public String getBelongRegion() {
            return this.belongRegion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return jumpServerAppId
         */
        public String getJumpServerAppId() {
            return this.jumpServerAppId;
        }

        /**
         * @return jumpServerIp
         */
        public String getJumpServerIp() {
            return this.jumpServerIp;
        }

        /**
         * @return lastChangeOrderId
         */
        public String getLastChangeOrderId() {
            return this.lastChangeOrderId;
        }

        /**
         * @return lastChangeOrderRunning
         */
        public Boolean getLastChangeOrderRunning() {
            return this.lastChangeOrderRunning;
        }

        /**
         * @return lastChangeOrderStatus
         */
        public String getLastChangeOrderStatus() {
            return this.lastChangeOrderStatus;
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
         * @return notificationExpired
         */
        public Boolean getNotificationExpired() {
            return this.notificationExpired;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return slsConfigs
         */
        public String getSlsConfigs() {
            return this.slsConfigs;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String apmJavaAgentVersion; 
            private Long appCount; 
            private String belongRegion; 
            private String description; 
            private String jumpServerAppId; 
            private String jumpServerIp; 
            private String lastChangeOrderId; 
            private Boolean lastChangeOrderRunning; 
            private String lastChangeOrderStatus; 
            private String nameSpaceShortId; 
            private String namespaceId; 
            private String namespaceName; 
            private Boolean notificationExpired; 
            private String securityGroupId; 
            private String slsConfigs; 
            private String tenantId; 
            private String userId; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apmJavaAgentVersion = model.apmJavaAgentVersion;
                this.appCount = model.appCount;
                this.belongRegion = model.belongRegion;
                this.description = model.description;
                this.jumpServerAppId = model.jumpServerAppId;
                this.jumpServerIp = model.jumpServerIp;
                this.lastChangeOrderId = model.lastChangeOrderId;
                this.lastChangeOrderRunning = model.lastChangeOrderRunning;
                this.lastChangeOrderStatus = model.lastChangeOrderStatus;
                this.nameSpaceShortId = model.nameSpaceShortId;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
                this.notificationExpired = model.notificationExpired;
                this.securityGroupId = model.securityGroupId;
                this.slsConfigs = model.slsConfigs;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The version of the APM Java agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5.0</p>
             */
            public Builder apmJavaAgentVersion(String apmJavaAgentVersion) {
                this.apmJavaAgentVersion = apmJavaAgentVersion;
                return this;
            }

            /**
             * <p>The number of applications.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appCount(Long appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * <p>The region to which the namespace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * <p>The namespace description.</p>
             * 
             * <strong>example:</strong>
             * <p>decs</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The jump server application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5ec46468-6b26-4a3c-9f7c-bf88761a****</p>
             */
            public Builder jumpServerAppId(String jumpServerAppId) {
                this.jumpServerAppId = jumpServerAppId;
                return this;
            }

            /**
             * <p>The IP address of the jump server.</p>
             * 
             * <strong>example:</strong>
             * <p>120.78.XXX.XX</p>
             */
            public Builder jumpServerIp(String jumpServerIp) {
                this.jumpServerIp = jumpServerIp;
                return this;
            }

            /**
             * <p>The change order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>afedb3c4-63f8-4a3d-aaa3-2c30363f****</p>
             */
            public Builder lastChangeOrderId(String lastChangeOrderId) {
                this.lastChangeOrderId = lastChangeOrderId;
                return this;
            }

            /**
             * <p>Indicates whether a change order is running in the namespace. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A change order is running.</li>
             * <li><strong>false</strong>: No change order is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder lastChangeOrderRunning(Boolean lastChangeOrderRunning) {
                this.lastChangeOrderRunning = lastChangeOrderRunning;
                return this;
            }

            /**
             * <p>The status of the latest change order. Valid values:</p>
             * <ul>
             * <li><strong>READY</strong>: The latest change order is ready.</li>
             * <li><strong>RUNNING</strong>: The latest change order is running.</li>
             * <li><strong>SUCCESS</strong>: The latest change order is successful.</li>
             * <li><strong>FAIL</strong>: The latest change order failed.</li>
             * <li><strong>ABORT</strong>: The latest change order is aborted.</li>
             * <li><strong>WAIT_BATCH_CONFIRM</strong>: The latest change order is waiting for manual batch confirmation.</li>
             * <li><strong>AUTO_BATCH_WAIT</strong>: The latest change order is in the automatic batch waiting state.</li>
             * <li><strong>SYSTEM_FAIL</strong>: A system fault occurred.</li>
             * <li><strong>WAIT_APPROVAL</strong>: The latest change order is waiting for approval.</li>
             * <li><strong>APPROVED</strong>: The latest change order is approved and waiting to be executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder lastChangeOrderStatus(String lastChangeOrderStatus) {
                this.lastChangeOrderStatus = lastChangeOrderStatus;
                return this;
            }

            /**
             * <p>The short namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nameSpaceShortId(String nameSpaceShortId) {
                this.nameSpaceShortId = nameSpaceShortId;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shangha:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The namespace name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>Indicates whether the change order notification has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The change order notification has expired.</li>
             * <li><strong>false</strong>: The change order notification has not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder notificationExpired(Boolean notificationExpired) {
                this.notificationExpired = notificationExpired;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz969ngg2e49q5i4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The configurations for collecting logs to Simple Log Service (SLS).</p>
             * <ul>
             * <li>To use SLS resources through automatic creation by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
             * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
             * </ul>
             * <p>Metric description:</p>
             * <ul>
             * <li><strong>projectName</strong>: The name of the SLS project.  </li>
             * <li><strong>logDir</strong>: The log path.</li>
             * <li><strong>logType</strong>: The log type. <strong>stdout</strong> indicates container standard output logs. You can configure only one such log in the Settings. If you do not configure it, file logs are collected.</li>
             * <li><strong>logstoreName</strong>: The name of the SLS Logstore.</li>
             * <li><strong>logtailName</strong>: The name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
             * </ul>
             * <p>If the SLS collection configurations remain unchanged during multiple deployments, you do not need to modify the Settings for this parameter (that is, the <strong>SlsConfigs</strong> field is not required in the request). If you no longer need to use the SLS collection feature, you must change the Settings of this field to an empty character string in the request (that is, the value of the <strong>SlsConfigs</strong> field is &quot;&quot;).</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * <p>The tenant ID of the SAE namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>838cad95-973f-48fe-830b-2a8546d7****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze559r1z1bpwqxwp****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The vSwitch name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze0i263cnn311nvj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
