// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List<Roles> roles;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRolesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.roles = builder.roles;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesResponseBody create() {
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
     * @return roles
     */
    public java.util.List<Roles> getRoles() {
        return this.roles;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Roles> roles; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRolesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.roles = model.roles;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to query the next page of data. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJvbGVzOjoyMA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of roles.</p>
         */
        public Builder roles(java.util.List<Roles> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * <p>The total number of roles that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Roles(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String roleId; 
            private String roleName; 
            private String type; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The role description.</p>
             * 
             * <strong>example:</strong>
             * <p>Data analytics role</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The role ID.</p>
             * 
             * <strong>example:</strong>
             * <p>role_xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The role name.</p>
             * 
             * <strong>example:</strong>
             * <p>Analyst</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The role type. Default indicates a default role. Manual indicates a custom role.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The update time in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}
