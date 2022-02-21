// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteNodeToolRequest} extends {@link RequestModel}
 *
 * <p>ExecuteNodeToolRequest</p>
 */
public class ExecuteNodeToolRequest extends Request {
    @Query
    @NameInMap("Arguments")
    private String arguments;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Command")
    @Validation(required = true)
    private String command;

    @Query
    @NameInMap("DataCenterId")
    @Validation(required = true)
    private String dataCenterId;

    @Query
    @NameInMap("ExecuteNodes")
    private String executeNodes;

    private ExecuteNodeToolRequest(Builder builder) {
        super(builder);
        this.arguments = builder.arguments;
        this.clusterId = builder.clusterId;
        this.command = builder.command;
        this.dataCenterId = builder.dataCenterId;
        this.executeNodes = builder.executeNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteNodeToolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arguments
     */
    public String getArguments() {
        return this.arguments;
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
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    /**
     * @return executeNodes
     */
    public String getExecuteNodes() {
        return this.executeNodes;
    }

    public static final class Builder extends Request.Builder<ExecuteNodeToolRequest, Builder> {
        private String arguments; 
        private String clusterId; 
        private String command; 
        private String dataCenterId; 
        private String executeNodes; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteNodeToolRequest response) {
            super(response);
            this.arguments = response.arguments;
            this.clusterId = response.clusterId;
            this.command = response.command;
            this.dataCenterId = response.dataCenterId;
            this.executeNodes = response.executeNodes;
        } 

        /**
         * Arguments.
         */
        public Builder arguments(String arguments) {
            this.putQueryParameter("Arguments", arguments);
            this.arguments = arguments;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.putQueryParameter("DataCenterId", dataCenterId);
            this.dataCenterId = dataCenterId;
            return this;
        }

        /**
         * ExecuteNodes.
         */
        public Builder executeNodes(String executeNodes) {
            this.putQueryParameter("ExecuteNodes", executeNodes);
            this.executeNodes = executeNodes;
            return this;
        }

        @Override
        public ExecuteNodeToolRequest build() {
            return new ExecuteNodeToolRequest(this);
        } 

    } 

}
