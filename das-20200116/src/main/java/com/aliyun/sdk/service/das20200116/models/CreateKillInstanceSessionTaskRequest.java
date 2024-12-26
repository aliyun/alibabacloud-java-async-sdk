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
 * {@link CreateKillInstanceSessionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateKillInstanceSessionTaskRequest</p>
 */
public class CreateKillInstanceSessionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbUserPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbUserPassword;

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
         * <p>The database account that has the permissions to terminate sessions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        public Builder dbUser(String dbUser) {
            this.putQueryParameter("DbUser", dbUser);
            this.dbUser = dbUser;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        public Builder dbUserPassword(String dbUserPassword) {
            this.putQueryParameter("DbUserPassword", dbUserPassword);
            this.dbUserPassword = dbUserPassword;
            return this;
        }

        /**
         * <p>The account whose sessions do not need to be terminated.</p>
         * <blockquote>
         * <p> Set this parameter to a JSON array. Separate database accounts with commas (,). Example: [&quot;Database account 1&quot;,&quot;Database account 2&quot;].</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;db_user1&quot;,&quot;db_user2&quot;]</p>
         */
        public Builder ignoredUsers(String ignoredUsers) {
            this.putQueryParameter("IgnoredUsers", ignoredUsers);
            this.ignoredUsers = ignoredUsers;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to terminate all sessions.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to <strong>true</strong>, sessions of the accounts that are specified by <strong>IgnoredUsers</strong>, sessions of internal O&amp;M accounts of Alibaba Cloud, and <strong>Binlog Dump</strong> sessions are not terminated.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder killAllSessions(Boolean killAllSessions) {
            this.putQueryParameter("KillAllSessions", killAllSessions);
            this.killAllSessions = killAllSessions;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter must be specified if the database instance is a PolarDB for MySQL cluster. If you do not specify a node ID and set <strong>KillAllSessions</strong> to <strong>true</strong>, the system traverses all nodes in the PolarDB for MySQL cluster and terminates the active sessions on each node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-bp1v203xzzh0a****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The IDs of sessions that need to be terminated.</p>
         * <blockquote>
         * <p> Set this parameter to a JSON array. Separate session IDs with commas (,). Example: [&quot;Session ID1&quot;,&quot;Session ID2&quot;]. If <strong>KillAllSessions</strong> is set to <strong>true</strong>, this parameter does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[10805639,10805623,10805645,10805553,10805566,10805616]</p>
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
