// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link UpdateTeamRequest} extends {@link RequestModel}
 *
 * <p>UpdateTeamRequest</p>
 */
public class UpdateTeamRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TeamMembers")
    private java.util.List<TeamMembers> teamMembers;

    private UpdateTeamRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.teamMembers = builder.teamMembers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTeamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return teamMembers
     */
    public java.util.List<TeamMembers> getTeamMembers() {
        return this.teamMembers;
    }

    public static final class Builder extends Request.Builder<UpdateTeamRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String instanceId; 
        private String name; 
        private java.util.List<TeamMembers> teamMembers; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTeamRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.teamMembers = request.teamMembers;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TeamMembers.
         */
        public Builder teamMembers(java.util.List<TeamMembers> teamMembers) {
            String teamMembersShrink = shrink(teamMembers, "TeamMembers", "json");
            this.putQueryParameter("TeamMembers", teamMembersShrink);
            this.teamMembers = teamMembers;
            return this;
        }

        @Override
        public UpdateTeamRequest build() {
            return new UpdateTeamRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTeamRequest} extends {@link TeaModel}
     *
     * <p>UpdateTeamRequest</p>
     */
    public static class TeamMembers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TeamMembers(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TeamMembers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(TeamMembers model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TeamMembers build() {
                return new TeamMembers(this);
            } 

        } 

    }
}
