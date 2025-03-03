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

        /**
         * <p>The information about the template.</p>
         */
        public Builder dataQualityRuleTemplate(DataQualityRuleTemplate dataQualityRuleTemplate) {
            this.dataQualityRuleTemplate = dataQualityRuleTemplate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>691CA452-D37A-4ED0-9441</p>
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

            /**
             * <p>The method that is used to query the referenced samples. To obtain some types of thresholds, you need to query reference samples and perform aggregate operations on the reference values. In this example, an expression is used to indicate the query method of referenced samples.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
             */
            public Builder referencedSamplesFilter(String referencedSamplesFilter) {
                this.referencedSamplesFilter = referencedSamplesFilter;
                return this;
            }

            /**
             * <p>The threshold calculation method. Valid values:</p>
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

            /**
             * <p>The metrics used for sampling. Valid values:</p>
             * <ul>
             * <li>Count: the number of rows in the table.</li>
             * <li>Min: the minimum value of the field.</li>
             * <li>Max: the maximum value of the field.</li>
             * <li>Avg: the average value of the field.</li>
             * <li>DistinctCount: the number of unique values of the field after deduplication.</li>
             * <li>DistinctPercent: the proportion of the number of unique values of the field after deduplication to the number of rows in the table.</li>
             * <li>DuplicatedCount: the number of duplicated values of the field.</li>
             * <li>DuplicatedPercent: the proportion of the number of duplicated values of the field to the number of rows in the table.</li>
             * <li>TableSize: the table size.</li>
             * <li>NullValueCount: the number of rows in which the field value is null.</li>
             * <li>NullValuePercent: the proportion of the number of rows in which the field value is null to the number of rows in the table.</li>
             * <li>GroupCount: the field value and the number of rows for each field value.</li>
             * <li>CountNotIn: the number of rows in which the field values are different from the referenced values that you specified in the rule.</li>
             * <li>CountDistinctNotIn: the number of unique values that are different from the referenced values that you specified in the rule after deduplication.</li>
             * <li>UserDefinedSql: indicates that data is sampled by executing custom SQL statements.</li>
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
             * <p>The parameters required for sampling.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
             */
            public Builder metricParameters(String metricParameters) {
                this.metricParameters = metricParameters;
                return this;
            }

            /**
             * <p>The statements that are used to configure the parameters required for sampling before you execute the sampling statements. The statements can be up to 1,000 characters in length. Only the MaxCompute database is supported.</p>
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

            /**
             * <p>The check settings for sample data.</p>
             */
            public Builder checkingConfig(CheckingConfig checkingConfig) {
                this.checkingConfig = checkingConfig;
                return this;
            }

            /**
             * <p>The code for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFINED:123</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The directory in which the template is stored. Slashes (/) are used to separate directory levels. The name of each directory level can be up to 1,024 characters in length. It cannot contain whitespace characters or slashes (/).</p>
             * 
             * <strong>example:</strong>
             * <p>/ods/order_data</p>
             */
            public Builder directoryPath(String directoryPath) {
                this.directoryPath = directoryPath;
                return this;
            }

            /**
             * <p>The name of the template. The name can be up to 512 characters in length and can contain digits, letters, and punctuation marks.</p>
             * 
             * <strong>example:</strong>
             * <p>Table row Count Verification</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4020</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The sampling settings.</p>
             */
            public Builder samplingConfig(SamplingConfig samplingConfig) {
                this.samplingConfig = samplingConfig;
                return this;
            }

            /**
             * <p>Available range of templates:</p>
             * <ul>
             * <li>Tenant: all tenants are available</li>
             * <li>Project: only available in the current Project</li>
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
