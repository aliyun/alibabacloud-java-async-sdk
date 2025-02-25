// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link CreateKillInstanceSessionTaskWithMaintainUserRequest} extends {@link RequestModel}
 *
 * <p>CreateKillInstanceSessionTaskWithMaintainUserRequest</p>
 */
public class CreateKillInstanceSessionTaskWithMaintainUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoredUsers")
    private String ignoredUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KillAllSessions")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean killAllSessions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionIds")
    private String sessionIds;

    private CreateKillInstanceSessionTaskWithMaintainUserRequest(Builder builder) {
        super(builder);
        this.ignoredUsers = builder.ignoredUsers;
        this.instanceId = builder.instanceId;
        this.killAllSessions = builder.killAllSessions;
        this.nodeId = builder.nodeId;
        this.sessionIds = builder.sessionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKillInstanceSessionTaskWithMaintainUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ignoredUsers
     */
    public String getIgnoredUsers() {
        return this.ignoredUsers;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return killAllSessions
     */
    public Boolean getKillAllSessions() {
        return this.killAllSessions;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return sessionIds
     */
    public String getSessionIds() {
        return this.sessionIds;
    }

    public static final class Builder extends Request.Builder<CreateKillInstanceSessionTaskWithMaintainUserRequest, Builder> {
        private String ignoredUsers; 
        private String instanceId; 
        private Boolean killAllSessions; 
        private String nodeId; 
        private String sessionIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateKillInstanceSessionTaskWithMaintainUserRequest request) {
            super(request);
            this.ignoredUsers = request.ignoredUsers;
            this.instanceId = request.instanceId;
            this.killAllSessions = request.killAllSessions;
            this.nodeId = request.nodeId;
            this.sessionIds = request.sessionIds;
        } 

        /**
         * IgnoredUsers.
         */
        public Builder ignoredUsers(String ignoredUsers) {
            this.putQueryParameter("IgnoredUsers", ignoredUsers);
            this.ignoredUsers = ignoredUsers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder killAllSessions(Boolean killAllSessions) {
            this.putQueryParameter("KillAllSessions", killAllSessions);
            this.killAllSessions = killAllSessions;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * SessionIds.
         */
        public Builder sessionIds(String sessionIds) {
            this.putQueryParameter("SessionIds", sessionIds);
            this.sessionIds = sessionIds;
            return this;
        }

        @Override
        public CreateKillInstanceSessionTaskWithMaintainUserRequest build() {
            return new CreateKillInstanceSessionTaskWithMaintainUserRequest(this);
        } 

    } 

}
