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
 * {@link AddDataServiceProjectMemberRequest} extends {@link RequestModel}
 *
 * <p>AddDataServiceProjectMemberRequest</p>
 */
public class AddDataServiceProjectMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private AddCommand addCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer projectId;

    private AddDataServiceProjectMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addCommand = builder.addCommand;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataServiceProjectMemberRequest create() {
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
     * @return addCommand
     */
    public AddCommand getAddCommand() {
        return this.addCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Integer getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<AddDataServiceProjectMemberRequest, Builder> {
        private String regionId; 
        private AddCommand addCommand; 
        private Long opTenantId; 
        private Integer projectId; 

        private Builder() {
            super();
        } 

        private Builder(AddDataServiceProjectMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addCommand = request.addCommand;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
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
         * <p>This parameter is required.</p>
         */
        public Builder addCommand(AddCommand addCommand) {
            String addCommandShrink = shrink(addCommand, "AddCommand", "json");
            this.putBodyParameter("AddCommand", addCommandShrink);
            this.addCommand = addCommand;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102102</p>
         */
        public Builder projectId(Integer projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public AddDataServiceProjectMemberRequest build() {
            return new AddDataServiceProjectMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDataServiceProjectMemberRequest} extends {@link TeaModel}
     *
     * <p>AddDataServiceProjectMemberRequest</p>
     */
    public static class ProjectMemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Role")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer role;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private ProjectMemberList(Builder builder) {
            this.accountName = builder.accountName;
            this.displayName = builder.displayName;
            this.role = builder.role;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectMemberList create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accountName; 
            private String displayName; 
            private Integer role; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ProjectMemberList model) {
                this.accountName = model.accountName;
                this.displayName = model.displayName;
                this.role = model.role;
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:xx@aliyuncs.com">xx@aliyuncs.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ProjectMemberList build() {
                return new ProjectMemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDataServiceProjectMemberRequest} extends {@link TeaModel}
     *
     * <p>AddDataServiceProjectMemberRequest</p>
     */
    public static class AddCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectMemberList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ProjectMemberList> projectMemberList;

        private AddCommand(Builder builder) {
            this.projectMemberList = builder.projectMemberList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddCommand create() {
            return builder().build();
        }

        /**
         * @return projectMemberList
         */
        public java.util.List<ProjectMemberList> getProjectMemberList() {
            return this.projectMemberList;
        }

        public static final class Builder {
            private java.util.List<ProjectMemberList> projectMemberList; 

            private Builder() {
            } 

            private Builder(AddCommand model) {
                this.projectMemberList = model.projectMemberList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder projectMemberList(java.util.List<ProjectMemberList> projectMemberList) {
                this.projectMemberList = projectMemberList;
                return this;
            }

            public AddCommand build() {
                return new AddCommand(this);
            } 

        } 

    }
}
