// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateMemberRequest</p>
 */
public class CreateMemberRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Body
    @NameInMap("Members")
    @Validation(required = true)
    private java.util.List < Members> members;

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
    public java.util.List < Members> getMembers() {
        return this.members;
    }

    public static final class Builder extends Request.Builder<CreateMemberRequest, Builder> {
        private String workspaceId; 
        private java.util.List < Members> members; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemberRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.members = request.members;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * Members.
         */
        public Builder members(java.util.List < Members> members) {
            this.putBodyParameter("Members", members);
            this.members = members;
            return this;
        }

        @Override
        public CreateMemberRequest build() {
            return new CreateMemberRequest(this);
        } 

    } 

    public static class Members extends TeaModel {
        @NameInMap("Roles")
        @Validation(required = true)
        private java.util.List < String > roles;

        @NameInMap("UserId")
        @Validation(required = true)
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
        public java.util.List < String > getRoles() {
            return this.roles;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < String > roles; 
            private String userId; 

            /**
             * Roles.
             */
            public Builder roles(java.util.List < String > roles) {
                this.roles = roles;
                return this;
            }

            /**
             * UserId.
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
