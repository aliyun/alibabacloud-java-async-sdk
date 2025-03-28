// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link TaskInvocation} extends {@link TeaModel}
 *
 * <p>TaskInvocation</p>
 */
public class TaskInvocation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceID")
    private String instanceID;

    @com.aliyun.core.annotation.NameInMap("invocationID")
    private String invocationID;

    @com.aliyun.core.annotation.NameInMap("invocationTarget")
    private String invocationTarget;

    @com.aliyun.core.annotation.NameInMap("output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("requestID")
    private String requestID;

    @com.aliyun.core.annotation.NameInMap("slsLogStore")
    private String slsLogStore;

    @com.aliyun.core.annotation.NameInMap("slsProject")
    private String slsProject;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private TaskInvocation(Builder builder) {
        this.instanceID = builder.instanceID;
        this.invocationID = builder.invocationID;
        this.invocationTarget = builder.invocationTarget;
        this.output = builder.output;
        this.requestID = builder.requestID;
        this.slsLogStore = builder.slsLogStore;
        this.slsProject = builder.slsProject;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskInvocation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * @return invocationID
     */
    public String getInvocationID() {
        return this.invocationID;
    }

    /**
     * @return invocationTarget
     */
    public String getInvocationTarget() {
        return this.invocationTarget;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestID
     */
    public String getRequestID() {
        return this.requestID;
    }

    /**
     * @return slsLogStore
     */
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String instanceID; 
        private String invocationID; 
        private String invocationTarget; 
        private String output; 
        private String requestID; 
        private String slsLogStore; 
        private String slsProject; 
        private String status; 

        private Builder() {
        } 

        private Builder(TaskInvocation model) {
            this.instanceID = model.instanceID;
            this.invocationID = model.invocationID;
            this.invocationTarget = model.invocationTarget;
            this.output = model.output;
            this.requestID = model.requestID;
            this.slsLogStore = model.slsLogStore;
            this.slsProject = model.slsProject;
            this.status = model.status;
        } 

        /**
         * instanceID.
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }

        /**
         * invocationID.
         */
        public Builder invocationID(String invocationID) {
            this.invocationID = invocationID;
            return this;
        }

        /**
         * invocationTarget.
         */
        public Builder invocationTarget(String invocationTarget) {
            this.invocationTarget = invocationTarget;
            return this;
        }

        /**
         * output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * requestID.
         */
        public Builder requestID(String requestID) {
            this.requestID = requestID;
            return this;
        }

        /**
         * slsLogStore.
         */
        public Builder slsLogStore(String slsLogStore) {
            this.slsLogStore = slsLogStore;
            return this;
        }

        /**
         * slsProject.
         */
        public Builder slsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public TaskInvocation build() {
            return new TaskInvocation(this);
        } 

    } 

}
