// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HpoExperimentConfig} extends {@link TeaModel}
 *
 * <p>HpoExperimentConfig</p>
 */
public class HpoExperimentConfig extends TeaModel {
    @NameInMap("dlc_config")
    private DlcConfig dlcConfig;

    @NameInMap("k8s_config")
    private K8sConfig k8sConfig;

    @NameInMap("metric_config")
    @Validation(required = true)
    private MetricConfig metricConfig;

    @NameInMap("monitor_config")
    private MonitorConfig monitorConfig;

    @NameInMap("odps_config")
    private OdpsConfig odpsConfig;

    @NameInMap("oss_config")
    private OssConfig ossConfig;

    @NameInMap("output_config")
    private OutputConfig outputConfig;

    @NameInMap("paiflow_config")
    private PaiflowConfig paiflowConfig;

    @NameInMap("params_config")
    private ParamsConfig paramsConfig;

    @NameInMap("platform_config")
    @Validation(required = true)
    private PlatformConfig platformConfig;

    @NameInMap("schedule_config")
    private ScheduleConfig scheduleConfig;

    @NameInMap("search_space")
    private java.util.Map < String, ? > searchSpace;

    @NameInMap("ts_config")
    private TsConfig tsConfig;

    @NameInMap("yml_config")
    private YmlConfig ymlConfig;

