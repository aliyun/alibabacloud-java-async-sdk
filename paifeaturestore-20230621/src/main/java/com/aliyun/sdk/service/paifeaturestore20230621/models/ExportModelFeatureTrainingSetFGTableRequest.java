// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportModelFeatureTrainingSetFGTableRequest} extends {@link RequestModel}
 *
 * <p>ExportModelFeatureTrainingSetFGTableRequest</p>
 */
public class ExportModelFeatureTrainingSetFGTableRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ModelFeatureId")
    @Validation(required = true)
    private String modelFeatureId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TrainingSetFgConfig")
    @Validation(required = true)
    private TrainingSetFgConfig trainingSetFgConfig;

    private ExportModelFeatureTrainingSetFGTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.regionId = builder.regionId;
        this.trainingSetFgConfig = builder.trainingSetFgConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportModelFeatureTrainingSetFGTableRequest create() {
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
     * @return trainingSetFgConfig
     */
    public TrainingSetFgConfig getTrainingSetFgConfig() {
        return this.trainingSetFgConfig;
    }

    public static final class Builder extends Request.Builder<ExportModelFeatureTrainingSetFGTableRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String regionId; 
        private TrainingSetFgConfig trainingSetFgConfig; 

        private Builder() {
            super();
        } 

        private Builder(ExportModelFeatureTrainingSetFGTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.regionId = request.regionId;
            this.trainingSetFgConfig = request.trainingSetFgConfig;
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
         * TrainingSetFgConfig.
         */
        public Builder trainingSetFgConfig(TrainingSetFgConfig trainingSetFgConfig) {
            this.putBodyParameter("TrainingSetFgConfig", trainingSetFgConfig);
            this.trainingSetFgConfig = trainingSetFgConfig;
            return this;
        }

        @Override
        public ExportModelFeatureTrainingSetFGTableRequest build() {
            return new ExportModelFeatureTrainingSetFGTableRequest(this);
        } 

    } 

    public static class TrainingSetFgConfig extends TeaModel {
        @NameInMap("FgJsonName")
        private String fgJsonName;

        @NameInMap("JarName")
        private String jarName;

        @NameInMap("Partitions")
        @Validation(required = true)
        private java.util.Map < String, java.util.Map<String, ?>> partitions;

        private TrainingSetFgConfig(Builder builder) {
            this.fgJsonName = builder.fgJsonName;
            this.jarName = builder.jarName;
            this.partitions = builder.partitions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainingSetFgConfig create() {
            return builder().build();
        }

        /**
         * @return fgJsonName
         */
        public String getFgJsonName() {
            return this.fgJsonName;
        }

        /**
         * @return jarName
         */
        public String getJarName() {
            return this.jarName;
        }

        /**
         * @return partitions
         */
        public java.util.Map < String, java.util.Map<String, ?>> getPartitions() {
            return this.partitions;
        }

        public static final class Builder {
            private String fgJsonName; 
            private String jarName; 
            private java.util.Map < String, java.util.Map<String, ?>> partitions; 

            /**
             * FgJsonName.
             */
            public Builder fgJsonName(String fgJsonName) {
                this.fgJsonName = fgJsonName;
                return this;
            }

            /**
             * JarName.
             */
            public Builder jarName(String jarName) {
                this.jarName = jarName;
                return this;
            }

            /**
             * Partitions.
             */
            public Builder partitions(java.util.Map < String, java.util.Map<String, ?>> partitions) {
                this.partitions = partitions;
                return this;
            }

            public TrainingSetFgConfig build() {
                return new TrainingSetFgConfig(this);
            } 

        } 

    }
}
