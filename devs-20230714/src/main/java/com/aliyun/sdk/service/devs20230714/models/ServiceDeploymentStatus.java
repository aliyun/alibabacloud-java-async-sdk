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
 * {@link ServiceDeploymentStatus} extends {@link TeaModel}
 *
 * <p>ServiceDeploymentStatus</p>
 */
public class ServiceDeploymentStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("finishedTime")
    private String finishedTime;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private ServiceDeploymentStatus(Builder builder) {
        this.finishedTime = builder.finishedTime;
        this.phase = builder.phase;
        this.pipelineName = builder.pipelineName;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceDeploymentStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return finishedTime
     */
    public String getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String finishedTime; 
        private String phase; 
        private String pipelineName; 
        private String startTime; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(ServiceDeploymentStatus model) {
            this.finishedTime = model.finishedTime;
            this.phase = model.phase;
            this.pipelineName = model.pipelineName;
            this.startTime = model.startTime;
            this.taskName = model.taskName;
        } 

        /**
         * finishedTime.
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public ServiceDeploymentStatus build() {
            return new ServiceDeploymentStatus(this);
        } 

    } 

}
