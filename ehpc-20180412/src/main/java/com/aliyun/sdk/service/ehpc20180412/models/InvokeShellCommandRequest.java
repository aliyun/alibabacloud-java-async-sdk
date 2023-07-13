// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeShellCommandRequest} extends {@link RequestModel}
 *
 * <p>InvokeShellCommandRequest</p>
 */
public class InvokeShellCommandRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Command")
    @Validation(required = true)
    private String command;

    @Query
    @NameInMap("Instance")
    private java.util.List < Instance> instance;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    private InvokeShellCommandRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.command = builder.command;
        this.instance = builder.instance;
        this.timeout = builder.timeout;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeShellCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return instance
     */
    public java.util.List < Instance> getInstance() {
        return this.instance;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<InvokeShellCommandRequest, Builder> {
        private String clusterId; 
        private String command; 
        private java.util.List < Instance> instance; 
        private Integer timeout; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(InvokeShellCommandRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.command = request.command;
            this.instance = request.instance;
            this.timeout = request.timeout;
            this.workingDir = request.workingDir;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The content of the command. The content must be 2 to 2,048 characters in length.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * The information of nodes on which the command is run.
         */
        public Builder instance(java.util.List < Instance> instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * The timeout period. If a command times out, the command process will be terminated. Unit: seconds.
         * <p>
         * 
         * Default value: 60.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The working directory of the command. Default value: `/root`.
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        @Override
        public InvokeShellCommandRequest build() {
            return new InvokeShellCommandRequest(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("Id")
        private String id;

        private Instance(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * The ID of the Nth node instance on which the command is run.
             * <p>
             * 
             * > This parameter specifies the node on which the command is run. If it is not specified, the command will be run on all nodes of the cluster.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
