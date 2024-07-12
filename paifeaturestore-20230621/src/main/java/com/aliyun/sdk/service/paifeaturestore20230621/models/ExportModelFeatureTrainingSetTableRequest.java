// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportModelFeatureTrainingSetTableRequest} extends {@link RequestModel}
 *
 * <p>ExportModelFeatureTrainingSetTableRequest</p>
 */
public class ExportModelFeatureTrainingSetTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelFeatureId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelFeatureId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureViewConfig")
    private java.util.Map < String, FeatureViewConfigValue > featureViewConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelInputConfig")
    private LabelInputConfig labelInputConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RealTimeIterateInterval")
    private Long realTimeIterateInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrainingSetConfig")
    private TrainingSetConfig trainingSetConfig;

    private ExportModelFeatureTrainingSetTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.regionId = builder.regionId;
        this.featureViewConfig = builder.featureViewConfig;
        this.labelInputConfig = builder.labelInputConfig;
        this.realTimeIterateInterval = builder.realTimeIterateInterval;
        this.trainingSetConfig = builder.trainingSetConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportModelFeatureTrainingSetTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return featureViewConfig
     */
    public java.util.Map < String, FeatureViewConfigValue > getFeatureViewConfig() {
        return this.featureViewConfig;
    }

    /**
     * @return labelInputConfig
     */
    public LabelInputConfig getLabelInputConfig() {
        return this.labelInputConfig;
    }

    /**
     * @return realTimeIterateInterval
     */
    public Long getRealTimeIterateInterval() {
        return this.realTimeIterateInterval;
    }

    /**
     * @return trainingSetConfig
     */
    public TrainingSetConfig getTrainingSetConfig() {
        return this.trainingSetConfig;
    }

    public static final class Builder extends Request.Builder<ExportModelFeatureTrainingSetTableRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String regionId; 
        private java.util.Map < String, FeatureViewConfigValue > featureViewConfig; 
        private LabelInputConfig labelInputConfig; 
        private Long realTimeIterateInterval; 
        private TrainingSetConfig trainingSetConfig; 

        private Builder() {
            super();
        } 

        private Builder(ExportModelFeatureTrainingSetTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.regionId = request.regionId;
            this.featureViewConfig = request.featureViewConfig;
            this.labelInputConfig = request.labelInputConfig;
            this.realTimeIterateInterval = request.realTimeIterateInterval;
            this.trainingSetConfig = request.trainingSetConfig;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModelFeatureId.
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.putPathParameter("ModelFeatureId", modelFeatureId);
            this.modelFeatureId = modelFeatureId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * FeatureViewConfig.
         */
        public Builder featureViewConfig(java.util.Map < String, FeatureViewConfigValue > featureViewConfig) {
            this.putBodyParameter("FeatureViewConfig", featureViewConfig);
            this.featureViewConfig = featureViewConfig;
            return this;
        }

        /**
         * LabelInputConfig.
         */
        public Builder labelInputConfig(LabelInputConfig labelInputConfig) {
            this.putBodyParameter("LabelInputConfig", labelInputConfig);
            this.labelInputConfig = labelInputConfig;
            return this;
        }

        /**
         * RealTimeIterateInterval.
         */
        public Builder realTimeIterateInterval(Long realTimeIterateInterval) {
            this.putBodyParameter("RealTimeIterateInterval", realTimeIterateInterval);
            this.realTimeIterateInterval = realTimeIterateInterval;
            return this;
        }

        /**
         * TrainingSetConfig.
         */
        public Builder trainingSetConfig(TrainingSetConfig trainingSetConfig) {
            this.putBodyParameter("TrainingSetConfig", trainingSetConfig);
            this.trainingSetConfig = trainingSetConfig;
            return this;
        }

        @Override
        public ExportModelFeatureTrainingSetTableRequest build() {
            return new ExportModelFeatureTrainingSetTableRequest(this);
        } 

    } 

    public static class LabelInputConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("Partitions")
        private java.util.Map < String, java.util.Map<String, ?>> partitions;

        private LabelInputConfig(Builder builder) {
            this.eventTime = builder.eventTime;
            this.partitions = builder.partitions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelInputConfig create() {
            return builder().build();
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return partitions
         */
        public java.util.Map < String, java.util.Map<String, ?>> getPartitions() {
            return this.partitions;
        }

        public static final class Builder {
            private String eventTime; 
            private java.util.Map < String, java.util.Map<String, ?>> partitions; 

            /**
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * Partitions.
             */
            public Builder partitions(java.util.Map < String, java.util.Map<String, ?>> partitions) {
                this.partitions = partitions;
                return this;
            }

            public LabelInputConfig build() {
                return new LabelInputConfig(this);
            } 

        } 

    }
    public static class TrainingSetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Partitions")
        private java.util.Map < String, java.util.Map<String, ?>> partitions;

        private TrainingSetConfig(Builder builder) {
            this.partitions = builder.partitions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainingSetConfig create() {
            return builder().build();
        }

        /**
         * @return partitions
         */
        public java.util.Map < String, java.util.Map<String, ?>> getPartitions() {
            return this.partitions;
        }

        public static final class Builder {
            private java.util.Map < String, java.util.Map<String, ?>> partitions; 

            /**
             * Partitions.
             */
            public Builder partitions(java.util.Map < String, java.util.Map<String, ?>> partitions) {
                this.partitions = partitions;
                return this;
            }

            public TrainingSetConfig build() {
                return new TrainingSetConfig(this);
            } 

        } 

    }
}
