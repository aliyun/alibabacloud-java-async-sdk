// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListRayHistoryServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRayHistoryServersResponseBody</p>
 */
public class ListRayHistoryServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RayHistoryServers")
    private java.util.List<RayHistoryServers> rayHistoryServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRayHistoryServersResponseBody(Builder builder) {
        this.rayHistoryServers = builder.rayHistoryServers;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRayHistoryServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rayHistoryServers
     */
    public java.util.List<RayHistoryServers> getRayHistoryServers() {
        return this.rayHistoryServers;
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
        private java.util.List<RayHistoryServers> rayHistoryServers; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRayHistoryServersResponseBody model) {
            this.rayHistoryServers = model.rayHistoryServers;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * RayHistoryServers.
         */
        public Builder rayHistoryServers(java.util.List<RayHistoryServers> rayHistoryServers) {
            this.rayHistoryServers = rayHistoryServers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRayHistoryServersResponseBody build() {
            return new ListRayHistoryServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRayHistoryServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRayHistoryServersResponseBody</p>
     */
    public static class RayHistoryServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessibility")
        private String accessibility;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EcsSpec")
        private String ecsSpec;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
        private String gmtFinishTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
        private String gmtModifyTime;

        @com.aliyun.core.annotation.NameInMap("MaxRuntimeMinutes")
        private Integer maxRuntimeMinutes;

        @com.aliyun.core.annotation.NameInMap("RayHistoryServerId")
        private String rayHistoryServerId;

        @com.aliyun.core.annotation.NameInMap("RayHistoryServerUrl")
        private String rayHistoryServerUrl;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StoragePath")
        private String storagePath;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private RayHistoryServers(Builder builder) {
            this.accessibility = builder.accessibility;
            this.displayName = builder.displayName;
            this.ecsSpec = builder.ecsSpec;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtFinishTime = builder.gmtFinishTime;
            this.gmtModifyTime = builder.gmtModifyTime;
            this.maxRuntimeMinutes = builder.maxRuntimeMinutes;
            this.rayHistoryServerId = builder.rayHistoryServerId;
            this.rayHistoryServerUrl = builder.rayHistoryServerUrl;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.status = builder.status;
            this.storagePath = builder.storagePath;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
            this.username = builder.username;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayHistoryServers create() {
            return builder().build();
        }

        /**
         * @return accessibility
         */
        public String getAccessibility() {
            return this.accessibility;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return ecsSpec
         */
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtFinishTime
         */
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        /**
         * @return gmtModifyTime
         */
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        /**
         * @return maxRuntimeMinutes
         */
        public Integer getMaxRuntimeMinutes() {
            return this.maxRuntimeMinutes;
        }

        /**
         * @return rayHistoryServerId
         */
        public String getRayHistoryServerId() {
            return this.rayHistoryServerId;
        }

        /**
         * @return rayHistoryServerUrl
         */
        public String getRayHistoryServerUrl() {
            return this.rayHistoryServerUrl;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storagePath
         */
        public String getStoragePath() {
            return this.storagePath;
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
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accessibility; 
            private String displayName; 
            private String ecsSpec; 
            private String gmtCreateTime; 
            private String gmtFinishTime; 
            private String gmtModifyTime; 
            private Integer maxRuntimeMinutes; 
            private String rayHistoryServerId; 
            private String rayHistoryServerUrl; 
            private String reasonCode; 
            private String reasonMessage; 
            private String resourceId; 
            private String resourceName; 
            private String status; 
            private String storagePath; 
            private String tenantId; 
            private String userId; 
            private String username; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(RayHistoryServers model) {
                this.accessibility = model.accessibility;
                this.displayName = model.displayName;
                this.ecsSpec = model.ecsSpec;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtFinishTime = model.gmtFinishTime;
                this.gmtModifyTime = model.gmtModifyTime;
                this.maxRuntimeMinutes = model.maxRuntimeMinutes;
                this.rayHistoryServerId = model.rayHistoryServerId;
                this.rayHistoryServerUrl = model.rayHistoryServerUrl;
                this.reasonCode = model.reasonCode;
                this.reasonMessage = model.reasonMessage;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.status = model.status;
                this.storagePath = model.storagePath;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
                this.username = model.username;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * Accessibility.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EcsSpec.
             */
            public Builder ecsSpec(String ecsSpec) {
                this.ecsSpec = ecsSpec;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtFinishTime.
             */
            public Builder gmtFinishTime(String gmtFinishTime) {
                this.gmtFinishTime = gmtFinishTime;
                return this;
            }

            /**
             * GmtModifyTime.
             */
            public Builder gmtModifyTime(String gmtModifyTime) {
                this.gmtModifyTime = gmtModifyTime;
                return this;
            }

            /**
             * MaxRuntimeMinutes.
             */
            public Builder maxRuntimeMinutes(Integer maxRuntimeMinutes) {
                this.maxRuntimeMinutes = maxRuntimeMinutes;
                return this;
            }

            /**
             * RayHistoryServerId.
             */
            public Builder rayHistoryServerId(String rayHistoryServerId) {
                this.rayHistoryServerId = rayHistoryServerId;
                return this;
            }

            /**
             * <p>Ray Dashboard URL。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://rhsxxx-dashboard.dsw-gateway-cn-wulanchabu.data.aliyun.com/">https://rhsxxx-dashboard.dsw-gateway-cn-wulanchabu.data.aliyun.com/</a></p>
             */
            public Builder rayHistoryServerUrl(String rayHistoryServerUrl) {
                this.rayHistoryServerUrl = rayHistoryServerUrl;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonMessage.
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StoragePath.
             */
            public Builder storagePath(String storagePath) {
                this.storagePath = storagePath;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public RayHistoryServers build() {
                return new RayHistoryServers(this);
            } 

        } 

    }
}
