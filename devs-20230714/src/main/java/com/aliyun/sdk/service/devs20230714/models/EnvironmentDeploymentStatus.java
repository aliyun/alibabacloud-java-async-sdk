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
 * {@link EnvironmentDeploymentStatus} extends {@link TeaModel}
 *
 * <p>EnvironmentDeploymentStatus</p>
 */
public class EnvironmentDeploymentStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("finishedTime")
    private String finishedTime;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("serviceDeployments")
    private java.util.Map<String, String> serviceDeployments;

    private EnvironmentDeploymentStatus(Builder builder) {
        this.finishedTime = builder.finishedTime;
        this.phase = builder.phase;
        this.pipelineName = builder.pipelineName;
        this.serviceDeployments = builder.serviceDeployments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentDeploymentStatus create() {
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
     * @return serviceDeployments
     */
    public java.util.Map<String, String> getServiceDeployments() {
        return this.serviceDeployments;
    }

    public static final class Builder {
        private String finishedTime; 
        private String phase; 
        private String pipelineName; 
        private java.util.Map<String, String> serviceDeployments; 

        private Builder() {
        } 

        private Builder(EnvironmentDeploymentStatus model) {
            this.finishedTime = model.finishedTime;
            this.phase = model.phase;
            this.pipelineName = model.pipelineName;
            this.serviceDeployments = model.serviceDeployments;
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
         * serviceDeployments.
         */
        public Builder serviceDeployments(java.util.Map<String, String> serviceDeployments) {
            this.serviceDeployments = serviceDeployments;
            return this;
        }

        public EnvironmentDeploymentStatus build() {
            return new EnvironmentDeploymentStatus(this);
        } 

    } 

}
