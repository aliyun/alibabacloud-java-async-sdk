// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link ListMappCenterWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMappCenterWorkspacesResponseBody</p>
 */
public class ListMappCenterWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListMappCenterWorkspaceResult")
    private ListMappCenterWorkspaceResult listMappCenterWorkspaceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMappCenterWorkspacesResponseBody(Builder builder) {
        this.listMappCenterWorkspaceResult = builder.listMappCenterWorkspaceResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMappCenterWorkspacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listMappCenterWorkspaceResult
     */
    public ListMappCenterWorkspaceResult getListMappCenterWorkspaceResult() {
        return this.listMappCenterWorkspaceResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private ListMappCenterWorkspaceResult listMappCenterWorkspaceResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(ListMappCenterWorkspacesResponseBody model) {
            this.listMappCenterWorkspaceResult = model.listMappCenterWorkspaceResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * ListMappCenterWorkspaceResult.
         */
        public Builder listMappCenterWorkspaceResult(ListMappCenterWorkspaceResult listMappCenterWorkspaceResult) {
            this.listMappCenterWorkspaceResult = listMappCenterWorkspaceResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ListMappCenterWorkspacesResponseBody build() {
            return new ListMappCenterWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMappCenterWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMappCenterWorkspacesResponseBody</p>
     */
    public static class MappCenterWorkspaceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompatibleId")
        private String compatibleId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private Long uid;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private String zones;

        private MappCenterWorkspaceList(Builder builder) {
            this.compatibleId = builder.compatibleId;
            this.createTime = builder.createTime;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.region = builder.region;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.uid = builder.uid;
            this.updateTime = builder.updateTime;
            this.workspaceId = builder.workspaceId;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappCenterWorkspaceList create() {
            return builder().build();
        }

        /**
         * @return compatibleId
         */
        public String getCompatibleId() {
            return this.compatibleId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return zones
         */
        public String getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String compatibleId; 
            private String createTime; 
            private String displayName; 
            private String id; 
            private String region; 
            private String status; 
            private String tenantId; 
            private String type; 
            private Long uid; 
            private String updateTime; 
            private String workspaceId; 
            private String zones; 

            private Builder() {
            } 

            private Builder(MappCenterWorkspaceList model) {
                this.compatibleId = model.compatibleId;
                this.createTime = model.createTime;
                this.displayName = model.displayName;
                this.id = model.id;
                this.region = model.region;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.type = model.type;
                this.uid = model.uid;
                this.updateTime = model.updateTime;
                this.workspaceId = model.workspaceId;
                this.zones = model.zones;
            } 

            /**
             * CompatibleId.
             */
            public Builder compatibleId(String compatibleId) {
                this.compatibleId = compatibleId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(String zones) {
                this.zones = zones;
                return this;
            }

            public MappCenterWorkspaceList build() {
                return new MappCenterWorkspaceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMappCenterWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMappCenterWorkspacesResponseBody</p>
     */
    public static class ListMappCenterWorkspaceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappCenterWorkspaceList")
        private java.util.List<MappCenterWorkspaceList> mappCenterWorkspaceList;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ListMappCenterWorkspaceResult(Builder builder) {
            this.mappCenterWorkspaceList = builder.mappCenterWorkspaceList;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListMappCenterWorkspaceResult create() {
            return builder().build();
        }

        /**
         * @return mappCenterWorkspaceList
         */
        public java.util.List<MappCenterWorkspaceList> getMappCenterWorkspaceList() {
            return this.mappCenterWorkspaceList;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<MappCenterWorkspaceList> mappCenterWorkspaceList; 
            private String resultMsg; 
            private Boolean success; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ListMappCenterWorkspaceResult model) {
                this.mappCenterWorkspaceList = model.mappCenterWorkspaceList;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
                this.userId = model.userId;
            } 

            /**
             * MappCenterWorkspaceList.
             */
            public Builder mappCenterWorkspaceList(java.util.List<MappCenterWorkspaceList> mappCenterWorkspaceList) {
                this.mappCenterWorkspaceList = mappCenterWorkspaceList;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ListMappCenterWorkspaceResult build() {
                return new ListMappCenterWorkspaceResult(this);
            } 

        } 

    }
}
