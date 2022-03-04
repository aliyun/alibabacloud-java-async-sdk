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
    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("InstanceCloudAssistantStatusSet")
    private InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet;

    private DescribeCloudAssistantStatusResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.instanceCloudAssistantStatusSet = builder.instanceCloudAssistantStatusSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudAssistantStatusResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return instanceCloudAssistantStatusSet
     */
    public InstanceCloudAssistantStatusSet getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    public static final class Builder {
        private Long pageSize; 
        private String requestId; 
        private Long pageNumber; 
        private Long totalCount; 
        private InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet; 

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The current page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of instances.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The collection of installation status results of the instance cloud assistant.
         */
        public Builder instanceCloudAssistantStatusSet(InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet) {
            this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
            return this;
        }

        public DescribeCloudAssistantStatusResponseBody build() {
            return new DescribeCloudAssistantStatusResponseBody(this);
        } 

    } 

    public static class InstanceCloudAssistantStatus extends TeaModel {
        @NameInMap("CloudAssistantStatus")
        private String cloudAssistantStatus;

        @NameInMap("LastInvokedTime")
        private String lastInvokedTime;

        @NameInMap("CloudAssistantVersion")
        private String cloudAssistantVersion;

        @NameInMap("ActiveTaskCount")
        private Long activeTaskCount;

        @NameInMap("InvocationCount")
        private Long invocationCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LastHeartbeatTime")
        private String lastHeartbeatTime;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("SupportSessionManager")
        private Boolean supportSessionManager;

        private InstanceCloudAssistantStatus(Builder builder) {
            this.cloudAssistantStatus = builder.cloudAssistantStatus;
            this.lastInvokedTime = builder.lastInvokedTime;
            this.cloudAssistantVersion = builder.cloudAssistantVersion;
            this.activeTaskCount = builder.activeTaskCount;
            this.invocationCount = builder.invocationCount;
            this.instanceId = builder.instanceId;
            this.lastHeartbeatTime = builder.lastHeartbeatTime;
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
         * @return cloudAssistantStatus
         */
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        /**
         * @return lastInvokedTime
         */
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        /**
         * @return cloudAssistantVersion
         */
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

        /**
         * @return activeTaskCount
         */
        public Long getActiveTaskCount() {
            return this.activeTaskCount;
        }

        /**
         * @return invocationCount
         */
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastHeartbeatTime
         */
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
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
            private String cloudAssistantStatus; 
            private String lastInvokedTime; 
            private String cloudAssistantVersion; 
            private Long activeTaskCount; 
            private Long invocationCount; 
            private String instanceId; 
            private String lastHeartbeatTime; 
            private String OSType; 
            private Boolean supportSessionManager; 

            /**
             * Indicates whether cloud assistant is installed.
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * The time when the last command was run.
             */
            public Builder lastInvokedTime(String lastInvokedTime) {
                this.lastInvokedTime = lastInvokedTime;
                return this;
            }

            /**
             * The version number of the cloud assistant client.
             */
            public Builder cloudAssistantVersion(String cloudAssistantVersion) {
                this.cloudAssistantVersion = cloudAssistantVersion;
                return this;
            }

            /**
             * The number of commands that are being executed.
             */
            public Builder activeTaskCount(Long activeTaskCount) {
                this.activeTaskCount = activeTaskCount;
                return this;
            }

            /**
             * The total number of executed commands.
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
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
             * The last heartbeat time of cloud assistant.
             */
            public Builder lastHeartbeatTime(String lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * The operating system type of the instance. Possible values:
             * <p>
             * 
             * -Windows.
             * -Linux.
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * Whether the current cloud assistant client version supports session management.
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
