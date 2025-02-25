// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVariableDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVariableDetailResponseBody</p>
 */
public class DescribeVariableDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeVariableDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableDetailResponseBody create() {
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

        public DescribeVariableDetailResponseBody build() {
            return new DescribeVariableDetailResponseBody(this);
        } 

    } 

    public static class BaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowBind")
        private String allowBind;

        @com.aliyun.core.annotation.NameInMap("chargingMode")
        private String chargingMode;

        @com.aliyun.core.annotation.NameInMap("chargingModeDesc")
        private String chargingModeDesc;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("dataDisplay")
        private String dataDisplay;

        @com.aliyun.core.annotation.NameInMap("dataThreshold")
        private String dataThreshold;

        @com.aliyun.core.annotation.NameInMap("deductionFactor")
        private Integer deductionFactor;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("frontAllowBind")
        private String frontAllowBind;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputRequired")
        private String inputRequired;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("inputsDesc")
        private String inputsDesc;

        @com.aliyun.core.annotation.NameInMap("invokeKey")
        private String invokeKey;

        @com.aliyun.core.annotation.NameInMap("invokeRt")
        private Integer invokeRt;

        @com.aliyun.core.annotation.NameInMap("invokeSuccessRate")
        private String invokeSuccessRate;

        @com.aliyun.core.annotation.NameInMap("invokeTimes")
        private Long invokeTimes;

        @com.aliyun.core.annotation.NameInMap("lastModifiedOperator")
        private String lastModifiedOperator;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("outputsDesc")
        private String outputsDesc;

        @com.aliyun.core.annotation.NameInMap("scene")
        private java.util.List < String > scene;

        @com.aliyun.core.annotation.NameInMap("sceneDesc")
        private java.util.List < String > sceneDesc;

        @com.aliyun.core.annotation.NameInMap("showOrder")
        private String showOrder;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourceDesc")
        private String sourceDesc;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("supportRegions")
        private java.util.List < String > supportRegions;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("typeDesc")
        private String typeDesc;

        @com.aliyun.core.annotation.NameInMap("xLabel")
        private String xLabel;

        @com.aliyun.core.annotation.NameInMap("yLabel")
        private String yLabel;

        private BaseInfo(Builder builder) {
            this.allowBind = builder.allowBind;
            this.chargingMode = builder.chargingMode;
            this.chargingModeDesc = builder.chargingModeDesc;
            this.creator = builder.creator;
            this.dataDisplay = builder.dataDisplay;
            this.dataThreshold = builder.dataThreshold;
            this.deductionFactor = builder.deductionFactor;
            this.description = builder.description;
            this.frontAllowBind = builder.frontAllowBind;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.inputRequired = builder.inputRequired;
            this.inputs = builder.inputs;
            this.inputsDesc = builder.inputsDesc;
            this.invokeKey = builder.invokeKey;
            this.invokeRt = builder.invokeRt;
            this.invokeSuccessRate = builder.invokeSuccessRate;
            this.invokeTimes = builder.invokeTimes;
            this.lastModifiedOperator = builder.lastModifiedOperator;
            this.name = builder.name;
            this.outputs = builder.outputs;
            this.outputsDesc = builder.outputsDesc;
            this.scene = builder.scene;
            this.sceneDesc = builder.sceneDesc;
            this.showOrder = builder.showOrder;
            this.source = builder.source;
            this.sourceDesc = builder.sourceDesc;
            this.status = builder.status;
            this.supportRegions = builder.supportRegions;
            this.title = builder.title;
            this.type = builder.type;
            this.typeDesc = builder.typeDesc;
            this.xLabel = builder.xLabel;
            this.yLabel = builder.yLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseInfo create() {
            return builder().build();
        }

        /**
         * @return allowBind
         */
        public String getAllowBind() {
            return this.allowBind;
        }

        /**
         * @return chargingMode
         */
        public String getChargingMode() {
            return this.chargingMode;
        }

        /**
         * @return chargingModeDesc
         */
        public String getChargingModeDesc() {
            return this.chargingModeDesc;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataDisplay
         */
        public String getDataDisplay() {
            return this.dataDisplay;
        }

        /**
         * @return dataThreshold
         */
        public String getDataThreshold() {
            return this.dataThreshold;
        }

        /**
         * @return deductionFactor
         */
        public Integer getDeductionFactor() {
            return this.deductionFactor;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return frontAllowBind
         */
        public String getFrontAllowBind() {
            return this.frontAllowBind;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return inputsDesc
         */
        public String getInputsDesc() {
            return this.inputsDesc;
        }

        /**
         * @return invokeKey
         */
        public String getInvokeKey() {
            return this.invokeKey;
        }

        /**
         * @return invokeRt
         */
        public Integer getInvokeRt() {
            return this.invokeRt;
        }

        /**
         * @return invokeSuccessRate
         */
        public String getInvokeSuccessRate() {
            return this.invokeSuccessRate;
        }

        /**
         * @return invokeTimes
         */
        public Long getInvokeTimes() {
            return this.invokeTimes;
        }

        /**
         * @return lastModifiedOperator
         */
        public String getLastModifiedOperator() {
            return this.lastModifiedOperator;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return outputsDesc
         */
        public String getOutputsDesc() {
            return this.outputsDesc;
        }

        /**
         * @return scene
         */
        public java.util.List < String > getScene() {
            return this.scene;
        }

        /**
         * @return sceneDesc
         */
        public java.util.List < String > getSceneDesc() {
            return this.sceneDesc;
        }

        /**
         * @return showOrder
         */
        public String getShowOrder() {
            return this.showOrder;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceDesc
         */
        public String getSourceDesc() {
            return this.sourceDesc;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportRegions
         */
        public java.util.List < String > getSupportRegions() {
            return this.supportRegions;
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
         * @return typeDesc
         */
        public String getTypeDesc() {
            return this.typeDesc;
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
            private String allowBind; 
            private String chargingMode; 
            private String chargingModeDesc; 
            private String creator; 
            private String dataDisplay; 
            private String dataThreshold; 
            private Integer deductionFactor; 
            private String description; 
            private String frontAllowBind; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String inputRequired; 
            private String inputs; 
            private String inputsDesc; 
            private String invokeKey; 
            private Integer invokeRt; 
            private String invokeSuccessRate; 
            private Long invokeTimes; 
            private String lastModifiedOperator; 
            private String name; 
            private String outputs; 
            private String outputsDesc; 
            private java.util.List < String > scene; 
            private java.util.List < String > sceneDesc; 
            private String showOrder; 
            private String source; 
            private String sourceDesc; 
            private String status; 
            private java.util.List < String > supportRegions; 
            private String title; 
            private String type; 
            private String typeDesc; 
            private String xLabel; 
            private String yLabel; 

            /**
             * allowBind.
             */
            public Builder allowBind(String allowBind) {
                this.allowBind = allowBind;
                return this;
            }

            /**
             * chargingMode.
             */
            public Builder chargingMode(String chargingMode) {
                this.chargingMode = chargingMode;
                return this;
            }

            /**
             * chargingModeDesc.
             */
            public Builder chargingModeDesc(String chargingModeDesc) {
                this.chargingModeDesc = chargingModeDesc;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * dataThreshold.
             */
            public Builder dataThreshold(String dataThreshold) {
                this.dataThreshold = dataThreshold;
                return this;
            }

            /**
             * deductionFactor.
             */
            public Builder deductionFactor(Integer deductionFactor) {
                this.deductionFactor = deductionFactor;
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
             * frontAllowBind.
             */
            public Builder frontAllowBind(String frontAllowBind) {
                this.frontAllowBind = frontAllowBind;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * inputsDesc.
             */
            public Builder inputsDesc(String inputsDesc) {
                this.inputsDesc = inputsDesc;
                return this;
            }

            /**
             * invokeKey.
             */
            public Builder invokeKey(String invokeKey) {
                this.invokeKey = invokeKey;
                return this;
            }

            /**
             * invokeRt.
             */
            public Builder invokeRt(Integer invokeRt) {
                this.invokeRt = invokeRt;
                return this;
            }

            /**
             * invokeSuccessRate.
             */
            public Builder invokeSuccessRate(String invokeSuccessRate) {
                this.invokeSuccessRate = invokeSuccessRate;
                return this;
            }

            /**
             * invokeTimes.
             */
            public Builder invokeTimes(Long invokeTimes) {
                this.invokeTimes = invokeTimes;
                return this;
            }

            /**
             * lastModifiedOperator.
             */
            public Builder lastModifiedOperator(String lastModifiedOperator) {
                this.lastModifiedOperator = lastModifiedOperator;
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
             * outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * outputsDesc.
             */
            public Builder outputsDesc(String outputsDesc) {
                this.outputsDesc = outputsDesc;
                return this;
            }

            /**
             * scene.
             */
            public Builder scene(java.util.List < String > scene) {
                this.scene = scene;
                return this;
            }

            /**
             * sceneDesc.
             */
            public Builder sceneDesc(java.util.List < String > sceneDesc) {
                this.sceneDesc = sceneDesc;
                return this;
            }

            /**
             * showOrder.
             */
            public Builder showOrder(String showOrder) {
                this.showOrder = showOrder;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sourceDesc.
             */
            public Builder sourceDesc(String sourceDesc) {
                this.sourceDesc = sourceDesc;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * supportRegions.
             */
            public Builder supportRegions(java.util.List < String > supportRegions) {
                this.supportRegions = supportRegions;
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
             * typeDesc.
             */
            public Builder typeDesc(String typeDesc) {
                this.typeDesc = typeDesc;
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

            public BaseInfo build() {
                return new BaseInfo(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseInfo")
        private BaseInfo baseInfo;

        private ResultObject(Builder builder) {
            this.baseInfo = builder.baseInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return baseInfo
         */
        public BaseInfo getBaseInfo() {
            return this.baseInfo;
        }

        public static final class Builder {
            private BaseInfo baseInfo; 

            /**
             * baseInfo.
             */
            public Builder baseInfo(BaseInfo baseInfo) {
                this.baseInfo = baseInfo;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
