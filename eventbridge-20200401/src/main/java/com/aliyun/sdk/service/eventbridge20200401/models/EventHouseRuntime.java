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
         * <p>EventHouse Runtime 最后成功生效的 CU 数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cu(Integer cu) {
            this.cu = cu;
            return this;
        }

        /**
         * <p>创建或变配失败时返回的稳定错误码</p>
         * 
         * <strong>example:</strong>
         * <p>RUNTIME_OPERATION_TIMEOUT</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>创建或变配失败时返回的脱敏错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>Runtime operation timed out</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>EventHouse Runtime 名称。首期通常为 default</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>当前创建或变配操作的进度，取值范围为 0 到 100</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>当前创建或变配操作所处阶段</p>
         * 
         * <strong>example:</strong>
         * <p>RUNTIME_HEALTH_CHECK</p>
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * <p>EventHouse Runtime 当前状态。RUNNING 表示 Runtime 已就绪且可以承接查询。可能值为 CREATING、RUNNING、UPDATING、RECOVERING、CLOSED、CREATE_FAILED、UPDATE_FAILED</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>创建、变配或对应失败状态下的目标 CU 数量，稳定运行时不返回</p>
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
