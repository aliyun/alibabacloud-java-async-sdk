// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001.models;

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
 * {@link CalMcpToolRequest} extends {@link RequestModel}
 *
 * <p>CalMcpToolRequest</p>
 */
public class CalMcpToolRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Args")
    private String args;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Authorization")
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Server")
    private String server;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tool")
    private String tool;

    private CalMcpToolRequest(Builder builder) {
        super(builder);
        this.args = builder.args;
        this.authorization = builder.authorization;
        this.externalUserId = builder.externalUserId;
        this.name = builder.name;
        this.server = builder.server;
        this.sessionId = builder.sessionId;
        this.tool = builder.tool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CalMcpToolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return server
     */
    public String getServer() {
        return this.server;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tool
     */
    public String getTool() {
        return this.tool;
    }

    public static final class Builder extends Request.Builder<CalMcpToolRequest, Builder> {
        private String args; 
        private String authorization; 
        private String externalUserId; 
        private String name; 
        private String server; 
        private String sessionId; 
        private String tool; 

        private Builder() {
            super();
        } 

        private Builder(CalMcpToolRequest request) {
            super(request);
            this.args = request.args;
            this.authorization = request.authorization;
            this.externalUserId = request.externalUserId;
            this.name = request.name;
            this.server = request.server;
            this.sessionId = request.sessionId;
            this.tool = request.tool;
        } 

        /**
         * Args.
         */
        public Builder args(String args) {
            this.putBodyParameter("Args", args);
            this.args = args;
            return this;
        }

        /**
         * Authorization.
         */
        public Builder authorization(String authorization) {
            this.putBodyParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Server.
         */
        public Builder server(String server) {
            this.putBodyParameter("Server", server);
            this.server = server;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Tool.
         */
        public Builder tool(String tool) {
            this.putBodyParameter("Tool", tool);
            this.tool = tool;
            return this;
        }

        @Override
        public CalMcpToolRequest build() {
            return new CalMcpToolRequest(this);
        } 

    } 

}
