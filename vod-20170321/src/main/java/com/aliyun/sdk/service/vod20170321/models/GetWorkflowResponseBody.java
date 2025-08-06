// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowResponseBody</p>
 */
public class GetWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkflowInfo")
    private WorkflowInfo workflowInfo;

    private GetWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workflowInfo = builder.workflowInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workflowInfo
     */
    public WorkflowInfo getWorkflowInfo() {
        return this.workflowInfo;
    }

    public static final class Builder {
        private String requestId; 
        private WorkflowInfo workflowInfo; 

        private Builder() {
        } 

        private Builder(GetWorkflowResponseBody model) {
            this.requestId = model.requestId;
            this.workflowInfo = model.workflowInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkflowInfo.
         */
        public Builder workflowInfo(WorkflowInfo workflowInfo) {
            this.workflowInfo = workflowInfo;
            return this;
        }

        public GetWorkflowResponseBody build() {
            return new GetWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowResponseBody</p>
     */
    public static class WorkflowInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionList")
        private String actionList;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CallbackConfig")
        private String callbackConfig;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        private WorkflowInfo(Builder builder) {
            this.actionList = builder.actionList;
            this.appId = builder.appId;
            this.callbackConfig = builder.callbackConfig;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.state = builder.state;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowInfo create() {
            return builder().build();
        }

        /**
         * @return actionList
         */
        public String getActionList() {
            return this.actionList;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return callbackConfig
         */
        public String getCallbackConfig() {
            return this.callbackConfig;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String actionList; 
            private String appId; 
            private String callbackConfig; 
            private String creationTime; 
            private String description; 
            private String modifyTime; 
            private String name; 
            private String state; 
            private String workflowId; 

            private Builder() {
            } 

            private Builder(WorkflowInfo model) {
                this.actionList = model.actionList;
                this.appId = model.appId;
                this.callbackConfig = model.callbackConfig;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.state = model.state;
                this.workflowId = model.workflowId;
            } 

            /**
             * ActionList.
             */
            public Builder actionList(String actionList) {
                this.actionList = actionList;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CallbackConfig.
             */
            public Builder callbackConfig(String callbackConfig) {
                this.callbackConfig = callbackConfig;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public WorkflowInfo build() {
                return new WorkflowInfo(this);
            } 

        } 

    }
}
