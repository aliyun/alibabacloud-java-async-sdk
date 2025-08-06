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
 * {@link ListWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowResponseBody</p>
 */
public class ListWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkflowInfoList")
    private java.util.List<WorkflowInfoList> workflowInfoList;

    private ListWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workflowInfoList = builder.workflowInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowResponseBody create() {
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
     * @return workflowInfoList
     */
    public java.util.List<WorkflowInfoList> getWorkflowInfoList() {
        return this.workflowInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<WorkflowInfoList> workflowInfoList; 

        private Builder() {
        } 

        private Builder(ListWorkflowResponseBody model) {
            this.requestId = model.requestId;
            this.workflowInfoList = model.workflowInfoList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkflowInfoList.
         */
        public Builder workflowInfoList(java.util.List<WorkflowInfoList> workflowInfoList) {
            this.workflowInfoList = workflowInfoList;
            return this;
        }

        public ListWorkflowResponseBody build() {
            return new ListWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowResponseBody</p>
     */
    public static class WorkflowInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionList")
        private String actionList;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        private WorkflowInfoList(Builder builder) {
            this.actionList = builder.actionList;
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.state = builder.state;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowInfoList create() {
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
            private String creationTime; 
            private String modifyTime; 
            private String name; 
            private String state; 
            private String workflowId; 

            private Builder() {
            } 

            private Builder(WorkflowInfoList model) {
                this.actionList = model.actionList;
                this.appId = model.appId;
                this.creationTime = model.creationTime;
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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

            public WorkflowInfoList build() {
                return new WorkflowInfoList(this);
            } 

        } 

    }
}
