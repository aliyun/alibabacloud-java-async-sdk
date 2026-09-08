// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link EventHouseRuntime} extends {@link TeaModel}
 *
 * <p>EventHouseRuntime</p>
 */
public class EventHouseRuntime extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cu")
    private Integer cu;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("Stage")
    private String stage;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TargetCu")
    private Integer targetCu;

    private EventHouseRuntime(Builder builder) {
        this.cu = builder.cu;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.name = builder.name;
        this.progress = builder.progress;
        this.stage = builder.stage;
        this.status = builder.status;
        this.targetCu = builder.targetCu;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventHouseRuntime create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return this.stage;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return targetCu
     */
    public Integer getTargetCu() {
        return this.targetCu;
    }

    public static final class Builder {
        private Integer cu; 
        private String errorCode; 
        private String errorMessage; 
        private String name; 
        private Integer progress; 
        private String stage; 
        private String status; 
        private Integer targetCu; 

        private Builder() {
        } 

        private Builder(EventHouseRuntime model) {
            this.cu = model.cu;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.name = model.name;
            this.progress = model.progress;
            this.stage = model.stage;
            this.status = model.status;
            this.targetCu = model.targetCu;
        } 

        /**
         * <p>The number of CUs that last took effect for the EventHouse Runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cu(Integer cu) {
            this.cu = cu;
            return this;
        }

        /**
         * <p>The stable error code returned when the creation or specification change operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNTIME_OPERATION_TIMEOUT</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The desensitized error message returned when the creation or specification change operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Runtime operation timed out</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The name of the EventHouse Runtime. Typically set to default in the initial phase.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The progress of the current creation or specification change operation. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The current stage of the creation or specification change operation.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNTIME_HEALTH_CHECK</p>
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * <p>The current status of the EventHouse Runtime. RUNNING indicates that the Runtime is ready and can accept queries. Valid values: CREATING, RUNNING, UPDATING, RECOVERING, CLOSED, CREATE_FAILED, and UPDATE_FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The target number of CUs during creation, specification change, or the corresponding failed state. This parameter is not returned when the Runtime is running stably.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder targetCu(Integer targetCu) {
            this.targetCu = targetCu;
            return this;
        }

        public EventHouseRuntime build() {
            return new EventHouseRuntime(this);
        } 

    } 

}
