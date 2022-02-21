// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateComputeInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeInstanceRequest</p>
 */
public class CreateComputeInstanceRequest extends Request {
    @Body
    @NameInMap("AcuUsed")
    @Validation(maximum = 99999, minimum = 1)
    private Long acuUsed;

    @Body
    @NameInMap("AlgorithmType")
    @Validation(required = true)
    private String algorithmType;

    @Body
    @NameInMap("Algorithms")
    @Validation(required = true)
    private java.util.List < Algorithms> algorithms;

    @Body
    @NameInMap("ComputePictureType")
    private String computePictureType;

    @Body
    @NameInMap("ComputePictureValue")
    private String computePictureValue;

    @Body
    @NameInMap("DatasourceType")
    private String datasourceType;

    @Body
    @NameInMap("Devices")
    @Validation(required = true)
    private java.util.List < Devices> devices;

    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("IsFrameExtraction")
    private String isFrameExtraction;

    @Body
    @NameInMap("IsPolling")
    private Boolean isPolling;

    @Body
    @NameInMap("OverallExecutionTime")
    private String overallExecutionTime;

    @Body
    @NameInMap("PicTopic")
    private String picTopic;

    @Body
    @NameInMap("PicType")
    private String picType;

    @Body
    @NameInMap("PollingConfigs")
    private String pollingConfigs;

    @Body
    @NameInMap("ProjectId")
    private String projectId;

    @Body
    @NameInMap("ScheduleCycleDate")
    private String scheduleCycleDate;

    @Body
    @NameInMap("ScheduleDay")
    private String scheduleDay;

    @Body
    @NameInMap("ScheduleDaySize")
    private String scheduleDaySize;

    @Body
    @NameInMap("ScheduleTimes")
    private String scheduleTimes;

    @Body
    @NameInMap("ScheduleType")
    @Validation(required = true)
    private String scheduleType;

    @Body
    @NameInMap("SliceExecutionTime")
    private String sliceExecutionTime;

    @Body
    @NameInMap("StorageUsed")
    private String storageUsed;

