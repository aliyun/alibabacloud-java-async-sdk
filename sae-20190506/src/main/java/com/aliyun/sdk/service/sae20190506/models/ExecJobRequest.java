// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecJobRequest} extends {@link RequestModel}
 *
 * <p>ExecJobRequest</p>
 */
public class ExecJobRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Command")
    private String command;

    @Query
    @NameInMap("CommandArgs")
    private String commandArgs;

    @Query
    @NameInMap("Envs")
    private String envs;

    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("JarStartArgs")
    private String jarStartArgs;

    @Query
    @NameInMap("JarStartOptions")
    private String jarStartOptions;

    @Query
    @NameInMap("WarStartOptions")
    private String warStartOptions;

    private ExecJobRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.envs = builder.envs;
        this.eventId = builder.eventId;
        this.jarStartArgs = builder.jarStartArgs;
        this.jarStartOptions = builder.jarStartOptions;
        this.warStartOptions = builder.warStartOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public String getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return envs
     */
    public String getEnvs() {
        return this.envs;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return jarStartArgs
     */
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    /**
     * @return jarStartOptions
     */
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    /**
     * @return warStartOptions
     */
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public static final class Builder extends Request.Builder<ExecJobRequest, Builder> {
        private String appId; 
        private String command; 
        private String commandArgs; 
        private String envs; 
        private String eventId; 
        private String jarStartArgs; 
        private String jarStartOptions; 
        private String warStartOptions; 

        private Builder() {
            super();
        } 

        private Builder(ExecJobRequest request) {
            super(request);
            this.appId = request.appId;
            this.command = request.command;
            this.commandArgs = request.commandArgs;
            this.envs = request.envs;
            this.eventId = request.eventId;
            this.jarStartArgs = request.jarStartArgs;
            this.jarStartOptions = request.jarStartOptions;
            this.warStartOptions = request.warStartOptions;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
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
         * CommandArgs.
         */
        public Builder commandArgs(String commandArgs) {
            this.putQueryParameter("CommandArgs", commandArgs);
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * JarStartArgs.
         */
        public Builder jarStartArgs(String jarStartArgs) {
            this.putQueryParameter("JarStartArgs", jarStartArgs);
            this.jarStartArgs = jarStartArgs;
            return this;
        }

        /**
         * JarStartOptions.
         */
        public Builder jarStartOptions(String jarStartOptions) {
            this.putQueryParameter("JarStartOptions", jarStartOptions);
            this.jarStartOptions = jarStartOptions;
            return this;
        }

        /**
         * WarStartOptions.
         */
        public Builder warStartOptions(String warStartOptions) {
            this.putQueryParameter("WarStartOptions", warStartOptions);
            this.warStartOptions = warStartOptions;
            return this;
        }

        @Override
        public ExecJobRequest build() {
            return new ExecJobRequest(this);
        } 

    } 

}
