// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateAIInstanceRequest</p>
 */
public class CreateAIInstanceRequest extends Request {
    @Body
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private String algorithmId;

    @Body
    @NameInMap("AlgorithmName")
    @Validation(required = true)
    private String algorithmName;

    @Body
    @NameInMap("ComputeType")
    @Validation(required = true)
    private String computeType;

    @Body
    @NameInMap("DataSource")
    @Validation(required = true)
    private String dataSource;

    @Body
    @NameInMap("DataType")
    @Validation(required = true)
    private String dataType;

    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("ScheduleCycleDates")
    private java.util.List < Long > scheduleCycleDates;

    @Body
    @NameInMap("ScheduleTimes")
    @Validation(required = true)
    private java.util.List < ScheduleTimes> scheduleTimes;

    @Body
    @NameInMap("ScheduleType")
    @Validation(required = true)
    private String scheduleType;

    @Body
    @NameInMap("Spf")
    private Long spf;

    private CreateAIInstanceRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.algorithmName = builder.algorithmName;
        this.computeType = builder.computeType;
        this.dataSource = builder.dataSource;
        this.dataType = builder.dataType;
        this.instanceName = builder.instanceName;
        this.projectId = builder.projectId;
        this.scheduleCycleDates = builder.scheduleCycleDates;
        this.scheduleTimes = builder.scheduleTimes;
        this.scheduleType = builder.scheduleType;
        this.spf = builder.spf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return computeType
     */
    public String getComputeType() {
        return this.computeType;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return scheduleCycleDates
     */
    public java.util.List < Long > getScheduleCycleDates() {
        return this.scheduleCycleDates;
    }

    /**
     * @return scheduleTimes
     */
    public java.util.List < ScheduleTimes> getScheduleTimes() {
        return this.scheduleTimes;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return spf
     */
    public Long getSpf() {
        return this.spf;
    }

    public static final class Builder extends Request.Builder<CreateAIInstanceRequest, Builder> {
        private String algorithmId; 
        private String algorithmName; 
        private String computeType; 
        private String dataSource; 
        private String dataType; 
        private String instanceName; 
        private String projectId; 
        private java.util.List < Long > scheduleCycleDates; 
        private java.util.List < ScheduleTimes> scheduleTimes; 
        private String scheduleType; 
        private Long spf; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIInstanceRequest response) {
            super(response);
            this.algorithmId = response.algorithmId;
            this.algorithmName = response.algorithmName;
            this.computeType = response.computeType;
            this.dataSource = response.dataSource;
            this.dataType = response.dataType;
            this.instanceName = response.instanceName;
            this.projectId = response.projectId;
            this.scheduleCycleDates = response.scheduleCycleDates;
            this.scheduleTimes = response.scheduleTimes;
            this.scheduleType = response.scheduleType;
            this.spf = response.spf;
        } 

        /**
         * 算子Id
         */
        public Builder algorithmId(String algorithmId) {
            this.putBodyParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * 算法名称
         */
        public Builder algorithmName(String algorithmName) {
            this.putBodyParameter("AlgorithmName", algorithmName);
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * 计算类型
         */
        public Builder computeType(String computeType) {
            this.putBodyParameter("ComputeType", computeType);
            this.computeType = computeType;
            return this;
        }

        /**
         * 数据来源
         */
        public Builder dataSource(String dataSource) {
            this.putBodyParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * 数据类型
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 所属项目Id
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ScheduleType为EVERY_WEEK、EVERY_MONTH时必填
         */
        public Builder scheduleCycleDates(java.util.List < Long > scheduleCycleDates) {
            this.putBodyParameter("ScheduleCycleDates", scheduleCycleDates);
            this.scheduleCycleDates = scheduleCycleDates;
            return this;
        }

        /**
         * 执行时间段，支持多段，指定多段时不能重合交错。
         */
        public Builder scheduleTimes(java.util.List < ScheduleTimes> scheduleTimes) {
            this.putBodyParameter("ScheduleTimes", scheduleTimes);
            this.scheduleTimes = scheduleTimes;
            return this;
        }

        /**
         * 调度类型
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * 多少秒抽取1帧，取值范围[0, 3600]。 0表示不抽帧。
         */
        public Builder spf(Long spf) {
            this.putBodyParameter("Spf", spf);
            this.spf = spf;
            return this;
        }

        @Override
        public CreateAIInstanceRequest build() {
            return new CreateAIInstanceRequest(this);
        } 

    } 

    public static class ScheduleTimes extends TeaModel {
        @NameInMap("EndTime")
        @Validation(required = true)
        private String endTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        private String startTime;

        private ScheduleTimes(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleTimes create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * 结束执行时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 开始执行时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ScheduleTimes build() {
                return new ScheduleTimes(this);
            } 

        } 

    }
}
