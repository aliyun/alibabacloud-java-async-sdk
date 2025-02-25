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
 * {@link ListDataQualityRuleTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataQualityRuleTemplatesResponseBody</p>
 */
public class ListDataQualityRuleTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataQualityRuleTemplatesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityRuleTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * <p>Quality Rule template pagination query results</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
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

        public ListDataQualityRuleTemplatesResponseBody build() {
            return new ListDataQualityRuleTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataQualityRuleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityRuleTemplatesResponseBody</p>
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
             * <p>Some types of thresholds need to query some reference samples, and then summarize the values of the reference samples to obtain the threshold for comparison. Here, an expression is used to represent the query method of the reference samples.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
             */
            public Builder referencedSamplesFilter(String referencedSamplesFilter) {
                this.referencedSamplesFilter = referencedSamplesFilter;
                return this;
            }

            /**
             * <p>Threshold Calculation method</p>
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
     * {@link ListDataQualityRuleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityRuleTemplatesResponseBody</p>
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
             * <p>The name of the sampled metric.</p>
             * <ul>
             * <li>Count: number of table rows</li>
             * <li>Min: minimum value of the field</li>
             * <li>Max: The maximum value of the field.</li>
             * <li>Avg: field mean</li>
             * <li>DistinctCount: number of unique field values</li>
             * <li>DistinctPercent: the ratio of the number of unique field values to the number of data rows.</li>
             * <li>DuplicatedCount: number of duplicate field values</li>
             * <li>DuplicatedPercent: the ratio of the number of duplicate field values to the number of data rows.</li>
             * <li>TableSize: table size</li>
             * <li>NullValueCount: number of rows with empty fields</li>
             * <li>NullValuePercent: the proportion of fields that are empty.</li>
             * <li>GroupCount: aggregate each value by field value and the corresponding number of data rows</li>
             * <li>CountNotIn: the enumerated value does not match the number of rows.</li>
             * <li>CountDistinctNotIn: the number of unique values that the enumerated values do not match.</li>
             * <li>UserDefinedSql: use custom SQL to collect samples</li>
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
             * <p>Parameters required for sample collection</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Sql&quot;: &quot;select count(1) from table;&quot;}</p>
             */
            public Builder metricParameters(String metricParameters) {
                this.metricParameters = metricParameters;
                return this;
            }

            /**
             * <p>Before executing the sample statement, insert some runtime parameter setting statements, which can be up to 1000 characters in length. Currently, only MaxCompute are supported.</p>
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
     * {@link ListDataQualityRuleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityRuleTemplatesResponseBody</p>
     */
    public static class DataQualityRuleTemplates extends TeaModel {
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

        private DataQualityRuleTemplates(Builder builder) {
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

        public static DataQualityRuleTemplates create() {
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
             * <p>Sample verification settings</p>
             */
            public Builder checkingConfig(CheckingConfig checkingConfig) {
                this.checkingConfig = checkingConfig;
                return this;
            }

            /**
             * <p>Rule template Code</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFINED:123</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The category directory where the custom template is stored, separated by slashes. Each level name can be up to 1024 characters in length and cannot contain white space characters or slashes.</p>
             * 
             * <strong>example:</strong>
             * <p>/ods/order_data</p>
             */
            public Builder directoryPath(String directoryPath) {
                this.directoryPath = directoryPath;
                return this;
            }

            /**
             * <p>Rule template name, a combination of numbers, English letters, Chinese characters, and half-width punctuation marks, up to 512 characters in length</p>
             * 
             * <strong>example:</strong>
             * <p>Table row Count Verification</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>DataWorks workspace ID</p>
             * 
             * <strong>example:</strong>
             * <p>2043</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Settings required for sample collection</p>
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

            public DataQualityRuleTemplates build() {
                return new DataQualityRuleTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityRuleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityRuleTemplatesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataQualityRuleTemplates")
        private java.util.List<DataQualityRuleTemplates> dataQualityRuleTemplates;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.dataQualityRuleTemplates = builder.dataQualityRuleTemplates;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return dataQualityRuleTemplates
         */
        public java.util.List<DataQualityRuleTemplates> getDataQualityRuleTemplates() {
            return this.dataQualityRuleTemplates;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DataQualityRuleTemplates> dataQualityRuleTemplates; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>Rule template list</p>
             */
            public Builder dataQualityRuleTemplates(java.util.List<DataQualityRuleTemplates> dataQualityRuleTemplates) {
                this.dataQualityRuleTemplates = dataQualityRuleTemplates;
                return this;
            }

            /**
             * <p>Page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of entries</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
