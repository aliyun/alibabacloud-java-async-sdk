// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWorkspacesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWorkspacesResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class BaseWorkspaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlreadyJoined")
        private Boolean alreadyJoined;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorNickName")
        private String creatorNickName;

        @com.aliyun.core.annotation.NameInMap("CreatorUid")
        private String creatorUid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerNickName")
        private String ownerNickName;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private String ownerUid;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountId")
        private Long serviceAccountId;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountNickName")
        private String serviceAccountNickName;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountUid")
        private String serviceAccountUid;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private Long workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private BaseWorkspaces(Builder builder) {
            this.alreadyJoined = builder.alreadyJoined;
            this.creatorId = builder.creatorId;
            this.creatorNickName = builder.creatorNickName;
            this.creatorUid = builder.creatorUid;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.ownerNickName = builder.ownerNickName;
            this.ownerUid = builder.ownerUid;
            this.region = builder.region;
            this.serviceAccountId = builder.serviceAccountId;
            this.serviceAccountNickName = builder.serviceAccountNickName;
            this.serviceAccountUid = builder.serviceAccountUid;
            this.tenantId = builder.tenantId;
            this.vpcId = builder.vpcId;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseWorkspaces create() {
            return builder().build();
        }

        /**
         * @return alreadyJoined
         */
        public Boolean getAlreadyJoined() {
            return this.alreadyJoined;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorNickName
         */
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        /**
         * @return creatorUid
         */
        public String getCreatorUid() {
            return this.creatorUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerNickName
         */
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

        /**
         * @return ownerUid
         */
        public String getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceAccountId
         */
        public Long getServiceAccountId() {
            return this.serviceAccountId;
        }

        /**
         * @return serviceAccountNickName
         */
        public String getServiceAccountNickName() {
            return this.serviceAccountNickName;
        }

        /**
         * @return serviceAccountUid
         */
        public String getServiceAccountUid() {
            return this.serviceAccountUid;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return workspaceId
         */
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Boolean alreadyJoined; 
            private Long creatorId; 
            private String creatorNickName; 
            private String creatorUid; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private Long ownerId; 
            private String ownerNickName; 
            private String ownerUid; 
            private String region; 
            private Long serviceAccountId; 
            private String serviceAccountNickName; 
            private String serviceAccountUid; 
            private Long tenantId; 
            private String vpcId; 
            private Long workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(BaseWorkspaces model) {
                this.alreadyJoined = model.alreadyJoined;
                this.creatorId = model.creatorId;
                this.creatorNickName = model.creatorNickName;
                this.creatorUid = model.creatorUid;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.name = model.name;
                this.ownerId = model.ownerId;
                this.ownerNickName = model.ownerNickName;
                this.ownerUid = model.ownerUid;
                this.region = model.region;
                this.serviceAccountId = model.serviceAccountId;
                this.serviceAccountNickName = model.serviceAccountNickName;
                this.serviceAccountUid = model.serviceAccountUid;
                this.tenantId = model.tenantId;
                this.vpcId = model.vpcId;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * AlreadyJoined.
             */
            public Builder alreadyJoined(Boolean alreadyJoined) {
                this.alreadyJoined = alreadyJoined;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * CreatorNickName.
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
                return this;
            }

            /**
             * CreatorUid.
             */
            public Builder creatorUid(String creatorUid) {
                this.creatorUid = creatorUid;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * OwnerNickName.
             */
            public Builder ownerNickName(String ownerNickName) {
                this.ownerNickName = ownerNickName;
                return this;
            }

            /**
             * OwnerUid.
             */
            public Builder ownerUid(String ownerUid) {
                this.ownerUid = ownerUid;
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
             * ServiceAccountId.
             */
            public Builder serviceAccountId(Long serviceAccountId) {
                this.serviceAccountId = serviceAccountId;
                return this;
            }

            /**
             * ServiceAccountNickName.
             */
            public Builder serviceAccountNickName(String serviceAccountNickName) {
                this.serviceAccountNickName = serviceAccountNickName;
                return this;
            }

            /**
             * ServiceAccountUid.
             */
            public Builder serviceAccountUid(String serviceAccountUid) {
                this.serviceAccountUid = serviceAccountUid;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(Long workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public BaseWorkspaces build() {
                return new BaseWorkspaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseWorkspaces")
        private java.util.List<BaseWorkspaces> baseWorkspaces;

        private Data(Builder builder) {
            this.baseWorkspaces = builder.baseWorkspaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseWorkspaces
         */
        public java.util.List<BaseWorkspaces> getBaseWorkspaces() {
            return this.baseWorkspaces;
        }

        public static final class Builder {
            private java.util.List<BaseWorkspaces> baseWorkspaces; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseWorkspaces = model.baseWorkspaces;
            } 

            /**
             * BaseWorkspaces.
             */
            public Builder baseWorkspaces(java.util.List<BaseWorkspaces> baseWorkspaces) {
                this.baseWorkspaces = baseWorkspaces;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
