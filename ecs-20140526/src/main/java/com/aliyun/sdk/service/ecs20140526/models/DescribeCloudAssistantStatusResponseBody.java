// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeCloudAssistantStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantStatusResponseBody</p>
 */
public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCloudAssistantStatusSet")
    private InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCloudAssistantStatusResponseBody(Builder builder) {
        this.instanceCloudAssistantStatusSet = builder.instanceCloudAssistantStatusSet;
        this.nextToken = builder.nextToken;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceCloudAssistantStatusSet
     */
    public InstanceCloudAssistantStatusSet getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCloudAssistantStatusResponseBody model) {
            this.instanceCloudAssistantStatusSet = model.instanceCloudAssistantStatusSet;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * InstanceCloudAssistantStatusSet.
         */
        public Builder instanceCloudAssistantStatusSet(InstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet) {
            this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudAssistantStatusResponseBody build() {
            return new DescribeCloudAssistantStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudAssistantStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantStatusResponseBody</p>
     */
    public static class InstanceCloudAssistantStatus extends TeaModel {
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

            private Builder() {
            } 

            private Builder(InstanceCloudAssistantStatus model) {
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
             * ActiveTaskCount.
             */
            public Builder activeTaskCount(Long activeTaskCount) {
                this.activeTaskCount = activeTaskCount;
                return this;
            }

            /**
             * CloudAssistantStatus.
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * CloudAssistantVersion.
             */
            public Builder cloudAssistantVersion(String cloudAssistantVersion) {
                this.cloudAssistantVersion = cloudAssistantVersion;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InvocationCount.
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
                return this;
            }

            /**
             * LastHeartbeatTime.
             */
            public Builder lastHeartbeatTime(String lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * LastInvokedTime.
             */
            public Builder lastInvokedTime(String lastInvokedTime) {
                this.lastInvokedTime = lastInvokedTime;
                return this;
            }

            /**
             * OSType.
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * SupportSessionManager.
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
    /**
     * 
     * {@link DescribeCloudAssistantStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudAssistantStatusResponseBody</p>
     */
    public static class InstanceCloudAssistantStatusSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceCloudAssistantStatus")
        private java.util.List<InstanceCloudAssistantStatus> instanceCloudAssistantStatus;

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
        public java.util.List<InstanceCloudAssistantStatus> getInstanceCloudAssistantStatus() {
            return this.instanceCloudAssistantStatus;
        }

        public static final class Builder {
            private java.util.List<InstanceCloudAssistantStatus> instanceCloudAssistantStatus; 

            private Builder() {
            } 

            private Builder(InstanceCloudAssistantStatusSet model) {
                this.instanceCloudAssistantStatus = model.instanceCloudAssistantStatus;
            } 

            /**
             * InstanceCloudAssistantStatus.
             */
            public Builder instanceCloudAssistantStatus(java.util.List<InstanceCloudAssistantStatus> instanceCloudAssistantStatus) {
                this.instanceCloudAssistantStatus = instanceCloudAssistantStatus;
                return this;
            }

            public InstanceCloudAssistantStatusSet build() {
                return new InstanceCloudAssistantStatusSet(this);
            } 

        } 

    }
}
