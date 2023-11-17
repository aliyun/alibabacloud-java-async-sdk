// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKillInstanceSessionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateKillInstanceSessionTaskRequest</p>
 */
public class CreateKillInstanceSessionTaskRequest extends Request {
    @Query
    @NameInMap("DbUser")
    @Validation(required = true)
    private String dbUser;

    @Query
    @NameInMap("DbUserPassword")
    @Validation(required = true)
    private String dbUserPassword;

    @Query
    @NameInMap("IgnoredUsers")
    private String ignoredUsers;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("KillAllSessions")
    @Validation(required = true)
    private Boolean killAllSessions;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("SessionIds")
    private String sessionIds;

    private CreateKillInstanceSessionTaskRequest(Builder builder) {
        super(builder);
        this.dbUser = builder.dbUser;
        this.dbUserPassword = builder.dbUserPassword;
        this.ignoredUsers = builder.ignoredUsers;
        this.instanceId = builder.instanceId;
        this.killAllSessions = builder.killAllSessions;
        this.nodeId = builder.nodeId;
        this.sessionIds = builder.sessionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKillInstanceSessionTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbUser
     */
    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * @return dbUserPassword
     */
    public String getDbUserPassword() {
        return this.dbUserPassword;
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

    public static final class Builder extends Request.Builder<CreateKillInstanceSessionTaskRequest, Builder> {
        private String dbUser; 
        private String dbUserPassword; 
        private String ignoredUsers; 
        private String instanceId; 
        private Boolean killAllSessions; 
        private String nodeId; 
        private String sessionIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateKillInstanceSessionTaskRequest request) {
            super(request);
            this.dbUser = request.dbUser;
            this.dbUserPassword = request.dbUserPassword;
            this.ignoredUsers = request.ignoredUsers;
            this.instanceId = request.instanceId;
            this.killAllSessions = request.killAllSessions;
            this.nodeId = request.nodeId;
            this.sessionIds = request.sessionIds;
        } 

        /**
         * The database account that has the permissions to terminate sessions.
         */
        public Builder dbUser(String dbUser) {
            this.putQueryParameter("DbUser", dbUser);
            this.dbUser = dbUser;
            return this;
        }

        /**
         * The password of the database account.
         */
        public Builder dbUserPassword(String dbUserPassword) {
            this.putQueryParameter("DbUserPassword", dbUserPassword);
            this.dbUserPassword = dbUserPassword;
            return this;
        }

        /**
         * The account whose sessions do not need to be terminated.
         * <p>
         * 
         * >  Set this parameter to a JSON array. Separate database accounts with commas (,). Example: \[\"Database account 1\",\"Database account 2\"].
         */
        public Builder ignoredUsers(String ignoredUsers) {
            this.putQueryParameter("IgnoredUsers", ignoredUsers);
            this.ignoredUsers = ignoredUsers;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to terminate all sessions.
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * >  If you set this parameter to **true**, sessions of the accounts that are specified by **IgnoredUsers**, sessions of internal O\&M accounts of Alibaba Cloud, and **Binlog Dump** sessions are not terminated.
         */
        public Builder killAllSessions(Boolean killAllSessions) {
            this.putQueryParameter("KillAllSessions", killAllSessions);
            this.killAllSessions = killAllSessions;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  This parameter must be specified if the database instance is a PolarDB for MySQL cluster. If you do not specify a node ID and set **KillAllSessions** to **true**, the system traverses all nodes in the PolarDB for MySQL cluster and terminates the active sessions on each node.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The IDs of sessions that need to be terminated.
         * <p>
         * 
         * >  Set this parameter to a JSON array. Separate session IDs with commas (,). Example: \[\"Session ID1\",\"Session ID2\"]. If **KillAllSessions** is set to **true**, this parameter does not take effect.
         */
        public Builder sessionIds(String sessionIds) {
            this.putQueryParameter("SessionIds", sessionIds);
            this.sessionIds = sessionIds;
            return this;
        }

        @Override
        public CreateKillInstanceSessionTaskRequest build() {
            return new CreateKillInstanceSessionTaskRequest(this);
        } 

    } 

}
