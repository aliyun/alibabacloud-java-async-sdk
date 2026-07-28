// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link TuningHistory} extends {@link TeaModel}
 *
 * <p>TuningHistory</p>
 */
public class TuningHistory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actionType")
    private String actionType;

    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.Map<String, String> annotations;

    @com.aliyun.core.annotation.NameInMap("deploymentName")
    private String deploymentName;

    @com.aliyun.core.annotation.NameInMap("isHotUpdate")
    private Boolean isHotUpdate;

    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("newResourceSetting")
    private NewResourceSetting newResourceSetting;

    @com.aliyun.core.annotation.NameInMap("oldResourceSetting")
    private OldResourceSetting oldResourceSetting;

    @com.aliyun.core.annotation.NameInMap("triggerTime")
    private Long triggerTime;

    @com.aliyun.core.annotation.NameInMap("tuningId")
    private String tuningId;

    @com.aliyun.core.annotation.NameInMap("tuningMessage")
    private String tuningMessage;

    @com.aliyun.core.annotation.NameInMap("tuningState")
    private String tuningState;

    private TuningHistory(Builder builder) {
        this.actionType = builder.actionType;
        this.annotations = builder.annotations;
        this.deploymentName = builder.deploymentName;
        this.isHotUpdate = builder.isHotUpdate;
        this.jobId = builder.jobId;
        this.newResourceSetting = builder.newResourceSetting;
        this.oldResourceSetting = builder.oldResourceSetting;
        this.triggerTime = builder.triggerTime;
        this.tuningId = builder.tuningId;
        this.tuningMessage = builder.tuningMessage;
        this.tuningState = builder.tuningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TuningHistory create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return annotations
     */
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return deploymentName
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * @return isHotUpdate
     */
    public Boolean getIsHotUpdate() {
        return this.isHotUpdate;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return newResourceSetting
     */
    public NewResourceSetting getNewResourceSetting() {
        return this.newResourceSetting;
    }

    /**
     * @return oldResourceSetting
     */
    public OldResourceSetting getOldResourceSetting() {
        return this.oldResourceSetting;
    }

    /**
     * @return triggerTime
     */
    public Long getTriggerTime() {
        return this.triggerTime;
    }

    /**
     * @return tuningId
     */
    public String getTuningId() {
        return this.tuningId;
    }

    /**
     * @return tuningMessage
     */
    public String getTuningMessage() {
        return this.tuningMessage;
    }

    /**
     * @return tuningState
     */
    public String getTuningState() {
        return this.tuningState;
    }

    public static final class Builder {
        private String actionType; 
        private java.util.Map<String, String> annotations; 
        private String deploymentName; 
        private Boolean isHotUpdate; 
        private String jobId; 
        private NewResourceSetting newResourceSetting; 
        private OldResourceSetting oldResourceSetting; 
        private Long triggerTime; 
        private String tuningId; 
        private String tuningMessage; 
        private String tuningState; 

        private Builder() {
        } 

        private Builder(TuningHistory model) {
            this.actionType = model.actionType;
            this.annotations = model.annotations;
            this.deploymentName = model.deploymentName;
            this.isHotUpdate = model.isHotUpdate;
            this.jobId = model.jobId;
            this.newResourceSetting = model.newResourceSetting;
            this.oldResourceSetting = model.oldResourceSetting;
            this.triggerTime = model.triggerTime;
            this.tuningId = model.tuningId;
            this.tuningMessage = model.tuningMessage;
            this.tuningState = model.tuningState;
        } 

        /**
         * actionType.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * annotations.
         */
        public Builder annotations(java.util.Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * deploymentName.
         */
        public Builder deploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        /**
         * isHotUpdate.
         */
        public Builder isHotUpdate(Boolean isHotUpdate) {
            this.isHotUpdate = isHotUpdate;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * newResourceSetting.
         */
        public Builder newResourceSetting(NewResourceSetting newResourceSetting) {
            this.newResourceSetting = newResourceSetting;
            return this;
        }

        /**
         * oldResourceSetting.
         */
        public Builder oldResourceSetting(OldResourceSetting oldResourceSetting) {
            this.oldResourceSetting = oldResourceSetting;
            return this;
        }

        /**
         * triggerTime.
         */
        public Builder triggerTime(Long triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }

        /**
         * tuningId.
         */
        public Builder tuningId(String tuningId) {
            this.tuningId = tuningId;
            return this;
        }

        /**
         * tuningMessage.
         */
        public Builder tuningMessage(String tuningMessage) {
            this.tuningMessage = tuningMessage;
            return this;
        }

        /**
         * tuningState.
         */
        public Builder tuningState(String tuningState) {
            this.tuningState = tuningState;
            return this;
        }

        public TuningHistory build() {
            return new TuningHistory(this);
        } 

    } 

    /**
     * 
     * {@link TuningHistory} extends {@link TeaModel}
     *
     * <p>TuningHistory</p>
     */
    public static class NewResourceSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private Double cpu;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("parallelism")
        private Integer parallelism;

        private NewResourceSetting(Builder builder) {
            this.cpu = builder.cpu;
            this.memory = builder.memory;
            this.parallelism = builder.parallelism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewResourceSetting create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Double getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return parallelism
         */
        public Integer getParallelism() {
            return this.parallelism;
        }

        public static final class Builder {
            private Double cpu; 
            private String memory; 
            private Integer parallelism; 

            private Builder() {
            } 

            private Builder(NewResourceSetting model) {
                this.cpu = model.cpu;
                this.memory = model.memory;
                this.parallelism = model.parallelism;
            } 

            /**
             * cpu.
             */
            public Builder cpu(Double cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * parallelism.
             */
            public Builder parallelism(Integer parallelism) {
                this.parallelism = parallelism;
                return this;
            }

            public NewResourceSetting build() {
                return new NewResourceSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link TuningHistory} extends {@link TeaModel}
     *
     * <p>TuningHistory</p>
     */
    public static class OldResourceSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private Double cpu;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("parallelism")
        private Integer parallelism;

        private OldResourceSetting(Builder builder) {
            this.cpu = builder.cpu;
            this.memory = builder.memory;
            this.parallelism = builder.parallelism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OldResourceSetting create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Double getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return parallelism
         */
        public Integer getParallelism() {
            return this.parallelism;
        }

        public static final class Builder {
            private Double cpu; 
            private String memory; 
            private Integer parallelism; 

            private Builder() {
            } 

            private Builder(OldResourceSetting model) {
                this.cpu = model.cpu;
                this.memory = model.memory;
                this.parallelism = model.parallelism;
            } 

            /**
             * cpu.
             */
            public Builder cpu(Double cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * parallelism.
             */
            public Builder parallelism(Integer parallelism) {
                this.parallelism = parallelism;
                return this;
            }

            public OldResourceSetting build() {
                return new OldResourceSetting(this);
            } 

        } 

    }
}
