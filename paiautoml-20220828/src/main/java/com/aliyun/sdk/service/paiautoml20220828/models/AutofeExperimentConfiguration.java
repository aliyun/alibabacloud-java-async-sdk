// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AutofeExperimentConfiguration} extends {@link TeaModel}
 *
 * <p>AutofeExperimentConfiguration</p>
 */
public class AutofeExperimentConfiguration extends TeaModel {
    @NameInMap("odps_config")
    @Validation(required = true)
    private OdpsConfig odpsConfig;

    @NameInMap("oss_config")
    @Validation(required = true)
    private OssConfig ossConfig;

    @NameInMap("yml_config")
    @Validation(required = true)
    private YmlConfig ymlConfig;

    private AutofeExperimentConfiguration(Builder builder) {
        this.odpsConfig = builder.odpsConfig;
        this.ossConfig = builder.ossConfig;
        this.ymlConfig = builder.ymlConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutofeExperimentConfiguration create() {
        return builder().build();
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
     * @return ymlConfig
     */
    public YmlConfig getYmlConfig() {
        return this.ymlConfig;
    }

    public static final class Builder {
        private OdpsConfig odpsConfig; 
        private OssConfig ossConfig; 
        private YmlConfig ymlConfig; 

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
         * yml_config.
         */
        public Builder ymlConfig(YmlConfig ymlConfig) {
            this.ymlConfig = ymlConfig;
            return this;
        }

        public AutofeExperimentConfiguration build() {
            return new AutofeExperimentConfiguration(this);
        } 

    } 

    public static class OdpsConfig extends TeaModel {
        @NameInMap("odps_access_id")
        private String odpsAccessId;

        @NameInMap("odps_access_key")
        private String odpsAccessKey;

        @NameInMap("odps_endpoint")
        @Validation(required = true)
        private String odpsEndpoint;

        @NameInMap("odps_project_name")
        @Validation(required = true)
        private String odpsProjectName;

        @NameInMap("odps_region_id")
        @Validation(required = true)
        private String odpsRegionId;

        @NameInMap("odps_role_arn")
        private String odpsRoleArn;

        private OdpsConfig(Builder builder) {
            this.odpsAccessId = builder.odpsAccessId;
            this.odpsAccessKey = builder.odpsAccessKey;
            this.odpsEndpoint = builder.odpsEndpoint;
            this.odpsProjectName = builder.odpsProjectName;
            this.odpsRegionId = builder.odpsRegionId;
            this.odpsRoleArn = builder.odpsRoleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OdpsConfig create() {
            return builder().build();
        }

        /**
         * @return odpsAccessId
         */
        public String getOdpsAccessId() {
            return this.odpsAccessId;
        }

        /**
         * @return odpsAccessKey
         */
        public String getOdpsAccessKey() {
            return this.odpsAccessKey;
        }

        /**
         * @return odpsEndpoint
         */
        public String getOdpsEndpoint() {
            return this.odpsEndpoint;
        }

        /**
         * @return odpsProjectName
         */
        public String getOdpsProjectName() {
            return this.odpsProjectName;
        }

        /**
         * @return odpsRegionId
         */
        public String getOdpsRegionId() {
            return this.odpsRegionId;
        }

        /**
         * @return odpsRoleArn
         */
        public String getOdpsRoleArn() {
            return this.odpsRoleArn;
        }

        public static final class Builder {
            private String odpsAccessId; 
            private String odpsAccessKey; 
            private String odpsEndpoint; 
            private String odpsProjectName; 
            private String odpsRegionId; 
            private String odpsRoleArn; 

            /**
             * odps_access_id.
             */
            public Builder odpsAccessId(String odpsAccessId) {
                this.odpsAccessId = odpsAccessId;
                return this;
            }

            /**
             * odps_access_key.
             */
            public Builder odpsAccessKey(String odpsAccessKey) {
                this.odpsAccessKey = odpsAccessKey;
                return this;
            }

            /**
             * odps_endpoint.
             */
            public Builder odpsEndpoint(String odpsEndpoint) {
                this.odpsEndpoint = odpsEndpoint;
                return this;
            }

            /**
             * odps_project_name.
             */
            public Builder odpsProjectName(String odpsProjectName) {
                this.odpsProjectName = odpsProjectName;
                return this;
            }

            /**
             * odps_region_id.
             */
            public Builder odpsRegionId(String odpsRegionId) {
                this.odpsRegionId = odpsRegionId;
                return this;
            }

            /**
             * odps_role_arn.
             */
            public Builder odpsRoleArn(String odpsRoleArn) {
                this.odpsRoleArn = odpsRoleArn;
                return this;
            }

            public OdpsConfig build() {
                return new OdpsConfig(this);
            } 

        } 

    }
    public static class OssConfig extends TeaModel {
        @NameInMap("oss_access_id")
        private String ossAccessId;

        @NameInMap("oss_access_key")
        private String ossAccessKey;

        @NameInMap("oss_bucket")
        @Validation(required = true)
        private String ossBucket;

        @NameInMap("oss_endpoint")
        @Validation(required = true)
        private String ossEndpoint;

        @NameInMap("oss_role_arn")
        private String ossRoleArn;

        private OssConfig(Builder builder) {
            this.ossAccessId = builder.ossAccessId;
            this.ossAccessKey = builder.ossAccessKey;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossRoleArn = builder.ossRoleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssConfig create() {
            return builder().build();
        }

        /**
         * @return ossAccessId
         */
        public String getOssAccessId() {
            return this.ossAccessId;
        }

        /**
         * @return ossAccessKey
         */
        public String getOssAccessKey() {
            return this.ossAccessKey;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return ossRoleArn
         */
        public String getOssRoleArn() {
            return this.ossRoleArn;
        }

        public static final class Builder {
            private String ossAccessId; 
            private String ossAccessKey; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossRoleArn; 

            /**
             * oss_access_id.
             */
            public Builder ossAccessId(String ossAccessId) {
                this.ossAccessId = ossAccessId;
                return this;
            }

            /**
             * oss_access_key.
             */
            public Builder ossAccessKey(String ossAccessKey) {
                this.ossAccessKey = ossAccessKey;
                return this;
            }

            /**
             * oss_bucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * oss_endpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * oss_role_arn.
             */
            public Builder ossRoleArn(String ossRoleArn) {
                this.ossRoleArn = ossRoleArn;
                return this;
            }

            public OssConfig build() {
                return new OssConfig(this);
            } 

        } 

    }
    public static class YmlConfig extends TeaModel {
        @NameInMap("action")
        private String action;

        @NameInMap("aggregate_only")
        private String aggregateOnly;

        @NameInMap("analyze_exp_id")
        private String analyzeExpId;

        @NameInMap("cpu")
        private String cpu;

        @NameInMap("data_partition")
        private String dataPartition;

        @NameInMap("data_source")
        @Validation(required = true)
        private String dataSource;

        @NameInMap("data_type")
        private String dataType;

        @NameInMap("debug_mode")
        private String debugMode;

        @NameInMap("exclude_columns")
        private String excludeColumns;

        @NameInMap("feature_selection")
        private String featureSelection;

        @NameInMap("filter_thresh")
        private String filterThresh;

        @NameInMap("iv_thresh")
        private String ivThresh;

        @NameInMap("label")
        @Validation(required = true)
        private String label;

        @NameInMap("memory")
        private String memory;

        @NameInMap("output_config_oss_dir")
        @Validation(required = true)
        private String outputConfigOssDir;

        @NameInMap("pipeline_exp_id")
        private String pipelineExpId;

        @NameInMap("reuse_results")
        private String reuseResults;

        @NameInMap("sample_ratio")
        private String sampleRatio;

        @NameInMap("sample_size")
        private String sampleSize;

        @NameInMap("selection_exp_id")
        private String selectionExpId;

        @NameInMap("skip_select")
        private String skipSelect;

        @NameInMap("workers")
        private String workers;

        @NameInMap("workspace_name")
        @Validation(required = true)
        private String workspaceName;

        private YmlConfig(Builder builder) {
            this.action = builder.action;
            this.aggregateOnly = builder.aggregateOnly;
            this.analyzeExpId = builder.analyzeExpId;
            this.cpu = builder.cpu;
            this.dataPartition = builder.dataPartition;
            this.dataSource = builder.dataSource;
            this.dataType = builder.dataType;
            this.debugMode = builder.debugMode;
            this.excludeColumns = builder.excludeColumns;
            this.featureSelection = builder.featureSelection;
            this.filterThresh = builder.filterThresh;
            this.ivThresh = builder.ivThresh;
            this.label = builder.label;
            this.memory = builder.memory;
            this.outputConfigOssDir = builder.outputConfigOssDir;
            this.pipelineExpId = builder.pipelineExpId;
            this.reuseResults = builder.reuseResults;
            this.sampleRatio = builder.sampleRatio;
            this.sampleSize = builder.sampleSize;
            this.selectionExpId = builder.selectionExpId;
            this.skipSelect = builder.skipSelect;
            this.workers = builder.workers;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static YmlConfig create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return aggregateOnly
         */
        public String getAggregateOnly() {
            return this.aggregateOnly;
        }

        /**
         * @return analyzeExpId
         */
        public String getAnalyzeExpId() {
            return this.analyzeExpId;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return dataPartition
         */
        public String getDataPartition() {
            return this.dataPartition;
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
         * @return debugMode
         */
        public String getDebugMode() {
            return this.debugMode;
        }

        /**
         * @return excludeColumns
         */
        public String getExcludeColumns() {
            return this.excludeColumns;
        }

        /**
         * @return featureSelection
         */
        public String getFeatureSelection() {
            return this.featureSelection;
        }

        /**
         * @return filterThresh
         */
        public String getFilterThresh() {
            return this.filterThresh;
        }

        /**
         * @return ivThresh
         */
        public String getIvThresh() {
            return this.ivThresh;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return outputConfigOssDir
         */
        public String getOutputConfigOssDir() {
            return this.outputConfigOssDir;
        }

        /**
         * @return pipelineExpId
         */
        public String getPipelineExpId() {
            return this.pipelineExpId;
        }

        /**
         * @return reuseResults
         */
        public String getReuseResults() {
            return this.reuseResults;
        }

        /**
         * @return sampleRatio
         */
        public String getSampleRatio() {
            return this.sampleRatio;
        }

        /**
         * @return sampleSize
         */
        public String getSampleSize() {
            return this.sampleSize;
        }

        /**
         * @return selectionExpId
         */
        public String getSelectionExpId() {
            return this.selectionExpId;
        }

        /**
         * @return skipSelect
         */
        public String getSkipSelect() {
            return this.skipSelect;
        }

        /**
         * @return workers
         */
        public String getWorkers() {
            return this.workers;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private String action; 
            private String aggregateOnly; 
            private String analyzeExpId; 
            private String cpu; 
            private String dataPartition; 
            private String dataSource; 
            private String dataType; 
            private String debugMode; 
            private String excludeColumns; 
            private String featureSelection; 
            private String filterThresh; 
            private String ivThresh; 
            private String label; 
            private String memory; 
            private String outputConfigOssDir; 
            private String pipelineExpId; 
            private String reuseResults; 
            private String sampleRatio; 
            private String sampleSize; 
            private String selectionExpId; 
            private String skipSelect; 
            private String workers; 
            private String workspaceName; 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * aggregate_only.
             */
            public Builder aggregateOnly(String aggregateOnly) {
                this.aggregateOnly = aggregateOnly;
                return this;
            }

            /**
             * analyze_exp_id.
             */
            public Builder analyzeExpId(String analyzeExpId) {
                this.analyzeExpId = analyzeExpId;
                return this;
            }

            /**
             * cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * data_partition.
             */
            public Builder dataPartition(String dataPartition) {
                this.dataPartition = dataPartition;
                return this;
            }

            /**
             * data_source.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * data_type.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * debug_mode.
             */
            public Builder debugMode(String debugMode) {
                this.debugMode = debugMode;
                return this;
            }

            /**
             * exclude_columns.
             */
            public Builder excludeColumns(String excludeColumns) {
                this.excludeColumns = excludeColumns;
                return this;
            }

            /**
             * feature_selection.
             */
            public Builder featureSelection(String featureSelection) {
                this.featureSelection = featureSelection;
                return this;
            }

            /**
             * filter_thresh.
             */
            public Builder filterThresh(String filterThresh) {
                this.filterThresh = filterThresh;
                return this;
            }

            /**
             * iv_thresh.
             */
            public Builder ivThresh(String ivThresh) {
                this.ivThresh = ivThresh;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * output_config_oss_dir.
             */
            public Builder outputConfigOssDir(String outputConfigOssDir) {
                this.outputConfigOssDir = outputConfigOssDir;
                return this;
            }

            /**
             * pipeline_exp_id.
             */
            public Builder pipelineExpId(String pipelineExpId) {
                this.pipelineExpId = pipelineExpId;
                return this;
            }

            /**
             * reuse_results.
             */
            public Builder reuseResults(String reuseResults) {
                this.reuseResults = reuseResults;
                return this;
            }

            /**
             * sample_ratio.
             */
            public Builder sampleRatio(String sampleRatio) {
                this.sampleRatio = sampleRatio;
                return this;
            }

            /**
             * sample_size.
             */
            public Builder sampleSize(String sampleSize) {
                this.sampleSize = sampleSize;
                return this;
            }

            /**
             * selection_exp_id.
             */
            public Builder selectionExpId(String selectionExpId) {
                this.selectionExpId = selectionExpId;
                return this;
            }

            /**
             * skip_select.
             */
            public Builder skipSelect(String skipSelect) {
                this.skipSelect = skipSelect;
                return this;
            }

            /**
             * workers.
             */
            public Builder workers(String workers) {
                this.workers = workers;
                return this;
            }

            /**
             * workspace_name.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public YmlConfig build() {
                return new YmlConfig(this);
            } 

        } 

    }
}
