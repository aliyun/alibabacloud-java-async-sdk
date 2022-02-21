// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteRemoteCommandRequest} extends {@link RequestModel}
 *
 * <p>ExecuteRemoteCommandRequest</p>
 */
public class ExecuteRemoteCommandRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("Command")
    private Long command;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private ExecuteRemoteCommandRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.command = builder.command;
        this.params = builder.params;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteRemoteCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return command
     */
    public Long getCommand() {
        return this.command;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ExecuteRemoteCommandRequest, Builder> {
        private String clientId; 
        private Long command; 
        private String params; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteRemoteCommandRequest response) {
            super(response);
            this.clientId = response.clientId;
            this.command = response.command;
            this.params = response.params;
            this.projectId = response.projectId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * 指令消息ID
         */
        public Builder command(Long command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * 指令入参字符串
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * 项目ID
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ExecuteRemoteCommandRequest build() {
            return new ExecuteRemoteCommandRequest(this);
        } 

    } 

}
