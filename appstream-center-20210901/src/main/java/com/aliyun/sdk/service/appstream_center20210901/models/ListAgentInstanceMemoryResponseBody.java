// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListAgentInstanceMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentInstanceMemoryResponseBody</p>
 */
public class ListAgentInstanceMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAgentInstanceMemoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentInstanceMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAgentInstanceMemoryResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The memory configurations and statistics information of agent instances on the current page.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The current page number. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page used for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAgentInstanceMemoryResponseBody build() {
            return new ListAgentInstanceMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentInstanceMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentInstanceMemoryResponseBody</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private UserGroups(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String groupId; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(UserGroups model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>group-aliy****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The user group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Office user group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentInstanceMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentInstanceMemoryResponseBody</p>
     */
    public static class UserOrgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        private UserOrgs(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserOrgs create() {
            return builder().build();
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        public static final class Builder {
            private String orgId; 
            private String orgName; 

            private Builder() {
            } 

            private Builder(UserOrgs model) {
                this.orgId = model.orgId;
                this.orgName = model.orgName;
            } 

            /**
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>org-aliy****</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The organization name.</p>
             * 
             * <strong>example:</strong>
             * <p>Enterprise office</p>
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            public UserOrgs build() {
                return new UserOrgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentInstanceMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentInstanceMemoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentInstanceId")
        private String agentInstanceId;

        @com.aliyun.core.annotation.NameInMap("AgentInstanceStatus")
        private String agentInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("AgentPlatform")
        private String agentPlatform;

        @com.aliyun.core.annotation.NameInMap("AgentProvider")
        private String agentProvider;

        @com.aliyun.core.annotation.NameInMap("BackupCount")
        private Integer backupCount;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("LastMemoryUpdatedAt")
        private String lastMemoryUpdatedAt;

        @com.aliyun.core.annotation.NameInMap("LatestBackupAt")
        private String latestBackupAt;

        @com.aliyun.core.annotation.NameInMap("MemoryCount")
        private Long memoryCount;

        @com.aliyun.core.annotation.NameInMap("MemoryEnabled")
        private String memoryEnabled;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("RuntimeId")
        private String runtimeId;

        @com.aliyun.core.annotation.NameInMap("RuntimeName")
        private String runtimeName;

        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private java.util.List<UserGroups> userGroups;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserOrgs")
        private java.util.List<UserOrgs> userOrgs;

        @com.aliyun.core.annotation.NameInMap("WyId")
        private String wyId;

        private Data(Builder builder) {
            this.agentInstanceId = builder.agentInstanceId;
            this.agentInstanceStatus = builder.agentInstanceStatus;
            this.agentPlatform = builder.agentPlatform;
            this.agentProvider = builder.agentProvider;
            this.backupCount = builder.backupCount;
            this.endUserId = builder.endUserId;
            this.lastMemoryUpdatedAt = builder.lastMemoryUpdatedAt;
            this.latestBackupAt = builder.latestBackupAt;
            this.memoryCount = builder.memoryCount;
            this.memoryEnabled = builder.memoryEnabled;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.runtimeId = builder.runtimeId;
            this.runtimeName = builder.runtimeName;
            this.userGroups = builder.userGroups;
            this.userName = builder.userName;
            this.userOrgs = builder.userOrgs;
            this.wyId = builder.wyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentInstanceId
         */
        public String getAgentInstanceId() {
            return this.agentInstanceId;
        }

        /**
         * @return agentInstanceStatus
         */
        public String getAgentInstanceStatus() {
            return this.agentInstanceStatus;
        }

        /**
         * @return agentPlatform
         */
        public String getAgentPlatform() {
            return this.agentPlatform;
        }

        /**
         * @return agentProvider
         */
        public String getAgentProvider() {
            return this.agentProvider;
        }

        /**
         * @return backupCount
         */
        public Integer getBackupCount() {
            return this.backupCount;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return lastMemoryUpdatedAt
         */
        public String getLastMemoryUpdatedAt() {
            return this.lastMemoryUpdatedAt;
        }

        /**
         * @return latestBackupAt
         */
        public String getLatestBackupAt() {
            return this.latestBackupAt;
        }

        /**
         * @return memoryCount
         */
        public Long getMemoryCount() {
            return this.memoryCount;
        }

        /**
         * @return memoryEnabled
         */
        public String getMemoryEnabled() {
            return this.memoryEnabled;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return runtimeId
         */
        public String getRuntimeId() {
            return this.runtimeId;
        }

        /**
         * @return runtimeName
         */
        public String getRuntimeName() {
            return this.runtimeName;
        }

        /**
         * @return userGroups
         */
        public java.util.List<UserGroups> getUserGroups() {
            return this.userGroups;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userOrgs
         */
        public java.util.List<UserOrgs> getUserOrgs() {
            return this.userOrgs;
        }

        /**
         * @return wyId
         */
        public String getWyId() {
            return this.wyId;
        }

        public static final class Builder {
            private String agentInstanceId; 
            private String agentInstanceStatus; 
            private String agentPlatform; 
            private String agentProvider; 
            private Integer backupCount; 
            private String endUserId; 
            private String lastMemoryUpdatedAt; 
            private String latestBackupAt; 
            private Long memoryCount; 
            private String memoryEnabled; 
            private String regionId; 
            private String resourceId; 
            private String runtimeId; 
            private String runtimeName; 
            private java.util.List<UserGroups> userGroups; 
            private String userName; 
            private java.util.List<UserOrgs> userOrgs; 
            private String wyId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentInstanceId = model.agentInstanceId;
                this.agentInstanceStatus = model.agentInstanceStatus;
                this.agentPlatform = model.agentPlatform;
                this.agentProvider = model.agentProvider;
                this.backupCount = model.backupCount;
                this.endUserId = model.endUserId;
                this.lastMemoryUpdatedAt = model.lastMemoryUpdatedAt;
                this.latestBackupAt = model.latestBackupAt;
                this.memoryCount = model.memoryCount;
                this.memoryEnabled = model.memoryEnabled;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.runtimeId = model.runtimeId;
                this.runtimeName = model.runtimeName;
                this.userGroups = model.userGroups;
                this.userName = model.userName;
                this.userOrgs = model.userOrgs;
                this.wyId = model.wyId;
            } 

            /**
             * <p>The Agent instance ID, which can be used to set the instance memory switch or clear the instance memory.</p>
             * 
             * <strong>example:</strong>
             * <p>agi-08vm****</p>
             */
            public Builder agentInstanceId(String agentInstanceId) {
                this.agentInstanceId = agentInstanceId;
                return this;
            }

            /**
             * <p>The lifecycle status of the agent instance.</p>
             * <ul>
             * <li><code>UNDEPLOYED</code>: Undeployed.</li>
             * <li><code>DEPLOYING</code>: Deploying.</li>
             * <li><code>DEPLOYED</code>: Deployed.</li>
             * <li><code>STARTING</code>: Starting.</li>
             * <li><code>RUNNING</code>: Running.</li>
             * <li><code>STOPPING</code>: Stopping.</li>
             * <li><code>STOPPED</code>: Stopped.</li>
             * <li><code>UNAVAILABLE</code>: Unavailable.</li>
             * <li><code>FAILED</code>: Failed.</li>
             * <li><code>UPGRADING</code>: Upgrading.</li>
             * <li><code>REBUILDING</code>: Resetting.</li>
             * <li><code>DELETING</code>: Deleting.</li>
             * <li><code>DELETED</code>: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder agentInstanceStatus(String agentInstanceStatus) {
                this.agentInstanceStatus = agentInstanceStatus;
                return this;
            }

            /**
             * <p>The business platform to which the Agent belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
             */
            public Builder agentPlatform(String agentPlatform) {
                this.agentPlatform = agentPlatform;
                return this;
            }

            /**
             * <p>The Agent provider.</p>
             * 
             * <strong>example:</strong>
             * <p>AgenticComputer</p>
             */
            public Builder agentProvider(String agentProvider) {
                this.agentProvider = agentProvider;
                return this;
            }

            /**
             * <p>The number of undeleted memory backups for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backupCount(Integer backupCount) {
                this.backupCount = backupCount;
                return this;
            }

            /**
             * <p>The ID of the end user to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The time of the last memory update. The time is returned in the YYYY-MM-DDThh:mm:ss format, which may include fractional seconds. The time value uses the default time zone of the server, and the string does not contain a time zone offset. This field is omitted if the last update time is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-26T21:14:36.693</p>
             */
            public Builder lastMemoryUpdatedAt(String lastMemoryUpdatedAt) {
                this.lastMemoryUpdatedAt = lastMemoryUpdatedAt;
                return this;
            }

            /**
             * <p>The time of the latest backup. The time is returned in the YYYY-MM-DDThh:mm:ss format, which may include fractional seconds. The time value uses the default time zone of the server, and the string does not contain a time zone offset. This field is omitted if the backup time is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-26T20:58:00.536</p>
             */
            public Builder latestBackupAt(String latestBackupAt) {
                this.latestBackupAt = latestBackupAt;
                return this;
            }

            /**
             * <p>The number of memory entries for the instance. This field may be omitted if statistics are unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder memoryCount(Long memoryCount) {
                this.memoryCount = memoryCount;
                return this;
            }

            /**
             * <p>The memory switch configured for the instance, returned as a string. A value of <code>true</code> indicates that the switch is turned on. A value of <code>false</code> indicates that the switch is turned off.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder memoryEnabled(String memoryEnabled) {
                this.memoryEnabled = memoryEnabled;
                return this;
            }

            /**
             * <p>The ID of the region where the runtime is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource associated with the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-d8ut****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The runtime ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-d8ut****</p>
             */
            public Builder runtimeId(String runtimeId) {
                this.runtimeId = runtimeId;
                return this;
            }

            /**
             * <p>The runtime name. The associated resource name is returned in preference. If the resource name is unavailable, the instance name is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Office Assistant</p>
             */
            public Builder runtimeName(String runtimeName) {
                this.runtimeName = runtimeName;
                return this;
            }

            /**
             * <p>The list of user groups to which the end user belongs.</p>
             */
            public Builder userGroups(java.util.List<UserGroups> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            /**
             * <p>The username of the end user to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The list of organizations to which the end user belongs.</p>
             */
            public Builder userOrgs(java.util.List<UserOrgs> userOrgs) {
                this.userOrgs = userOrgs;
                return this;
            }

            /**
             * <p>The Wuying user ID of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>0c614d26****</p>
             */
            public Builder wyId(String wyId) {
                this.wyId = wyId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
