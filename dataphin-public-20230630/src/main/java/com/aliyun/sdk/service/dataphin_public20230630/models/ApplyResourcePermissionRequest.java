// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ApplyResourcePermissionRequest} extends {@link RequestModel}
 *
 * <p>ApplyResourcePermissionRequest</p>
 */
public class ApplyResourcePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplyCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ApplyCommand applyCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ApplyResourcePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applyCommand = builder.applyCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyResourcePermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applyCommand
     */
    public ApplyCommand getApplyCommand() {
        return this.applyCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ApplyResourcePermissionRequest, Builder> {
        private String regionId; 
        private ApplyCommand applyCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyResourcePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applyCommand = request.applyCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The permission application request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder applyCommand(ApplyCommand applyCommand) {
            String applyCommandShrink = shrink(applyCommand, "ApplyCommand", "json");
            this.putBodyParameter("ApplyCommand", applyCommandShrink);
            this.applyCommand = applyCommand;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ApplyResourcePermissionRequest build() {
            return new ApplyResourcePermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>ApplyResourcePermissionRequest</p>
     */
    public static class GrantToUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("PeriodEnd")
        private String periodEnd;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private GrantToUsers(Builder builder) {
            this.accountType = builder.accountType;
            this.periodEnd = builder.periodEnd;
            this.periodType = builder.periodType;
            this.projectId = builder.projectId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantToUsers create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return periodEnd
         */
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accountType; 
            private String periodEnd; 
            private String periodType; 
            private String projectId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(GrantToUsers model) {
                this.accountType = model.accountType;
                this.periodEnd = model.periodEnd;
                this.periodType = model.periodType;
                this.projectId = model.projectId;
                this.userId = model.userId;
            } 

            /**
             * <p>The account type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PERSONAL</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The expiration date of the permission. Format: yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-31</p>
             */
            public Builder periodEnd(String periodEnd) {
                this.periodEnd = periodEnd;
                return this;
            }

            /**
             * <p>The type of the permission validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>DAYS_30</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The project ID of the production account. This parameter is required when the account type is PRODUCE.</p>
             * 
             * <strong>example:</strong>
             * <p>7298904510790528</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>300001186</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public GrantToUsers build() {
                return new GrantToUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>ApplyResourcePermissionRequest</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List<String> columnList;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        private ResourceList(Builder builder) {
            this.columnList = builder.columnList;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return columnList
         */
        public java.util.List<String> getColumnList() {
            return this.columnList;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.List<String> columnList; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.columnList = model.columnList;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The list of column names specified for column-level permissions. This parameter is required when the granularity is COLUMN.</p>
             */
            public Builder columnList(java.util.List<String> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * <p>The resource ID, which is the GUID of the table metadata.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dp_ds_table_xxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>ApplyResourcePermissionRequest</p>
     */
    public static class ApplyCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantToUsers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<GrantToUsers> grantToUsers;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        @com.aliyun.core.annotation.Validation(required = true)
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("OperateList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> operateList;

        @com.aliyun.core.annotation.NameInMap("Reason")
        @com.aliyun.core.annotation.Validation(required = true)
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        private ApplyCommand(Builder builder) {
            this.grantToUsers = builder.grantToUsers;
            this.granularity = builder.granularity;
            this.operateList = builder.operateList;
            this.reason = builder.reason;
            this.resourceList = builder.resourceList;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyCommand create() {
            return builder().build();
        }

        /**
         * @return grantToUsers
         */
        public java.util.List<GrantToUsers> getGrantToUsers() {
            return this.grantToUsers;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return operateList
         */
        public java.util.List<String> getOperateList() {
            return this.operateList;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resourceList
         */
        public java.util.List<ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<GrantToUsers> grantToUsers; 
            private String granularity; 
            private java.util.List<String> operateList; 
            private String reason; 
            private java.util.List<ResourceList> resourceList; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ApplyCommand model) {
                this.grantToUsers = model.grantToUsers;
                this.granularity = model.granularity;
                this.operateList = model.operateList;
                this.reason = model.reason;
                this.resourceList = model.resourceList;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The list of users to whom permissions are granted.</p>
             * <p>This parameter is required.</p>
             */
            public Builder grantToUsers(java.util.List<GrantToUsers> grantToUsers) {
                this.grantToUsers = grantToUsers;
                return this;
            }

            /**
             * <p>The permission granularity. Valid values: TABLE (table-level permissions) and COLUMN (column-level permissions).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The list of operation types.</p>
             * <p>This parameter is required.</p>
             */
            public Builder operateList(java.util.List<String> operateList) {
                this.operateList = operateList;
                return this;
            }

            /**
             * <p>The reason for the application. This parameter is required and cannot be empty or contain only whitespace characters.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The list of resources for which permissions are applied.</p>
             * <p>This parameter is required.</p>
             */
            public Builder resourceList(java.util.List<ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL_TABLE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ApplyCommand build() {
                return new ApplyCommand(this);
            } 

        } 

    }
}
