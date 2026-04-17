// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link UninstallAppResponseBody} extends {@link TeaModel}
 *
 * <p>UninstallAppResponseBody</p>
 */
public class UninstallAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChildTaskInfo")
    private java.util.List<ChildTaskInfo> childTaskInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private UninstallAppResponseBody(Builder builder) {
        this.childTaskInfo = builder.childTaskInfo;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childTaskInfo
     */
    public java.util.List<ChildTaskInfo> getChildTaskInfo() {
        return this.childTaskInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private java.util.List<ChildTaskInfo> childTaskInfo; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(UninstallAppResponseBody model) {
            this.childTaskInfo = model.childTaskInfo;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * ChildTaskInfo.
         */
        public Builder childTaskInfo(java.util.List<ChildTaskInfo> childTaskInfo) {
            this.childTaskInfo = childTaskInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E5138F7E-46B5-526A-8C99-82DEAE6B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-1ljew7on6ay0j****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public UninstallAppResponseBody build() {
            return new UninstallAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UninstallAppResponseBody} extends {@link TeaModel}
     *
     * <p>UninstallAppResponseBody</p>
     */
    public static class ChildTaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ChildTaskId")
        private String childTaskId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private ChildTaskInfo(Builder builder) {
            this.appId = builder.appId;
            this.childTaskId = builder.childTaskId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildTaskInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return childTaskId
         */
        public String getChildTaskId() {
            return this.childTaskId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String appId; 
            private String childTaskId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(ChildTaskInfo model) {
                this.appId = model.appId;
                this.childTaskId = model.childTaskId;
                this.instanceId = model.instanceId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ChildTaskId.
             */
            public Builder childTaskId(String childTaskId) {
                this.childTaskId = childTaskId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public ChildTaskInfo build() {
                return new ChildTaskInfo(this);
            } 

        } 

    }
}
