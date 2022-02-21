// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncErrorRequestStatByCodeRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncErrorRequestStatByCodeRequest</p>
 */
public class GetAsyncErrorRequestStatByCodeRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("DbName")
    private String dbName;

    @Query
    @NameInMap("End")
    private String end;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("Start")
    private String start;

    private GetAsyncErrorRequestStatByCodeRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.dbName = builder.dbName;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.role = builder.role;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncErrorRequestStatByCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetAsyncErrorRequestStatByCodeRequest, Builder> {
        private String consoleContext; 
        private String dbName; 
        private String end; 
        private String instanceId; 
        private String nodeId; 
        private String role; 
        private String start; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncErrorRequestStatByCodeRequest response) {
            super(response);
            this.consoleContext = response.consoleContext;
            this.dbName = response.dbName;
            this.end = response.end;
            this.instanceId = response.instanceId;
            this.nodeId = response.nodeId;
            this.role = response.role;
            this.start = response.start;
        } 

        /**
         * ConsoleContext.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * End.
         */
        public Builder end(String end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetAsyncErrorRequestStatByCodeRequest build() {
            return new GetAsyncErrorRequestStatByCodeRequest(this);
        } 

    } 

}
