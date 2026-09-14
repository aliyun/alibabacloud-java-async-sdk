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
 * {@link CreateDataQualityRuleTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateDataQualityRuleTemplateRequest</p>
 */
public class CreateDataQualityRuleTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckingConfig")
    private CheckingConfig checkingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DirectoryPath")
    private String directoryPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SamplingConfig")
    private SamplingConfig samplingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VisibleScope")
    private String visibleScope;

    private CreateDataQualityRuleTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkingConfig = builder.checkingConfig;
        this.directoryPath = builder.directoryPath;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.samplingConfig = builder.samplingConfig;
        this.visibleScope = builder.visibleScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataQualityRuleTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return checkingConfig
     */
    public CheckingConfig getCheckingConfig() {
        return this.checkingConfig;
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

    public static final class Builder extends Request.Builder<CreateDataQualityRuleTemplateRequest, Builder> {
        private String regionId; 
        private CheckingConfig checkingConfig; 
        private String directoryPath; 
        private String name; 
        private Long projectId; 
        private SamplingConfig samplingConfig; 
        private String visibleScope; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataQualityRuleTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkingConfig = request.checkingConfig;
            this.directoryPath = request.directoryPath;
            this.name = request.name;
            this.projectId = request.projectId;
            this.samplingConfig = request.samplingConfig;
            this.visibleScope = request.visibleScope;
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
         * <p>The sample verification settings.</p>
         */
        public Builder checkingConfig(CheckingConfig checkingConfig) {
            String checkingConfigShrink = shrink(checkingConfig, "CheckingConfig", "json");
            this.putBodyParameter("CheckingConfig", checkingConfigShrink);
            this.checkingConfig = checkingConfig;
            return this;
        }

        /**
         * <p>The directory path where the custom template is stored. Levels are separated by forward slashes (/). Each level name can be up to 1024 characters in length and cannot contain whitespace characters or forward slashes.</p>
         * 
         * <strong>example:</strong>
         * <p>/ods/order_data</p>
         */
        public Builder directoryPath(String directoryPath) {
            this.putBodyParameter("DirectoryPath", directoryPath);
            this.directoryPath = directoryPath;
            return this;
        }

        /**
         * <p>The name of the rule template. The name can contain digits, letters, Chinese characters, and half-width or full-width punctuation marks. The name can be up to 512 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Table row Count Verification</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The settings required for sample collection.</p>
         */
        public Builder samplingConfig(SamplingConfig samplingConfig) {
            String samplingConfigShrink = shrink(samplingConfig, "SamplingConfig", "json");
            this.putBodyParameter("SamplingConfig", samplingConfigShrink);
            this.samplingConfig = samplingConfig;
            return this;
        }

        /**
         * <p>The visibility scope of the template. Valid values:</p>
         * <ul>
         * <li>Tenant: available to the entire tenant.</li>
         * <li>Project: available only in the current project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        public Builder visibleScope(String visibleScope) {
            this.putBodyParameter("VisibleScope", visibleScope);
            this.visibleScope = visibleScope;
            return this;
        }

        @Override
        public CreateDataQualityRuleTemplateRequest build() {
            return new CreateDataQualityRuleTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataQualityRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityRuleTemplateRequest</p>
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
             * <p>An expression that specifies how to query reference samples. Some threshold types require querying reference samples and then aggregating their values to derive the threshold for comparison.</p>
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
     * {@link CreateDataQualityRuleTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityRuleTemplateRequest</p>
     */
    public static class SamplingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricParameters")
        private String metricParameters;

        @com.aliyun.core.annotation.NameInMap("SettingConfig")
        @com.aliyun.core.annotation.Validation(maxLength = 1000)
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
             * <p>The name of the sampling metric. Valid values:</p>
             * <ul>
             * <li>Count: the number of table rows.</li>
             * <li>Min: the minimum value of a field.</li>
             * <li>Max: the maximum value of a field.</li>
             * <li>Avg: the average value of a field.</li>
             * <li>DistinctCount: the number of distinct values in a field.</li>
             * <li>DistinctPercent: the ratio of distinct values to the total number of rows.</li>
             * <li>DuplicatedCount: the number of duplicate values in a field.</li>
             * <li>DuplicatedPercent: the ratio of duplicate values to the total number of rows.</li>
             * <li>TableSize: the table size.</li>
             * <li>NullValueCount: the number of rows where the field value is null.</li>
             * <li>NullValuePercent: the ratio of rows where the field value is null.</li>
             * <li>GroupCount: the count of rows for each value after aggregation by field value.</li>
             * <li>CountNotIn: the number of rows that do not match the enumerated values.</li>
             * <li>CountDistinctNotIn: the number of distinct values that do not match the enumerated values.</li>
             * <li>UserDefinedSql: sample collection through a custom SQL statement.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Count</p>
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
             * <p>The runtime parameter setting statements to execute before the sampling statement. The value can be up to 1000 characters in length. Currently, only MaxCompute is supported.</p>
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
}
