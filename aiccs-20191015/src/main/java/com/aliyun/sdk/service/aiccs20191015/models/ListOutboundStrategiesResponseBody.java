// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOutboundStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOutboundStrategiesResponseBody</p>
 */
public class ListOutboundStrategiesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("OutboundStrategies")
    private java.util.List < OutboundStrategies> outboundStrategies;

    @NameInMap("RequestId")
    private String requestId;

    private ListOutboundStrategiesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.outboundStrategies = builder.outboundStrategies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOutboundStrategiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outboundStrategies
     */
    public java.util.List < OutboundStrategies> getOutboundStrategies() {
        return this.outboundStrategies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < OutboundStrategies> outboundStrategies; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OutboundStrategies.
         */
        public Builder outboundStrategies(java.util.List < OutboundStrategies> outboundStrategies) {
            this.outboundStrategies = outboundStrategies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOutboundStrategiesResponseBody build() {
            return new ListOutboundStrategiesResponseBody(this);
        } 

    } 

    public static class OutboundStrategies extends TeaModel {
        @NameInMap("BuId")
        private Long buId;

        @NameInMap("CreatorId")
        private Long creatorId;

        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("DepartmentId")
        private Long departmentId;

        @NameInMap("ExtAttr")
        private String extAttr;

        @NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @NameInMap("GmtModifiedStr")
        private String gmtModifiedStr;

        @NameInMap("ModifierId")
        private Long modifierId;

        @NameInMap("ModifierName")
        private String modifierName;

        @NameInMap("NumType")
        private Integer numType;

        @NameInMap("OutboundNum")
        private String outboundNum;

        @NameInMap("OutboundStrategyId")
        private Long outboundStrategyId;

        @NameInMap("OutboundStrategyName")
        private String outboundStrategyName;

        @NameInMap("Process")
        private Integer process;

        @NameInMap("ResourceAllocation")
        private Integer resourceAllocation;

        @NameInMap("RobotId")
        private String robotId;

        @NameInMap("RobotName")
        private String robotName;

        @NameInMap("RobotType")
        private Integer robotType;

        @NameInMap("RuleCode")
        private Long ruleCode;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SuccessRate")
        private Integer successRate;

        private OutboundStrategies(Builder builder) {
            this.buId = builder.buId;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.departmentId = builder.departmentId;
            this.extAttr = builder.extAttr;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.gmtModifiedStr = builder.gmtModifiedStr;
            this.modifierId = builder.modifierId;
            this.modifierName = builder.modifierName;
            this.numType = builder.numType;
            this.outboundNum = builder.outboundNum;
            this.outboundStrategyId = builder.outboundStrategyId;
            this.outboundStrategyName = builder.outboundStrategyName;
            this.process = builder.process;
            this.resourceAllocation = builder.resourceAllocation;
            this.robotId = builder.robotId;
            this.robotName = builder.robotName;
            this.robotType = builder.robotType;
            this.ruleCode = builder.ruleCode;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
            this.successRate = builder.successRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutboundStrategies create() {
            return builder().build();
        }

        /**
         * @return buId
         */
        public Long getBuId() {
            return this.buId;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return departmentId
         */
        public Long getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return extAttr
         */
        public String getExtAttr() {
            return this.extAttr;
        }

        /**
         * @return gmtCreateStr
         */
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        /**
         * @return gmtModifiedStr
         */
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        /**
         * @return modifierId
         */
        public Long getModifierId() {
            return this.modifierId;
        }

        /**
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
        }

        /**
         * @return numType
         */
        public Integer getNumType() {
            return this.numType;
        }

        /**
         * @return outboundNum
         */
        public String getOutboundNum() {
            return this.outboundNum;
        }

        /**
         * @return outboundStrategyId
         */
        public Long getOutboundStrategyId() {
            return this.outboundStrategyId;
        }

        /**
         * @return outboundStrategyName
         */
        public String getOutboundStrategyName() {
            return this.outboundStrategyName;
        }

        /**
         * @return process
         */
        public Integer getProcess() {
            return this.process;
        }

        /**
         * @return resourceAllocation
         */
        public Integer getResourceAllocation() {
            return this.resourceAllocation;
        }

        /**
         * @return robotId
         */
        public String getRobotId() {
            return this.robotId;
        }

        /**
         * @return robotName
         */
        public String getRobotName() {
            return this.robotName;
        }

        /**
         * @return robotType
         */
        public Integer getRobotType() {
            return this.robotType;
        }

        /**
         * @return ruleCode
         */
        public Long getRuleCode() {
            return this.ruleCode;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return successRate
         */
        public Integer getSuccessRate() {
            return this.successRate;
        }

        public static final class Builder {
            private Long buId; 
            private Long creatorId; 
            private String creatorName; 
            private Long departmentId; 
            private String extAttr; 
            private String gmtCreateStr; 
            private String gmtModifiedStr; 
            private Long modifierId; 
            private String modifierName; 
            private Integer numType; 
            private String outboundNum; 
            private Long outboundStrategyId; 
            private String outboundStrategyName; 
            private Integer process; 
            private Integer resourceAllocation; 
            private String robotId; 
            private String robotName; 
            private Integer robotType; 
            private Long ruleCode; 
            private String sceneName; 
            private Integer status; 
            private Integer successRate; 

            /**
             * BuId.
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * DepartmentId.
             */
            public Builder departmentId(Long departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * ExtAttr.
             */
            public Builder extAttr(String extAttr) {
                this.extAttr = extAttr;
                return this;
            }

            /**
             * GmtCreateStr.
             */
            public Builder gmtCreateStr(String gmtCreateStr) {
                this.gmtCreateStr = gmtCreateStr;
                return this;
            }

            /**
             * GmtModifiedStr.
             */
            public Builder gmtModifiedStr(String gmtModifiedStr) {
                this.gmtModifiedStr = gmtModifiedStr;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(Long modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * ModifierName.
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * NumType.
             */
            public Builder numType(Integer numType) {
                this.numType = numType;
                return this;
            }

            /**
             * OutboundNum.
             */
            public Builder outboundNum(String outboundNum) {
                this.outboundNum = outboundNum;
                return this;
            }

            /**
             * OutboundStrategyId.
             */
            public Builder outboundStrategyId(Long outboundStrategyId) {
                this.outboundStrategyId = outboundStrategyId;
                return this;
            }

            /**
             * OutboundStrategyName.
             */
            public Builder outboundStrategyName(String outboundStrategyName) {
                this.outboundStrategyName = outboundStrategyName;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(Integer process) {
                this.process = process;
                return this;
            }

            /**
             * ResourceAllocation.
             */
            public Builder resourceAllocation(Integer resourceAllocation) {
                this.resourceAllocation = resourceAllocation;
                return this;
            }

            /**
             * RobotId.
             */
            public Builder robotId(String robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * RobotName.
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * RobotType.
             */
            public Builder robotType(Integer robotType) {
                this.robotType = robotType;
                return this;
            }

            /**
             * RuleCode.
             */
            public Builder ruleCode(Long ruleCode) {
                this.ruleCode = ruleCode;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SuccessRate.
             */
            public Builder successRate(Integer successRate) {
                this.successRate = successRate;
                return this;
            }

            public OutboundStrategies build() {
                return new OutboundStrategies(this);
            } 

        } 

    }
}
