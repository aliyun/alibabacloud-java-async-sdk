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
 * {@link DataQualityRuleTemplate} extends {@link TeaModel}
 *
 * <p>DataQualityRuleTemplate</p>
 */
public class DataQualityRuleTemplate extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("VisibleScope")
    private String visibleScope;

    private DataQualityRuleTemplate(Builder builder) {
        this.checkingConfig = builder.checkingConfig;
        this.code = builder.code;
        this.directoryPath = builder.directoryPath;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.samplingConfig = builder.samplingConfig;
        this.tenantId = builder.tenantId;
        this.visibleScope = builder.visibleScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataQualityRuleTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
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
        private Long tenantId; 
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
            this.tenantId = model.tenantId;
            this.visibleScope = model.visibleScope;
        } 

        /**
         * CheckingConfig.
         */
        public Builder checkingConfig(CheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DirectoryPath.
         */
        public Builder directoryPath(String directoryPath) {
            this.directoryPath = directoryPath;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * SamplingConfig.
         */
        public Builder samplingConfig(SamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * VisibleScope.
         */
        public Builder visibleScope(String visibleScope) {
            this.visibleScope = visibleScope;
            return this;
        }

        public DataQualityRuleTemplate build() {
            return new DataQualityRuleTemplate(this);
        } 

    } 

    /**
     * 
     * {@link DataQualityRuleTemplate} extends {@link TeaModel}
     *
     * <p>DataQualityRuleTemplate</p>
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
             * ReferencedSamplesFilter.
             */
            public Builder referencedSamplesFilter(String referencedSamplesFilter) {
                this.referencedSamplesFilter = referencedSamplesFilter;
                return this;
            }

            /**
             * Type.
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
     * {@link DataQualityRuleTemplate} extends {@link TeaModel}
     *
     * <p>DataQualityRuleTemplate</p>
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
             * Metric.
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * MetricParameters.
             */
            public Builder metricParameters(String metricParameters) {
                this.metricParameters = metricParameters;
                return this;
            }

            /**
             * SettingConfig.
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
