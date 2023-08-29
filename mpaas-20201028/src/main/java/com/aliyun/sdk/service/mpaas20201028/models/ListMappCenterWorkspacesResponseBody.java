// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMappCenterWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMappCenterWorkspacesResponseBody</p>
 */
public class ListMappCenterWorkspacesResponseBody extends TeaModel {
    @NameInMap("ListMappCenterWorkspaceResult")
    private ListMappCenterWorkspaceResult listMappCenterWorkspaceResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
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

    public static class MappCenterWorkspaceList extends TeaModel {
        @NameInMap("CompatibleId")
        private String compatibleId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uid")
        private Long uid;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("Zones")
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
    public static class ListMappCenterWorkspaceResult extends TeaModel {
        @NameInMap("MappCenterWorkspaceList")
        private java.util.List < MappCenterWorkspaceList> mappCenterWorkspaceList;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("UserId")
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
        public java.util.List < MappCenterWorkspaceList> getMappCenterWorkspaceList() {
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
            private java.util.List < MappCenterWorkspaceList> mappCenterWorkspaceList; 
            private String resultMsg; 
            private Boolean success; 
            private String userId; 

            /**
             * MappCenterWorkspaceList.
             */
            public Builder mappCenterWorkspaceList(java.util.List < MappCenterWorkspaceList> mappCenterWorkspaceList) {
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
