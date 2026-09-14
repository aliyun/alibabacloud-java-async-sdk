// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDataQualityRuleTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityRuleTemplateResponseBody</p>
 */
public class GetDataQualityRuleTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityRuleTemplate")
    private DataQualityRuleTemplate dataQualityRuleTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityRuleTemplateResponseBody(Builder builder) {
        this.dataQualityRuleTemplate = builder.dataQualityRuleTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityRuleTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataQualityRuleTemplate
     */
    public DataQualityRuleTemplate getDataQualityRuleTemplate() {
        return this.dataQualityRuleTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityRuleTemplate dataQualityRuleTemplate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataQualityRuleTemplateResponseBody model) {
            this.dataQualityRuleTemplate = model.dataQualityRuleTemplate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the rule template.</p>
         */
        public Builder dataQualityRuleTemplate(DataQualityRuleTemplate dataQualityRuleTemplate) {
            this.dataQualityRuleTemplate = dataQualityRuleTemplate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>691CA452-D37A-4E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityRuleTemplateResponseBody build() {
            return new GetDataQualityRuleTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityRuleTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleTemplateResponseBody</p>
     */
    public static class CheckingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReferencedSamplesFilter")
        private String referencedSamplesFilter;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CheckingConfig(Builder builder) {
            this.referencedSamplesFilter = builder.referencedSamplesFilter;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckingConfig create() {
            return builder().build();
        }

        /**
         * @return referencedSamplesFilter
         */
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String referencedSamplesFilter; 
            private String type; 

            private Builder() {
            } 

            private Builder(CheckingConfig model) {
                this.referencedSamplesFilter = model.referencedSamplesFilter;
                this.type = model.type;
            } 

            /**
             * <p>Some types of thresholds require you to query reference samples and aggregate the values of the reference samples to obtain the threshold for comparison. An expression is used to indicate the query method of reference samples.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
             */
            public Builder referencedSamplesFilter(String referencedSamplesFilter) {
                this.referencedSamplesFilter = referencedSamplesFilter;
                return this;
            }

            /**
             * <p>The threshold calculation method:</p>
             * <ul>
             * <li>Fixed</li>
             * <li>Fluctation</li>
             * <li>FluctationDiscreate</li>
             * <li>Auto</li>
             * <li>Average</li>
             * <li>Variance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Fixed</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CheckingConfig build() {
                return new CheckingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleTemplateResponseBody</p>
     */
    public static class SamplingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricParameters")
        private String metricParameters;

        @com.aliyun.core.annotation.NameInMap("SettingConfig")
        private String settingConfig;

        private SamplingConfig(Builder builder) {
            this.metric = builder.metric;
            this.metricParameters = builder.metricParameters;
            this.settingConfig = builder.settingConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamplingConfig create() {
            return builder().build();
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return metricParameters
         */
        public String getMetricParameters() {
            return this.metricParameters;
        }

        /**
         * @return settingConfig
         */
        public String getSettingConfig() {
            return this.settingConfig;
        }

        public static final class Builder {
            private String metric; 
            private String metricParameters; 
            private String settingConfig; 

            private Builder() {
            } 

            private Builder(SamplingConfig model) {
                this.metric = model.metric;
                this.metricParameters = model.metricParameters;
                this.settingConfig = model.settingConfig;
            } 

            /**
             * <p>The name of the metric to be sampled:</p>
             * <ul>
             * <li>Count: the number of rows in the table.</li>
             * <li>Min: the minimum value of the field.</li>
             * <li>Max: the maximum value of the field.</li>
             * <li>Avg: the average value of the field.</li>
             * <li>DistinctCount: the number of distinct values of the field.</li>
             * <li>DistinctPercent: the ratio of the number of distinct values of the field to the number of data rows.</li>
             * <li>DuplicatedCount: the number of duplicate values of the field.</li>
             * <li>DuplicatedPercent: the ratio of the number of duplicate values of the field to the number of data rows.</li>
             * <li>TableSize: the size of the table.</li>
             * <li>NullValueCount: the number of rows in which the field is null.</li>
             * <li>NullValuePercent: the percentage of rows in which the field is null.</li>
             * <li>GroupCount: the number of data rows corresponding to each value after aggregation by field value.</li>
             * <li>CountNotIn: the number of rows whose enumerated values do not match.</li>
             * <li>CountDistinctNotIn: the number of distinct values whose enumerated values do not match.</li>
             * <li>UserDefinedSql: collects samples by using a custom SQL statement.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Max</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The parameters required for sample collection.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
             */
            public Builder metricParameters(String metricParameters) {
                this.metricParameters = metricParameters;
                return this;
            }

            /**
             * <p>The runtime parameter setting statements that are inserted and executed before the specific sampling statement is executed. The setting can be a maximum of 1,000 characters in length. Only MaxCompute is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>SET odps.sql.udf.timeout=600s; 
             * SET odps.sql.python.version=cp27;</p>
             */
            public Builder settingConfig(String settingConfig) {
                this.settingConfig = settingConfig;
                return this;
            }

            public SamplingConfig build() {
                return new SamplingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityRuleTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityRuleTemplateResponseBody</p>
     */
    public static class DataQualityRuleTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingConfig")
        private CheckingConfig checkingConfig;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DirectoryPath")
        private String directoryPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SamplingConfig")
        private SamplingConfig samplingConfig;

        @com.aliyun.core.annotation.NameInMap("VisibleScope")
        private String visibleScope;

        private DataQualityRuleTemplate(Builder builder) {
            this.checkingConfig = builder.checkingConfig;
            this.code = builder.code;
            this.directoryPath = builder.directoryPath;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.samplingConfig = builder.samplingConfig;
            this.visibleScope = builder.visibleScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityRuleTemplate create() {
            return builder().build();
        }

        /**
         * @return checkingConfig
         */
        public CheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return directoryPath
         */
        public String getDirectoryPath() {
            return this.directoryPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return samplingConfig
         */
        public SamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        /**
         * @return visibleScope
         */
        public String getVisibleScope() {
            return this.visibleScope;
        }

        public static final class Builder {
            private CheckingConfig checkingConfig; 
            private String code; 
            private String directoryPath; 
            private String name; 
            private Long projectId; 
            private SamplingConfig samplingConfig; 
            private String visibleScope; 

            private Builder() {
            } 

            private Builder(DataQualityRuleTemplate model) {
                this.checkingConfig = model.checkingConfig;
                this.code = model.code;
                this.directoryPath = model.directoryPath;
                this.name = model.name;
                this.projectId = model.projectId;
                this.samplingConfig = model.samplingConfig;
                this.visibleScope = model.visibleScope;
            } 

            /**
             * <p>The sample verification settings.</p>
             */
            public Builder checkingConfig(CheckingConfig checkingConfig) {
                this.checkingConfig = checkingConfig;
                return this;
            }

            /**
             * <p>The code of the rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFINED:123</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The category directory in which the custom template is stored. Levels are separated by forward slashes (/). Each level name can be a maximum of 1,024 characters in length and cannot contain whitespace characters or forward slashes (/).</p>
             * 
             * <strong>example:</strong>
             * <p>/ods/order_data</p>
             */
            public Builder directoryPath(String directoryPath) {
                this.directoryPath = directoryPath;
                return this;
            }

            /**
             * <p>The name of the rule template. The name can be a combination of digits, letters, Chinese characters, and half-width or full-width punctuation marks. The name can be a maximum of 512 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>Table row Count Verification</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>4020</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The settings required for sample collection.</p>
             */
            public Builder samplingConfig(SamplingConfig samplingConfig) {
                this.samplingConfig = samplingConfig;
                return this;
            }

            /**
             * <p>The scope in which the template is available:</p>
             * <ul>
             * <li>Tenant: available to the entire tenant.</li>
             * <li>Project: available only in the current project.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Project</p>
             */
            public Builder visibleScope(String visibleScope) {
                this.visibleScope = visibleScope;
                return this;
            }

            public DataQualityRuleTemplate build() {
                return new DataQualityRuleTemplate(this);
            } 

        } 

    }
}
