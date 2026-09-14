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
 * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataQualityResultsResponseBody</p>
 */
public class ListDataQualityResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataQualityResultsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDataQualityResultsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>数据质量校验结果分页查询结果。</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>API请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>691CA452-D37A-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataQualityResultsResponseBody build() {
            return new ListDataQualityResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckedValue")
        private String checkedValue;

        @com.aliyun.core.annotation.NameInMap("ReferencedValue")
        private String referencedValue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Details(Builder builder) {
            this.checkedValue = builder.checkedValue;
            this.referencedValue = builder.referencedValue;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return checkedValue
         */
        public String getCheckedValue() {
            return this.checkedValue;
        }

        /**
         * @return referencedValue
         */
        public String getReferencedValue() {
            return this.referencedValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String checkedValue; 
            private String referencedValue; 
            private String status; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.checkedValue = model.checkedValue;
                this.referencedValue = model.referencedValue;
                this.status = model.status;
            } 

            /**
             * <p>最终用来与阈值比较的值。</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder checkedValue(String checkedValue) {
                this.checkedValue = checkedValue;
                return this;
            }

            /**
             * <p>使用引用的样本，用来参与CheckedValue计算的基准值。</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder referencedValue(String referencedValue) {
                this.referencedValue = referencedValue;
                return this;
            }

            /**
             * <p>最终的比较结果状态：</p>
             * <ul>
             * <li>Error</li>
             * <li>Passed</li>
             * <li>Warned</li>
             * <li>Critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Passed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Critical(Builder builder) {
            this.expression = builder.expression;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Critical create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String expression; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Critical model) {
                this.expression = model.expression;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>阈值表达式。</p>
             * <p>波动率类型规则必须使用表达式方式表示波动阈值。如：</p>
             * <ul>
             * <li>波动上升大于0.01： $checkValue &gt; 0.01 </li>
             * <li>波动下降大于0.01：$checkValue &lt; -0.01 </li>
             * <li>波动率绝对值：abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>固定值类型规则也可以使用表达式方式配置阈值，如果同时配置，表达式优先级高于Operator和Value。</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &gt; 0.01</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>比较符：</p>
             * <ul>
             * <li>\&gt;</li>
             * <li>\&gt;=</li>
             * <li>\&lt;</li>
             * <li>\&lt;=</li>
             * <li>!=</li>
             * <li>=</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>阈值数值。</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Critical build() {
                return new Critical(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class Expected extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Expected(Builder builder) {
            this.expression = builder.expression;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expected create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String expression; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Expected model) {
                this.expression = model.expression;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>阈值表达式。</p>
             * <p>波动率类型规则必须使用表达式方式表示波动阈值。如：</p>
             * <ul>
             * <li>波动上升大于0.01： $checkValue &gt; 0.01 </li>
             * <li>波动下降大于0.01：$checkValue &lt; -0.01 </li>
             * <li>波动率绝对值：abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>固定值类型规则也可以使用表达式方式配置阈值，如果同时配置，表达式优先级高于Operator和Value。</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &gt; 0.01</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>比较符：</p>
             * <ul>
             * <li>\&gt;</li>
             * <li>\&gt;=</li>
             * <li>\&lt;</li>
             * <li>\&lt;=</li>
             * <li>!=</li>
             * <li>=</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>阈值数值。</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Expected build() {
                return new Expected(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class Warned extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Warned(Builder builder) {
            this.expression = builder.expression;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warned create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String expression; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Warned model) {
                this.expression = model.expression;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>阈值表达式。</p>
             * <p>波动率类型规则必须使用表达式方式表示波动阈值。如：</p>
             * <ul>
             * <li>波动上升大于0.01： $checkValue &gt; 0.01 </li>
             * <li>波动下降大于0.01：$checkValue &lt; -0.01 </li>
             * <li>波动率绝对值：abs($checkValue) &gt; 0.01</li>
             * </ul>
             * <p>固定值类型规则也可以使用表达式方式配置阈值，如果同时配置，表达式优先级高于Operator和Value。</p>
             * 
             * <strong>example:</strong>
             * <p>$checkValue &gt; 0.01</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>比较符：</p>
             * <ul>
             * <li>\&gt;</li>
             * <li>\&gt;=</li>
             * <li>\&lt;</li>
             * <li>\&lt;=</li>
             * <li>!=</li>
             * <li>=</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>阈值数值。</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Warned build() {
                return new Warned(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class Thresholds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Expected")
        private Expected expected;

        @com.aliyun.core.annotation.NameInMap("Warned")
        private Warned warned;

        private Thresholds(Builder builder) {
            this.critical = builder.critical;
            this.expected = builder.expected;
            this.warned = builder.warned;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thresholds create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Critical getCritical() {
            return this.critical;
        }

        /**
         * @return expected
         */
        public Expected getExpected() {
            return this.expected;
        }

        /**
         * @return warned
         */
        public Warned getWarned() {
            return this.warned;
        }

        public static final class Builder {
            private Critical critical; 
            private Expected expected; 
            private Warned warned; 

            private Builder() {
            } 

            private Builder(Thresholds model) {
                this.critical = model.critical;
                this.expected = model.expected;
                this.warned = model.warned;
            } 

            /**
             * <p>严重警告的阈值设置。</p>
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * <p>期望的阈值设置。</p>
             */
            public Builder expected(Expected expected) {
                this.expected = expected;
                return this;
            }

            /**
             * <p>普通警告的阈值设置。</p>
             */
            public Builder warned(Warned warned) {
                this.warned = warned;
                return this;
            }

            public Thresholds build() {
                return new Thresholds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class CheckingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReferencedSamplesFilter")
        private String referencedSamplesFilter;

        @com.aliyun.core.annotation.NameInMap("Thresholds")
        private Thresholds thresholds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CheckingConfig(Builder builder) {
            this.referencedSamplesFilter = builder.referencedSamplesFilter;
            this.thresholds = builder.thresholds;
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
         * @return thresholds
         */
        public Thresholds getThresholds() {
            return this.thresholds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String referencedSamplesFilter; 
            private Thresholds thresholds; 
            private String type; 

            private Builder() {
            } 

            private Builder(CheckingConfig model) {
                this.referencedSamplesFilter = model.referencedSamplesFilter;
                this.thresholds = model.thresholds;
                this.type = model.type;
            } 

            /**
             * <p>有些类型的阈值需要查询出一些参考样本，然后对参考样本的值进行汇总得出进行比较的阈值，这里使用一个表达式来表示参考样本的查询方式。</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
             */
            public Builder referencedSamplesFilter(String referencedSamplesFilter) {
                this.referencedSamplesFilter = referencedSamplesFilter;
                return this;
            }

            /**
             * <p>阈值设置。</p>
             */
            public Builder thresholds(Thresholds thresholds) {
                this.thresholds = thresholds;
                return this;
            }

            /**
             * <p>阈值计算方式：</p>
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
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class ErrorHandlers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorDataFilter")
        private String errorDataFilter;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ErrorHandlers(Builder builder) {
            this.errorDataFilter = builder.errorDataFilter;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorHandlers create() {
            return builder().build();
        }

        /**
         * @return errorDataFilter
         */
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String errorDataFilter; 
            private String type; 

            private Builder() {
            } 

            private Builder(ErrorHandlers model) {
                this.errorDataFilter = model.errorDataFilter;
                this.type = model.type;
            } 

            /**
             * <p>如果是自定义SQL规则，需要用户指定SQL来过滤问题数据。</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
             */
            public Builder errorDataFilter(String errorDataFilter) {
                this.errorDataFilter = errorDataFilter;
                return this;
            }

            /**
             * <p>处理器类型。</p>
             * <ul>
             * <li>SaveErrorData</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SaveErrorData</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ErrorHandlers build() {
                return new ErrorHandlers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class SamplingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("MetricParameters")
        private String metricParameters;

        @com.aliyun.core.annotation.NameInMap("SamplingFilter")
        private String samplingFilter;

        @com.aliyun.core.annotation.NameInMap("SettingConfig")
        private String settingConfig;

        private SamplingConfig(Builder builder) {
            this.metric = builder.metric;
            this.metricParameters = builder.metricParameters;
            this.samplingFilter = builder.samplingFilter;
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
         * @return samplingFilter
         */
        public String getSamplingFilter() {
            return this.samplingFilter;
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
            private String samplingFilter; 
            private String settingConfig; 

            private Builder() {
            } 

            private Builder(SamplingConfig model) {
                this.metric = model.metric;
                this.metricParameters = model.metricParameters;
                this.samplingFilter = model.samplingFilter;
                this.settingConfig = model.settingConfig;
            } 

            /**
             * <p>采样的指标名称：</p>
             * <ul>
             * <li>Count：表行数</li>
             * <li>Min：字段最小值</li>
             * <li>Max：字段最大值</li>
             * <li>Avg：字段均值</li>
             * <li>DistinctCount：字段唯一值个数</li>
             * <li>DistinctPercent：字段唯一值个数与数据行数占比</li>
             * <li>DuplicatedCount：字段重复值个数</li>
             * <li>DuplicatedPercent：字段重复值个数与数据行数占比</li>
             * <li>TableSize：表大小</li>
             * <li>NullValueCount：字段为空的行数</li>
             * <li>NullValuePercent：字段为空的比例</li>
             * <li>GroupCount：按字段值聚合后每个值与对应的数据行数</li>
             * <li>CountNotIn：枚举值不匹配行数</li>
             * <li>CountDistinctNotIn：枚举值不匹配唯一值个数</li>
             * <li>UserDefinedSql：通过自定义SQL做样本采集</li>
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
             * <p>样本采集时，所需的参数。</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] }</p>
             */
            public Builder metricParameters(String metricParameters) {
                this.metricParameters = metricParameters;
                return this;
            }

            /**
             * <p>采样时，对不关注的数据进行二次过滤的条件，最多16777215个字符。</p>
             * 
             * <strong>example:</strong>
             * <p>id IS NULL</p>
             */
            public Builder samplingFilter(String samplingFilter) {
                this.samplingFilter = samplingFilter;
                return this;
            }

            /**
             * <p>具体执行采样语句前，插入执行的一些运行时参数设置语句，最长1000个字符。目前只支持MaxCompute。</p>
             * 
             * <strong>example:</strong>
             * <p>SET odps.sql.udf.timeout=600s;</p>
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
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Target(Builder builder) {
            this.databaseType = builder.databaseType;
            this.tableGuid = builder.tableGuid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String databaseType; 
            private String tableGuid; 
            private String type; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.databaseType = model.databaseType;
                this.tableGuid = model.tableGuid;
                this.type = model.type;
            } 

            /**
             * <p>表类型的数据集，表所属的数据库类型：</p>
             * <ul>
             * <li>maxcompute</li>
             * <li>emr</li>
             * <li>cdh</li>
             * <li>hologres</li>
             * <li>analyticdb_for_postgresql</li>
             * <li>analyticdb_for_mysql</li>
             * <li>starrocks</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>表在数据地图中的唯一ID。</p>
             * 
             * <strong>example:</strong>
             * <p>odps.unit_test.tb_unit_test</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>监控对象类型：</p>
             * <ul>
             * <li>Table</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingConfig")
        private CheckingConfig checkingConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ErrorHandlers")
        private java.util.List<ErrorHandlers> errorHandlers;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SamplingConfig")
        private SamplingConfig samplingConfig;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private Rule(Builder builder) {
            this.checkingConfig = builder.checkingConfig;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.errorHandlers = builder.errorHandlers;
            this.id = builder.id;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.samplingConfig = builder.samplingConfig;
            this.severity = builder.severity;
            this.target = builder.target;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return checkingConfig
         */
        public CheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return errorHandlers
         */
        public java.util.List<ErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private CheckingConfig checkingConfig; 
            private String description; 
            private Boolean enabled; 
            private java.util.List<ErrorHandlers> errorHandlers; 
            private Long id; 
            private String name; 
            private Long projectId; 
            private SamplingConfig samplingConfig; 
            private String severity; 
            private Target target; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(Rule model) {
                this.checkingConfig = model.checkingConfig;
                this.description = model.description;
                this.enabled = model.enabled;
                this.errorHandlers = model.errorHandlers;
                this.id = model.id;
                this.name = model.name;
                this.projectId = model.projectId;
                this.samplingConfig = model.samplingConfig;
                this.severity = model.severity;
                this.target = model.target;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>样本校验设置。</p>
             */
            public Builder checkingConfig(CheckingConfig checkingConfig) {
                this.checkingConfig = checkingConfig;
                return this;
            }

            /**
             * <p>规则描述信息，最长500个字符。</p>
             * 
             * <strong>example:</strong>
             * <p>this is a odps _sql task</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>规则是否启用。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>质量规则校验问题处理器。</p>
             */
            public Builder errorHandlers(java.util.List<ErrorHandlers> errorHandlers) {
                this.errorHandlers = errorHandlers;
                return this;
            }

            /**
             * <p>规则ID。</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>规则名称，数字、英文字母、汉字、半角全角标点符号组合，最长255个字符。</p>
             * 
             * <strong>example:</strong>
             * <p>The table cannot be empty.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>DataWorks项目空间ID。</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>样本采集所需的设置。</p>
             */
            public Builder samplingConfig(SamplingConfig samplingConfig) {
                this.samplingConfig = samplingConfig;
                return this;
            }

            /**
             * <p>规则对于业务的等级（对应页面上的强弱规则）：</p>
             * <ul>
             * <li>High</li>
             * <li>Normal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>规则所监控的对象。</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>创建规则时所引用的规则模板Code。</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM:user_defined_sql</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class DataQualityResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private Rule rule;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
        private Long taskInstanceId;

        private DataQualityResults(Builder builder) {
            this.createTime = builder.createTime;
            this.details = builder.details;
            this.id = builder.id;
            this.rule = builder.rule;
            this.sample = builder.sample;
            this.status = builder.status;
            this.taskInstanceId = builder.taskInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityResults create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return rule
         */
        public Rule getRule() {
            return this.rule;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskInstanceId
         */
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.List<Details> details; 
            private Long id; 
            private Rule rule; 
            private String sample; 
            private String status; 
            private Long taskInstanceId; 

            private Builder() {
            } 

            private Builder(DataQualityResults model) {
                this.createTime = model.createTime;
                this.details = model.details;
                this.id = model.id;
                this.rule = model.rule;
                this.sample = model.sample;
                this.status = model.status;
                this.taskInstanceId = model.taskInstanceId;
            } 

            /**
             * <p>校验结果生成时间。</p>
             * 
             * <strong>example:</strong>
             * <p>1708284916414</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>本次校验的详情。</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>校验结果ID。</p>
             * 
             * <strong>example:</strong>
             * <p>16033</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>校验开始时，规则配置快照。</p>
             */
            public Builder rule(Rule rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>本次校验所使用的样本值。</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *   {
             *     &quot;gender&quot;: &quot;male&quot;,
             *     &quot;_count&quot;: 100
             *   }, {
             *     &quot;gender&quot;: &quot;female&quot;,
             *     &quot;_count&quot;: 100
             *   }
             * ]</p>
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <p>校验结果状态：</p>
             * <ul>
             * <li>Running</li>
             * <li>Error</li>
             * <li>Passed</li>
             * <li>Warned</li>
             * <li>Critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Passed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>校验任务实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>200001</p>
             */
            public Builder taskInstanceId(Long taskInstanceId) {
                this.taskInstanceId = taskInstanceId;
                return this;
            }

            public DataQualityResults build() {
                return new DataQualityResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityResultsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataQualityResults")
        private java.util.List<DataQualityResults> dataQualityResults;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.dataQualityResults = builder.dataQualityResults;
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
         * @return dataQualityResults
         */
        public java.util.List<DataQualityResults> getDataQualityResults() {
            return this.dataQualityResults;
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
            private java.util.List<DataQualityResults> dataQualityResults; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.dataQualityResults = model.dataQualityResults;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>质量校验结果列表。</p>
             */
            public Builder dataQualityResults(java.util.List<DataQualityResults> dataQualityResults) {
                this.dataQualityResults = dataQualityResults;
                return this;
            }

            /**
             * <p>页码。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>页大小。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>总条数。</p>
             * 
             * <strong>example:</strong>
             * <p>219</p>
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
