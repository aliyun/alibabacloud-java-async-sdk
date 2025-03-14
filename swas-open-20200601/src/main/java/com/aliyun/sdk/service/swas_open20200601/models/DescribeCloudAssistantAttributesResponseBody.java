// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeCloudAssistantAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantAttributesResponseBody</p>
 */
public class DescribeCloudAssistantAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAssistant")
    private java.util.List<CloudAssistant> cloudAssistant;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCloudAssistantAttributesResponseBody(Builder builder) {
        this.cloudAssistant = builder.cloudAssistant;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudAssistantAttributesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAssistant
     */
    public java.util.List<CloudAssistant> getCloudAssistant() {
        return this.cloudAssistant;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CloudAssistant> cloudAssistant; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCloudAssistantAttributesResponseBody model) {
            this.cloudAssistant = model.cloudAssistant;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The Command Assistant information.</p>
         */
        public Builder cloudAssistant(java.util.List<CloudAssistant> cloudAssistant) {
            this.cloudAssistant = cloudAssistant;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudAssistantAttributesResponseBody build() {
            return new DescribeCloudAssistantAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudAssistantAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantAttributesResponseBody</p>
     */
    public static class CloudAssistant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTaskCount")
        private Long activeTaskCount;

        @com.aliyun.core.annotation.NameInMap("CloudAssistantStatus")
        private String cloudAssistantStatus;

        @com.aliyun.core.annotation.NameInMap("CloudAssistantVersion")
        private String cloudAssistantVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InvocationCount")
        private Long invocationCount;

        @com.aliyun.core.annotation.NameInMap("LastHeartbeatTime")
        private String lastHeartbeatTime;

        @com.aliyun.core.annotation.NameInMap("LastInvokedTime")
        private String lastInvokedTime;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("SupportSessionManager")
        private Boolean supportSessionManager;

        private CloudAssistant(Builder builder) {
            this.activeTaskCount = builder.activeTaskCount;
            this.cloudAssistantStatus = builder.cloudAssistantStatus;
            this.cloudAssistantVersion = builder.cloudAssistantVersion;
            this.instanceId = builder.instanceId;
            this.invocationCount = builder.invocationCount;
            this.lastHeartbeatTime = builder.lastHeartbeatTime;
            this.lastInvokedTime = builder.lastInvokedTime;
            this.OSType = builder.OSType;
            this.supportSessionManager = builder.supportSessionManager;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssistant create() {
            return builder().build();
        }

        /**
         * @return activeTaskCount
         */
        public Long getActiveTaskCount() {
            return this.activeTaskCount;
        }

        /**
         * @return cloudAssistantStatus
         */
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        /**
         * @return cloudAssistantVersion
         */
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return invocationCount
         */
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        /**
         * @return lastHeartbeatTime
         */
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        /**
         * @return lastInvokedTime
         */
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return supportSessionManager
         */
        public Boolean getSupportSessionManager() {
            return this.supportSessionManager;
        }

        public static final class Builder {
            private Long activeTaskCount; 
            private String cloudAssistantStatus; 
            private String cloudAssistantVersion; 
            private String instanceId; 
            private Long invocationCount; 
            private String lastHeartbeatTime; 
            private String lastInvokedTime; 
            private String OSType; 
            private Boolean supportSessionManager; 

            private Builder() {
            } 

            private Builder(CloudAssistant model) {
                this.activeTaskCount = model.activeTaskCount;
                this.cloudAssistantStatus = model.cloudAssistantStatus;
                this.cloudAssistantVersion = model.cloudAssistantVersion;
                this.instanceId = model.instanceId;
                this.invocationCount = model.invocationCount;
                this.lastHeartbeatTime = model.lastHeartbeatTime;
                this.lastInvokedTime = model.lastInvokedTime;
                this.OSType = model.OSType;
                this.supportSessionManager = model.supportSessionManager;
            } 

            /**
             * <p>The number of active tasks in Command Assistant.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder activeTaskCount(Long activeTaskCount) {
                this.activeTaskCount = activeTaskCount;
                return this;
            }

            /**
             * <p>Indicates whether Command Assistant is running. Valid values:</p>
             * <p>true: Heartbeats are detected in the last 2 minutes.</p>
             * <p>false: Heartbeats are not detected in the last 2 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * <p>The version number of the Command Assistant agent. Null is returned if the Command Assistant agent is not installed or is not running.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.0.106</p>
             */
            public Builder cloudAssistantVersion(String cloudAssistantVersion) {
                this.cloudAssistantVersion = cloudAssistantVersion;
                return this;
            }

            /**
             * <p>The ID of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>85dbe3e7cc7b49e1a3df4af3bfa4ebbf</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of completed tasks in Command Assistant.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
                return this;
            }

            /**
             * <p>The time when the last heartbeat of Command Assistant was detected. The value is updated every minute on average. The interval can be 55, 60, or 65 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T09:00:00Z</p>
             */
            public Builder lastHeartbeatTime(String lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * <p>The time when commands were last run.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T08:00:00Z</p>
             */
            public Builder lastInvokedTime(String lastInvokedTime) {
                this.lastInvokedTime = lastInvokedTime;
                return this;
            }

            /**
             * <p>The OS type of the simple application server. Valid values:</p>
             * <ul>
             * <li>Windows</li>
             * <li>Linux</li>
             * <li>FreeBSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * <p>Indicates whether Command Assistant supports session management. If Command Assistant does not support session management, the version of the Command Assistant agent is too earlier. We recommend that you update your Command Assistant agent to the latest version.</p>
             * <p>To use the session management feature, you must make sure that the version of your Command Assistant agent meets one of the following requirements:</p>
             * <p>If your simple application server runs Linux, the version of the Command Assistant agent on the server must be 2.2.3.189 or later. If your simple application server runs Windows, the version of the Command Assistant agent on the server must be 2.1.3.189 or later.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportSessionManager(Boolean supportSessionManager) {
                this.supportSessionManager = supportSessionManager;
                return this;
            }

            public CloudAssistant build() {
                return new CloudAssistant(this);
            } 

        } 

    }
}
