// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateMemberRequest</p>
 */
public class CreateMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Members")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Members> members;

    private CreateMemberRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.members = builder.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
    }

    public static final class Builder extends Request.Builder<CreateMemberRequest, Builder> {
        private String workspaceId; 
        private java.util.List<Members> members; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemberRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.members = request.members;
        } 

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The members.</p>
         * <p>This parameter is required.</p>
         */
        public Builder members(java.util.List<Members> members) {
            this.putBodyParameter("Members", members);
            this.members = members;
            return this;
        }

        @Override
        public CreateMemberRequest build() {
            return new CreateMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemberRequest} extends {@link TeaModel}
     *
     * <p>CreateMemberRequest</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Roles")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> roles;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private Members(Builder builder) {
            this.roles = builder.roles;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return roles
         */
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<String> roles; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.roles = model.roles;
                this.userId = model.userId;
            } 

            /**
             * <p>The list of roles.</p>
             * <p>This parameter is required.</p>
             */
            public Builder roles(java.util.List<String> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The member IDs. Multiple member IDs are separated by commas (,). You can call <a href="https://help.aliyun.com/document_detail/449135.html">ListMembers</a> to obtain the member IDs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>21513926******88039</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
