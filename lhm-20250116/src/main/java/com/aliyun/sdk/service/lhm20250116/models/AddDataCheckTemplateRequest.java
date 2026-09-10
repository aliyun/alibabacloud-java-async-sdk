// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link AddDataCheckTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddDataCheckTemplateRequest</p>
 */
public class AddDataCheckTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("basicMetricRules")
    private java.util.List<BasicMetricRules> basicMetricRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkType")
    private Integer checkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("complexMetricRules")
    private java.util.List<ComplexMetricRules> complexMetricRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsEngineRels")
    private java.util.List<DsEngineRels> dsEngineRels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fulltextRule")
    private FulltextRule fulltextRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metricRules")
    private java.util.List<MetricRules> metricRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nullRules")
    private java.util.List<NullRules> nullRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateDesc")
    private String templateDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("weakContentRule")
    private WeakContentRule weakContentRule;

    private AddDataCheckTemplateRequest(Builder builder) {
        super(builder);
        this.basicMetricRules = builder.basicMetricRules;
        this.checkType = builder.checkType;
        this.complexMetricRules = builder.complexMetricRules;
        this.dsEngineRels = builder.dsEngineRels;
        this.fulltextRule = builder.fulltextRule;
        this.metricRules = builder.metricRules;
        this.nullRules = builder.nullRules;
        this.requestId = builder.requestId;
        this.templateDesc = builder.templateDesc;
        this.templateName = builder.templateName;
        this.tenantId = builder.tenantId;
        this.weakContentRule = builder.weakContentRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataCheckTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basicMetricRules
     */
    public java.util.List<BasicMetricRules> getBasicMetricRules() {
        return this.basicMetricRules;
    }

    /**
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return complexMetricRules
     */
    public java.util.List<ComplexMetricRules> getComplexMetricRules() {
        return this.complexMetricRules;
    }

    /**
     * @return dsEngineRels
     */
    public java.util.List<DsEngineRels> getDsEngineRels() {
        return this.dsEngineRels;
    }

    /**
     * @return fulltextRule
     */
    public FulltextRule getFulltextRule() {
        return this.fulltextRule;
    }

    /**
     * @return metricRules
     */
    public java.util.List<MetricRules> getMetricRules() {
        return this.metricRules;
    }

    /**
     * @return nullRules
     */
    public java.util.List<NullRules> getNullRules() {
        return this.nullRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateDesc
     */
    public String getTemplateDesc() {
        return this.templateDesc;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return weakContentRule
     */
    public WeakContentRule getWeakContentRule() {
        return this.weakContentRule;
    }

    public static final class Builder extends Request.Builder<AddDataCheckTemplateRequest, Builder> {
        private java.util.List<BasicMetricRules> basicMetricRules; 
        private Integer checkType; 
        private java.util.List<ComplexMetricRules> complexMetricRules; 
        private java.util.List<DsEngineRels> dsEngineRels; 
        private FulltextRule fulltextRule; 
        private java.util.List<MetricRules> metricRules; 
        private java.util.List<NullRules> nullRules; 
        private String requestId; 
        private String templateDesc; 
        private String templateName; 
        private String tenantId; 
        private WeakContentRule weakContentRule; 

        private Builder() {
            super();
        } 

        private Builder(AddDataCheckTemplateRequest request) {
            super(request);
            this.basicMetricRules = request.basicMetricRules;
            this.checkType = request.checkType;
            this.complexMetricRules = request.complexMetricRules;
            this.dsEngineRels = request.dsEngineRels;
            this.fulltextRule = request.fulltextRule;
            this.metricRules = request.metricRules;
            this.nullRules = request.nullRules;
            this.requestId = request.requestId;
            this.templateDesc = request.templateDesc;
            this.templateName = request.templateName;
            this.tenantId = request.tenantId;
            this.weakContentRule = request.weakContentRule;
        } 

        /**
         * <p>The list of metric verification rules for basic data types. This field is required when checkType is set to 1 (metric comparison).</p>
         */
        public Builder basicMetricRules(java.util.List<BasicMetricRules> basicMetricRules) {
            this.putBodyParameter("basicMetricRules", basicMetricRules);
            this.basicMetricRules = basicMetricRules;
            return this;
        }

        /**
         * <p>The verification rule type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * <li>3: custom comparison.</li>
         * <li>4: full-text comparison.</li>
         * <li>5: null rate comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder checkType(Integer checkType) {
            this.putBodyParameter("checkType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The list of check rules for complex data type metrics. Used when checkType is set to 1 (metric comparison).</p>
         */
        public Builder complexMetricRules(java.util.List<ComplexMetricRules> complexMetricRules) {
            this.putBodyParameter("complexMetricRules", complexMetricRules);
            this.complexMetricRules = complexMetricRules;
            return this;
        }

        /**
         * <p>The list of datasource engine relationships (datasource engines associated with the template).</p>
         */
        public Builder dsEngineRels(java.util.List<DsEngineRels> dsEngineRels) {
            this.putBodyParameter("dsEngineRels", dsEngineRels);
            this.dsEngineRels = dsEngineRels;
            return this;
        }

        /**
         * <p>The full-text comparison rule. This parameter has a value when checkType is set to 4 (full-text comparison). For the field structure, see the child field descriptions.</p>
         */
        public Builder fulltextRule(FulltextRule fulltextRule) {
            this.putBodyParameter("fulltextRule", fulltextRule);
            this.fulltextRule = fulltextRule;
            return this;
        }

        /**
         * <p>The list of metric check rules. This parameter has a value when checkType is set to 1 (metric comparison).</p>
         */
        public Builder metricRules(java.util.List<MetricRules> metricRules) {
            this.putBodyParameter("metricRules", metricRules);
            this.metricRules = metricRules;
            return this;
        }

        /**
         * <p>The list of null value rate check rules. This parameter has a value when checkType is set to 5 (null value rate comparison).</p>
         */
        public Builder nullRules(java.util.List<NullRules> nullRules) {
            this.putBodyParameter("nullRules", nullRules);
            this.nullRules = nullRules;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues of this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the data volume check template</p>
         */
        public Builder templateDesc(String templateDesc) {
            this.putBodyParameter("templateDesc", templateDesc);
            this.templateDesc = templateDesc;
            return this;
        }

        /**
         * <p>The name of the check template.</p>
         * 
         * <strong>example:</strong>
         * <p>Data volume check template</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The weak content check rule. This parameter has a value and is required when checkType is set to 2 (weak content comparison). For the field structure, refer to the child field descriptions below.</p>
         */
        public Builder weakContentRule(WeakContentRule weakContentRule) {
            this.putBodyParameter("weakContentRule", weakContentRule);
            this.weakContentRule = weakContentRule;
            return this;
        }

        @Override
        public AddDataCheckTemplateRequest build() {
            return new AddDataCheckTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDataCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>AddDataCheckTemplateRequest</p>
     */
    public static class BasicMetricRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkMethods")
        private String checkMethods;

        @com.aliyun.core.annotation.NameInMap("controlFloatPrecision")
        private Integer controlFloatPrecision;

        @com.aliyun.core.annotation.NameInMap("dataTypeClassify")
        private Integer dataTypeClassify;

        @com.aliyun.core.annotation.NameInMap("dataTypeGroup")
        private Integer dataTypeGroup;

        @com.aliyun.core.annotation.NameInMap("dataTypeList")
        private java.util.List<String> dataTypeList;

        @com.aliyun.core.annotation.NameInMap("dataTypes")
        private String dataTypes;

        @com.aliyun.core.annotation.NameInMap("diffTolerateType")
        private Integer diffTolerateType;

        @com.aliyun.core.annotation.NameInMap("diffTolerateValues")
        private java.util.Map<String, ?> diffTolerateValues;

        @com.aliyun.core.annotation.NameInMap("enableDecimalScale")
        private Integer enableDecimalScale;

        @com.aliyun.core.annotation.NameInMap("filterColumnName")
        private String filterColumnName;

        @com.aliyun.core.annotation.NameInMap("filterColumns")
        private String filterColumns;

        @com.aliyun.core.annotation.NameInMap("floatPrecision")
        private Integer floatPrecision;

        @com.aliyun.core.annotation.NameInMap("ignoreDecimalDiff")
        private Integer ignoreDecimalDiff;

        @com.aliyun.core.annotation.NameInMap("ignoreDecimalScaleSuffixZero")
        private Integer ignoreDecimalScaleSuffixZero;

        @com.aliyun.core.annotation.NameInMap("ignoreEmptyDiff")
        private Integer ignoreEmptyDiff;

        @com.aliyun.core.annotation.NameInMap("ignoreNumericZero")
        private Integer ignoreNumericZero;

        @com.aliyun.core.annotation.NameInMap("ignoreStringEmpty")
        private Integer ignoreStringEmpty;

        @com.aliyun.core.annotation.NameInMap("ignoreZeroDiff")
        private Integer ignoreZeroDiff;

        @com.aliyun.core.annotation.NameInMap("isCountCheck")
        private Integer isCountCheck;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("setDecimalScale")
        private Integer setDecimalScale;

        private BasicMetricRules(Builder builder) {
            this.checkMethods = builder.checkMethods;
            this.controlFloatPrecision = builder.controlFloatPrecision;
            this.dataTypeClassify = builder.dataTypeClassify;
            this.dataTypeGroup = builder.dataTypeGroup;
            this.dataTypeList = builder.dataTypeList;
            this.dataTypes = builder.dataTypes;
            this.diffTolerateType = builder.diffTolerateType;
            this.diffTolerateValues = builder.diffTolerateValues;
            this.enableDecimalScale = builder.enableDecimalScale;
            this.filterColumnName = builder.filterColumnName;
            this.filterColumns = builder.filterColumns;
            this.floatPrecision = builder.floatPrecision;
            this.ignoreDecimalDiff = builder.ignoreDecimalDiff;
            this.ignoreDecimalScaleSuffixZero = builder.ignoreDecimalScaleSuffixZero;
            this.ignoreEmptyDiff = builder.ignoreEmptyDiff;
            this.ignoreNumericZero = builder.ignoreNumericZero;
            this.ignoreStringEmpty = builder.ignoreStringEmpty;
            this.ignoreZeroDiff = builder.ignoreZeroDiff;
            this.isCountCheck = builder.isCountCheck;
            this.ruleId = builder.ruleId;
            this.setDecimalScale = builder.setDecimalScale;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicMetricRules create() {
            return builder().build();
        }

        /**
         * @return checkMethods
         */
        public String getCheckMethods() {
            return this.checkMethods;
        }

        /**
         * @return controlFloatPrecision
         */
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        /**
         * @return dataTypeClassify
         */
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        /**
         * @return dataTypeGroup
         */
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        /**
         * @return dataTypeList
         */
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        /**
         * @return dataTypes
         */
        public String getDataTypes() {
            return this.dataTypes;
        }

        /**
         * @return diffTolerateType
         */
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        /**
         * @return diffTolerateValues
         */
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        /**
         * @return enableDecimalScale
         */
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        /**
         * @return filterColumnName
         */
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        /**
         * @return filterColumns
         */
        public String getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return floatPrecision
         */
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        /**
         * @return ignoreDecimalDiff
         */
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        /**
         * @return ignoreDecimalScaleSuffixZero
         */
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        /**
         * @return ignoreEmptyDiff
         */
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        /**
         * @return ignoreNumericZero
         */
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        /**
         * @return ignoreStringEmpty
         */
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        /**
         * @return ignoreZeroDiff
         */
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        /**
         * @return isCountCheck
         */
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return setDecimalScale
         */
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

        public static final class Builder {
            private String checkMethods; 
            private Integer controlFloatPrecision; 
            private Integer dataTypeClassify; 
            private Integer dataTypeGroup; 
            private java.util.List<String> dataTypeList; 
            private String dataTypes; 
            private Integer diffTolerateType; 
            private java.util.Map<String, ?> diffTolerateValues; 
            private Integer enableDecimalScale; 
            private String filterColumnName; 
            private String filterColumns; 
            private Integer floatPrecision; 
            private Integer ignoreDecimalDiff; 
            private Integer ignoreDecimalScaleSuffixZero; 
            private Integer ignoreEmptyDiff; 
            private Integer ignoreNumericZero; 
            private Integer ignoreStringEmpty; 
            private Integer ignoreZeroDiff; 
            private Integer isCountCheck; 
            private String ruleId; 
            private Integer setDecimalScale; 

            private Builder() {
            } 

            private Builder(BasicMetricRules model) {
                this.checkMethods = model.checkMethods;
                this.controlFloatPrecision = model.controlFloatPrecision;
                this.dataTypeClassify = model.dataTypeClassify;
                this.dataTypeGroup = model.dataTypeGroup;
                this.dataTypeList = model.dataTypeList;
                this.dataTypes = model.dataTypes;
                this.diffTolerateType = model.diffTolerateType;
                this.diffTolerateValues = model.diffTolerateValues;
                this.enableDecimalScale = model.enableDecimalScale;
                this.filterColumnName = model.filterColumnName;
                this.filterColumns = model.filterColumns;
                this.floatPrecision = model.floatPrecision;
                this.ignoreDecimalDiff = model.ignoreDecimalDiff;
                this.ignoreDecimalScaleSuffixZero = model.ignoreDecimalScaleSuffixZero;
                this.ignoreEmptyDiff = model.ignoreEmptyDiff;
                this.ignoreNumericZero = model.ignoreNumericZero;
                this.ignoreStringEmpty = model.ignoreStringEmpty;
                this.ignoreZeroDiff = model.ignoreZeroDiff;
                this.isCountCheck = model.isCountCheck;
                this.ruleId = model.ruleId;
                this.setDecimalScale = model.setDecimalScale;
            } 

            /**
             * <p>The verification methods (metric calculation methods). Separate multiple values with commas (,), such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
             * 
             * <strong>example:</strong>
             * <p>SUM,AVG</p>
             */
            public Builder checkMethods(String checkMethods) {
                this.checkMethods = checkMethods;
                return this;
            }

            /**
             * <p>Specifies whether to control floating-point precision. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder controlFloatPrecision(Integer controlFloatPrecision) {
                this.controlFloatPrecision = controlFloatPrecision;
                return this;
            }

            /**
             * <p>The data type category. Valid values: 0 (native data type) and 1 (composite data type).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataTypeClassify(Integer dataTypeClassify) {
                this.dataTypeClassify = dataTypeClassify;
                return this;
            }

            /**
             * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataTypeGroup(Integer dataTypeGroup) {
                this.dataTypeGroup = dataTypeGroup;
                return this;
            }

            /**
             * <p>The list of data types to which the verification rule applies. Configure this field based on your requirements.</p>
             */
            public Builder dataTypeList(java.util.List<String> dataTypeList) {
                this.dataTypeList = dataTypeList;
                return this;
            }

            /**
             * <p>The data types. Configure this field based on your requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
             */
            public Builder dataTypes(String dataTypes) {
                this.dataTypes = dataTypes;
                return this;
            }

            /**
             * <p>The difference tolerance rate type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder diffTolerateType(Integer diffTolerateType) {
                this.diffTolerateType = diffTolerateType;
                return this;
            }

            /**
             * <p>The difference tolerance rate values. For the unified type, specify one value, such as {&quot;SAME&quot;: 0}. For the custom type, specify a value for each tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
             */
            public Builder diffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
                this.diffTolerateValues = diffTolerateValues;
                return this;
            }

            /**
             * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enableDecimalScale(Integer enableDecimalScale) {
                this.enableDecimalScale = enableDecimalScale;
                return this;
            }

            /**
             * <p>The filter field names, separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder filterColumnName(String filterColumnName) {
                this.filterColumnName = filterColumnName;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field is retained for backward compatibility.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder filterColumns(String filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>The number of decimal places for floating-point values.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder floatPrecision(Integer floatPrecision) {
                this.floatPrecision = floatPrecision;
                return this;
            }

            /**
             * <p>Specifies whether to ignore trailing zero differences in decimal parts. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreDecimalDiff(Integer ignoreDecimalDiff) {
                this.ignoreDecimalDiff = ignoreDecimalDiff;
                return this;
            }

            /**
             * <p>Specifies whether to ignore trailing zeros in the decimal scale for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
                this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreEmptyDiff(Integer ignoreEmptyDiff) {
                this.ignoreEmptyDiff = ignoreEmptyDiff;
                return this;
            }

            /**
             * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreNumericZero(Integer ignoreNumericZero) {
                this.ignoreNumericZero = ignoreNumericZero;
                return this;
            }

            /**
             * <p>Specifies whether to ignore empty strings and null values for string types. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreStringEmpty(Integer ignoreStringEmpty) {
                this.ignoreStringEmpty = ignoreStringEmpty;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreZeroDiff(Integer ignoreZeroDiff) {
                this.ignoreZeroDiff = ignoreZeroDiff;
                return this;
            }

            /**
             * <p>Specifies whether to enable count (data volume) verification. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isCountCheck(Integer isCountCheck) {
                this.isCountCheck = isCountCheck;
                return this;
            }

            /**
             * <p>The rule ID that uniquely identifies a verification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The specific decimal scale value for DECIMAL type comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder setDecimalScale(Integer setDecimalScale) {
                this.setDecimalScale = setDecimalScale;
                return this;
            }

            public BasicMetricRules build() {
                return new BasicMetricRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDataCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>AddDataCheckTemplateRequest</p>
     */
    public static class ComplexMetricRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkMethods")
        private String checkMethods;

        @com.aliyun.core.annotation.NameInMap("controlFloatPrecision")
        private Integer controlFloatPrecision;

        @com.aliyun.core.annotation.NameInMap("dataTypeClassify")
        private Integer dataTypeClassify;

        @com.aliyun.core.annotation.NameInMap("dataTypeGroup")
        private Integer dataTypeGroup;

        @com.aliyun.core.annotation.NameInMap("dataTypeList")
        private java.util.List<String> dataTypeList;

        @com.aliyun.core.annotation.NameInMap("dataTypes")
        private String dataTypes;

        @com.aliyun.core.annotation.NameInMap("diffTolerateType")
        private Integer diffTolerateType;

        @com.aliyun.core.annotation.NameInMap("diffTolerateValues")
        private java.util.Map<String, ?> diffTolerateValues;

        @com.aliyun.core.annotation.NameInMap("enableDecimalScale")
        private Integer enableDecimalScale;

        @com.aliyun.core.annotation.NameInMap("filterColumnName")
        private String filterColumnName;

        @com.aliyun.core.annotation.NameInMap("filterColumns")
        private String filterColumns;

        @com.aliyun.core.annotation.NameInMap("floatPrecision")
        private Integer floatPrecision;

        @com.aliyun.core.annotation.NameInMap("ignoreDecimalDiff")
        private Integer ignoreDecimalDiff;

        @com.aliyun.core.annotation.NameInMap("ignoreDecimalScaleSuffixZero")
        private Integer ignoreDecimalScaleSuffixZero;

        @com.aliyun.core.annotation.NameInMap("ignoreEmptyDiff")
        private Integer ignoreEmptyDiff;

        @com.aliyun.core.annotation.NameInMap("ignoreNumericZero")
        private Integer ignoreNumericZero;

        @com.aliyun.core.annotation.NameInMap("ignoreStringEmpty")
        private Integer ignoreStringEmpty;

        @com.aliyun.core.annotation.NameInMap("ignoreZeroDiff")
        private Integer ignoreZeroDiff;

        @com.aliyun.core.annotation.NameInMap("isCountCheck")
        private Integer isCountCheck;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("setDecimalScale")
        private Integer setDecimalScale;

        private ComplexMetricRules(Builder builder) {
            this.checkMethods = builder.checkMethods;
            this.controlFloatPrecision = builder.controlFloatPrecision;
            this.dataTypeClassify = builder.dataTypeClassify;
            this.dataTypeGroup = builder.dataTypeGroup;
            this.dataTypeList = builder.dataTypeList;
            this.dataTypes = builder.dataTypes;
            this.diffTolerateType = builder.diffTolerateType;
            this.diffTolerateValues = builder.diffTolerateValues;
            this.enableDecimalScale = builder.enableDecimalScale;
            this.filterColumnName = builder.filterColumnName;
            this.filterColumns = builder.filterColumns;
            this.floatPrecision = builder.floatPrecision;
            this.ignoreDecimalDiff = builder.ignoreDecimalDiff;
            this.ignoreDecimalScaleSuffixZero = builder.ignoreDecimalScaleSuffixZero;
            this.ignoreEmptyDiff = builder.ignoreEmptyDiff;
            this.ignoreNumericZero = builder.ignoreNumericZero;
            this.ignoreStringEmpty = builder.ignoreStringEmpty;
            this.ignoreZeroDiff = builder.ignoreZeroDiff;
            this.isCountCheck = builder.isCountCheck;
            this.ruleId = builder.ruleId;
            this.setDecimalScale = builder.setDecimalScale;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplexMetricRules create() {
            return builder().build();
        }

        /**
         * @return checkMethods
         */
        public String getCheckMethods() {
            return this.checkMethods;
        }

        /**
         * @return controlFloatPrecision
         */
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        /**
         * @return dataTypeClassify
         */
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        /**
         * @return dataTypeGroup
         */
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        /**
         * @return dataTypeList
         */
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        /**
         * @return dataTypes
         */
        public String getDataTypes() {
            return this.dataTypes;
        }

        /**
         * @return diffTolerateType
         */
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        /**
         * @return diffTolerateValues
         */
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        /**
         * @return enableDecimalScale
         */
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        /**
         * @return filterColumnName
         */
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        /**
         * @return filterColumns
         */
        public String getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return floatPrecision
         */
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        /**
         * @return ignoreDecimalDiff
         */
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        /**
         * @return ignoreDecimalScaleSuffixZero
         */
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        /**
         * @return ignoreEmptyDiff
         */
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        /**
         * @return ignoreNumericZero
         */
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        /**
         * @return ignoreStringEmpty
         */
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        /**
         * @return ignoreZeroDiff
         */
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        /**
         * @return isCountCheck
         */
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return setDecimalScale
         */
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

        public static final class Builder {
            private String checkMethods; 
            private Integer controlFloatPrecision; 
            private Integer dataTypeClassify; 
            private Integer dataTypeGroup; 
            private java.util.List<String> dataTypeList; 
            private String dataTypes; 
            private Integer diffTolerateType; 
            private java.util.Map<String, ?> diffTolerateValues; 
            private Integer enableDecimalScale; 
            private String filterColumnName; 
            private String filterColumns; 
            private Integer floatPrecision; 
            private Integer ignoreDecimalDiff; 
            private Integer ignoreDecimalScaleSuffixZero; 
            private Integer ignoreEmptyDiff; 
            private Integer ignoreNumericZero; 
            private Integer ignoreStringEmpty; 
            private Integer ignoreZeroDiff; 
            private Integer isCountCheck; 
            private String ruleId; 
            private Integer setDecimalScale; 

            private Builder() {
            } 

            private Builder(ComplexMetricRules model) {
                this.checkMethods = model.checkMethods;
                this.controlFloatPrecision = model.controlFloatPrecision;
                this.dataTypeClassify = model.dataTypeClassify;
                this.dataTypeGroup = model.dataTypeGroup;
                this.dataTypeList = model.dataTypeList;
                this.dataTypes = model.dataTypes;
                this.diffTolerateType = model.diffTolerateType;
                this.diffTolerateValues = model.diffTolerateValues;
                this.enableDecimalScale = model.enableDecimalScale;
                this.filterColumnName = model.filterColumnName;
                this.filterColumns = model.filterColumns;
                this.floatPrecision = model.floatPrecision;
                this.ignoreDecimalDiff = model.ignoreDecimalDiff;
                this.ignoreDecimalScaleSuffixZero = model.ignoreDecimalScaleSuffixZero;
                this.ignoreEmptyDiff = model.ignoreEmptyDiff;
                this.ignoreNumericZero = model.ignoreNumericZero;
                this.ignoreStringEmpty = model.ignoreStringEmpty;
                this.ignoreZeroDiff = model.ignoreZeroDiff;
                this.isCountCheck = model.isCountCheck;
                this.ruleId = model.ruleId;
                this.setDecimalScale = model.setDecimalScale;
            } 

            /**
             * <p>The check methods (metric calculation methods). Separate multiple values with commas, such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
             * 
             * <strong>example:</strong>
             * <p>SUM,AVG</p>
             */
            public Builder checkMethods(String checkMethods) {
                this.checkMethods = checkMethods;
                return this;
            }

            /**
             * <p>Specifies whether to control floating-point precision. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder controlFloatPrecision(Integer controlFloatPrecision) {
                this.controlFloatPrecision = controlFloatPrecision;
                return this;
            }

            /**
             * <p>The data type category. Valid values: 0 (native data type) and 1 (composite data type).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataTypeClassify(Integer dataTypeClassify) {
                this.dataTypeClassify = dataTypeClassify;
                return this;
            }

            /**
             * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataTypeGroup(Integer dataTypeGroup) {
                this.dataTypeGroup = dataTypeGroup;
                return this;
            }

            /**
             * <p>The list of data types to which the verification rule applies. Configure this field based on your requirements.</p>
             */
            public Builder dataTypeList(java.util.List<String> dataTypeList) {
                this.dataTypeList = dataTypeList;
                return this;
            }

            /**
             * <p>The data types. Configure this field based on your requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
             */
            public Builder dataTypes(String dataTypes) {
                this.dataTypes = dataTypes;
                return this;
            }

            /**
             * <p>The difference tolerance rate type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder diffTolerateType(Integer diffTolerateType) {
                this.diffTolerateType = diffTolerateType;
                return this;
            }

            /**
             * <p>The difference tolerance rate values. For the unified type, specify one value, such as {&quot;SAME&quot;: 0}. For the custom type, specify a value for each tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
             */
            public Builder diffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
                this.diffTolerateValues = diffTolerateValues;
                return this;
            }

            /**
             * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enableDecimalScale(Integer enableDecimalScale) {
                this.enableDecimalScale = enableDecimalScale;
                return this;
            }

            /**
             * <p>The filter field names, separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder filterColumnName(String filterColumnName) {
                this.filterColumnName = filterColumnName;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field is retained for backward compatibility.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder filterColumns(String filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>The number of decimal places for floating-point values.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder floatPrecision(Integer floatPrecision) {
                this.floatPrecision = floatPrecision;
                return this;
            }

            /**
             * <p>Specifies whether to ignore trailing zero differences in decimal parts. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreDecimalDiff(Integer ignoreDecimalDiff) {
                this.ignoreDecimalDiff = ignoreDecimalDiff;
                return this;
            }

            /**
             * <p>Specifies whether to ignore trailing zeros in the decimal scale for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
                this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreEmptyDiff(Integer ignoreEmptyDiff) {
                this.ignoreEmptyDiff = ignoreEmptyDiff;
                return this;
            }

            /**
             * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreNumericZero(Integer ignoreNumericZero) {
                this.ignoreNumericZero = ignoreNumericZero;
                return this;
            }

            /**
             * <p>Specifies whether to ignore empty strings and null values for string types. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreStringEmpty(Integer ignoreStringEmpty) {
                this.ignoreStringEmpty = ignoreStringEmpty;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreZeroDiff(Integer ignoreZeroDiff) {
                this.ignoreZeroDiff = ignoreZeroDiff;
                return this;
            }

            /**
             * <p>Specifies whether to enable count (data volume) verification. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isCountCheck(Integer isCountCheck) {
                this.isCountCheck = isCountCheck;
                return this;
            }

            /**
             * <p>The rule ID that uniquely identifies a verification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The specific decimal scale value for DECIMAL type comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder setDecimalScale(Integer setDecimalScale) {
                this.setDecimalScale = setDecimalScale;
                return this;
            }

            public ComplexMetricRules build() {
                return new ComplexMetricRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDataCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>AddDataCheckTemplateRequest</p>
     */
    public static class DsEngineRels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dsEngineId")
        private String dsEngineId;

        @com.aliyun.core.annotation.NameInMap("dsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("engineTypes")
        private java.util.List<String> engineTypes;

        private DsEngineRels(Builder builder) {
            this.dsEngineId = builder.dsEngineId;
            this.dsType = builder.dsType;
            this.engineTypes = builder.engineTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DsEngineRels create() {
            return builder().build();
        }

        /**
         * @return dsEngineId
         */
        public String getDsEngineId() {
            return this.dsEngineId;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return engineTypes
         */
        public java.util.List<String> getEngineTypes() {
            return this.engineTypes;
        }

        public static final class Builder {
            private String dsEngineId; 
            private String dsType; 
            private java.util.List<String> engineTypes; 

            private Builder() {
            } 

            private Builder(DsEngineRels model) {
                this.dsEngineId = model.dsEngineId;
                this.dsType = model.dsType;
                this.engineTypes = model.engineTypes;
            } 

            /**
             * <p>The ID of the datasource engine configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder dsEngineId(String dsEngineId) {
                this.dsEngineId = dsEngineId;
                return this;
            }

            /**
             * <p>The datasource type, such as Hive or MaxCompute.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>The list of covered check engine types, such as Tez or MapReduce. When specified as a string, separate multiple values with commas.</p>
             */
            public Builder engineTypes(java.util.List<String> engineTypes) {
                this.engineTypes = engineTypes;
                return this;
            }

            public DsEngineRels build() {
                return new DsEngineRels(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDataCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>AddDataCheckTemplateRequest</p>
     */
    public static class FulltextRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkMode")
        private Integer checkMode;

        @com.aliyun.core.annotation.NameInMap("columnEqualCmpType")
        private Integer columnEqualCmpType;

        @com.aliyun.core.annotation.NameInMap("columnEqualCmpValues")
        private String columnEqualCmpValues;

        @com.aliyun.core.annotation.NameInMap("columnIsCosine")
        private Integer columnIsCosine;

        @com.aliyun.core.annotation.NameInMap("columnIsIgnoreNull")
        private Integer columnIsIgnoreNull;

        @com.aliyun.core.annotation.NameInMap("columnIsIgnoreZero")
        private Integer columnIsIgnoreZero;

        @com.aliyun.core.annotation.NameInMap("columnIsSamples")
        private Integer columnIsSamples;

        @com.aliyun.core.annotation.NameInMap("columnSamplesType")
        private Integer columnSamplesType;

        @com.aliyun.core.annotation.NameInMap("columnSamplesValue")
        private Integer columnSamplesValue;

        @com.aliyun.core.annotation.NameInMap("columnSizeCmpType")
        private Integer columnSizeCmpType;

        @com.aliyun.core.annotation.NameInMap("columnSizeCmpValues")
        private String columnSizeCmpValues;

        @com.aliyun.core.annotation.NameInMap("isPrimaryKeyCheck")
        private Integer isPrimaryKeyCheck;

        @com.aliyun.core.annotation.NameInMap("lineCheckType")
        private Integer lineCheckType;

        @com.aliyun.core.annotation.NameInMap("lineIsPrintAll")
        private Integer lineIsPrintAll;

        @com.aliyun.core.annotation.NameInMap("lineIsSamples")
        private Integer lineIsSamples;

        @com.aliyun.core.annotation.NameInMap("lineSamplesType")
        private Integer lineSamplesType;

        @com.aliyun.core.annotation.NameInMap("lineSamplesValue")
        private Integer lineSamplesValue;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        private FulltextRule(Builder builder) {
            this.checkMode = builder.checkMode;
            this.columnEqualCmpType = builder.columnEqualCmpType;
            this.columnEqualCmpValues = builder.columnEqualCmpValues;
            this.columnIsCosine = builder.columnIsCosine;
            this.columnIsIgnoreNull = builder.columnIsIgnoreNull;
            this.columnIsIgnoreZero = builder.columnIsIgnoreZero;
            this.columnIsSamples = builder.columnIsSamples;
            this.columnSamplesType = builder.columnSamplesType;
            this.columnSamplesValue = builder.columnSamplesValue;
            this.columnSizeCmpType = builder.columnSizeCmpType;
            this.columnSizeCmpValues = builder.columnSizeCmpValues;
            this.isPrimaryKeyCheck = builder.isPrimaryKeyCheck;
            this.lineCheckType = builder.lineCheckType;
            this.lineIsPrintAll = builder.lineIsPrintAll;
            this.lineIsSamples = builder.lineIsSamples;
            this.lineSamplesType = builder.lineSamplesType;
            this.lineSamplesValue = builder.lineSamplesValue;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FulltextRule create() {
            return builder().build();
        }

        /**
         * @return checkMode
         */
        public Integer getCheckMode() {
            return this.checkMode;
        }

        /**
         * @return columnEqualCmpType
         */
        public Integer getColumnEqualCmpType() {
            return this.columnEqualCmpType;
        }

        /**
         * @return columnEqualCmpValues
         */
        public String getColumnEqualCmpValues() {
            return this.columnEqualCmpValues;
        }

        /**
         * @return columnIsCosine
         */
        public Integer getColumnIsCosine() {
            return this.columnIsCosine;
        }

        /**
         * @return columnIsIgnoreNull
         */
        public Integer getColumnIsIgnoreNull() {
            return this.columnIsIgnoreNull;
        }

        /**
         * @return columnIsIgnoreZero
         */
        public Integer getColumnIsIgnoreZero() {
            return this.columnIsIgnoreZero;
        }

        /**
         * @return columnIsSamples
         */
        public Integer getColumnIsSamples() {
            return this.columnIsSamples;
        }

        /**
         * @return columnSamplesType
         */
        public Integer getColumnSamplesType() {
            return this.columnSamplesType;
        }

        /**
         * @return columnSamplesValue
         */
        public Integer getColumnSamplesValue() {
            return this.columnSamplesValue;
        }

        /**
         * @return columnSizeCmpType
         */
        public Integer getColumnSizeCmpType() {
            return this.columnSizeCmpType;
        }

        /**
         * @return columnSizeCmpValues
         */
        public String getColumnSizeCmpValues() {
            return this.columnSizeCmpValues;
        }

        /**
         * @return isPrimaryKeyCheck
         */
        public Integer getIsPrimaryKeyCheck() {
            return this.isPrimaryKeyCheck;
        }

        /**
         * @return lineCheckType
         */
        public Integer getLineCheckType() {
            return this.lineCheckType;
        }

        /**
         * @return lineIsPrintAll
         */
        public Integer getLineIsPrintAll() {
            return this.lineIsPrintAll;
        }

        /**
         * @return lineIsSamples
         */
        public Integer getLineIsSamples() {
            return this.lineIsSamples;
        }

        /**
         * @return lineSamplesType
         */
        public Integer getLineSamplesType() {
            return this.lineSamplesType;
        }

        /**
         * @return lineSamplesValue
         */
        public Integer getLineSamplesValue() {
            return this.lineSamplesValue;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Integer checkMode; 
            private Integer columnEqualCmpType; 
            private String columnEqualCmpValues; 
            private Integer columnIsCosine; 
            private Integer columnIsIgnoreNull; 
            private Integer columnIsIgnoreZero; 
            private Integer columnIsSamples; 
            private Integer columnSamplesType; 
            private Integer columnSamplesValue; 
            private Integer columnSizeCmpType; 
            private String columnSizeCmpValues; 
            private Integer isPrimaryKeyCheck; 
            private Integer lineCheckType; 
            private Integer lineIsPrintAll; 
            private Integer lineIsSamples; 
            private Integer lineSamplesType; 
            private Integer lineSamplesValue; 
            private String ruleId; 

            private Builder() {
            } 

            private Builder(FulltextRule model) {
                this.checkMode = model.checkMode;
                this.columnEqualCmpType = model.columnEqualCmpType;
                this.columnEqualCmpValues = model.columnEqualCmpValues;
                this.columnIsCosine = model.columnIsCosine;
                this.columnIsIgnoreNull = model.columnIsIgnoreNull;
                this.columnIsIgnoreZero = model.columnIsIgnoreZero;
                this.columnIsSamples = model.columnIsSamples;
                this.columnSamplesType = model.columnSamplesType;
                this.columnSamplesValue = model.columnSamplesValue;
                this.columnSizeCmpType = model.columnSizeCmpType;
                this.columnSizeCmpValues = model.columnSizeCmpValues;
                this.isPrimaryKeyCheck = model.isPrimaryKeyCheck;
                this.lineCheckType = model.lineCheckType;
                this.lineIsPrintAll = model.lineIsPrintAll;
                this.lineIsSamples = model.lineIsSamples;
                this.lineSamplesType = model.lineSamplesType;
                this.lineSamplesValue = model.lineSamplesValue;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The check mode. Valid values:</p>
             * <ul>
             * <li>0: row-by-row overall comparison.</li>
             * <li>1: row-by-row column-by-column comparison.</li>
             * <li>2: both row-by-row overall comparison and row-by-row column-by-column comparison.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder checkMode(Integer checkMode) {
                this.checkMode = checkMode;
                return this;
            }

            /**
             * <p>The equality comparison type for row-by-row column-by-column comparison. Valid values:</p>
             * <ul>
             * <li>0: all field types.</li>
             * <li>1: native primitive data types.</li>
             * <li>2: complex data types.</li>
             * <li>3: custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder columnEqualCmpType(Integer columnEqualCmpType) {
                this.columnEqualCmpType = columnEqualCmpType;
                return this;
            }

            /**
             * <p>The custom type list for equality comparison during row-by-row column-by-column comparison. Separate multiple values with commas.</p>
             * 
             * <strong>example:</strong>
             * <p>ARRAY,MAP</p>
             */
            public Builder columnEqualCmpValues(String columnEqualCmpValues) {
                this.columnEqualCmpValues = columnEqualCmpValues;
                return this;
            }

            /**
             * <p>Specifies whether to enable cosine similarity during row-by-row column-by-column comparison. Valid values:</p>
             * <ul>
             * <li>0: Disabled.</li>
             * <li>1: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder columnIsCosine(Integer columnIsCosine) {
                this.columnIsCosine = columnIsCosine;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and empty strings during row-by-row column-by-column comparison. Valid values:</p>
             * <ul>
             * <li>0: Not ignored.</li>
             * <li>1: Ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder columnIsIgnoreNull(Integer columnIsIgnoreNull) {
                this.columnIsIgnoreNull = columnIsIgnoreNull;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and 0 values during row-by-row column-by-column comparison. Valid values:</p>
             * <ul>
             * <li>0: Not ignored.</li>
             * <li>1: Ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder columnIsIgnoreZero(Integer columnIsIgnoreZero) {
                this.columnIsIgnoreZero = columnIsIgnoreZero;
                return this;
            }

            /**
             * <p>Specifies whether to enable sampling during row-by-row column-by-column comparison. Valid values:</p>
             * <ul>
             * <li>0: Disabled.</li>
             * <li>1: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder columnIsSamples(Integer columnIsSamples) {
                this.columnIsSamples = columnIsSamples;
                return this;
            }

            /**
             * <p>The sampling method for row-by-row column-by-column comparison. Valid values:</p>
             * <ul>
             * <li>0: by row.</li>
             * <li>1: by percentage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder columnSamplesType(Integer columnSamplesType) {
                this.columnSamplesType = columnSamplesType;
                return this;
            }

            /**
             * <p>The sampling value for row-by-row column-by-column comparison. The meaning depends on the sampling method: the number of rows when sampling by row, or the percentage value when sampling by percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder columnSamplesValue(Integer columnSamplesValue) {
                this.columnSamplesValue = columnSamplesValue;
                return this;
            }

            /**
             * <p>The size comparison type for row-by-row column-by-column comparison. Valid values:</p>
             * <ul>
             * <li>0: all complex data types.</li>
             * <li>1: custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder columnSizeCmpType(Integer columnSizeCmpType) {
                this.columnSizeCmpType = columnSizeCmpType;
                return this;
            }

            /**
             * <p>The custom type list for size comparison during row-by-row column-by-column comparison. Separate multiple values with commas.</p>
             * 
             * <strong>example:</strong>
             * <p>ARRAY,MAP</p>
             */
            public Builder columnSizeCmpValues(String columnSizeCmpValues) {
                this.columnSizeCmpValues = columnSizeCmpValues;
                return this;
            }

            /**
             * <p>Specifies whether to enable primary key or composite primary key existence check. Valid values:</p>
             * <ul>
             * <li>0: Disabled.</li>
             * <li>1: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPrimaryKeyCheck(Integer isPrimaryKeyCheck) {
                this.isPrimaryKeyCheck = isPrimaryKeyCheck;
                return this;
            }

            /**
             * <p>The row-by-row comparison method. Valid values:</p>
             * <ul>
             * <li>0: md5.</li>
             * <li>1: crc32.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lineCheckType(Integer lineCheckType) {
                this.lineCheckType = lineCheckType;
                return this;
            }

            /**
             * <p>Specifies whether to print all columns in the difference details during row-by-row comparison. Valid values:</p>
             * <ul>
             * <li>0: Not printed.</li>
             * <li>1: Printed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lineIsPrintAll(Integer lineIsPrintAll) {
                this.lineIsPrintAll = lineIsPrintAll;
                return this;
            }

            /**
             * <p>Specifies whether to enable sampling during row-by-row comparison. Valid values:</p>
             * <ul>
             * <li>0: Disabled.</li>
             * <li>1: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lineIsSamples(Integer lineIsSamples) {
                this.lineIsSamples = lineIsSamples;
                return this;
            }

            /**
             * <p>The sampling method for row-by-row comparison. Valid values:</p>
             * <ul>
             * <li>0: by row.</li>
             * <li>1: by percentage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lineSamplesType(Integer lineSamplesType) {
                this.lineSamplesType = lineSamplesType;
                return this;
            }

            /**
             * <p>The sampling value for row-by-row comparison. The meaning depends on the sampling method: the number of rows when sampling by row, or the percentage value when sampling by percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder lineSamplesValue(Integer lineSamplesValue) {
                this.lineSamplesValue = lineSamplesValue;
                return this;
            }

            /**
             * <p>The rule ID that uniquely identifies a verification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public FulltextRule build() {
                return new FulltextRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDataCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>AddDataCheckTemplateRequest</p>
     */
    public static class MetricRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkMethods")
        private String checkMethods;

        @com.aliyun.core.annotation.NameInMap("controlFloatPrecision")
        private Integer controlFloatPrecision;

        @com.aliyun.core.annotation.NameInMap("dataTypeClassify")
        private Integer dataTypeClassify;

        @com.aliyun.core.annotation.NameInMap("dataTypeGroup")
        private Integer dataTypeGroup;

        @com.aliyun.core.annotation.NameInMap("dataTypeList")
        private java.util.List<String> dataTypeList;

        @com.aliyun.core.annotation.NameInMap("dataTypes")
        private String dataTypes;

        @com.aliyun.core.annotation.NameInMap("diffTolerateType")
        private Integer diffTolerateType;

        @com.aliyun.core.annotation.NameInMap("diffTolerateValues")
        private java.util.Map<String, ?> diffTolerateValues;

        @com.aliyun.core.annotation.NameInMap("enableDecimalScale")
        private Integer enableDecimalScale;

        @com.aliyun.core.annotation.NameInMap("filterColumnName")
        private String filterColumnName;

        @com.aliyun.core.annotation.NameInMap("filterColumns")
        private String filterColumns;

        @com.aliyun.core.annotation.NameInMap("floatPrecision")
        private Integer floatPrecision;

        @com.aliyun.core.annotation.NameInMap("ignoreDecimalDiff")
        private Integer ignoreDecimalDiff;

        @com.aliyun.core.annotation.NameInMap("ignoreDecimalScaleSuffixZero")
        private Integer ignoreDecimalScaleSuffixZero;

        @com.aliyun.core.annotation.NameInMap("ignoreEmptyDiff")
        private Integer ignoreEmptyDiff;

        @com.aliyun.core.annotation.NameInMap("ignoreNumericZero")
        private Integer ignoreNumericZero;

        @com.aliyun.core.annotation.NameInMap("ignoreStringEmpty")
        private Integer ignoreStringEmpty;

        @com.aliyun.core.annotation.NameInMap("ignoreZeroDiff")
        private Integer ignoreZeroDiff;

        @com.aliyun.core.annotation.NameInMap("isCountCheck")
        private Integer isCountCheck;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("setDecimalScale")
        private Integer setDecimalScale;

        private MetricRules(Builder builder) {
            this.checkMethods = builder.checkMethods;
            this.controlFloatPrecision = builder.controlFloatPrecision;
            this.dataTypeClassify = builder.dataTypeClassify;
            this.dataTypeGroup = builder.dataTypeGroup;
            this.dataTypeList = builder.dataTypeList;
            this.dataTypes = builder.dataTypes;
            this.diffTolerateType = builder.diffTolerateType;
            this.diffTolerateValues = builder.diffTolerateValues;
            this.enableDecimalScale = builder.enableDecimalScale;
            this.filterColumnName = builder.filterColumnName;
            this.filterColumns = builder.filterColumns;
            this.floatPrecision = builder.floatPrecision;
            this.ignoreDecimalDiff = builder.ignoreDecimalDiff;
            this.ignoreDecimalScaleSuffixZero = builder.ignoreDecimalScaleSuffixZero;
            this.ignoreEmptyDiff = builder.ignoreEmptyDiff;
            this.ignoreNumericZero = builder.ignoreNumericZero;
            this.ignoreStringEmpty = builder.ignoreStringEmpty;
            this.ignoreZeroDiff = builder.ignoreZeroDiff;
            this.isCountCheck = builder.isCountCheck;
            this.ruleId = builder.ruleId;
            this.setDecimalScale = builder.setDecimalScale;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricRules create() {
            return builder().build();
        }

        /**
         * @return checkMethods
         */
        public String getCheckMethods() {
            return this.checkMethods;
        }

        /**
         * @return controlFloatPrecision
         */
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        /**
         * @return dataTypeClassify
         */
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        /**
         * @return dataTypeGroup
         */
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        /**
         * @return dataTypeList
         */
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        /**
         * @return dataTypes
         */
        public String getDataTypes() {
            return this.dataTypes;
        }

        /**
         * @return diffTolerateType
         */
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        /**
         * @return diffTolerateValues
         */
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        /**
         * @return enableDecimalScale
         */
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        /**
         * @return filterColumnName
         */
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        /**
         * @return filterColumns
         */
        public String getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return floatPrecision
         */
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        /**
         * @return ignoreDecimalDiff
         */
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        /**
         * @return ignoreDecimalScaleSuffixZero
         */
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        /**
         * @return ignoreEmptyDiff
         */
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        /**
         * @return ignoreNumericZero
         */
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        /**
         * @return ignoreStringEmpty
         */
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        /**
         * @return ignoreZeroDiff
         */
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        /**
         * @return isCountCheck
         */
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return setDecimalScale
         */
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

        public static final class Builder {
            private String checkMethods; 
            private Integer controlFloatPrecision; 
            private Integer dataTypeClassify; 
            private Integer dataTypeGroup; 
            private java.util.List<String> dataTypeList; 
            private String dataTypes; 
            private Integer diffTolerateType; 
            private java.util.Map<String, ?> diffTolerateValues; 
            private Integer enableDecimalScale; 
            private String filterColumnName; 
            private String filterColumns; 
            private Integer floatPrecision; 
            private Integer ignoreDecimalDiff; 
            private Integer ignoreDecimalScaleSuffixZero; 
            private Integer ignoreEmptyDiff; 
            private Integer ignoreNumericZero; 
            private Integer ignoreStringEmpty; 
            private Integer ignoreZeroDiff; 
            private Integer isCountCheck; 
            private String ruleId; 
            private Integer setDecimalScale; 

            private Builder() {
            } 

            private Builder(MetricRules model) {
                this.checkMethods = model.checkMethods;
                this.controlFloatPrecision = model.controlFloatPrecision;
                this.dataTypeClassify = model.dataTypeClassify;
                this.dataTypeGroup = model.dataTypeGroup;
                this.dataTypeList = model.dataTypeList;
                this.dataTypes = model.dataTypes;
                this.diffTolerateType = model.diffTolerateType;
                this.diffTolerateValues = model.diffTolerateValues;
                this.enableDecimalScale = model.enableDecimalScale;
                this.filterColumnName = model.filterColumnName;
                this.filterColumns = model.filterColumns;
                this.floatPrecision = model.floatPrecision;
                this.ignoreDecimalDiff = model.ignoreDecimalDiff;
                this.ignoreDecimalScaleSuffixZero = model.ignoreDecimalScaleSuffixZero;
                this.ignoreEmptyDiff = model.ignoreEmptyDiff;
                this.ignoreNumericZero = model.ignoreNumericZero;
                this.ignoreStringEmpty = model.ignoreStringEmpty;
                this.ignoreZeroDiff = model.ignoreZeroDiff;
                this.isCountCheck = model.isCountCheck;
                this.ruleId = model.ruleId;
                this.setDecimalScale = model.setDecimalScale;
            } 

            /**
             * <p>The check methods (metric calculation methods). Separate multiple values with commas, such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
             * 
             * <strong>example:</strong>
             * <p>SUM,AVG</p>
             */
            public Builder checkMethods(String checkMethods) {
                this.checkMethods = checkMethods;
                return this;
            }

            /**
             * <p>Specifies whether to control floating-point precision. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder controlFloatPrecision(Integer controlFloatPrecision) {
                this.controlFloatPrecision = controlFloatPrecision;
                return this;
            }

            /**
             * <p>The data type category. Valid values: 0 (native data type) and 1 (composite data type).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataTypeClassify(Integer dataTypeClassify) {
                this.dataTypeClassify = dataTypeClassify;
                return this;
            }

            /**
             * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataTypeGroup(Integer dataTypeGroup) {
                this.dataTypeGroup = dataTypeGroup;
                return this;
            }

            /**
             * <p>The list of data types to which the verification rule applies. Configure this field based on your requirements.</p>
             */
            public Builder dataTypeList(java.util.List<String> dataTypeList) {
                this.dataTypeList = dataTypeList;
                return this;
            }

            /**
             * <p>The data types. Configure this field based on your requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
             */
            public Builder dataTypes(String dataTypes) {
                this.dataTypes = dataTypes;
                return this;
            }

            /**
             * <p>The difference tolerance rate type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder diffTolerateType(Integer diffTolerateType) {
                this.diffTolerateType = diffTolerateType;
                return this;
            }

            /**
             * <p>The difference tolerance rate values. For the unified type, specify one value, such as {&quot;SAME&quot;: 0}. For the custom type, specify a value for each tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
             */
            public Builder diffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
                this.diffTolerateValues = diffTolerateValues;
                return this;
            }

            /**
             * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enableDecimalScale(Integer enableDecimalScale) {
                this.enableDecimalScale = enableDecimalScale;
                return this;
            }

            /**
             * <p>The filter field names, separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder filterColumnName(String filterColumnName) {
                this.filterColumnName = filterColumnName;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field is retained for backward compatibility.</p>
             * 
             * <strong>example:</strong>
             * <p>col_a,col_b</p>
             */
            public Builder filterColumns(String filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>The number of decimal places for floating-point values.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder floatPrecision(Integer floatPrecision) {
                this.floatPrecision = floatPrecision;
                return this;
            }

            /**
             * <p>Specifies whether to ignore trailing zero differences in decimal parts. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreDecimalDiff(Integer ignoreDecimalDiff) {
                this.ignoreDecimalDiff = ignoreDecimalDiff;
                return this;
            }

            /**
             * <p>Specifies whether to ignore trailing zeros in the decimal scale for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
                this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreEmptyDiff(Integer ignoreEmptyDiff) {
                this.ignoreEmptyDiff = ignoreEmptyDiff;
                return this;
            }

            /**
             * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreNumericZero(Integer ignoreNumericZero) {
                this.ignoreNumericZero = ignoreNumericZero;
                return this;
            }

            /**
             * <p>Specifies whether to ignore empty strings and null values for string types. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreStringEmpty(Integer ignoreStringEmpty) {
                this.ignoreStringEmpty = ignoreStringEmpty;
                return this;
            }

            /**
             * <p>Specifies whether to ignore differences between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ignoreZeroDiff(Integer ignoreZeroDiff) {
                this.ignoreZeroDiff = ignoreZeroDiff;
                return this;
            }

            /**
             * <p>Specifies whether to enable count (data volume) verification. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isCountCheck(Integer isCountCheck) {
                this.isCountCheck = isCountCheck;
                return this;
            }

            /**
             * <p>The rule ID that uniquely identifies a verification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The specific decimal scale value for DECIMAL type comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder setDecimalScale(Integer setDecimalScale) {
                this.setDecimalScale = setDecimalScale;
                return this;
            }

            public MetricRules build() {
                return new MetricRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDataCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>AddDataCheckTemplateRequest</p>
     */
    public static class NullRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataTypeGroup")
        private Integer dataTypeGroup;

        @com.aliyun.core.annotation.NameInMap("nullValues")
        private String nullValues;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        private NullRules(Builder builder) {
            this.dataTypeGroup = builder.dataTypeGroup;
            this.nullValues = builder.nullValues;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NullRules create() {
            return builder().build();
        }

        /**
         * @return dataTypeGroup
         */
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        /**
         * @return nullValues
         */
        public String getNullValues() {
            return this.nullValues;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Integer dataTypeGroup; 
            private String nullValues; 
            private String ruleId; 

            private Builder() {
            } 

            private Builder(NullRules model) {
                this.dataTypeGroup = model.dataTypeGroup;
                this.nullValues = model.nullValues;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataTypeGroup(Integer dataTypeGroup) {
                this.dataTypeGroup = dataTypeGroup;
                return this;
            }

            /**
             * <p>The null value definitions, stored in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder nullValues(String nullValues) {
                this.nullValues = nullValues;
                return this;
            }

            /**
             * <p>The rule ID that uniquely identifies a verification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public NullRules build() {
                return new NullRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDataCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>AddDataCheckTemplateRequest</p>
     */
    public static class WeakContentRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterColumnExpression")
        private String filterColumnExpression;

        @com.aliyun.core.annotation.NameInMap("filterColumnTypes")
        private java.util.List<String> filterColumnTypes;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("weakContentAlgorithm")
        private String weakContentAlgorithm;

        private WeakContentRule(Builder builder) {
            this.filterColumnExpression = builder.filterColumnExpression;
            this.filterColumnTypes = builder.filterColumnTypes;
            this.ruleId = builder.ruleId;
            this.weakContentAlgorithm = builder.weakContentAlgorithm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeakContentRule create() {
            return builder().build();
        }

        /**
         * @return filterColumnExpression
         */
        public String getFilterColumnExpression() {
            return this.filterColumnExpression;
        }

        /**
         * @return filterColumnTypes
         */
        public java.util.List<String> getFilterColumnTypes() {
            return this.filterColumnTypes;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return weakContentAlgorithm
         */
        public String getWeakContentAlgorithm() {
            return this.weakContentAlgorithm;
        }

        public static final class Builder {
            private String filterColumnExpression; 
            private java.util.List<String> filterColumnTypes; 
            private String ruleId; 
            private String weakContentAlgorithm; 

            private Builder() {
            } 

            private Builder(WeakContentRule model) {
                this.filterColumnExpression = model.filterColumnExpression;
                this.filterColumnTypes = model.filterColumnTypes;
                this.ruleId = model.ruleId;
                this.weakContentAlgorithm = model.weakContentAlgorithm;
            } 

            /**
             * <p>The filter column name expression.</p>
             * 
             * <strong>example:</strong>
             * <p>^col_.*$</p>
             */
            public Builder filterColumnExpression(String filterColumnExpression) {
                this.filterColumnExpression = filterColumnExpression;
                return this;
            }

            /**
             * <p>The filter column types, separated by vertical bars (|).</p>
             */
            public Builder filterColumnTypes(java.util.List<String> filterColumnTypes) {
                this.filterColumnTypes = filterColumnTypes;
                return this;
            }

            /**
             * <p>The rule ID that uniquely identifies a verification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The weak content algorithm name: md5 or crc32.</p>
             * 
             * <strong>example:</strong>
             * <p>md5</p>
             */
            public Builder weakContentAlgorithm(String weakContentAlgorithm) {
                this.weakContentAlgorithm = weakContentAlgorithm;
                return this;
            }

            public WeakContentRule build() {
                return new WeakContentRule(this);
            } 

        } 

    }
}
