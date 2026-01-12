// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link DataJuicerConfig} extends {@link TeaModel}
 *
 * <p>DataJuicerConfig</p>
 */
public class DataJuicerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandType")
    private String commandType;

    @com.aliyun.core.annotation.NameInMap("EnableResourceEstimation")
    private Boolean enableResourceEstimation;

    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.NameInMap("ResourceLimit")
    private ResourceLimit resourceLimit;

    private DataJuicerConfig(Builder builder) {
        this.commandType = builder.commandType;
        this.enableResourceEstimation = builder.enableResourceEstimation;
        this.executionMode = builder.executionMode;
        this.resourceLimit = builder.resourceLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataJuicerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandType
     */
    public String getCommandType() {
        return this.commandType;
    }

    /**
     * @return enableResourceEstimation
     */
    public Boolean getEnableResourceEstimation() {
        return this.enableResourceEstimation;
    }

    /**
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return resourceLimit
     */
    public ResourceLimit getResourceLimit() {
        return this.resourceLimit;
    }

    public static final class Builder {
        private String commandType; 
        private Boolean enableResourceEstimation; 
        private String executionMode; 
        private ResourceLimit resourceLimit; 

        private Builder() {
        } 

        private Builder(DataJuicerConfig model) {
            this.commandType = model.commandType;
            this.enableResourceEstimation = model.enableResourceEstimation;
            this.executionMode = model.executionMode;
            this.resourceLimit = model.resourceLimit;
        } 

        /**
         * CommandType.
         */
        public Builder commandType(String commandType) {
            this.commandType = commandType;
            return this;
        }

        /**
         * EnableResourceEstimation.
         */
        public Builder enableResourceEstimation(Boolean enableResourceEstimation) {
            this.enableResourceEstimation = enableResourceEstimation;
            return this;
        }

        /**
         * ExecutionMode.
         */
        public Builder executionMode(String executionMode) {
            this.executionMode = executionMode;
            return this;
        }

        /**
         * ResourceLimit.
         */
        public Builder resourceLimit(ResourceLimit resourceLimit) {
            this.resourceLimit = resourceLimit;
            return this;
        }

        public DataJuicerConfig build() {
            return new DataJuicerConfig(this);
        } 

    } 

}
