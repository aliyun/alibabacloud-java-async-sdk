// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ExecJobRequest} extends {@link RequestModel}
 *
 * <p>ExecJobRequest</p>
 */
public class ExecJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JarStartArgs")
    private String jarStartArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JarStartOptions")
    private String jarStartOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private String replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarStartOptions")
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
        this.replicas = builder.replicas;
        this.time = builder.time;
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
     * @return replicas
     */
    public String getReplicas() {
        return this.replicas;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
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
        private String replicas; 
        private String time; 
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
            this.replicas = request.replicas;
            this.time = request.time;
            this.warStartOptions = request.warStartOptions;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ee1a7a07-abcb-4652-a1d3-2d57f415****</p>
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
         * <p>The arguments in the JAR package. The arguments are used to start the job. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-args</p>
         */
        public Builder jarStartArgs(String jarStartArgs) {
            this.putQueryParameter("JarStartArgs", jarStartArgs);
            this.jarStartArgs = jarStartArgs;
            return this;
        }

        /**
         * <p>The option settings in the JAR package. The settings are used to start the job. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArg</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>-Xms4G -Xmx4G</p>
         */
        public Builder jarStartOptions(String jarStartOptions) {
            this.putQueryParameter("JarStartOptions", jarStartOptions);
            this.jarStartOptions = jarStartOptions;
            return this;
        }

        /**
         * <p>The number of concurrent instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replicas(String replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The time at which the job is triggered. Format: <code>yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-14T14:25:02Z</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        /**
         * <p>The startup command of the WAR package. For information about how to configure the startup command, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure a startup command</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CATALINA_OPTS=&quot;$CATALINA_OPTS $Options&quot; catalina.sh run</p>
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
