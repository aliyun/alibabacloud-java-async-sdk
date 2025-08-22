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

    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    private DataJuicerConfig(Builder builder) {
        this.commandType = builder.commandType;
        this.executionMode = builder.executionMode;
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
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    public static final class Builder {
        private String commandType; 
        private String executionMode; 

        private Builder() {
        } 

        private Builder(DataJuicerConfig model) {
            this.commandType = model.commandType;
            this.executionMode = model.executionMode;
        } 

        /**
         * CommandType.
         */
        public Builder commandType(String commandType) {
            this.commandType = commandType;
            return this;
        }

        /**
         * ExecutionMode.
         */
        public Builder executionMode(String executionMode) {
            this.executionMode = executionMode;
            return this;
        }

        public DataJuicerConfig build() {
            return new DataJuicerConfig(this);
        } 

    } 

}
