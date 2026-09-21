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
         * <p>The database account that has the permission to terminate sessions.</p>
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
         * <p>The list of accounts whose sessions will not be terminated.</p>
         * <blockquote>
         * <p>The data is in JSONArray format, such as [\&quot;DatabaseAccount1\&quot;,\&quot;DatabaseAccount2\&quot;\]. Separate multiple database accounts with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;db_user1\&quot;,\&quot;db_user2\&quot;]</p>
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
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When this parameter is set to <strong>true</strong>, sessions of accounts specified in the <strong>IgnoredUsers</strong> request parameter, sessions of Alibaba Cloud internal operations accounts, and <strong>Binlog Dump</strong> sessions are not terminated.</p>
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
         * <p>For PolarDB for MySQL instances, provide the node ID. If no node ID is provided and the <strong>KillAllSessions</strong> request parameter is set to <strong>true</strong> (terminate all sessions), the system traverses all nodes of the PolarDB for MySQL instance and terminates ongoing sessions on each node.</p>
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
         * <p>The list of session IDs to be terminated.</p>
         * <blockquote>
         * <p>The data is in JSONArray format, such as [SessionID1,SessionID2\]. Separate multiple session IDs with commas (,). If the <strong>KillAllSessions</strong> request parameter is set to <strong>true</strong> (terminate all sessions), this list is ignored.</p>
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
