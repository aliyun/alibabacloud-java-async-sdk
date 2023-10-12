// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AgentsTask} extends {@link TeaModel}
 *
 * <p>AgentsTask</p>
 */
public class AgentsTask extends TeaModel {
    @NameInMap("ActionType")
    private String actionType;

    @NameInMap("AgentType")
    private String agentType;

    @NameInMap("AgentsTaskId")
    private String agentsTaskId;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("Params")
    private String params;

    @NameInMap("Status")
    private String status;

    private AgentsTask(Builder builder) {
        this.actionType = builder.actionType;
        this.agentType = builder.agentType;
        this.agentsTaskId = builder.agentsTaskId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModify = builder.gmtModify;
        this.params = builder.params;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentsTask create() {
        return builder().build();
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return agentsTaskId
     */
    public String getAgentsTaskId() {
        return this.agentsTaskId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModify
     */
    public String getGmtModify() {
        return this.gmtModify;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String actionType; 
        private String agentType; 
        private String agentsTaskId; 
        private String gmtCreate; 
        private String gmtModify; 
        private String params; 
        private String status; 

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.agentType = agentType;
            return this;
        }

        /**
         * AgentsTaskId.
         */
        public Builder agentsTaskId(String agentsTaskId) {
            this.agentsTaskId = agentsTaskId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModify.
         */
        public Builder gmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AgentsTask build() {
            return new AgentsTask(this);
        } 

    } 

}
