// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventVariableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventVariableListResponseBody</p>
 */
public class DescribeEventVariableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeEventVariableListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventVariableListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeEventVariableListResponseBody build() {
            return new DescribeEventVariableListResponseBody(this);
        } 

    } 

    public static class OutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private OutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public OutputThreshold build() {
                return new OutputThreshold(this);
            } 

        } 

    }
    public static class VariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private VariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public VariableVelocity build() {
                return new VariableVelocity(this);
            } 

        } 

    }
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private OutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private VariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private Actions(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public OutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public VariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private OutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private VariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(OutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(VariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    public static class DeviceVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private DeviceVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public DeviceVariablesOutputThreshold build() {
                return new DeviceVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class DeviceVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private DeviceVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public DeviceVariablesVariableVelocity build() {
                return new DeviceVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class DeviceVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private DeviceVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private DeviceVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private DeviceVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public DeviceVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public DeviceVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private DeviceVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private DeviceVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(DeviceVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(DeviceVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public DeviceVariables build() {
                return new DeviceVariables(this);
            } 

        } 

    }
    public static class ExpressionVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private ExpressionVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressionVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public ExpressionVariablesOutputThreshold build() {
                return new ExpressionVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class ExpressionVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private ExpressionVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressionVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public ExpressionVariablesVariableVelocity build() {
                return new ExpressionVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class ExpressionVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private ExpressionVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private ExpressionVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private ExpressionVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressionVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public ExpressionVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public ExpressionVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private ExpressionVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private ExpressionVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(ExpressionVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(ExpressionVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public ExpressionVariables build() {
                return new ExpressionVariables(this);
            } 

        } 

    }
    public static class FavoriteVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private FavoriteVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FavoriteVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public FavoriteVariablesOutputThreshold build() {
                return new FavoriteVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class FavoriteVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private FavoriteVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FavoriteVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public FavoriteVariablesVariableVelocity build() {
                return new FavoriteVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class FavoriteVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private FavoriteVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private FavoriteVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private FavoriteVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FavoriteVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public FavoriteVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public FavoriteVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private FavoriteVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private FavoriteVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(FavoriteVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(FavoriteVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public FavoriteVariables build() {
                return new FavoriteVariables(this);
            } 

        } 

    }
    public static class MiddleVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private MiddleVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiddleVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public MiddleVariablesOutputThreshold build() {
                return new MiddleVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class MiddleVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private MiddleVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiddleVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public MiddleVariablesVariableVelocity build() {
                return new MiddleVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class MiddleVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private MiddleVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private MiddleVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private MiddleVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiddleVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public MiddleVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public MiddleVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private MiddleVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private MiddleVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(MiddleVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(MiddleVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public MiddleVariables build() {
                return new MiddleVariables(this);
            } 

        } 

    }
    public static class ModelVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private ModelVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public ModelVariablesOutputThreshold build() {
                return new ModelVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class ModelVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private ModelVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public ModelVariablesVariableVelocity build() {
                return new ModelVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class ModelVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private ModelVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private ModelVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private ModelVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public ModelVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public ModelVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private ModelVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private ModelVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(ModelVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(ModelVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public ModelVariables build() {
                return new ModelVariables(this);
            } 

        } 

    }
    public static class NameListOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private NameListOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameListOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public NameListOutputThreshold build() {
                return new NameListOutputThreshold(this);
            } 

        } 

    }
    public static class NameListVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private NameListVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameListVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public NameListVariableVelocity build() {
                return new NameListVariableVelocity(this);
            } 

        } 

    }
    public static class NameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private NameListOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private NameListVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private NameList(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public NameListOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public NameListVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private NameListOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private NameListVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(NameListOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(NameListVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public NameList build() {
                return new NameList(this);
            } 

        } 

    }
    public static class NativeVariableFunctionsOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private NativeVariableFunctionsOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeVariableFunctionsOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public NativeVariableFunctionsOutputThreshold build() {
                return new NativeVariableFunctionsOutputThreshold(this);
            } 

        } 

    }
    public static class NativeVariableFunctionsVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private NativeVariableFunctionsVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeVariableFunctionsVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public NativeVariableFunctionsVariableVelocity build() {
                return new NativeVariableFunctionsVariableVelocity(this);
            } 

        } 

    }
    public static class NativeVariableFunctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private NativeVariableFunctionsOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private NativeVariableFunctionsVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private NativeVariableFunctions(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeVariableFunctions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public NativeVariableFunctionsOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public NativeVariableFunctionsVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private NativeVariableFunctionsOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private NativeVariableFunctionsVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(NativeVariableFunctionsOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(NativeVariableFunctionsVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public NativeVariableFunctions build() {
                return new NativeVariableFunctions(this);
            } 

        } 

    }
    public static class NativeVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private NativeVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public NativeVariablesOutputThreshold build() {
                return new NativeVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class NativeVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private NativeVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public NativeVariablesVariableVelocity build() {
                return new NativeVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class NativeVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private NativeVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private NativeVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private NativeVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public NativeVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public NativeVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private NativeVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private NativeVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(NativeVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(NativeVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public NativeVariables build() {
                return new NativeVariables(this);
            } 

        } 

    }
    public static class QueryVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private QueryVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public QueryVariablesOutputThreshold build() {
                return new QueryVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class QueryVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private QueryVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public QueryVariablesVariableVelocity build() {
                return new QueryVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class QueryVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private QueryVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private QueryVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private QueryVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public QueryVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public QueryVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private QueryVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private QueryVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(QueryVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(QueryVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public QueryVariables build() {
                return new QueryVariables(this);
            } 

        } 

    }
    public static class SelfVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private SelfVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelfVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public SelfVariablesOutputThreshold build() {
                return new SelfVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class SelfVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private SelfVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelfVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public SelfVariablesVariableVelocity build() {
                return new SelfVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class SelfVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private SelfVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private SelfVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private SelfVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelfVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public SelfVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public SelfVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private SelfVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private SelfVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(SelfVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(SelfVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public SelfVariables build() {
                return new SelfVariables(this);
            } 

        } 

    }
    public static class SysVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private SysVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SysVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public SysVariablesOutputThreshold build() {
                return new SysVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class SysVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private SysVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SysVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public SysVariablesVariableVelocity build() {
                return new SysVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class SysVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private SysVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private SysVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private SysVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SysVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public SysVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public SysVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private SysVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private SysVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(SysVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(SysVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public SysVariables build() {
                return new SysVariables(this);
            } 

        } 

    }
    public static class VelocityVariablesOutputThreshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Double minValue;

        private VelocityVariablesOutputThreshold(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VelocityVariablesOutputThreshold create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
            return this.minValue;
        }

        public static final class Builder {
            private Double maxValue; 
            private Double minValue; 

            /**
             * maxValue.
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            public VelocityVariablesOutputThreshold build() {
                return new VelocityVariablesOutputThreshold(this);
            } 

        } 

    }
    public static class VelocityVariablesVariableVelocity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("iv")
        private String iv;

        private VelocityVariablesVariableVelocity(Builder builder) {
            this.iv = builder.iv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VelocityVariablesVariableVelocity create() {
            return builder().build();
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        public static final class Builder {
            private String iv; 

            /**
             * iv.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            public VelocityVariablesVariableVelocity build() {
                return new VelocityVariablesVariableVelocity(this);
            } 

        } 

    }
    public static class VelocityVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("expressionTitle")
        private String expressionTitle;

        @com.aliyun.core.annotation.NameInMap("favoriteFlag")
        private Boolean favoriteFlag;

        @com.aliyun.core.annotation.NameInMap("fieldDetail")
        private String fieldDetail;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Integer fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFieldType")
        private String inputFieldType;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outlier")
        private String outlier;

        @com.aliyun.core.annotation.NameInMap("outputThreshold")
        private VelocityVariablesOutputThreshold outputThreshold;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("variableVelocity")
        private VelocityVariablesVariableVelocity variableVelocity;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private VelocityVariables(Builder builder) {
            this.code = builder.code;
            this.dataDisplay = builder.dataDisplay;
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.expressionTitle = builder.expressionTitle;
            this.favoriteFlag = builder.favoriteFlag;
            this.fieldDetail = builder.fieldDetail;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.inputFieldType = builder.inputFieldType;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.name = builder.name;
            this.outlier = builder.outlier;
            this.outputThreshold = builder.outputThreshold;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.variableVelocity = builder.variableVelocity;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VelocityVariables create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return expressionTitle
         */
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        /**
         * @return favoriteFlag
         */
        public Boolean getFavoriteFlag() {
            return this.favoriteFlag;
        }

        /**
         * @return fieldDetail
         */
        public String getFieldDetail() {
            return this.fieldDetail;
        }

        /**
         * @return fieldRank
         */
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFieldType
         */
        public String getInputFieldType() {
            return this.inputFieldType;
        }

        /**
         * @return inputRequired
         */
        public String getInputRequired() {
            return this.inputRequired;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlier
         */
        public String getOutlier() {
            return this.outlier;
        }

        /**
         * @return outputThreshold
         */
        public VelocityVariablesOutputThreshold getOutputThreshold() {
            return this.outputThreshold;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return variableVelocity
         */
        public VelocityVariablesVariableVelocity getVariableVelocity() {
            return this.variableVelocity;
        }

        /**
         * @return xLabel
         */
        public String getXLabel() {
            return this.xLabel;
        }

        /**
         * @return yLabel
         */
        public String getYLabel() {
            return this.yLabel;
        }

        public static final class Builder {
            private String code; 
            private String dataDisplay; 
            private String defineId; 
            private String description; 
            private String displayType; 
            private String expressionTitle; 
            private Boolean favoriteFlag; 
            private String fieldDetail; 
            private Integer fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private Long id; 
            private String inputFieldType; 
            private String inputRequired; 
            private String inputs; 
            private String name; 
            private String outlier; 
            private VelocityVariablesOutputThreshold outputThreshold; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 
            private VelocityVariablesVariableVelocity variableVelocity; 
            private String xLabel; 
            private String yLabel; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * dataDisplay.
             */
            public Builder dataDisplay(String dataDisplay) {
                this.dataDisplay = dataDisplay;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * expressionTitle.
             */
            public Builder expressionTitle(String expressionTitle) {
                this.expressionTitle = expressionTitle;
                return this;
            }

            /**
             * favoriteFlag.
             */
            public Builder favoriteFlag(Boolean favoriteFlag) {
                this.favoriteFlag = favoriteFlag;
                return this;
            }

            /**
             * fieldDetail.
             */
            public Builder fieldDetail(String fieldDetail) {
                this.fieldDetail = fieldDetail;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Integer fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * inputFieldType.
             */
            public Builder inputFieldType(String inputFieldType) {
                this.inputFieldType = inputFieldType;
                return this;
            }

            /**
             * inputRequired.
             */
            public Builder inputRequired(String inputRequired) {
                this.inputRequired = inputRequired;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
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
             * outlier.
             */
            public Builder outlier(String outlier) {
                this.outlier = outlier;
                return this;
            }

            /**
             * outputThreshold.
             */
            public Builder outputThreshold(VelocityVariablesOutputThreshold outputThreshold) {
                this.outputThreshold = outputThreshold;
                return this;
            }

            /**
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * variableVelocity.
             */
            public Builder variableVelocity(VelocityVariablesVariableVelocity variableVelocity) {
                this.variableVelocity = variableVelocity;
                return this;
            }

            /**
             * xLabel.
             */
            public Builder xLabel(String xLabel) {
                this.xLabel = xLabel;
                return this;
            }

            /**
             * yLabel.
             */
            public Builder yLabel(String yLabel) {
                this.yLabel = yLabel;
                return this;
            }

            public VelocityVariables build() {
                return new VelocityVariables(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < Actions> actions;

        @com.aliyun.core.annotation.NameInMap("deviceVariables")
        private java.util.List < DeviceVariables> deviceVariables;

        @com.aliyun.core.annotation.NameInMap("expressionVariables")
        private java.util.List < ExpressionVariables> expressionVariables;

        @com.aliyun.core.annotation.NameInMap("favoriteVariables")
        private java.util.List < FavoriteVariables> favoriteVariables;

        @com.aliyun.core.annotation.NameInMap("middleVariables")
        private java.util.List < MiddleVariables> middleVariables;

        @com.aliyun.core.annotation.NameInMap("modelVariables")
        private java.util.List < ModelVariables> modelVariables;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List < NameList> nameList;

        @com.aliyun.core.annotation.NameInMap("nativeVariableFunctions")
        private java.util.List < NativeVariableFunctions> nativeVariableFunctions;

        @com.aliyun.core.annotation.NameInMap("nativeVariables")
        private java.util.List < NativeVariables> nativeVariables;

        @com.aliyun.core.annotation.NameInMap("queryVariables")
        private java.util.List < QueryVariables> queryVariables;

        @com.aliyun.core.annotation.NameInMap("selfVariables")
        private java.util.List < SelfVariables> selfVariables;

        @com.aliyun.core.annotation.NameInMap("sysVariables")
        private java.util.List < SysVariables> sysVariables;

        @com.aliyun.core.annotation.NameInMap("thirdVariables")
        private java.util.Map < String, ? > thirdVariables;

        @com.aliyun.core.annotation.NameInMap("velocityVariables")
        private java.util.List < VelocityVariables> velocityVariables;

        private ResultObject(Builder builder) {
            this.actions = builder.actions;
            this.deviceVariables = builder.deviceVariables;
            this.expressionVariables = builder.expressionVariables;
            this.favoriteVariables = builder.favoriteVariables;
            this.middleVariables = builder.middleVariables;
            this.modelVariables = builder.modelVariables;
            this.nameList = builder.nameList;
            this.nativeVariableFunctions = builder.nativeVariableFunctions;
            this.nativeVariables = builder.nativeVariables;
            this.queryVariables = builder.queryVariables;
            this.selfVariables = builder.selfVariables;
            this.sysVariables = builder.sysVariables;
            this.thirdVariables = builder.thirdVariables;
            this.velocityVariables = builder.velocityVariables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < Actions> getActions() {
            return this.actions;
        }

        /**
         * @return deviceVariables
         */
        public java.util.List < DeviceVariables> getDeviceVariables() {
            return this.deviceVariables;
        }

        /**
         * @return expressionVariables
         */
        public java.util.List < ExpressionVariables> getExpressionVariables() {
            return this.expressionVariables;
        }

        /**
         * @return favoriteVariables
         */
        public java.util.List < FavoriteVariables> getFavoriteVariables() {
            return this.favoriteVariables;
        }

        /**
         * @return middleVariables
         */
        public java.util.List < MiddleVariables> getMiddleVariables() {
            return this.middleVariables;
        }

        /**
         * @return modelVariables
         */
        public java.util.List < ModelVariables> getModelVariables() {
            return this.modelVariables;
        }

        /**
         * @return nameList
         */
        public java.util.List < NameList> getNameList() {
            return this.nameList;
        }

        /**
         * @return nativeVariableFunctions
         */
        public java.util.List < NativeVariableFunctions> getNativeVariableFunctions() {
            return this.nativeVariableFunctions;
        }

        /**
         * @return nativeVariables
         */
        public java.util.List < NativeVariables> getNativeVariables() {
            return this.nativeVariables;
        }

        /**
         * @return queryVariables
         */
        public java.util.List < QueryVariables> getQueryVariables() {
            return this.queryVariables;
        }

        /**
         * @return selfVariables
         */
        public java.util.List < SelfVariables> getSelfVariables() {
            return this.selfVariables;
        }

        /**
         * @return sysVariables
         */
        public java.util.List < SysVariables> getSysVariables() {
            return this.sysVariables;
        }

        /**
         * @return thirdVariables
         */
        public java.util.Map < String, ? > getThirdVariables() {
            return this.thirdVariables;
        }

        /**
         * @return velocityVariables
         */
        public java.util.List < VelocityVariables> getVelocityVariables() {
            return this.velocityVariables;
        }

        public static final class Builder {
            private java.util.List < Actions> actions; 
            private java.util.List < DeviceVariables> deviceVariables; 
            private java.util.List < ExpressionVariables> expressionVariables; 
            private java.util.List < FavoriteVariables> favoriteVariables; 
            private java.util.List < MiddleVariables> middleVariables; 
            private java.util.List < ModelVariables> modelVariables; 
            private java.util.List < NameList> nameList; 
            private java.util.List < NativeVariableFunctions> nativeVariableFunctions; 
            private java.util.List < NativeVariables> nativeVariables; 
            private java.util.List < QueryVariables> queryVariables; 
            private java.util.List < SelfVariables> selfVariables; 
            private java.util.List < SysVariables> sysVariables; 
            private java.util.Map < String, ? > thirdVariables; 
            private java.util.List < VelocityVariables> velocityVariables; 

            /**
             * actions.
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * deviceVariables.
             */
            public Builder deviceVariables(java.util.List < DeviceVariables> deviceVariables) {
                this.deviceVariables = deviceVariables;
                return this;
            }

            /**
             * expressionVariables.
             */
            public Builder expressionVariables(java.util.List < ExpressionVariables> expressionVariables) {
                this.expressionVariables = expressionVariables;
                return this;
            }

            /**
             * favoriteVariables.
             */
            public Builder favoriteVariables(java.util.List < FavoriteVariables> favoriteVariables) {
                this.favoriteVariables = favoriteVariables;
                return this;
            }

            /**
             * middleVariables.
             */
            public Builder middleVariables(java.util.List < MiddleVariables> middleVariables) {
                this.middleVariables = middleVariables;
                return this;
            }

            /**
             * modelVariables.
             */
            public Builder modelVariables(java.util.List < ModelVariables> modelVariables) {
                this.modelVariables = modelVariables;
                return this;
            }

            /**
             * nameList.
             */
            public Builder nameList(java.util.List < NameList> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * nativeVariableFunctions.
             */
            public Builder nativeVariableFunctions(java.util.List < NativeVariableFunctions> nativeVariableFunctions) {
                this.nativeVariableFunctions = nativeVariableFunctions;
                return this;
            }

            /**
             * nativeVariables.
             */
            public Builder nativeVariables(java.util.List < NativeVariables> nativeVariables) {
                this.nativeVariables = nativeVariables;
                return this;
            }

            /**
             * queryVariables.
             */
            public Builder queryVariables(java.util.List < QueryVariables> queryVariables) {
                this.queryVariables = queryVariables;
                return this;
            }

            /**
             * selfVariables.
             */
            public Builder selfVariables(java.util.List < SelfVariables> selfVariables) {
                this.selfVariables = selfVariables;
                return this;
            }

            /**
             * sysVariables.
             */
            public Builder sysVariables(java.util.List < SysVariables> sysVariables) {
                this.sysVariables = sysVariables;
                return this;
            }

            /**
             * thirdVariables.
             */
            public Builder thirdVariables(java.util.Map < String, ? > thirdVariables) {
                this.thirdVariables = thirdVariables;
                return this;
            }

            /**
             * velocityVariables.
             */
            public Builder velocityVariables(java.util.List < VelocityVariables> velocityVariables) {
                this.velocityVariables = velocityVariables;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