    private CreateComputeInstanceRequest(Builder builder) {
        super(builder);
        this.acuUsed = builder.acuUsed;
        this.algorithmType = builder.algorithmType;
        this.algorithms = builder.algorithms;
        this.computePictureType = builder.computePictureType;
        this.computePictureValue = builder.computePictureValue;
        this.datasourceType = builder.datasourceType;
        this.devices = builder.devices;
        this.instanceName = builder.instanceName;
        this.isFrameExtraction = builder.isFrameExtraction;
        this.isPolling = builder.isPolling;
        this.overallExecutionTime = builder.overallExecutionTime;
        this.picTopic = builder.picTopic;
        this.picType = builder.picType;
        this.pollingConfigs = builder.pollingConfigs;
        this.projectId = builder.projectId;
        this.scheduleCycleDate = builder.scheduleCycleDate;
        this.scheduleDay = builder.scheduleDay;
        this.scheduleDaySize = builder.scheduleDaySize;
        this.scheduleTimes = builder.scheduleTimes;
        this.scheduleType = builder.scheduleType;
        this.sliceExecutionTime = builder.sliceExecutionTime;
        this.storageUsed = builder.storageUsed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acuUsed
     */
    public Long getAcuUsed() {
        return this.acuUsed;
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return algorithms
     */
    public java.util.List < Algorithms> getAlgorithms() {
        return this.algorithms;
    }

    /**
     * @return computePictureType
     */
    public String getComputePictureType() {
        return this.computePictureType;
    }

    /**
     * @return computePictureValue
     */
    public String getComputePictureValue() {
        return this.computePictureValue;
    }

    /**
     * @return datasourceType
     */
    public String getDatasourceType() {
        return this.datasourceType;
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isFrameExtraction
     */
    public String getIsFrameExtraction() {
        return this.isFrameExtraction;
    }

    /**
     * @return isPolling
     */
    public Boolean getIsPolling() {
        return this.isPolling;
    }

    /**
     * @return overallExecutionTime
     */
    public String getOverallExecutionTime() {
        return this.overallExecutionTime;
    }

    /**
     * @return picTopic
     */
    public String getPicTopic() {
        return this.picTopic;
    }

    /**
     * @return picType
     */
    public String getPicType() {
        return this.picType;
    }

    /**
     * @return pollingConfigs
     */
    public String getPollingConfigs() {
        return this.pollingConfigs;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return scheduleCycleDate
     */
    public String getScheduleCycleDate() {
        return this.scheduleCycleDate;
    }

    /**
     * @return scheduleDay
     */
    public String getScheduleDay() {
        return this.scheduleDay;
    }

    /**
     * @return scheduleDaySize
     */
    public String getScheduleDaySize() {
        return this.scheduleDaySize;
    }

    /**
     * @return scheduleTimes
     */
    public String getScheduleTimes() {
        return this.scheduleTimes;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return sliceExecutionTime
     */
    public String getSliceExecutionTime() {
        return this.sliceExecutionTime;
    }

    /**
     * @return storageUsed
     */
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public static final class Builder extends Request.Builder<CreateComputeInstanceRequest, Builder> {
        private Long acuUsed; 
        private String algorithmType; 
        private java.util.List < Algorithms> algorithms; 
        private String computePictureType; 
        private String computePictureValue; 
        private String datasourceType; 
        private java.util.List < Devices> devices; 
        private String instanceName; 
        private String isFrameExtraction; 
        private Boolean isPolling; 
        private String overallExecutionTime; 
        private String picTopic; 
        private String picType; 
        private String pollingConfigs; 
        private String projectId; 
        private String scheduleCycleDate; 
        private String scheduleDay; 
        private String scheduleDaySize; 
        private String scheduleTimes; 
        private String scheduleType; 
        private String sliceExecutionTime; 
        private String storageUsed; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeInstanceRequest response) {
            super(response);
            this.acuUsed = response.acuUsed;
            this.algorithmType = response.algorithmType;
            this.algorithms = response.algorithms;
            this.computePictureType = response.computePictureType;
            this.computePictureValue = response.computePictureValue;
            this.datasourceType = response.datasourceType;
            this.devices = response.devices;
            this.instanceName = response.instanceName;
            this.isFrameExtraction = response.isFrameExtraction;
            this.isPolling = response.isPolling;
            this.overallExecutionTime = response.overallExecutionTime;
            this.picTopic = response.picTopic;
            this.picType = response.picType;
            this.pollingConfigs = response.pollingConfigs;
            this.projectId = response.projectId;
            this.scheduleCycleDate = response.scheduleCycleDate;
            this.scheduleDay = response.scheduleDay;
            this.scheduleDaySize = response.scheduleDaySize;
            this.scheduleTimes = response.scheduleTimes;
            this.scheduleType = response.scheduleType;
            this.sliceExecutionTime = response.sliceExecutionTime;
            this.storageUsed = response.storageUsed;
        } 

        /**
         * AcuUsed.
         */
        public Builder acuUsed(Long acuUsed) {
            this.putBodyParameter("AcuUsed", acuUsed);
            this.acuUsed = acuUsed;
            return this;
        }

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putBodyParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * Algorithms.
         */
        public Builder algorithms(java.util.List < Algorithms> algorithms) {
            this.putBodyParameter("Algorithms", algorithms);
            this.algorithms = algorithms;
            return this;
        }

        /**
         * ComputePictureType.
         */
        public Builder computePictureType(String computePictureType) {
            this.putBodyParameter("ComputePictureType", computePictureType);
            this.computePictureType = computePictureType;
            return this;
        }

        /**
         * ComputePictureValue.
         */
        public Builder computePictureValue(String computePictureValue) {
            this.putBodyParameter("ComputePictureValue", computePictureValue);
            this.computePictureValue = computePictureValue;
            return this;
        }

        /**
         * DatasourceType.
         */
        public Builder datasourceType(String datasourceType) {
            this.putBodyParameter("DatasourceType", datasourceType);
            this.datasourceType = datasourceType;
            return this;
        }

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.putBodyParameter("Devices", devices);
            this.devices = devices;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IsFrameExtraction.
         */
        public Builder isFrameExtraction(String isFrameExtraction) {
            this.putBodyParameter("IsFrameExtraction", isFrameExtraction);
            this.isFrameExtraction = isFrameExtraction;
            return this;
        }

        /**
         * IsPolling.
         */
        public Builder isPolling(Boolean isPolling) {
            this.putBodyParameter("IsPolling", isPolling);
            this.isPolling = isPolling;
            return this;
        }

        /**
         * OverallExecutionTime.
         */
        public Builder overallExecutionTime(String overallExecutionTime) {
            this.putBodyParameter("OverallExecutionTime", overallExecutionTime);
            this.overallExecutionTime = overallExecutionTime;
            return this;
        }

        /**
         * PicTopic.
         */
        public Builder picTopic(String picTopic) {
            this.putBodyParameter("PicTopic", picTopic);
            this.picTopic = picTopic;
            return this;
        }

        /**
         * PicType.
         */
        public Builder picType(String picType) {
            this.putBodyParameter("PicType", picType);
            this.picType = picType;
            return this;
        }

        /**
         * PollingConfigs.
         */
        public Builder pollingConfigs(String pollingConfigs) {
            this.putBodyParameter("PollingConfigs", pollingConfigs);
            this.pollingConfigs = pollingConfigs;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ScheduleCycleDate.
         */
        public Builder scheduleCycleDate(String scheduleCycleDate) {
            this.putBodyParameter("ScheduleCycleDate", scheduleCycleDate);
            this.scheduleCycleDate = scheduleCycleDate;
            return this;
        }

        /**
         * ScheduleDay.
         */
        public Builder scheduleDay(String scheduleDay) {
            this.putBodyParameter("ScheduleDay", scheduleDay);
            this.scheduleDay = scheduleDay;
            return this;
        }

        /**
         * ScheduleDaySize.
         */
        public Builder scheduleDaySize(String scheduleDaySize) {
            this.putBodyParameter("ScheduleDaySize", scheduleDaySize);
            this.scheduleDaySize = scheduleDaySize;
            return this;
        }

        /**
         * ScheduleTimes.
         */
        public Builder scheduleTimes(String scheduleTimes) {
            this.putBodyParameter("ScheduleTimes", scheduleTimes);
            this.scheduleTimes = scheduleTimes;
            return this;
        }

        /**
         * ScheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * SliceExecutionTime.
         */
        public Builder sliceExecutionTime(String sliceExecutionTime) {
            this.putBodyParameter("SliceExecutionTime", sliceExecutionTime);
            this.sliceExecutionTime = sliceExecutionTime;
            return this;
        }

        /**
         * StorageUsed.
         */
        public Builder storageUsed(String storageUsed) {
            this.putBodyParameter("StorageUsed", storageUsed);
            this.storageUsed = storageUsed;
            return this;
        }

        @Override
        public CreateComputeInstanceRequest build() {
            return new CreateComputeInstanceRequest(this);
        } 

    } 

    public static class Algorithms extends TeaModel {
        @NameInMap("AlgorithmId")
        @Validation(required = true)
        private String algorithmId;

        @NameInMap("AlgorithmName")
        @Validation(required = true)
        private String algorithmName;

        private Algorithms(Builder builder) {
            this.algorithmId = builder.algorithmId;
            this.algorithmName = builder.algorithmName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Algorithms create() {
            return builder().build();
        }

        /**
         * @return algorithmId
         */
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        /**
         * @return algorithmName
         */
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public static final class Builder {
            private String algorithmId; 
            private String algorithmName; 

            /**
             * AlgorithmId.
             */
            public Builder algorithmId(String algorithmId) {
                this.algorithmId = algorithmId;
                return this;
            }

            /**
             * AlgorithmName.
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            public Algorithms build() {
                return new Algorithms(this);
            } 

        } 

    }
    public static class Devices extends TeaModel {
        @NameInMap("BitRate")
        private String bitRate;

        @NameInMap("CodingFormat")
        private String codingFormat;

        @NameInMap("DeviceId")
        @Validation(required = true)
        private String deviceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResolvingPower")
        private String resolvingPower;

        @NameInMap("StartStream")
        @Validation(required = true)
        private Boolean startStream;

        private Devices(Builder builder) {
            this.bitRate = builder.bitRate;
            this.codingFormat = builder.codingFormat;
            this.deviceId = builder.deviceId;
            this.regionId = builder.regionId;
            this.resolvingPower = builder.resolvingPower;
            this.startStream = builder.startStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return bitRate
         */
        public String getBitRate() {
            return this.bitRate;
        }

        /**
         * @return codingFormat
         */
        public String getCodingFormat() {
            return this.codingFormat;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resolvingPower
         */
        public String getResolvingPower() {
            return this.resolvingPower;
        }

        /**
         * @return startStream
         */
        public Boolean getStartStream() {
            return this.startStream;
        }

        public static final class Builder {
            private String bitRate; 
            private String codingFormat; 
            private String deviceId; 
            private String regionId; 
            private String resolvingPower; 
            private Boolean startStream; 

            /**
             * BitRate.
             */
            public Builder bitRate(String bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * CodingFormat.
             */
            public Builder codingFormat(String codingFormat) {
                this.codingFormat = codingFormat;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResolvingPower.
             */
            public Builder resolvingPower(String resolvingPower) {
                this.resolvingPower = resolvingPower;
                return this;
            }

            /**
             * StartStream.
             */
            public Builder startStream(Boolean startStream) {
                this.startStream = startStream;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
