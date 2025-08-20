// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListMembersResponseBody</p>
 */
public class ListMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("members")
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListMembersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.members = builder.members;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMembersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<Members> members; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMembersResponseBody model) {
            this.maxResults = model.maxResults;
            this.members = model.members;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>一次获取的最大记录数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * members.
         */
        public Builder members(java.util.List<Members> members) {
            this.members = members;
            return this;
        }

        /**
         * <p>下一页TOKEN。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>记录总数。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMembersResponseBody build() {
            return new ListMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMembersResponseBody</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionArn")
        private String actionArn;

        @com.aliyun.core.annotation.NameInMap("actionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("dependencies")
        private java.util.List<String> dependencies;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        private Actions(Builder builder) {
            this.actionArn = builder.actionArn;
            this.actionName = builder.actionName;
            this.dependencies = builder.dependencies;
            this.description = builder.description;
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return actionArn
         */
        public String getActionArn() {
            return this.actionArn;
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return dependencies
         */
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String actionArn; 
            private String actionName; 
            private java.util.List<String> dependencies; 
            private String description; 
            private String displayName; 

            private Builder() {
            } 

            private Builder(Actions model) {
                this.actionArn = model.actionArn;
                this.actionName = model.actionName;
                this.dependencies = model.dependencies;
                this.description = model.description;
                this.displayName = model.displayName;
            } 

            /**
             * <p>行为 arn。</p>
             * 
             * <strong>example:</strong>
             * <p>acs:emr::w-1234****abcd:action/add_MEMBER</p>
             */
            public Builder actionArn(String actionArn) {
                this.actionArn = actionArn;
                return this;
            }

            /**
             * <p>权限名称。</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * <p>action 依赖列表。</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;view&quot;]</p>
             */
            public Builder dependencies(java.util.List<String> dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * <p>action 描述。</p>
             * 
             * <strong>example:</strong>
             * <p>add members</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>权限展示名称。</p>
             * 
             * <strong>example:</strong>
             * <p>add members</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMembersResponseBody</p>
     */
    public static class RolesActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionArn")
        private String actionArn;

        @com.aliyun.core.annotation.NameInMap("actionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("dependencies")
        private java.util.List<String> dependencies;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        private RolesActions(Builder builder) {
            this.actionArn = builder.actionArn;
            this.actionName = builder.actionName;
            this.dependencies = builder.dependencies;
            this.description = builder.description;
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RolesActions create() {
            return builder().build();
        }

        /**
         * @return actionArn
         */
        public String getActionArn() {
            return this.actionArn;
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return dependencies
         */
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String actionArn; 
            private String actionName; 
            private java.util.List<String> dependencies; 
            private String description; 
            private String displayName; 

            private Builder() {
            } 

            private Builder(RolesActions model) {
                this.actionArn = model.actionArn;
                this.actionName = model.actionName;
                this.dependencies = model.dependencies;
                this.description = model.description;
                this.displayName = model.displayName;
            } 

            /**
             * <p>行为 arn。</p>
             * 
             * <strong>example:</strong>
             * <p>acs:emr::w-1234****abcd:action/add_MEMBER</p>
             */
            public Builder actionArn(String actionArn) {
                this.actionArn = actionArn;
                return this;
            }

            /**
             * <p>权限名称。</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * <p>action 依赖列表。</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;view&quot;]</p>
             */
            public Builder dependencies(java.util.List<String> dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * <p>action 描述。</p>
             * 
             * <strong>example:</strong>
             * <p>add members</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>权限展示名称。</p>
             * 
             * <strong>example:</strong>
             * <p>add members</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public RolesActions build() {
                return new RolesActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMembersResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<RolesActions> actions;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("roleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        private Roles(Builder builder) {
            this.actions = builder.actions;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.roleArn = builder.roleArn;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<RolesActions> getActions() {
            return this.actions;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private java.util.List<RolesActions> actions; 
            private Long createTime; 
            private String description; 
            private String roleArn; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.actions = model.actions;
                this.createTime = model.createTime;
                this.description = model.description;
                this.roleArn = model.roleArn;
                this.roleName = model.roleName;
            } 

            /**
             * <p>权限列表。</p>
             */
            public Builder actions(java.util.List<RolesActions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>1753412502000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>描述。</p>
             * 
             * <strong>example:</strong>
             * <p>DataScience</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>角色 arn。</p>
             * 
             * <strong>example:</strong>
             * <p>acs:emr::w-1234****abcd:role/DataScience</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>角色名称。</p>
             * 
             * <strong>example:</strong>
             * <p>DataScience</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMembersResponseBody</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<Actions> actions;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("memberArn")
        private String memberArn;

        @com.aliyun.core.annotation.NameInMap("roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("userType")
        private String userType;

        @com.aliyun.core.annotation.NameInMap("visible")
        private Boolean visible;

        private Members(Builder builder) {
            this.actions = builder.actions;
            this.createTime = builder.createTime;
            this.displayName = builder.displayName;
            this.memberArn = builder.memberArn;
            this.roles = builder.roles;
            this.userName = builder.userName;
            this.userType = builder.userType;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<Actions> getActions() {
            return this.actions;
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
         * @return memberArn
         */
        public String getMemberArn() {
            return this.memberArn;
        }

        /**
         * @return roles
         */
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private java.util.List<Actions> actions; 
            private String createTime; 
            private String displayName; 
            private String memberArn; 
            private java.util.List<Roles> roles; 
            private String userName; 
            private String userType; 
            private Boolean visible; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.actions = model.actions;
                this.createTime = model.createTime;
                this.displayName = model.displayName;
                this.memberArn = model.memberArn;
                this.roles = model.roles;
                this.userName = model.userName;
                this.userType = model.userType;
                this.visible = model.visible;
            } 

            /**
             * <p>针对此用户允许的操作列表。</p>
             */
            public Builder actions(java.util.List<Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>1753412502000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>用户展示名称。</p>
             * 
             * <strong>example:</strong>
             * <p>jia***test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>用户 arn。</p>
             * 
             * <strong>example:</strong>
             * <p>acs:emr::w-1234*<em><strong>abcd:member/202265</strong></em>**276</p>
             */
            public Builder memberArn(String memberArn) {
                this.memberArn = memberArn;
                return this;
            }

            /**
             * <p>用户角色列表。</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>用户名称。</p>
             * 
             * <strong>example:</strong>
             * <p>jia<em><strong>test@195</strong></em>**7311.onaliyun.com</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>用户类型。</p>
             * 
             * <strong>example:</strong>
             * <p>MEMBER</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            /**
             * visible.
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
