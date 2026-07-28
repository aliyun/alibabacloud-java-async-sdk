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
 * {@link AutopilotPolicy} extends {@link TeaModel}
 *
 * <p>AutopilotPolicy</p>
 */
public class AutopilotPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("advancedRules")
    private AdvancedRules advancedRules;

    @com.aliyun.core.annotation.NameInMap("limits")
    private Limits limits;

    @com.aliyun.core.annotation.NameInMap("scaleDownRules")
    private ScaleDownRules scaleDownRules;

    @com.aliyun.core.annotation.NameInMap("scaleUpRules")
    private ScaleUpRules scaleUpRules;

    @com.aliyun.core.annotation.NameInMap("silentPeriodConfig")
    private SilentPeriodConfig silentPeriodConfig;

    private AutopilotPolicy(Builder builder) {
        this.advancedRules = builder.advancedRules;
        this.limits = builder.limits;
        this.scaleDownRules = builder.scaleDownRules;
        this.scaleUpRules = builder.scaleUpRules;
        this.silentPeriodConfig = builder.silentPeriodConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutopilotPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedRules
     */
    public AdvancedRules getAdvancedRules() {
        return this.advancedRules;
    }

    /**
     * @return limits
     */
    public Limits getLimits() {
        return this.limits;
    }

    /**
     * @return scaleDownRules
     */
    public ScaleDownRules getScaleDownRules() {
        return this.scaleDownRules;
    }

    /**
     * @return scaleUpRules
     */
    public ScaleUpRules getScaleUpRules() {
        return this.scaleUpRules;
    }

    /**
     * @return silentPeriodConfig
     */
    public SilentPeriodConfig getSilentPeriodConfig() {
        return this.silentPeriodConfig;
    }

    public static final class Builder {
        private AdvancedRules advancedRules; 
        private Limits limits; 
        private ScaleDownRules scaleDownRules; 
        private ScaleUpRules scaleUpRules; 
        private SilentPeriodConfig silentPeriodConfig; 

        private Builder() {
        } 

        private Builder(AutopilotPolicy model) {
            this.advancedRules = model.advancedRules;
            this.limits = model.limits;
            this.scaleDownRules = model.scaleDownRules;
            this.scaleUpRules = model.scaleUpRules;
            this.silentPeriodConfig = model.silentPeriodConfig;
        } 

        /**
         * advancedRules.
         */
        public Builder advancedRules(AdvancedRules advancedRules) {
            this.advancedRules = advancedRules;
            return this;
        }

        /**
         * limits.
         */
        public Builder limits(Limits limits) {
            this.limits = limits;
            return this;
        }

        /**
         * scaleDownRules.
         */
        public Builder scaleDownRules(ScaleDownRules scaleDownRules) {
            this.scaleDownRules = scaleDownRules;
            return this;
        }

        /**
         * scaleUpRules.
         */
        public Builder scaleUpRules(ScaleUpRules scaleUpRules) {
            this.scaleUpRules = scaleUpRules;
            return this;
        }

        /**
         * silentPeriodConfig.
         */
        public Builder silentPeriodConfig(SilentPeriodConfig silentPeriodConfig) {
            this.silentPeriodConfig = silentPeriodConfig;
            return this;
        }

        public AutopilotPolicy build() {
            return new AutopilotPolicy(this);
        } 

    } 

    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class AdvancedRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, String> parameters;

        private AdvancedRules(Builder builder) {
            this.enabled = builder.enabled;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedRules create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.Map<String, String> parameters; 

            private Builder() {
            } 

            private Builder(AdvancedRules model) {
                this.enabled = model.enabled;
                this.parameters = model.parameters;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            public AdvancedRules build() {
                return new AdvancedRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class Limits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("coolDownMinutes")
        private Long coolDownMinutes;

        @com.aliyun.core.annotation.NameInMap("jobMaxCpu")
        private Double jobMaxCpu;

        @com.aliyun.core.annotation.NameInMap("jobMaxMemory")
        private String jobMaxMemory;

        @com.aliyun.core.annotation.NameInMap("jobMaxParallelism")
        private Integer jobMaxParallelism;

        @com.aliyun.core.annotation.NameInMap("jobMinParallelism")
        private Integer jobMinParallelism;

        private Limits(Builder builder) {
            this.coolDownMinutes = builder.coolDownMinutes;
            this.jobMaxCpu = builder.jobMaxCpu;
            this.jobMaxMemory = builder.jobMaxMemory;
            this.jobMaxParallelism = builder.jobMaxParallelism;
            this.jobMinParallelism = builder.jobMinParallelism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Limits create() {
            return builder().build();
        }

        /**
         * @return coolDownMinutes
         */
        public Long getCoolDownMinutes() {
            return this.coolDownMinutes;
        }

        /**
         * @return jobMaxCpu
         */
        public Double getJobMaxCpu() {
            return this.jobMaxCpu;
        }

        /**
         * @return jobMaxMemory
         */
        public String getJobMaxMemory() {
            return this.jobMaxMemory;
        }

        /**
         * @return jobMaxParallelism
         */
        public Integer getJobMaxParallelism() {
            return this.jobMaxParallelism;
        }

        /**
         * @return jobMinParallelism
         */
        public Integer getJobMinParallelism() {
            return this.jobMinParallelism;
        }

        public static final class Builder {
            private Long coolDownMinutes; 
            private Double jobMaxCpu; 
            private String jobMaxMemory; 
            private Integer jobMaxParallelism; 
            private Integer jobMinParallelism; 

            private Builder() {
            } 

            private Builder(Limits model) {
                this.coolDownMinutes = model.coolDownMinutes;
                this.jobMaxCpu = model.jobMaxCpu;
                this.jobMaxMemory = model.jobMaxMemory;
                this.jobMaxParallelism = model.jobMaxParallelism;
                this.jobMinParallelism = model.jobMinParallelism;
            } 

            /**
             * coolDownMinutes.
             */
            public Builder coolDownMinutes(Long coolDownMinutes) {
                this.coolDownMinutes = coolDownMinutes;
                return this;
            }

            /**
             * jobMaxCpu.
             */
            public Builder jobMaxCpu(Double jobMaxCpu) {
                this.jobMaxCpu = jobMaxCpu;
                return this;
            }

            /**
             * jobMaxMemory.
             */
            public Builder jobMaxMemory(String jobMaxMemory) {
                this.jobMaxMemory = jobMaxMemory;
                return this;
            }

            /**
             * jobMaxParallelism.
             */
            public Builder jobMaxParallelism(Integer jobMaxParallelism) {
                this.jobMaxParallelism = jobMaxParallelism;
                return this;
            }

            /**
             * jobMinParallelism.
             */
            public Builder jobMinParallelism(Integer jobMinParallelism) {
                this.jobMinParallelism = jobMinParallelism;
                return this;
            }

            public Limits build() {
                return new Limits(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class MemoryScaleDownRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("memUsageScaleDownSampleInterval")
        private String memUsageScaleDownSampleInterval;

        @com.aliyun.core.annotation.NameInMap("memUsageScaleDownThreshold")
        private Double memUsageScaleDownThreshold;

        private MemoryScaleDownRule(Builder builder) {
            this.enabled = builder.enabled;
            this.memUsageScaleDownSampleInterval = builder.memUsageScaleDownSampleInterval;
            this.memUsageScaleDownThreshold = builder.memUsageScaleDownThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryScaleDownRule create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return memUsageScaleDownSampleInterval
         */
        public String getMemUsageScaleDownSampleInterval() {
            return this.memUsageScaleDownSampleInterval;
        }

        /**
         * @return memUsageScaleDownThreshold
         */
        public Double getMemUsageScaleDownThreshold() {
            return this.memUsageScaleDownThreshold;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String memUsageScaleDownSampleInterval; 
            private Double memUsageScaleDownThreshold; 

            private Builder() {
            } 

            private Builder(MemoryScaleDownRule model) {
                this.enabled = model.enabled;
                this.memUsageScaleDownSampleInterval = model.memUsageScaleDownSampleInterval;
                this.memUsageScaleDownThreshold = model.memUsageScaleDownThreshold;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * memUsageScaleDownSampleInterval.
             */
            public Builder memUsageScaleDownSampleInterval(String memUsageScaleDownSampleInterval) {
                this.memUsageScaleDownSampleInterval = memUsageScaleDownSampleInterval;
                return this;
            }

            /**
             * memUsageScaleDownThreshold.
             */
            public Builder memUsageScaleDownThreshold(Double memUsageScaleDownThreshold) {
                this.memUsageScaleDownThreshold = memUsageScaleDownThreshold;
                return this;
            }

            public MemoryScaleDownRule build() {
                return new MemoryScaleDownRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class SlotBusyScaleDownRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("slotBusyScaleDownSampleInterval")
        private String slotBusyScaleDownSampleInterval;

        @com.aliyun.core.annotation.NameInMap("slotBusyScaleDownThreshold")
        private Double slotBusyScaleDownThreshold;

        private SlotBusyScaleDownRule(Builder builder) {
            this.enabled = builder.enabled;
            this.slotBusyScaleDownSampleInterval = builder.slotBusyScaleDownSampleInterval;
            this.slotBusyScaleDownThreshold = builder.slotBusyScaleDownThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotBusyScaleDownRule create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return slotBusyScaleDownSampleInterval
         */
        public String getSlotBusyScaleDownSampleInterval() {
            return this.slotBusyScaleDownSampleInterval;
        }

        /**
         * @return slotBusyScaleDownThreshold
         */
        public Double getSlotBusyScaleDownThreshold() {
            return this.slotBusyScaleDownThreshold;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String slotBusyScaleDownSampleInterval; 
            private Double slotBusyScaleDownThreshold; 

            private Builder() {
            } 

            private Builder(SlotBusyScaleDownRule model) {
                this.enabled = model.enabled;
                this.slotBusyScaleDownSampleInterval = model.slotBusyScaleDownSampleInterval;
                this.slotBusyScaleDownThreshold = model.slotBusyScaleDownThreshold;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * slotBusyScaleDownSampleInterval.
             */
            public Builder slotBusyScaleDownSampleInterval(String slotBusyScaleDownSampleInterval) {
                this.slotBusyScaleDownSampleInterval = slotBusyScaleDownSampleInterval;
                return this;
            }

            /**
             * slotBusyScaleDownThreshold.
             */
            public Builder slotBusyScaleDownThreshold(Double slotBusyScaleDownThreshold) {
                this.slotBusyScaleDownThreshold = slotBusyScaleDownThreshold;
                return this;
            }

            public SlotBusyScaleDownRule build() {
                return new SlotBusyScaleDownRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class ScaleDownRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memoryScaleDownRule")
        private MemoryScaleDownRule memoryScaleDownRule;

        @com.aliyun.core.annotation.NameInMap("slotBusyScaleDownRule")
        private SlotBusyScaleDownRule slotBusyScaleDownRule;

        private ScaleDownRules(Builder builder) {
            this.memoryScaleDownRule = builder.memoryScaleDownRule;
            this.slotBusyScaleDownRule = builder.slotBusyScaleDownRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleDownRules create() {
            return builder().build();
        }

        /**
         * @return memoryScaleDownRule
         */
        public MemoryScaleDownRule getMemoryScaleDownRule() {
            return this.memoryScaleDownRule;
        }

        /**
         * @return slotBusyScaleDownRule
         */
        public SlotBusyScaleDownRule getSlotBusyScaleDownRule() {
            return this.slotBusyScaleDownRule;
        }

        public static final class Builder {
            private MemoryScaleDownRule memoryScaleDownRule; 
            private SlotBusyScaleDownRule slotBusyScaleDownRule; 

            private Builder() {
            } 

            private Builder(ScaleDownRules model) {
                this.memoryScaleDownRule = model.memoryScaleDownRule;
                this.slotBusyScaleDownRule = model.slotBusyScaleDownRule;
            } 

            /**
             * memoryScaleDownRule.
             */
            public Builder memoryScaleDownRule(MemoryScaleDownRule memoryScaleDownRule) {
                this.memoryScaleDownRule = memoryScaleDownRule;
                return this;
            }

            /**
             * slotBusyScaleDownRule.
             */
            public Builder slotBusyScaleDownRule(SlotBusyScaleDownRule slotBusyScaleDownRule) {
                this.slotBusyScaleDownRule = slotBusyScaleDownRule;
                return this;
            }

            public ScaleDownRules build() {
                return new ScaleDownRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class DelayRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delaySampleInterval")
        private String delaySampleInterval;

        @com.aliyun.core.annotation.NameInMap("delayThreshold")
        private String delayThreshold;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private DelayRule(Builder builder) {
            this.delaySampleInterval = builder.delaySampleInterval;
            this.delayThreshold = builder.delayThreshold;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayRule create() {
            return builder().build();
        }

        /**
         * @return delaySampleInterval
         */
        public String getDelaySampleInterval() {
            return this.delaySampleInterval;
        }

        /**
         * @return delayThreshold
         */
        public String getDelayThreshold() {
            return this.delayThreshold;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String delaySampleInterval; 
            private String delayThreshold; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(DelayRule model) {
                this.delaySampleInterval = model.delaySampleInterval;
                this.delayThreshold = model.delayThreshold;
                this.enabled = model.enabled;
            } 

            /**
             * delaySampleInterval.
             */
            public Builder delaySampleInterval(String delaySampleInterval) {
                this.delaySampleInterval = delaySampleInterval;
                return this;
            }

            /**
             * delayThreshold.
             */
            public Builder delayThreshold(String delayThreshold) {
                this.delayThreshold = delayThreshold;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public DelayRule build() {
                return new DelayRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class GcRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("gcSampleInterval")
        private String gcSampleInterval;

        @com.aliyun.core.annotation.NameInMap("gcTimeRatioThreshold")
        private Double gcTimeRatioThreshold;

        private GcRule(Builder builder) {
            this.enabled = builder.enabled;
            this.gcSampleInterval = builder.gcSampleInterval;
            this.gcTimeRatioThreshold = builder.gcTimeRatioThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GcRule create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return gcSampleInterval
         */
        public String getGcSampleInterval() {
            return this.gcSampleInterval;
        }

        /**
         * @return gcTimeRatioThreshold
         */
        public Double getGcTimeRatioThreshold() {
            return this.gcTimeRatioThreshold;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String gcSampleInterval; 
            private Double gcTimeRatioThreshold; 

            private Builder() {
            } 

            private Builder(GcRule model) {
                this.enabled = model.enabled;
                this.gcSampleInterval = model.gcSampleInterval;
                this.gcTimeRatioThreshold = model.gcTimeRatioThreshold;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * gcSampleInterval.
             */
            public Builder gcSampleInterval(String gcSampleInterval) {
                this.gcSampleInterval = gcSampleInterval;
                return this;
            }

            /**
             * gcTimeRatioThreshold.
             */
            public Builder gcTimeRatioThreshold(Double gcTimeRatioThreshold) {
                this.gcTimeRatioThreshold = gcTimeRatioThreshold;
                return this;
            }

            public GcRule build() {
                return new GcRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class MemoryScaleUpRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("memUsageScaleUpThreshold")
        private Double memUsageScaleUpThreshold;

        private MemoryScaleUpRule(Builder builder) {
            this.enabled = builder.enabled;
            this.memUsageScaleUpThreshold = builder.memUsageScaleUpThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryScaleUpRule create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return memUsageScaleUpThreshold
         */
        public Double getMemUsageScaleUpThreshold() {
            return this.memUsageScaleUpThreshold;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Double memUsageScaleUpThreshold; 

            private Builder() {
            } 

            private Builder(MemoryScaleUpRule model) {
                this.enabled = model.enabled;
                this.memUsageScaleUpThreshold = model.memUsageScaleUpThreshold;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * memUsageScaleUpThreshold.
             */
            public Builder memUsageScaleUpThreshold(Double memUsageScaleUpThreshold) {
                this.memUsageScaleUpThreshold = memUsageScaleUpThreshold;
                return this;
            }

            public MemoryScaleUpRule build() {
                return new MemoryScaleUpRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class OomScaleUpRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private OomScaleUpRule(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OomScaleUpRule create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(OomScaleUpRule model) {
                this.enabled = model.enabled;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public OomScaleUpRule build() {
                return new OomScaleUpRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class SlotBusyScaleUpRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("slotBusyScaleUpSampleInterval")
        private String slotBusyScaleUpSampleInterval;

        @com.aliyun.core.annotation.NameInMap("slotBusyScaleUpThreshold")
        private Double slotBusyScaleUpThreshold;

        private SlotBusyScaleUpRule(Builder builder) {
            this.enabled = builder.enabled;
            this.slotBusyScaleUpSampleInterval = builder.slotBusyScaleUpSampleInterval;
            this.slotBusyScaleUpThreshold = builder.slotBusyScaleUpThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotBusyScaleUpRule create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return slotBusyScaleUpSampleInterval
         */
        public String getSlotBusyScaleUpSampleInterval() {
            return this.slotBusyScaleUpSampleInterval;
        }

        /**
         * @return slotBusyScaleUpThreshold
         */
        public Double getSlotBusyScaleUpThreshold() {
            return this.slotBusyScaleUpThreshold;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String slotBusyScaleUpSampleInterval; 
            private Double slotBusyScaleUpThreshold; 

            private Builder() {
            } 

            private Builder(SlotBusyScaleUpRule model) {
                this.enabled = model.enabled;
                this.slotBusyScaleUpSampleInterval = model.slotBusyScaleUpSampleInterval;
                this.slotBusyScaleUpThreshold = model.slotBusyScaleUpThreshold;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * slotBusyScaleUpSampleInterval.
             */
            public Builder slotBusyScaleUpSampleInterval(String slotBusyScaleUpSampleInterval) {
                this.slotBusyScaleUpSampleInterval = slotBusyScaleUpSampleInterval;
                return this;
            }

            /**
             * slotBusyScaleUpThreshold.
             */
            public Builder slotBusyScaleUpThreshold(Double slotBusyScaleUpThreshold) {
                this.slotBusyScaleUpThreshold = slotBusyScaleUpThreshold;
                return this;
            }

            public SlotBusyScaleUpRule build() {
                return new SlotBusyScaleUpRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class ScaleUpRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delayRule")
        private DelayRule delayRule;

        @com.aliyun.core.annotation.NameInMap("gcRule")
        private GcRule gcRule;

        @com.aliyun.core.annotation.NameInMap("memoryScaleUpRule")
        private MemoryScaleUpRule memoryScaleUpRule;

        @com.aliyun.core.annotation.NameInMap("oomScaleUpRule")
        private OomScaleUpRule oomScaleUpRule;

        @com.aliyun.core.annotation.NameInMap("slotBusyScaleUpRule")
        private SlotBusyScaleUpRule slotBusyScaleUpRule;

        private ScaleUpRules(Builder builder) {
            this.delayRule = builder.delayRule;
            this.gcRule = builder.gcRule;
            this.memoryScaleUpRule = builder.memoryScaleUpRule;
            this.oomScaleUpRule = builder.oomScaleUpRule;
            this.slotBusyScaleUpRule = builder.slotBusyScaleUpRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleUpRules create() {
            return builder().build();
        }

        /**
         * @return delayRule
         */
        public DelayRule getDelayRule() {
            return this.delayRule;
        }

        /**
         * @return gcRule
         */
        public GcRule getGcRule() {
            return this.gcRule;
        }

        /**
         * @return memoryScaleUpRule
         */
        public MemoryScaleUpRule getMemoryScaleUpRule() {
            return this.memoryScaleUpRule;
        }

        /**
         * @return oomScaleUpRule
         */
        public OomScaleUpRule getOomScaleUpRule() {
            return this.oomScaleUpRule;
        }

        /**
         * @return slotBusyScaleUpRule
         */
        public SlotBusyScaleUpRule getSlotBusyScaleUpRule() {
            return this.slotBusyScaleUpRule;
        }

        public static final class Builder {
            private DelayRule delayRule; 
            private GcRule gcRule; 
            private MemoryScaleUpRule memoryScaleUpRule; 
            private OomScaleUpRule oomScaleUpRule; 
            private SlotBusyScaleUpRule slotBusyScaleUpRule; 

            private Builder() {
            } 

            private Builder(ScaleUpRules model) {
                this.delayRule = model.delayRule;
                this.gcRule = model.gcRule;
                this.memoryScaleUpRule = model.memoryScaleUpRule;
                this.oomScaleUpRule = model.oomScaleUpRule;
                this.slotBusyScaleUpRule = model.slotBusyScaleUpRule;
            } 

            /**
             * delayRule.
             */
            public Builder delayRule(DelayRule delayRule) {
                this.delayRule = delayRule;
                return this;
            }

            /**
             * gcRule.
             */
            public Builder gcRule(GcRule gcRule) {
                this.gcRule = gcRule;
                return this;
            }

            /**
             * memoryScaleUpRule.
             */
            public Builder memoryScaleUpRule(MemoryScaleUpRule memoryScaleUpRule) {
                this.memoryScaleUpRule = memoryScaleUpRule;
                return this;
            }

            /**
             * oomScaleUpRule.
             */
            public Builder oomScaleUpRule(OomScaleUpRule oomScaleUpRule) {
                this.oomScaleUpRule = oomScaleUpRule;
                return this;
            }

            /**
             * slotBusyScaleUpRule.
             */
            public Builder slotBusyScaleUpRule(SlotBusyScaleUpRule slotBusyScaleUpRule) {
                this.slotBusyScaleUpRule = slotBusyScaleUpRule;
                return this;
            }

            public ScaleUpRules build() {
                return new ScaleUpRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class SilentPeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("beginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        private SilentPeriods(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilentPeriods create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Long beginTime; 
            private Long endTime; 
            private String level; 

            private Builder() {
            } 

            private Builder(SilentPeriods model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
                this.level = model.level;
            } 

            /**
             * beginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public SilentPeriods build() {
                return new SilentPeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link AutopilotPolicy} extends {@link TeaModel}
     *
     * <p>AutopilotPolicy</p>
     */
    public static class SilentPeriodConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("silentPeriods")
        private java.util.List<SilentPeriods> silentPeriods;

        private SilentPeriodConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.silentPeriods = builder.silentPeriods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilentPeriodConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return silentPeriods
         */
        public java.util.List<SilentPeriods> getSilentPeriods() {
            return this.silentPeriods;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<SilentPeriods> silentPeriods; 

            private Builder() {
            } 

            private Builder(SilentPeriodConfig model) {
                this.enabled = model.enabled;
                this.silentPeriods = model.silentPeriods;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * silentPeriods.
             */
            public Builder silentPeriods(java.util.List<SilentPeriods> silentPeriods) {
                this.silentPeriods = silentPeriods;
                return this;
            }

            public SilentPeriodConfig build() {
                return new SilentPeriodConfig(this);
            } 

        } 

    }
}
