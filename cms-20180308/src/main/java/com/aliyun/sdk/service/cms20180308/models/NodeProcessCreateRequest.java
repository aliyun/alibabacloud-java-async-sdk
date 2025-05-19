// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link NodeProcessCreateRequest} extends {@link RequestModel}
 *
 * <p>NodeProcessCreateRequest</p>
 */
public class NodeProcessCreateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessUser")
    private String processUser;

    private NodeProcessCreateRequest(Builder builder) {
        super(builder);
        this.command = builder.command;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.processName = builder.processName;
        this.processUser = builder.processUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeProcessCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
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
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return processUser
     */
    public String getProcessUser() {
        return this.processUser;
    }

    public static final class Builder extends Request.Builder<NodeProcessCreateRequest, Builder> {
        private String command; 
        private String instanceId; 
        private String name; 
        private String processName; 
        private String processUser; 

        private Builder() {
            super();
        } 

        private Builder(NodeProcessCreateRequest request) {
            super(request);
            this.command = request.command;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.processName = request.processName;
            this.processUser = request.processUser;
        } 

        /**
         * Command.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProcessName.
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * ProcessUser.
         */
        public Builder processUser(String processUser) {
            this.putQueryParameter("ProcessUser", processUser);
            this.processUser = processUser;
            return this;
        }

        @Override
        public NodeProcessCreateRequest build() {
            return new NodeProcessCreateRequest(this);
        } 

    } 

}
