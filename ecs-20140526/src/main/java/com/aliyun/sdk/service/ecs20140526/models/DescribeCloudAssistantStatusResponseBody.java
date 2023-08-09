// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudAssistantStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantStatusResponseBody</p>
 */
public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    @NameInMap("InstanceCloudAssistantStatusSet")
    private InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCloudAssistantStatusResponseBody(Builder builder) {
        this.instanceCloudAssistantStatusSet = builder.instanceCloudAssistantStatusSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudAssistantStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceCloudAssistantStatusSet
     */
    public InstanceCloudAssistantStatusSet getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The installation states of Cloud Assistant Agent on the instances.
         */
        public Builder instanceCloudAssistantStatusSet(InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet) {
            this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of queried instances.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudAssistantStatusResponseBody build() {
            return new DescribeCloudAssistantStatusResponseBody(this);
        } 

    } 

    public static class InstanceCloudAssistantStatus extends TeaModel {
        @NameInMap("ActiveTaskCount")
        private Long activeTaskCount;

        @NameInMap("CloudAssistantStatus")
        private String cloudAssistantStatus;

        @NameInMap("CloudAssistantVersion")
        private String cloudAssistantVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InvocationCount")
        private Long invocationCount;

        @NameInMap("LastHeartbeatTime")
        private String lastHeartbeatTime;

        @NameInMap("LastInvokedTime")
        private String lastInvokedTime;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("SupportSessionManager")
        private Boolean supportSessionManager;

        private InstanceCloudAssistantStatus(Builder builder) {
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

        public static InstanceCloudAssistantStatus create() {
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

            /**
             * The number of tasks that Cloud Assistant was running on the instance.
             */
            public Builder activeTaskCount(Long activeTaskCount) {
                this.activeTaskCount = activeTaskCount;
                return this;
            }

            /**
             * Indicates whether Cloud Assistant is running on the instance. Valid values:
             * <p>
             * 
             * *   true: Heartbeats are detected within 1 minute.
             * *   false: No heartbeats are detected within 1 minute.
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * The version number of Cloud Assistant Agent. If Cloud Assistant Agent is not installed or is not running, this parameter is left empty.
             */
            public Builder cloudAssistantVersion(String cloudAssistantVersion) {
                this.cloudAssistantVersion = cloudAssistantVersion;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of tasks that Cloud Assistant completed on the instance.
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
                return this;
            }

            /**
             * The last heartbeat time of Cloud Assistant. The value is updated once every minute.
             */
            public Builder lastHeartbeatTime(String lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * The time when commands were last run.
             */
            public Builder lastInvokedTime(String lastInvokedTime) {
                this.lastInvokedTime = lastInvokedTime;
                return this;
            }

            /**
             * The operating system type of the instance. Valid values:
             * <p>
             * 
             * *   Windows
             * *   Linux
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * Indicates whether Cloud Assistant supports Session Manager on the instance. If Cloud Assistant does not support Session Manager, the Cloud Assistant running on the instance may be of an early version or Session Manager may not be supported in the specified region.
             */
            public Builder supportSessionManager(Boolean supportSessionManager) {
                this.supportSessionManager = supportSessionManager;
                return this;
            }

            public InstanceCloudAssistantStatus build() {
                return new InstanceCloudAssistantStatus(this);
            } 

        } 

    }
    public static class InstanceCloudAssistantStatusSet extends TeaModel {
        @NameInMap("InstanceCloudAssistantStatus")
        private java.util.List < InstanceCloudAssistantStatus> instanceCloudAssistantStatus;

        private InstanceCloudAssistantStatusSet(Builder builder) {
            this.instanceCloudAssistantStatus = builder.instanceCloudAssistantStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCloudAssistantStatusSet create() {
            return builder().build();
        }

        /**
         * @return instanceCloudAssistantStatus
         */
        public java.util.List < InstanceCloudAssistantStatus> getInstanceCloudAssistantStatus() {
            return this.instanceCloudAssistantStatus;
        }

        public static final class Builder {
            private java.util.List < InstanceCloudAssistantStatus> instanceCloudAssistantStatus; 

            /**
             * InstanceCloudAssistantStatus.
             */
            public Builder instanceCloudAssistantStatus(java.util.List < InstanceCloudAssistantStatus> instanceCloudAssistantStatus) {
                this.instanceCloudAssistantStatus = instanceCloudAssistantStatus;
                return this;
            }

            public InstanceCloudAssistantStatusSet build() {
                return new InstanceCloudAssistantStatusSet(this);
            } 

        } 

    }
}