    private HpoExperimentConfig(Builder builder) {
        this.dlcConfig = builder.dlcConfig;
        this.k8sConfig = builder.k8sConfig;
        this.metricConfig = builder.metricConfig;
        this.monitorConfig = builder.monitorConfig;
        this.odpsConfig = builder.odpsConfig;
        this.ossConfig = builder.ossConfig;
        this.outputConfig = builder.outputConfig;
        this.paiflowConfig = builder.paiflowConfig;
        this.paramsConfig = builder.paramsConfig;
        this.platformConfig = builder.platformConfig;
        this.scheduleConfig = builder.scheduleConfig;
        this.searchSpace = builder.searchSpace;
        this.tsConfig = builder.tsConfig;
        this.ymlConfig = builder.ymlConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HpoExperimentConfig create() {
        return builder().build();
    }

    /**
     * @return dlcConfig
     */
    public DlcConfig getDlcConfig() {
        return this.dlcConfig;
    }

    /**
     * @return k8sConfig
     */
    public K8sConfig getK8sConfig() {
        return this.k8sConfig;
    }

    /**
     * @return metricConfig
     */
    public MetricConfig getMetricConfig() {
        return this.metricConfig;
    }

    /**
     * @return monitorConfig
     */
    public MonitorConfig getMonitorConfig() {
        return this.monitorConfig;
    }

    /**
     * @return odpsConfig
     */
    public OdpsConfig getOdpsConfig() {
        return this.odpsConfig;
    }

    /**
     * @return ossConfig
     */
    public OssConfig getOssConfig() {
        return this.ossConfig;
    }

    /**
     * @return outputConfig
     */
    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return paiflowConfig
     */
    public PaiflowConfig getPaiflowConfig() {
        return this.paiflowConfig;
    }

    /**
     * @return paramsConfig
     */
    public ParamsConfig getParamsConfig() {
        return this.paramsConfig;
    }

    /**
     * @return platformConfig
     */
    public PlatformConfig getPlatformConfig() {
        return this.platformConfig;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return searchSpace
     */
    public java.util.Map < String, ? > getSearchSpace() {
        return this.searchSpace;
    }

    /**
     * @return tsConfig
     */
    public TsConfig getTsConfig() {
        return this.tsConfig;
    }

    /**
     * @return ymlConfig
     */
    public YmlConfig getYmlConfig() {
        return this.ymlConfig;
    }

    public static final class Builder {
        private DlcConfig dlcConfig; 
        private K8sConfig k8sConfig; 
        private MetricConfig metricConfig; 
        private MonitorConfig monitorConfig; 
        private OdpsConfig odpsConfig; 
        private OssConfig ossConfig; 
        private OutputConfig outputConfig; 
        private PaiflowConfig paiflowConfig; 
        private ParamsConfig paramsConfig; 
        private PlatformConfig platformConfig; 
        private ScheduleConfig scheduleConfig; 
        private java.util.Map < String, ? > searchSpace; 
        private TsConfig tsConfig; 
        private YmlConfig ymlConfig; 

        /**
         * dlc_config.
         */
        public Builder dlcConfig(DlcConfig dlcConfig) {
            this.dlcConfig = dlcConfig;
            return this;
        }

        /**
         * k8s_config.
         */
        public Builder k8sConfig(K8sConfig k8sConfig) {
            this.k8sConfig = k8sConfig;
            return this;
        }

        /**
         * metric_config.
         */
        public Builder metricConfig(MetricConfig metricConfig) {
            this.metricConfig = metricConfig;
            return this;
        }

        /**
         * monitor_config.
         */
        public Builder monitorConfig(MonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }

        /**
         * odps_config.
         */
        public Builder odpsConfig(OdpsConfig odpsConfig) {
            this.odpsConfig = odpsConfig;
            return this;
        }

        /**
         * oss_config.
         */
        public Builder ossConfig(OssConfig ossConfig) {
            this.ossConfig = ossConfig;
            return this;
        }

        /**
         * output_config.
         */
        public Builder outputConfig(OutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * paiflow_config.
         */
        public Builder paiflowConfig(PaiflowConfig paiflowConfig) {
            this.paiflowConfig = paiflowConfig;
            return this;
        }

        /**
         * params_config.
         */
        public Builder paramsConfig(ParamsConfig paramsConfig) {
            this.paramsConfig = paramsConfig;
            return this;
        }

        /**
         * platform_config.
         */
        public Builder platformConfig(PlatformConfig platformConfig) {
            this.platformConfig = platformConfig;
            return this;
        }

        /**
         * schedule_config.
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * search_space.
         */
        public Builder searchSpace(java.util.Map < String, ? > searchSpace) {
            this.searchSpace = searchSpace;
            return this;
        }

        /**
         * ts_config.
         */
        public Builder tsConfig(TsConfig tsConfig) {
            this.tsConfig = tsConfig;
            return this;
        }

        /**
         * yml_config.
         */
        public Builder ymlConfig(YmlConfig ymlConfig) {
            this.ymlConfig = ymlConfig;
            return this;
        }

        public HpoExperimentConfig build() {
            return new HpoExperimentConfig(this);
        } 

    } 

    public static class DlcConfig extends TeaModel {
        @NameInMap("access_id")
        private String accessId;

        @NameInMap("access_key")
        private String accessKey;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("protocol")
        private String protocol;

        @NameInMap("region")
        private String region;

        private DlcConfig(Builder builder) {
            this.accessId = builder.accessId;
            this.accessKey = builder.accessKey;
            this.endpoint = builder.endpoint;
            this.protocol = builder.protocol;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlcConfig create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String accessId; 
            private String accessKey; 
            private String endpoint; 
            private String protocol; 
            private String region; 

            /**
             * access_id.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * access_key.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public DlcConfig build() {
                return new DlcConfig(this);
            } 

        } 

    }
    public static class K8sConfig extends TeaModel {
        @NameInMap("nni_container_cpu_limit")
        private String nniContainerCpuLimit;

        @NameInMap("nni_container_memory_limit")
        private String nniContainerMemoryLimit;

        @NameInMap("nni_container_requested_cpu")
        private String nniContainerRequestedCpu;

        @NameInMap("nni_container_requested_memory")
        private String nniContainerRequestedMemory;

        private K8sConfig(Builder builder) {
            this.nniContainerCpuLimit = builder.nniContainerCpuLimit;
            this.nniContainerMemoryLimit = builder.nniContainerMemoryLimit;
            this.nniContainerRequestedCpu = builder.nniContainerRequestedCpu;
            this.nniContainerRequestedMemory = builder.nniContainerRequestedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sConfig create() {
            return builder().build();
        }

        /**
         * @return nniContainerCpuLimit
         */
        public String getNniContainerCpuLimit() {
            return this.nniContainerCpuLimit;
        }

        /**
         * @return nniContainerMemoryLimit
         */
        public String getNniContainerMemoryLimit() {
            return this.nniContainerMemoryLimit;
        }

        /**
         * @return nniContainerRequestedCpu
         */
        public String getNniContainerRequestedCpu() {
            return this.nniContainerRequestedCpu;
        }

        /**
         * @return nniContainerRequestedMemory
         */
        public String getNniContainerRequestedMemory() {
            return this.nniContainerRequestedMemory;
        }

        public static final class Builder {
            private String nniContainerCpuLimit; 
            private String nniContainerMemoryLimit; 
            private String nniContainerRequestedCpu; 
            private String nniContainerRequestedMemory; 

            /**
             * nni_container_cpu_limit.
             */
            public Builder nniContainerCpuLimit(String nniContainerCpuLimit) {
                this.nniContainerCpuLimit = nniContainerCpuLimit;
                return this;
            }

            /**
             * nni_container_memory_limit.
             */
            public Builder nniContainerMemoryLimit(String nniContainerMemoryLimit) {
                this.nniContainerMemoryLimit = nniContainerMemoryLimit;
                return this;
            }

            /**
             * nni_container_requested_cpu.
             */
            public Builder nniContainerRequestedCpu(String nniContainerRequestedCpu) {
                this.nniContainerRequestedCpu = nniContainerRequestedCpu;
                return this;
            }

            /**
             * nni_container_requested_memory.
             */
            public Builder nniContainerRequestedMemory(String nniContainerRequestedMemory) {
                this.nniContainerRequestedMemory = nniContainerRequestedMemory;
                return this;
            }

            public K8sConfig build() {
                return new K8sConfig(this);
            } 

        } 

    }
    public static class MetricConfig extends TeaModel {
        @NameInMap("final_mode")
        @Validation(required = true)
        private String finalMode;

        @NameInMap("metric_dict")
        @Validation(required = true)
        private java.util.Map < String, ? > metricDict;

        @NameInMap("metric_source")
        @Validation(required = true)
        private java.util.List < String > metricSource;

        @NameInMap("metric_type")
        @Validation(required = true)
        private String metricType;

        @NameInMap("source_list_final_mode")
        private String sourceListFinalMode;

        private MetricConfig(Builder builder) {
            this.finalMode = builder.finalMode;
            this.metricDict = builder.metricDict;
            this.metricSource = builder.metricSource;
            this.metricType = builder.metricType;
            this.sourceListFinalMode = builder.sourceListFinalMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricConfig create() {
            return builder().build();
        }

        /**
         * @return finalMode
         */
        public String getFinalMode() {
            return this.finalMode;
        }

        /**
         * @return metricDict
         */
        public java.util.Map < String, ? > getMetricDict() {
            return this.metricDict;
        }

        /**
         * @return metricSource
         */
        public java.util.List < String > getMetricSource() {
            return this.metricSource;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        /**
         * @return sourceListFinalMode
         */
        public String getSourceListFinalMode() {
            return this.sourceListFinalMode;
        }

        public static final class Builder {
            private String finalMode; 
            private java.util.Map < String, ? > metricDict; 
            private java.util.List < String > metricSource; 
            private String metricType; 
            private String sourceListFinalMode; 

            /**
             * final_mode.
             */
            public Builder finalMode(String finalMode) {
                this.finalMode = finalMode;
                return this;
            }

            /**
             * metric_dict.
             */
            public Builder metricDict(java.util.Map < String, ? > metricDict) {
                this.metricDict = metricDict;
                return this;
            }

            /**
             * metric_source.
             */
            public Builder metricSource(java.util.List < String > metricSource) {
                this.metricSource = metricSource;
                return this;
            }

            /**
             * metric_type.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * source_list_final_mode.
             */
            public Builder sourceListFinalMode(String sourceListFinalMode) {
                this.sourceListFinalMode = sourceListFinalMode;
                return this;
            }

            public MetricConfig build() {
                return new MetricConfig(this);
            } 

        } 

    }
    public static class MonitorConfig extends TeaModel {
        @NameInMap("at_mobiles")
        private String atMobiles;

        @NameInMap("at_user_ids")
        private String atUserIds;

        @NameInMap("is_at_all")
        private String isAtAll;

        @NameInMap("keyword")
        private String keyword;

        @NameInMap("url")
        private String url;

        private MonitorConfig(Builder builder) {
            this.atMobiles = builder.atMobiles;
            this.atUserIds = builder.atUserIds;
            this.isAtAll = builder.isAtAll;
            this.keyword = builder.keyword;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorConfig create() {
            return builder().build();
        }

        /**
         * @return atMobiles
         */
        public String getAtMobiles() {
            return this.atMobiles;
        }

        /**
         * @return atUserIds
         */
        public String getAtUserIds() {
            return this.atUserIds;
        }

        /**
         * @return isAtAll
         */
        public String getIsAtAll() {
            return this.isAtAll;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String atMobiles; 
            private String atUserIds; 
            private String isAtAll; 
            private String keyword; 
            private String url; 

            /**
             * at_mobiles.
             */
            public Builder atMobiles(String atMobiles) {
                this.atMobiles = atMobiles;
                return this;
            }

            /**
             * at_user_ids.
             */
            public Builder atUserIds(String atUserIds) {
                this.atUserIds = atUserIds;
                return this;
            }

            /**
             * is_at_all.
             */
            public Builder isAtAll(String isAtAll) {
                this.isAtAll = isAtAll;
                return this;
            }

            /**
             * keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public MonitorConfig build() {
                return new MonitorConfig(this);
            } 

        } 

    }
    public static class OdpsConfig extends TeaModel {
        @NameInMap("access_id")
        private String accessId;

        @NameInMap("access_key")
        private String accessKey;

        @NameInMap("end_point")
        private String endPoint;

        @NameInMap("log_view_host")
        private String logViewHost;

        @NameInMap("project_name")
        private String projectName;

        @NameInMap("region")
        private String region;

        @NameInMap("role_arn")
        private String roleArn;

        private OdpsConfig(Builder builder) {
            this.accessId = builder.accessId;
            this.accessKey = builder.accessKey;
            this.endPoint = builder.endPoint;
            this.logViewHost = builder.logViewHost;
            this.projectName = builder.projectName;
            this.region = builder.region;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OdpsConfig create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return logViewHost
         */
        public String getLogViewHost() {
            return this.logViewHost;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String accessId; 
            private String accessKey; 
            private String endPoint; 
            private String logViewHost; 
            private String projectName; 
            private String region; 
            private String roleArn; 

            /**
             * access_id.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * access_key.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * end_point.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * log_view_host.
             */
            public Builder logViewHost(String logViewHost) {
                this.logViewHost = logViewHost;
                return this;
            }

            /**
             * project_name.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * role_arn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public OdpsConfig build() {
                return new OdpsConfig(this);
            } 

        } 

    }
    public static class OssConfig extends TeaModel {
        @NameInMap("accessKeyID")
        private String accessKeyID;

        @NameInMap("accessKeySecret")
        private String accessKeySecret;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("role_arn")
        private String roleArn;

        private OssConfig(Builder builder) {
            this.accessKeyID = builder.accessKeyID;
            this.accessKeySecret = builder.accessKeySecret;
            this.endpoint = builder.endpoint;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssConfig create() {
            return builder().build();
        }

        /**
         * @return accessKeyID
         */
        public String getAccessKeyID() {
            return this.accessKeyID;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String accessKeyID; 
            private String accessKeySecret; 
            private String endpoint; 
            private String roleArn; 

            /**
             * accessKeyID.
             */
            public Builder accessKeyID(String accessKeyID) {
                this.accessKeyID = accessKeyID;
                return this;
            }

            /**
             * accessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * role_arn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public OssConfig build() {
                return new OssConfig(this);
            } 

        } 

    }
    public static class OutputConfig extends TeaModel {
        @NameInMap("model_path")
        private String modelPath;

        @NameInMap("summary_path")
        private String summaryPath;

        private OutputConfig(Builder builder) {
            this.modelPath = builder.modelPath;
            this.summaryPath = builder.summaryPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputConfig create() {
            return builder().build();
        }

        /**
         * @return modelPath
         */
        public String getModelPath() {
            return this.modelPath;
        }

        /**
         * @return summaryPath
         */
        public String getSummaryPath() {
            return this.summaryPath;
        }

        public static final class Builder {
            private String modelPath; 
            private String summaryPath; 

            /**
             * model_path.
             */
            public Builder modelPath(String modelPath) {
                this.modelPath = modelPath;
                return this;
            }

            /**
             * summary_path.
             */
            public Builder summaryPath(String summaryPath) {
                this.summaryPath = summaryPath;
                return this;
            }

            public OutputConfig build() {
                return new OutputConfig(this);
            } 

        } 

    }
    public static class PaiflowConfig extends TeaModel {
        @NameInMap("access_key_id")
        private String accessKeyId;

        @NameInMap("access_key_secret")
        private String accessKeySecret;

        @NameInMap("region_id")
        private String regionId;

        @NameInMap("workspace_id")
        private String workspaceId;

        private PaiflowConfig(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.regionId = builder.regionId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaiflowConfig create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String regionId; 
            private String workspaceId; 

            /**
             * access_key_id.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * access_key_secret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * region_id.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * workspace_id.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public PaiflowConfig build() {
                return new PaiflowConfig(this);
            } 

        } 

    }
    public static class ParamsConfig extends TeaModel {
        @NameInMap("params_src_dst_filepath")
        private java.util.List < String > paramsSrcDstFilepath;

        private ParamsConfig(Builder builder) {
            this.paramsSrcDstFilepath = builder.paramsSrcDstFilepath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamsConfig create() {
            return builder().build();
        }

        /**
         * @return paramsSrcDstFilepath
         */
        public java.util.List < String > getParamsSrcDstFilepath() {
            return this.paramsSrcDstFilepath;
        }

        public static final class Builder {
            private java.util.List < String > paramsSrcDstFilepath; 

            /**
             * params_src_dst_filepath.
             */
            public Builder paramsSrcDstFilepath(java.util.List < String > paramsSrcDstFilepath) {
                this.paramsSrcDstFilepath = paramsSrcDstFilepath;
                return this;
            }

            public ParamsConfig build() {
                return new ParamsConfig(this);
            } 

        } 

    }
    public static class PlatformConfig extends TeaModel {
        @NameInMap("cmd")
        @Validation(required = true)
        private java.util.List < String > cmd;

        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("resume")
        private String resume;

        private PlatformConfig(Builder builder) {
            this.cmd = builder.cmd;
            this.name = builder.name;
            this.resume = builder.resume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlatformConfig create() {
            return builder().build();
        }

        /**
         * @return cmd
         */
        public java.util.List < String > getCmd() {
            return this.cmd;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resume
         */
        public String getResume() {
            return this.resume;
        }

        public static final class Builder {
            private java.util.List < String > cmd; 
            private String name; 
            private String resume; 

            /**
             * cmd.
             */
            public Builder cmd(java.util.List < String > cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * resume.
             */
            public Builder resume(String resume) {
                this.resume = resume;
                return this;
            }

            public PlatformConfig build() {
                return new PlatformConfig(this);
            } 

        } 

    }
    public static class ScheduleConfig extends TeaModel {
        @NameInMap("day")
        private String day;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("start_time")
        private String startTime;

        private ScheduleConfig(Builder builder) {
            this.day = builder.day;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
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
            private String day; 
            private String endTime; 
            private String startTime; 

            /**
             * day.
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * end_time.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
    public static class TsConfig extends TeaModel {
        @NameInMap("access_key_id")
        private String accessKeyId;

        @NameInMap("access_key_secret")
        private String accessKeySecret;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("region_id")
        private String regionId;

        private TsConfig(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.endpoint = builder.endpoint;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TsConfig create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String endpoint; 
            private String regionId; 

            /**
             * access_key_id.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * access_key_secret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * region_id.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public TsConfig build() {
                return new TsConfig(this);
            } 

        } 

    }
    public static class ClassArgs extends TeaModel {
        @NameInMap("earlystop")
        private Boolean earlystop;

        @NameInMap("moving_avg")
        private String movingAvg;

        @NameInMap("optimize_mode")
        private String optimizeMode;

        @NameInMap("proportion")
        private Float proportion;

        @NameInMap("start_step")
        private Integer startStep;

        private ClassArgs(Builder builder) {
            this.earlystop = builder.earlystop;
            this.movingAvg = builder.movingAvg;
            this.optimizeMode = builder.optimizeMode;
            this.proportion = builder.proportion;
            this.startStep = builder.startStep;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassArgs create() {
            return builder().build();
        }

        /**
         * @return earlystop
         */
        public Boolean getEarlystop() {
            return this.earlystop;
        }

        /**
         * @return movingAvg
         */
        public String getMovingAvg() {
            return this.movingAvg;
        }

        /**
         * @return optimizeMode
         */
        public String getOptimizeMode() {
            return this.optimizeMode;
        }

        /**
         * @return proportion
         */
        public Float getProportion() {
            return this.proportion;
        }

        /**
         * @return startStep
         */
        public Integer getStartStep() {
            return this.startStep;
        }

        public static final class Builder {
            private Boolean earlystop; 
            private String movingAvg; 
            private String optimizeMode; 
            private Float proportion; 
            private Integer startStep; 

            /**
             * earlystop.
             */
            public Builder earlystop(Boolean earlystop) {
                this.earlystop = earlystop;
                return this;
            }

            /**
             * moving_avg.
             */
            public Builder movingAvg(String movingAvg) {
                this.movingAvg = movingAvg;
                return this;
            }

            /**
             * optimize_mode.
             */
            public Builder optimizeMode(String optimizeMode) {
                this.optimizeMode = optimizeMode;
                return this;
            }

            /**
             * proportion.
             */
            public Builder proportion(Float proportion) {
                this.proportion = proportion;
                return this;
            }

            /**
             * start_step.
             */
            public Builder startStep(Integer startStep) {
                this.startStep = startStep;
                return this;
            }

            public ClassArgs build() {
                return new ClassArgs(this);
            } 

        } 

    }
    public static class Assessor extends TeaModel {
        @NameInMap("class_args")
        private ClassArgs classArgs;

        @NameInMap("name")
        private String name;

        private Assessor(Builder builder) {
            this.classArgs = builder.classArgs;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assessor create() {
            return builder().build();
        }

        /**
         * @return classArgs
         */
        public ClassArgs getClassArgs() {
            return this.classArgs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private ClassArgs classArgs; 
            private String name; 

            /**
             * class_args.
             */
            public Builder classArgs(ClassArgs classArgs) {
                this.classArgs = classArgs;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Assessor build() {
                return new Assessor(this);
            } 

        } 

    }
    public static class Tuner extends TeaModel {
        @NameInMap("class_args")
        private java.util.Map < String, ? > classArgs;

        @NameInMap("name")
        private String name;

        private Tuner(Builder builder) {
            this.classArgs = builder.classArgs;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tuner create() {
            return builder().build();
        }

        /**
         * @return classArgs
         */
        public java.util.Map < String, ? > getClassArgs() {
            return this.classArgs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map < String, ? > classArgs; 
            private String name; 

            /**
             * class_args.
             */
            public Builder classArgs(java.util.Map < String, ? > classArgs) {
                this.classArgs = classArgs;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Tuner build() {
                return new Tuner(this);
            } 

        } 

    }
    public static class YmlConfig extends TeaModel {
        @NameInMap("assessor")
        private Assessor assessor;

        @NameInMap("debug")
        private Boolean debug;

        @NameInMap("experiment_name")
        private String experimentName;

        @NameInMap("log_level")
        private String logLevel;

        @NameInMap("max_trial_number")
        private Integer maxTrialNumber;

        @NameInMap("trial_concurrency")
        private Integer trialConcurrency;

        @NameInMap("tuner")
        private Tuner tuner;

        private YmlConfig(Builder builder) {
            this.assessor = builder.assessor;
            this.debug = builder.debug;
            this.experimentName = builder.experimentName;
            this.logLevel = builder.logLevel;
            this.maxTrialNumber = builder.maxTrialNumber;
            this.trialConcurrency = builder.trialConcurrency;
            this.tuner = builder.tuner;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static YmlConfig create() {
            return builder().build();
        }

        /**
         * @return assessor
         */
        public Assessor getAssessor() {
            return this.assessor;
        }

        /**
         * @return debug
         */
        public Boolean getDebug() {
            return this.debug;
        }

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        /**
         * @return maxTrialNumber
         */
        public Integer getMaxTrialNumber() {
            return this.maxTrialNumber;
        }

        /**
         * @return trialConcurrency
         */
        public Integer getTrialConcurrency() {
            return this.trialConcurrency;
        }

        /**
         * @return tuner
         */
        public Tuner getTuner() {
            return this.tuner;
        }

        public static final class Builder {
            private Assessor assessor; 
            private Boolean debug; 
            private String experimentName; 
            private String logLevel; 
            private Integer maxTrialNumber; 
            private Integer trialConcurrency; 
            private Tuner tuner; 

            /**
             * assessor.
             */
            public Builder assessor(Assessor assessor) {
                this.assessor = assessor;
                return this;
            }

            /**
             * debug.
             */
            public Builder debug(Boolean debug) {
                this.debug = debug;
                return this;
            }

            /**
             * experiment_name.
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * log_level.
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * max_trial_number.
             */
            public Builder maxTrialNumber(Integer maxTrialNumber) {
                this.maxTrialNumber = maxTrialNumber;
                return this;
            }

            /**
             * trial_concurrency.
             */
            public Builder trialConcurrency(Integer trialConcurrency) {
                this.trialConcurrency = trialConcurrency;
                return this;
            }

            /**
             * tuner.
             */
            public Builder tuner(Tuner tuner) {
                this.tuner = tuner;
                return this;
            }

            public YmlConfig build() {
                return new YmlConfig(this);
            } 

        } 

    }
}
