// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchTaskInfoByVersionResponseBody</p>
 */
public class GetBatchTaskInfoByVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private GetBatchTaskInfoByVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchTaskInfoByVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TaskInfo taskInfo; 

        private Builder() {
        } 

        private Builder(GetBatchTaskInfoByVersionResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskInfo = model.taskInfo;
        } 

        /**
         * <p>The error code. OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The node details.</p>
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public GetBatchTaskInfoByVersionResponseBody build() {
            return new GetBatchTaskInfoByVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class CustomScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IntervalUnit")
        private String intervalUnit;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private CustomScheduleConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.interval = builder.interval;
            this.intervalUnit = builder.intervalUnit;
            this.schedulePeriod = builder.schedulePeriod;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return intervalUnit
         */
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        /**
         * @return schedulePeriod
         */
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Integer interval; 
            private String intervalUnit; 
            private String schedulePeriod; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CustomScheduleConfig model) {
                this.endTime = model.endTime;
                this.interval = model.interval;
                this.intervalUnit = model.intervalUnit;
                this.schedulePeriod = model.schedulePeriod;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>20:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The custom interval.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The unit of the interval. Valid values: MINUTE and HOUR.</p>
             * 
             * <strong>example:</strong>
             * <p>HOUR</p>
             */
            public Builder intervalUnit(String intervalUnit) {
                this.intervalUnit = intervalUnit;
                return this;
            }

            /**
             * <p>The scheduling period.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>The start time in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CustomScheduleConfig build() {
                return new CustomScheduleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class DatabricksPythonConnectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevHttpPath")
        private String devHttpPath;

        @com.aliyun.core.annotation.NameInMap("EnableDatabricksPythonConnect")
        private Boolean enableDatabricksPythonConnect;

        @com.aliyun.core.annotation.NameInMap("ProdHttpPath")
        private String prodHttpPath;

        private DatabricksPythonConnectInfo(Builder builder) {
            this.devHttpPath = builder.devHttpPath;
            this.enableDatabricksPythonConnect = builder.enableDatabricksPythonConnect;
            this.prodHttpPath = builder.prodHttpPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabricksPythonConnectInfo create() {
            return builder().build();
        }

        /**
         * @return devHttpPath
         */
        public String getDevHttpPath() {
            return this.devHttpPath;
        }

        /**
         * @return enableDatabricksPythonConnect
         */
        public Boolean getEnableDatabricksPythonConnect() {
            return this.enableDatabricksPythonConnect;
        }

        /**
         * @return prodHttpPath
         */
        public String getProdHttpPath() {
            return this.prodHttpPath;
        }

        public static final class Builder {
            private String devHttpPath; 
            private Boolean enableDatabricksPythonConnect; 
            private String prodHttpPath; 

            private Builder() {
            } 

            private Builder(DatabricksPythonConnectInfo model) {
                this.devHttpPath = model.devHttpPath;
                this.enableDatabricksPythonConnect = model.enableDatabricksPythonConnect;
                this.prodHttpPath = model.prodHttpPath;
            } 

            /**
             * <p>The HTTP path in the development environment.</p>
             * 
             * <strong>example:</strong>
             * <p>/sql/1.0/warehouses/dev</p>
             */
            public Builder devHttpPath(String devHttpPath) {
                this.devHttpPath = devHttpPath;
                return this;
            }

            /**
             * <p>Specifies whether to enable Databricks Python Connect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDatabricksPythonConnect(Boolean enableDatabricksPythonConnect) {
                this.enableDatabricksPythonConnect = enableDatabricksPythonConnect;
                return this;
            }

            /**
             * <p>The HTTP path in the production environment.</p>
             * 
             * <strong>example:</strong>
             * <p>/sql/1.0/warehouses/prod</p>
             */
            public Builder prodHttpPath(String prodHttpPath) {
                this.prodHttpPath = prodHttpPath;
                return this;
            }

            public DatabricksPythonConnectInfo build() {
                return new DatabricksPythonConnectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class ExecuteRerunConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomRerunInterval")
        private String customRerunInterval;

        @com.aliyun.core.annotation.NameInMap("CustomRerunTimes")
        private String customRerunTimes;

        @com.aliyun.core.annotation.NameInMap("FollowSystem")
        private Boolean followSystem;

        private ExecuteRerunConfig(Builder builder) {
            this.customRerunInterval = builder.customRerunInterval;
            this.customRerunTimes = builder.customRerunTimes;
            this.followSystem = builder.followSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteRerunConfig create() {
            return builder().build();
        }

        /**
         * @return customRerunInterval
         */
        public String getCustomRerunInterval() {
            return this.customRerunInterval;
        }

        /**
         * @return customRerunTimes
         */
        public String getCustomRerunTimes() {
            return this.customRerunTimes;
        }

        /**
         * @return followSystem
         */
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

        public static final class Builder {
            private String customRerunInterval; 
            private String customRerunTimes; 
            private Boolean followSystem; 

            private Builder() {
            } 

            private Builder(ExecuteRerunConfig model) {
                this.customRerunInterval = model.customRerunInterval;
                this.customRerunTimes = model.customRerunTimes;
                this.followSystem = model.followSystem;
            } 

            /**
             * <p>The custom retry interval for failed executions.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder customRerunInterval(String customRerunInterval) {
                this.customRerunInterval = customRerunInterval;
                return this;
            }

            /**
             * <p>The custom number of retries for failed executions.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder customRerunTimes(String customRerunTimes) {
                this.customRerunTimes = customRerunTimes;
                return this;
            }

            /**
             * <p>Specifies whether to follow the system retry configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder followSystem(Boolean followSystem) {
                this.followSystem = followSystem;
                return this;
            }

            public ExecuteRerunConfig build() {
                return new ExecuteRerunConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class ExecuteTimeOutConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomValues")
        private String customValues;

        @com.aliyun.core.annotation.NameInMap("FollowSystem")
        private Boolean followSystem;

        private ExecuteTimeOutConfig(Builder builder) {
            this.customValues = builder.customValues;
            this.followSystem = builder.followSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteTimeOutConfig create() {
            return builder().build();
        }

        /**
         * @return customValues
         */
        public String getCustomValues() {
            return this.customValues;
        }

        /**
         * @return followSystem
         */
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

        public static final class Builder {
            private String customValues; 
            private Boolean followSystem; 

            private Builder() {
            } 

            private Builder(ExecuteTimeOutConfig model) {
                this.customValues = model.customValues;
                this.followSystem = model.followSystem;
            } 

            /**
             * <p>The custom timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder customValues(String customValues) {
                this.customValues = customValues;
                return this;
            }

            /**
             * <p>Specifies whether to follow the system retry configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder followSystem(Boolean followSystem) {
                this.followSystem = followSystem;
                return this;
            }

            public ExecuteTimeOutConfig build() {
                return new ExecuteTimeOutConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class PaiConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("WorkSpaceId")
        private String workSpaceId;

        private PaiConfig(Builder builder) {
            this.experimentId = builder.experimentId;
            this.region = builder.region;
            this.workSpaceId = builder.workSpaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaiConfig create() {
            return builder().build();
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return workSpaceId
         */
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

        public static final class Builder {
            private String experimentId; 
            private String region; 
            private String workSpaceId; 

            private Builder() {
            } 

            private Builder(PaiConfig model) {
                this.experimentId = model.experimentId;
                this.region = model.region;
                this.workSpaceId = model.workSpaceId;
            } 

            /**
             * <p>The PAI experiment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>789012</p>
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>The PAI region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The PAI workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder workSpaceId(String workSpaceId) {
                this.workSpaceId = workSpaceId;
                return this;
            }

            public PaiConfig build() {
                return new PaiConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>Value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class PythonModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PythonVersion")
        private String pythonVersion;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PythonModuleList(Builder builder) {
            this.moduleId = builder.moduleId;
            this.name = builder.name;
            this.pythonVersion = builder.pythonVersion;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PythonModuleList create() {
            return builder().build();
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pythonVersion
         */
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long moduleId; 
            private String name; 
            private String pythonVersion; 
            private String version; 

            private Builder() {
            } 

            private Builder(PythonModuleList model) {
                this.moduleId = model.moduleId;
                this.name = model.name;
                this.pythonVersion = model.pythonVersion;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * <p>The name of the third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>pandas</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Python version required by the third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>Python 3.7</p>
             */
            public Builder pythonVersion(String pythonVersion) {
                this.pythonVersion = pythonVersion;
                return this;
            }

            /**
             * <p>The version of the third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>1.3.5</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PythonModuleList build() {
                return new PythonModuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class SparkClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SparkClientVersion")
        private String sparkClientVersion;

        private SparkClientInfo(Builder builder) {
            this.sparkClientVersion = builder.sparkClientVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparkClientInfo create() {
            return builder().build();
        }

        /**
         * @return sparkClientVersion
         */
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

        public static final class Builder {
            private String sparkClientVersion; 

            private Builder() {
            } 

            private Builder(SparkClientInfo model) {
                this.sparkClientVersion = model.sparkClientVersion;
            } 

            /**
             * <p>The name of the Spark client.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder sparkClientVersion(String sparkClientVersion) {
                this.sparkClientVersion = sparkClientVersion;
                return this;
            }

            public SparkClientInfo build() {
                return new SparkClientInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class DependPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodOffset")
        private Integer periodOffset;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
        private String periodType;

        private DependPeriod(Builder builder) {
            this.periodOffset = builder.periodOffset;
            this.periodType = builder.periodType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependPeriod create() {
            return builder().build();
        }

        /**
         * @return periodOffset
         */
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        public static final class Builder {
            private Integer periodOffset; 
            private String periodType; 

            private Builder() {
            } 

            private Builder(DependPeriod model) {
                this.periodOffset = model.periodOffset;
                this.periodType = model.periodType;
            } 

            /**
             * <p>The period offset. This parameter is required when the PeriodType parameter is set to LAST_N_PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodOffset(Integer periodOffset) {
                this.periodOffset = periodOffset;
                return this;
            }

            /**
             * <p>The dependency period type. Valid values:</p>
             * <ul>
             * <li>CURRENT_PERIOD: Current period.</li>
             * <li>LAST_PERIOD: Last period.</li>
             * <li>LAST_N_PERIOD: Last N periods.</li>
             * <li>LAST_24_HOUR: Last 24 hours.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CURRENT_PERIOD</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            public DependPeriod build() {
                return new DependPeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class UpStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependPeriod")
        private DependPeriod dependPeriod;

        @com.aliyun.core.annotation.NameInMap("DependStrategy")
        private String dependStrategy;

        @com.aliyun.core.annotation.NameInMap("FieldList")
        private java.util.List<String> fieldList;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PeriodDiff")
        private Integer periodDiff;

        @com.aliyun.core.annotation.NameInMap("SourceNodeEnabled")
        private Boolean sourceNodeEnabled;

        @com.aliyun.core.annotation.NameInMap("SourceNodeId")
        private String sourceNodeId;

        @com.aliyun.core.annotation.NameInMap("SourceNodeName")
        private String sourceNodeName;

        @com.aliyun.core.annotation.NameInMap("SourceNodeOutputName")
        private String sourceNodeOutputName;

        @com.aliyun.core.annotation.NameInMap("SourceNodeUserName")
        private String sourceNodeUserName;

        @com.aliyun.core.annotation.NameInMap("SourceTableName")
        private String sourceTableName;

        private UpStreamList(Builder builder) {
            this.dependPeriod = builder.dependPeriod;
            this.dependStrategy = builder.dependStrategy;
            this.fieldList = builder.fieldList;
            this.nodeType = builder.nodeType;
            this.periodDiff = builder.periodDiff;
            this.sourceNodeEnabled = builder.sourceNodeEnabled;
            this.sourceNodeId = builder.sourceNodeId;
            this.sourceNodeName = builder.sourceNodeName;
            this.sourceNodeOutputName = builder.sourceNodeOutputName;
            this.sourceNodeUserName = builder.sourceNodeUserName;
            this.sourceTableName = builder.sourceTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpStreamList create() {
            return builder().build();
        }

        /**
         * @return dependPeriod
         */
        public DependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        /**
         * @return dependStrategy
         */
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        /**
         * @return fieldList
         */
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return periodDiff
         */
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        /**
         * @return sourceNodeEnabled
         */
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        /**
         * @return sourceNodeId
         */
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        /**
         * @return sourceNodeName
         */
        public String getSourceNodeName() {
            return this.sourceNodeName;
        }

        /**
         * @return sourceNodeOutputName
         */
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        /**
         * @return sourceNodeUserName
         */
        public String getSourceNodeUserName() {
            return this.sourceNodeUserName;
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public static final class Builder {
            private DependPeriod dependPeriod; 
            private String dependStrategy; 
            private java.util.List<String> fieldList; 
            private String nodeType; 
            private Integer periodDiff; 
            private Boolean sourceNodeEnabled; 
            private String sourceNodeId; 
            private String sourceNodeName; 
            private String sourceNodeOutputName; 
            private String sourceNodeUserName; 
            private String sourceTableName; 

            private Builder() {
            } 

            private Builder(UpStreamList model) {
                this.dependPeriod = model.dependPeriod;
                this.dependStrategy = model.dependStrategy;
                this.fieldList = model.fieldList;
                this.nodeType = model.nodeType;
                this.periodDiff = model.periodDiff;
                this.sourceNodeEnabled = model.sourceNodeEnabled;
                this.sourceNodeId = model.sourceNodeId;
                this.sourceNodeName = model.sourceNodeName;
                this.sourceNodeOutputName = model.sourceNodeOutputName;
                this.sourceNodeUserName = model.sourceNodeUserName;
                this.sourceTableName = model.sourceTableName;
            } 

            /**
             * <p>The dependency period.</p>
             */
            public Builder dependPeriod(DependPeriod dependPeriod) {
                this.dependPeriod = dependPeriod;
                return this;
            }

            /**
             * <p>The dependency strategy. Valid values:</p>
             * <ul>
             * <li>ALL: All.</li>
             * <li>FIRST: First.</li>
             * <li>LAST: Last.</li>
             * <li>NEAR: Nearest.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LAST</p>
             */
            public Builder dependStrategy(String dependStrategy) {
                this.dependStrategy = dependStrategy;
                return this;
            }

            /**
             * <p>The dependent logical table fields.</p>
             */
            public Builder fieldList(java.util.List<String> fieldList) {
                this.fieldList = fieldList;
                return this;
            }

            /**
             * <p>The upstream dependency node type. Valid values:</p>
             * <ul>
             * <li>PHYSICAL: Physical node.</li>
             * <li>LOGICAL: Logical table dependency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The period difference. A value of 0 indicates a same-period dependency. A positive integer indicates a dependency on the previous N periods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodDiff(Integer periodDiff) {
                this.periodDiff = periodDiff;
                return this;
            }

            /**
             * <p>Specifies whether the upstream node is enabled.</p>
             */
            public Builder sourceNodeEnabled(Boolean sourceNodeEnabled) {
                this.sourceNodeEnabled = sourceNodeEnabled;
                return this;
            }

            /**
             * <p>The ID of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>n_2001</p>
             */
            public Builder sourceNodeId(String sourceNodeId) {
                this.sourceNodeId = sourceNodeId;
                return this;
            }

            /**
             * <p>The name of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input1</p>
             */
            public Builder sourceNodeName(String sourceNodeName) {
                this.sourceNodeName = sourceNodeName;
                return this;
            }

            /**
             * <p>The output name of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input1</p>
             */
            public Builder sourceNodeOutputName(String sourceNodeOutputName) {
                this.sourceNodeOutputName = sourceNodeOutputName;
                return this;
            }

            /**
             * <p>The upstream username.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder sourceNodeUserName(String sourceNodeUserName) {
                this.sourceNodeUserName = sourceNodeUserName;
                return this;
            }

            /**
             * <p>The name of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input1</p>
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            public UpStreamList build() {
                return new UpStreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskInfoByVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskInfoByVersionResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CodeTemplateId")
        private String codeTemplateId;

        @com.aliyun.core.annotation.NameInMap("CodeTemplateVersion")
        private Integer codeTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("CpuResource")
        private String cpuResource;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomScheduleConfig")
        private CustomScheduleConfig customScheduleConfig;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private String dagId;

        @com.aliyun.core.annotation.NameInMap("DataSourceCatalog")
        private String dataSourceCatalog;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceSchema")
        private String dataSourceSchema;

        @com.aliyun.core.annotation.NameInMap("DatabricksPythonConnectInfo")
        private DatabricksPythonConnectInfo databricksPythonConnectInfo;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerIdList")
        private java.util.List<String> developOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerNameList")
        private java.util.List<String> developOwnerNameList;

        @com.aliyun.core.annotation.NameInMap("ExecuteRerunConfig")
        private ExecuteRerunConfig executeRerunConfig;

        @com.aliyun.core.annotation.NameInMap("ExecuteTimeOutConfig")
        private ExecuteTimeOutConfig executeTimeOutConfig;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("HasDevNode")
        private Boolean hasDevNode;

        @com.aliyun.core.annotation.NameInMap("MemoryResource")
        private String memoryResource;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedPublish")
        private Boolean needPublish;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeFrom")
        private String nodeFrom;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeOutputNameList")
        private java.util.List<String> nodeOutputNameList;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("OperatorUserId")
        private String operatorUserId;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerIdList")
        private java.util.List<String> opsOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerNameList")
        private java.util.List<String> opsOwnerNameList;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("PaiConfig")
        private PaiConfig paiConfig;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("Paused")
        private Boolean paused;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Published")
        private Boolean published;

        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<PythonModuleList> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("PythonVersion")
        private String pythonVersion;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Rerunable")
        private Boolean rerunable;

        @com.aliyun.core.annotation.NameInMap("RetryOnTimeoutEnable")
        private Boolean retryOnTimeoutEnable;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private Integer scheduleType;

        @com.aliyun.core.annotation.NameInMap("SparkClientInfo")
        private SparkClientInfo sparkClientInfo;

        @com.aliyun.core.annotation.NameInMap("SparkDynamicResourceSwitch")
        private Boolean sparkDynamicResourceSwitch;

        @com.aliyun.core.annotation.NameInMap("SparkResourceEffectScope")
        private String sparkResourceEffectScope;

        @com.aliyun.core.annotation.NameInMap("SparkSqlResourceConfigMap")
        private String sparkSqlResourceConfigMap;

        @com.aliyun.core.annotation.NameInMap("SparkVersion")
        private String sparkVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Integer taskType;

        @com.aliyun.core.annotation.NameInMap("UpStreamList")
        private java.util.List<UpStreamList> upStreamList;

        private TaskInfo(Builder builder) {
            this.code = builder.code;
            this.codeTemplateId = builder.codeTemplateId;
            this.codeTemplateVersion = builder.codeTemplateVersion;
            this.cpuResource = builder.cpuResource;
            this.cronExpression = builder.cronExpression;
            this.customScheduleConfig = builder.customScheduleConfig;
            this.dagId = builder.dagId;
            this.dataSourceCatalog = builder.dataSourceCatalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSchema = builder.dataSourceSchema;
            this.databricksPythonConnectInfo = builder.databricksPythonConnectInfo;
            this.developOwnerIdList = builder.developOwnerIdList;
            this.developOwnerNameList = builder.developOwnerNameList;
            this.executeRerunConfig = builder.executeRerunConfig;
            this.executeTimeOutConfig = builder.executeTimeOutConfig;
            this.fileId = builder.fileId;
            this.hasDevNode = builder.hasDevNode;
            this.memoryResource = builder.memoryResource;
            this.name = builder.name;
            this.needPublish = builder.needPublish;
            this.nodeDescription = builder.nodeDescription;
            this.nodeFrom = builder.nodeFrom;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeOutputNameList = builder.nodeOutputNameList;
            this.nodeStatus = builder.nodeStatus;
            this.operatorUserId = builder.operatorUserId;
            this.opsOwnerIdList = builder.opsOwnerIdList;
            this.opsOwnerNameList = builder.opsOwnerNameList;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.paiConfig = builder.paiConfig;
            this.paramList = builder.paramList;
            this.paused = builder.paused;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.published = builder.published;
            this.pythonModuleList = builder.pythonModuleList;
            this.pythonVersion = builder.pythonVersion;
            this.remark = builder.remark;
            this.rerunable = builder.rerunable;
            this.retryOnTimeoutEnable = builder.retryOnTimeoutEnable;
            this.schedulePeriod = builder.schedulePeriod;
            this.scheduleType = builder.scheduleType;
            this.sparkClientInfo = builder.sparkClientInfo;
            this.sparkDynamicResourceSwitch = builder.sparkDynamicResourceSwitch;
            this.sparkResourceEffectScope = builder.sparkResourceEffectScope;
            this.sparkSqlResourceConfigMap = builder.sparkSqlResourceConfigMap;
            this.sparkVersion = builder.sparkVersion;
            this.status = builder.status;
            this.taskType = builder.taskType;
            this.upStreamList = builder.upStreamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return codeTemplateId
         */
        public String getCodeTemplateId() {
            return this.codeTemplateId;
        }

        /**
         * @return codeTemplateVersion
         */
        public Integer getCodeTemplateVersion() {
            return this.codeTemplateVersion;
        }

        /**
         * @return cpuResource
         */
        public String getCpuResource() {
            return this.cpuResource;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return customScheduleConfig
         */
        public CustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        /**
         * @return dagId
         */
        public String getDagId() {
            return this.dagId;
        }

        /**
         * @return dataSourceCatalog
         */
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceSchema
         */
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        /**
         * @return databricksPythonConnectInfo
         */
        public DatabricksPythonConnectInfo getDatabricksPythonConnectInfo() {
            return this.databricksPythonConnectInfo;
        }

        /**
         * @return developOwnerIdList
         */
        public java.util.List<String> getDevelopOwnerIdList() {
            return this.developOwnerIdList;
        }

        /**
         * @return developOwnerNameList
         */
        public java.util.List<String> getDevelopOwnerNameList() {
            return this.developOwnerNameList;
        }

        /**
         * @return executeRerunConfig
         */
        public ExecuteRerunConfig getExecuteRerunConfig() {
            return this.executeRerunConfig;
        }

        /**
         * @return executeTimeOutConfig
         */
        public ExecuteTimeOutConfig getExecuteTimeOutConfig() {
            return this.executeTimeOutConfig;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return hasDevNode
         */
        public Boolean getHasDevNode() {
            return this.hasDevNode;
        }

        /**
         * @return memoryResource
         */
        public String getMemoryResource() {
            return this.memoryResource;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needPublish
         */
        public Boolean getNeedPublish() {
            return this.needPublish;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeFrom
         */
        public String getNodeFrom() {
            return this.nodeFrom;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeOutputNameList
         */
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        /**
         * @return nodeStatus
         */
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return operatorUserId
         */
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        /**
         * @return opsOwnerIdList
         */
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        /**
         * @return opsOwnerNameList
         */
        public java.util.List<String> getOpsOwnerNameList() {
            return this.opsOwnerNameList;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return paiConfig
         */
        public PaiConfig getPaiConfig() {
            return this.paiConfig;
        }

        /**
         * @return paramList
         */
        public java.util.List<ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return paused
         */
        public Boolean getPaused() {
            return this.paused;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return published
         */
        public Boolean getPublished() {
            return this.published;
        }

        /**
         * @return pythonModuleList
         */
        public java.util.List<PythonModuleList> getPythonModuleList() {
            return this.pythonModuleList;
        }

        /**
         * @return pythonVersion
         */
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return rerunable
         */
        public Boolean getRerunable() {
            return this.rerunable;
        }

        /**
         * @return retryOnTimeoutEnable
         */
        public Boolean getRetryOnTimeoutEnable() {
            return this.retryOnTimeoutEnable;
        }

        /**
         * @return schedulePeriod
         */
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return scheduleType
         */
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return sparkClientInfo
         */
        public SparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        /**
         * @return sparkDynamicResourceSwitch
         */
        public Boolean getSparkDynamicResourceSwitch() {
            return this.sparkDynamicResourceSwitch;
        }

        /**
         * @return sparkResourceEffectScope
         */
        public String getSparkResourceEffectScope() {
            return this.sparkResourceEffectScope;
        }

        /**
         * @return sparkSqlResourceConfigMap
         */
        public String getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
        }

        /**
         * @return sparkVersion
         */
        public String getSparkVersion() {
            return this.sparkVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        /**
         * @return upStreamList
         */
        public java.util.List<UpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

        public static final class Builder {
            private String code; 
            private String codeTemplateId; 
            private Integer codeTemplateVersion; 
            private String cpuResource; 
            private String cronExpression; 
            private CustomScheduleConfig customScheduleConfig; 
            private String dagId; 
            private String dataSourceCatalog; 
            private String dataSourceId; 
            private String dataSourceSchema; 
            private DatabricksPythonConnectInfo databricksPythonConnectInfo; 
            private java.util.List<String> developOwnerIdList; 
            private java.util.List<String> developOwnerNameList; 
            private ExecuteRerunConfig executeRerunConfig; 
            private ExecuteTimeOutConfig executeTimeOutConfig; 
            private Long fileId; 
            private Boolean hasDevNode; 
            private String memoryResource; 
            private String name; 
            private Boolean needPublish; 
            private String nodeDescription; 
            private String nodeFrom; 
            private String nodeId; 
            private String nodeName; 
            private java.util.List<String> nodeOutputNameList; 
            private Integer nodeStatus; 
            private String operatorUserId; 
            private java.util.List<String> opsOwnerIdList; 
            private java.util.List<String> opsOwnerNameList; 
            private String ownerName; 
            private String ownerUserId; 
            private PaiConfig paiConfig; 
            private java.util.List<ParamList> paramList; 
            private Boolean paused; 
            private Integer priority; 
            private Long projectId; 
            private Boolean published; 
            private java.util.List<PythonModuleList> pythonModuleList; 
            private String pythonVersion; 
            private String remark; 
            private Boolean rerunable; 
            private Boolean retryOnTimeoutEnable; 
            private String schedulePeriod; 
            private Integer scheduleType; 
            private SparkClientInfo sparkClientInfo; 
            private Boolean sparkDynamicResourceSwitch; 
            private String sparkResourceEffectScope; 
            private String sparkSqlResourceConfigMap; 
            private String sparkVersion; 
            private String status; 
            private Integer taskType; 
            private java.util.List<UpStreamList> upStreamList; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.code = model.code;
                this.codeTemplateId = model.codeTemplateId;
                this.codeTemplateVersion = model.codeTemplateVersion;
                this.cpuResource = model.cpuResource;
                this.cronExpression = model.cronExpression;
                this.customScheduleConfig = model.customScheduleConfig;
                this.dagId = model.dagId;
                this.dataSourceCatalog = model.dataSourceCatalog;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceSchema = model.dataSourceSchema;
                this.databricksPythonConnectInfo = model.databricksPythonConnectInfo;
                this.developOwnerIdList = model.developOwnerIdList;
                this.developOwnerNameList = model.developOwnerNameList;
                this.executeRerunConfig = model.executeRerunConfig;
                this.executeTimeOutConfig = model.executeTimeOutConfig;
                this.fileId = model.fileId;
                this.hasDevNode = model.hasDevNode;
                this.memoryResource = model.memoryResource;
                this.name = model.name;
                this.needPublish = model.needPublish;
                this.nodeDescription = model.nodeDescription;
                this.nodeFrom = model.nodeFrom;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeOutputNameList = model.nodeOutputNameList;
                this.nodeStatus = model.nodeStatus;
                this.operatorUserId = model.operatorUserId;
                this.opsOwnerIdList = model.opsOwnerIdList;
                this.opsOwnerNameList = model.opsOwnerNameList;
                this.ownerName = model.ownerName;
                this.ownerUserId = model.ownerUserId;
                this.paiConfig = model.paiConfig;
                this.paramList = model.paramList;
                this.paused = model.paused;
                this.priority = model.priority;
                this.projectId = model.projectId;
                this.published = model.published;
                this.pythonModuleList = model.pythonModuleList;
                this.pythonVersion = model.pythonVersion;
                this.remark = model.remark;
                this.rerunable = model.rerunable;
                this.retryOnTimeoutEnable = model.retryOnTimeoutEnable;
                this.schedulePeriod = model.schedulePeriod;
                this.scheduleType = model.scheduleType;
                this.sparkClientInfo = model.sparkClientInfo;
                this.sparkDynamicResourceSwitch = model.sparkDynamicResourceSwitch;
                this.sparkResourceEffectScope = model.sparkResourceEffectScope;
                this.sparkSqlResourceConfigMap = model.sparkSqlResourceConfigMap;
                this.sparkVersion = model.sparkVersion;
                this.status = model.status;
                this.taskType = model.taskType;
                this.upStreamList = model.upStreamList;
            } 

            /**
             * <p>The code of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>show tables;</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the offline code template.</p>
             * 
             * <strong>example:</strong>
             * <p>st_123456</p>
             */
            public Builder codeTemplateId(String codeTemplateId) {
                this.codeTemplateId = codeTemplateId;
                return this;
            }

            /**
             * <p>The version of the offline code template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder codeTemplateVersion(Integer codeTemplateVersion) {
                this.codeTemplateVersion = codeTemplateVersion;
                return this;
            }

            /**
             * <p>The current CPU resource configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder cpuResource(String cpuResource) {
                this.cpuResource = cpuResource;
                return this;
            }

            /**
             * <p>The cron expression for automatic scheduling. You can refer to Linux cron expressions.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 1 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The custom scheduling interval configuration.</p>
             */
            public Builder customScheduleConfig(CustomScheduleConfig customScheduleConfig) {
                this.customScheduleConfig = customScheduleConfig;
                return this;
            }

            /**
             * <p>The ID of the DAG to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dag_102121211</p>
             */
            public Builder dagId(String dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The catalog of the data source. This parameter applies only to database SQL nodes and data source types that require a catalog, such as Presto.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_catalog</p>
             */
            public Builder dataSourceCatalog(String dataSourceCatalog) {
                this.dataSourceCatalog = dataSourceCatalog;
                return this;
            }

            /**
             * <p>The ID of the data source for the database SQL node.</p>
             * 
             * <strong>example:</strong>
             * <p>12131111</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The schema of the data source. This parameter applies only to database SQL nodes and data source types that require a schema, such as Oracle.</p>
             * 
             * <strong>example:</strong>
             * <p>erp</p>
             */
            public Builder dataSourceSchema(String dataSourceSchema) {
                this.dataSourceSchema = dataSourceSchema;
                return this;
            }

            /**
             * <p>The Python connection information.</p>
             */
            public Builder databricksPythonConnectInfo(DatabricksPythonConnectInfo databricksPythonConnectInfo) {
                this.databricksPythonConnectInfo = databricksPythonConnectInfo;
                return this;
            }

            /**
             * <p>The IDs of the developers.</p>
             */
            public Builder developOwnerIdList(java.util.List<String> developOwnerIdList) {
                this.developOwnerIdList = developOwnerIdList;
                return this;
            }

            /**
             * <p>The names of the developers.</p>
             */
            public Builder developOwnerNameList(java.util.List<String> developOwnerNameList) {
                this.developOwnerNameList = developOwnerNameList;
                return this;
            }

            /**
             * <p>The retry configuration for failed executions. This is the current configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
             */
            public Builder executeRerunConfig(ExecuteRerunConfig executeRerunConfig) {
                this.executeRerunConfig = executeRerunConfig;
                return this;
            }

            /**
             * <p>The execution timeout configuration. This is the current configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
             */
            public Builder executeTimeOutConfig(ExecuteTimeOutConfig executeTimeOutConfig) {
                this.executeTimeOutConfig = executeTimeOutConfig;
                return this;
            }

            /**
             * <p>The node ID of the task directory tree.</p>
             * 
             * <strong>example:</strong>
             * <p>12113111</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Indicates whether a development environment node exists.</p>
             */
            public Builder hasDevNode(Boolean hasDevNode) {
                this.hasDevNode = hasDevNode;
                return this;
            }

            /**
             * <p>The current CPU resource configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder memoryResource(String memoryResource) {
                this.memoryResource = memoryResource;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test task 1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether publishing is required.</p>
             */
            public Builder needPublish(Boolean needPublish) {
                this.needPublish = needPublish;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>xx test</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * <p>The source of the node, which indicates the organization or application that created the node.</p>
             * 
             * <strong>example:</strong>
             * <p>openapi</p>
             */
            public Builder nodeFrom(String nodeFrom) {
                this.nodeFrom = nodeFrom;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_1011_21232132322</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test task 1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The list of node output names.</p>
             */
            public Builder nodeOutputNameList(java.util.List<String> nodeOutputNameList) {
                this.nodeOutputNameList = nodeOutputNameList;
                return this;
            }

            /**
             * <p>The node status. Valid values: 1: Normal. 2: Paused. 3: Dry run.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeStatus(Integer nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The ID of the user who performs the current operation.</p>
             * 
             * <strong>example:</strong>
             * <p>30231123</p>
             */
            public Builder operatorUserId(String operatorUserId) {
                this.operatorUserId = operatorUserId;
                return this;
            }

            /**
             * <p>The list of O&amp;M owner IDs.</p>
             */
            public Builder opsOwnerIdList(java.util.List<String> opsOwnerIdList) {
                this.opsOwnerIdList = opsOwnerIdList;
                return this;
            }

            /**
             * <p>The list of O&amp;M owner names.</p>
             */
            public Builder opsOwnerNameList(java.util.List<String> opsOwnerNameList) {
                this.opsOwnerNameList = opsOwnerNameList;
                return this;
            }

            /**
             * <p>The name of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The user ID of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30231123</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The PAI configuration.</p>
             */
            public Builder paiConfig(PaiConfig paiConfig) {
                this.paiConfig = paiConfig;
                return this;
            }

            /**
             * <p>The list of custom parameters for the node.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>Specifies whether node scheduling is paused.</p>
             */
            public Builder paused(Boolean paused) {
                this.paused = paused;
                return this;
            }

            /**
             * <p>The task scheduling priority. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>131211211</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Specifies whether the task is published.</p>
             */
            public Builder published(Boolean published) {
                this.published = published;
                return this;
            }

            /**
             * <p>The list of third-party packages required by the Python task.</p>
             */
            public Builder pythonModuleList(java.util.List<PythonModuleList> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>The Python version for the Python task, such as Python 3.7.</p>
             * 
             * <strong>example:</strong>
             * <p>Python 3.7</p>
             */
            public Builder pythonVersion(String pythonVersion) {
                this.pythonVersion = pythonVersion;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test xx</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Specifies whether the node can be rerun.</p>
             */
            public Builder rerunable(Boolean rerunable) {
                this.rerunable = rerunable;
                return this;
            }

            /**
             * <p>Specifies whether to enable retry on timeout. This reflects the current configuration of the node. When queried by version, it reflects the configuration of the corresponding version.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder retryOnTimeoutEnable(Boolean retryOnTimeoutEnable) {
                this.retryOnTimeoutEnable = retryOnTimeoutEnable;
                return this;
            }

            /**
             * <p>The schedule period. Valid values:</p>
             * <ul>
             * <li>YEARLY: Yearly.</li>
             * <li>MONTHLY: Monthly.</li>
             * <li>WEEKLY: Weekly.</li>
             * <li>DAILY: Daily.</li>
             * <li>HOURLY: Hourly.</li>
             * <li>MINUTELY: Minutely.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li>1: Periodic node.</li>
             * <li>3: Manual node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder scheduleType(Integer scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The Spark client.</p>
             */
            public Builder sparkClientInfo(SparkClientInfo sparkClientInfo) {
                this.sparkClientInfo = sparkClientInfo;
                return this;
            }

            /**
             * <p>The current CPU resource configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sparkDynamicResourceSwitch(Boolean sparkDynamicResourceSwitch) {
                this.sparkDynamicResourceSwitch = sparkDynamicResourceSwitch;
                return this;
            }

            /**
             * <p>The effective scope of the Spark resource configuration. Valid values:</p>
             * <ul>
             * <li>ONLY_PROD: Production environment only.</li>
             * <li>PROD_AND_DEV: Production and development environments.
             * This reflects the current configuration of the node. When queried by version, it reflects the configuration of the corresponding version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLY_PROD</p>
             */
            public Builder sparkResourceEffectScope(String sparkResourceEffectScope) {
                this.sparkResourceEffectScope = sparkResourceEffectScope;
                return this;
            }

            /**
             * <p>The Spark SQL resource configuration. The key is the configuration item name and the value is a string. The configuration is returned as a JSON string, such as {&quot;spark.executor.memory&quot;:&quot;2g&quot;}. This reflects the current configuration of the node. When queried by version, it reflects the configuration of the corresponding version.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;spark.executor.memory&quot;:&quot;2g&quot;}</p>
             */
            public Builder sparkSqlResourceConfigMap(String sparkSqlResourceConfigMap) {
                this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
                return this;
            }

            /**
             * <p>The MaxCompute Spark version.</p>
             * 
             * <strong>example:</strong>
             * <p>Spark 3.1.1</p>
             */
            public Builder sparkVersion(String sparkVersion) {
                this.sparkVersion = sparkVersion;
                return this;
            }

            /**
             * <p>The publish status. Valid values:</p>
             * <ul>
             * <li>0: Draft.</li>
             * <li>1: Submitted.</li>
             * <li>100: In development.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Test task 1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task type. For more information, see the API operation for creating an offline computing node.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The upstream dependencies.</p>
             */
            public Builder upStreamList(java.util.List<UpStreamList> upStreamList) {
                this.upStreamList = upStreamList;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
