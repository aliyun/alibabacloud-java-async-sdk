// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderStep} extends {@link TeaModel}
 *
 * <p>OrderStep</p>
 */
public class OrderStep extends TeaModel {
    @NameInMap("DisplayMethod")
    private String displayMethod;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("JobKwargs")
    private String jobKwargs;

    @NameInMap("JobMessage")
    private String jobMessage;

    @NameInMap("JobReturnStatus")
    private String jobReturnStatus;

    @NameInMap("JobReturnValues")
    private String jobReturnValues;

    @NameInMap("JobSystem")
    private String jobSystem;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("OrderStepId")
    private String orderStepId;

    @NameInMap("RealNextStep")
    private String realNextStep;

    @NameInMap("Restriction")
    private java.util.List < Restriction> restriction;

    @NameInMap("StepName")
    private String stepName;

    @NameInMap("StepStatus")
    private String stepStatus;

    @NameInMap("StepTitle")
    private String stepTitle;

    @NameInMap("StepType")
    private String stepType;

    private OrderStep(Builder builder) {
        this.displayMethod = builder.displayMethod;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModify = builder.gmtModify;
        this.jobKwargs = builder.jobKwargs;
        this.jobMessage = builder.jobMessage;
        this.jobReturnStatus = builder.jobReturnStatus;
        this.jobReturnValues = builder.jobReturnValues;
        this.jobSystem = builder.jobSystem;
        this.orderId = builder.orderId;
        this.orderStepId = builder.orderStepId;
        this.realNextStep = builder.realNextStep;
        this.restriction = builder.restriction;
        this.stepName = builder.stepName;
        this.stepStatus = builder.stepStatus;
        this.stepTitle = builder.stepTitle;
        this.stepType = builder.stepType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderStep create() {
        return builder().build();
    }

    /**
     * @return displayMethod
     */
    public String getDisplayMethod() {
        return this.displayMethod;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModify
     */
    public String getGmtModify() {
        return this.gmtModify;
    }

    /**
     * @return jobKwargs
     */
    public String getJobKwargs() {
        return this.jobKwargs;
    }

    /**
     * @return jobMessage
     */
    public String getJobMessage() {
        return this.jobMessage;
    }

    /**
     * @return jobReturnStatus
     */
    public String getJobReturnStatus() {
        return this.jobReturnStatus;
    }

    /**
     * @return jobReturnValues
     */
    public String getJobReturnValues() {
        return this.jobReturnValues;
    }

    /**
     * @return jobSystem
     */
    public String getJobSystem() {
        return this.jobSystem;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderStepId
     */
    public String getOrderStepId() {
        return this.orderStepId;
    }

    /**
     * @return realNextStep
     */
    public String getRealNextStep() {
        return this.realNextStep;
    }

    /**
     * @return restriction
     */
    public java.util.List < Restriction> getRestriction() {
        return this.restriction;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return stepStatus
     */
    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * @return stepTitle
     */
    public String getStepTitle() {
        return this.stepTitle;
    }

    /**
     * @return stepType
     */
    public String getStepType() {
        return this.stepType;
    }

    public static final class Builder {
        private String displayMethod; 
        private String gmtCreate; 
        private String gmtModify; 
        private String jobKwargs; 
        private String jobMessage; 
        private String jobReturnStatus; 
        private String jobReturnValues; 
        private String jobSystem; 
        private String orderId; 
        private String orderStepId; 
        private String realNextStep; 
        private java.util.List < Restriction> restriction; 
        private String stepName; 
        private String stepStatus; 
        private String stepTitle; 
        private String stepType; 

        /**
         * DisplayMethod.
         */
        public Builder displayMethod(String displayMethod) {
            this.displayMethod = displayMethod;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModify.
         */
        public Builder gmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }

        /**
         * JobKwargs.
         */
        public Builder jobKwargs(String jobKwargs) {
            this.jobKwargs = jobKwargs;
            return this;
        }

        /**
         * JobMessage.
         */
        public Builder jobMessage(String jobMessage) {
            this.jobMessage = jobMessage;
            return this;
        }

        /**
         * JobReturnStatus.
         */
        public Builder jobReturnStatus(String jobReturnStatus) {
            this.jobReturnStatus = jobReturnStatus;
            return this;
        }

        /**
         * JobReturnValues.
         */
        public Builder jobReturnValues(String jobReturnValues) {
            this.jobReturnValues = jobReturnValues;
            return this;
        }

        /**
         * JobSystem.
         */
        public Builder jobSystem(String jobSystem) {
            this.jobSystem = jobSystem;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * OrderStepId.
         */
        public Builder orderStepId(String orderStepId) {
            this.orderStepId = orderStepId;
            return this;
        }

        /**
         * RealNextStep.
         */
        public Builder realNextStep(String realNextStep) {
            this.realNextStep = realNextStep;
            return this;
        }

        /**
         * Restriction.
         */
        public Builder restriction(java.util.List < Restriction> restriction) {
            this.restriction = restriction;
            return this;
        }

        /**
         * StepName.
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /**
         * StepStatus.
         */
        public Builder stepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }

        /**
         * StepTitle.
         */
        public Builder stepTitle(String stepTitle) {
            this.stepTitle = stepTitle;
            return this;
        }

        /**
         * StepType.
         */
        public Builder stepType(String stepType) {
            this.stepType = stepType;
            return this;
        }

        public OrderStep build() {
            return new OrderStep(this);
        } 

    } 

    public static class Restriction extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Value")
        private String value;

        private Restriction(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Restriction create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Restriction build() {
                return new Restriction(this);
            } 

        } 

    }
}
