// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryUserRoleInfoInWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserRoleInfoInWorkspaceResponseBody</p>
 */
public class QueryUserRoleInfoInWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryUserRoleInfoInWorkspaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserRoleInfoInWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryUserRoleInfoInWorkspaceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Preset space role information of the user.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request succeeded.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUserRoleInfoInWorkspaceResponseBody build() {
            return new QueryUserRoleInfoInWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserRoleInfoInWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserRoleInfoInWorkspaceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleCode")
        private String roleCode;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private Long roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private Result(Builder builder) {
            this.roleCode = builder.roleCode;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return roleCode
         */
        public String getRoleCode() {
            return this.roleCode;
        }

        /**
         * @return roleId
         */
        public Long getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String roleCode; 
            private Long roleId; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.roleCode = model.roleCode;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
            } 

            /**
             * <p>Preset role code.</p>
             * 
             * <strong>example:</strong>
             * <p>role_workspace_admin</p>
             */
            public Builder roleCode(String roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * <p>Preset role ID. Possible values:</p>
             * <ul>
             * <li>25: Space Administrator</li>
             * <li>26: Space Developer</li>
             * <li>27: Space Analyst</li>
             * <li>30: Space Viewer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder roleId(Long roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>Preset role name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
