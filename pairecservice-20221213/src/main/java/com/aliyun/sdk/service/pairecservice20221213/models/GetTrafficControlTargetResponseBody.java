// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficControlTargetResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrafficControlTargetResponseBody</p>
 */
public class GetTrafficControlTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
    private String itemConditionArray;

    @com.aliyun.core.annotation.NameInMap("ItemConditionExpress")
    private String itemConditionExpress;

    @com.aliyun.core.annotation.NameInMap("ItemConditionType")
    private String itemConditionType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NewProductRegulation")
    private Boolean newProductRegulation;

    @com.aliyun.core.annotation.NameInMap("RecallName")
    private String recallName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SplitParts")
    private SplitParts splitParts;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StatisPeriod")
    private String statisPeriod;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("ToleranceValue")
    private Long toleranceValue;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    private String trafficControlTargetId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Float value;

    private GetTrafficControlTargetResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.event = builder.event;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.itemConditionArray = builder.itemConditionArray;
        this.itemConditionExpress = builder.itemConditionExpress;
        this.itemConditionType = builder.itemConditionType;
        this.name = builder.name;
        this.newProductRegulation = builder.newProductRegulation;
        this.recallName = builder.recallName;
        this.requestId = builder.requestId;
        this.splitParts = builder.splitParts;
        this.startTime = builder.startTime;
        this.statisPeriod = builder.statisPeriod;
        this.status = builder.status;
        this.toleranceValue = builder.toleranceValue;
        this.trafficControlTargetId = builder.trafficControlTargetId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficControlTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return itemConditionArray
     */
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    /**
     * @return itemConditionExpress
     */
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    /**
     * @return itemConditionType
     */
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return newProductRegulation
     */
    public Boolean getNewProductRegulation() {
        return this.newProductRegulation;
    }

    /**
     * @return recallName
     */
    public String getRecallName() {
        return this.recallName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return splitParts
     */
    public SplitParts getSplitParts() {
        return this.splitParts;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statisPeriod
     */
    public String getStatisPeriod() {
        return this.statisPeriod;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return toleranceValue
     */
    public Long getToleranceValue() {
        return this.toleranceValue;
    }

    /**
     * @return trafficControlTargetId
     */
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
    }

    /**
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    public static final class Builder {
        private String endTime; 
        private String event; 
        private String gmtCreateTime; 
        private String itemConditionArray; 
        private String itemConditionExpress; 
        private String itemConditionType; 
        private String name; 
        private Boolean newProductRegulation; 
        private String recallName; 
        private String requestId; 
        private SplitParts splitParts; 
        private String startTime; 
        private String statisPeriod; 
        private String status; 
        private Long toleranceValue; 
        private String trafficControlTargetId; 
        private Float value; 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Event.
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * ItemConditionArray.
         */
        public Builder itemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }

        /**
         * ItemConditionExpress.
         */
        public Builder itemConditionExpress(String itemConditionExpress) {
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }

        /**
         * ItemConditionType.
         */
        public Builder itemConditionType(String itemConditionType) {
            this.itemConditionType = itemConditionType;
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
         * NewProductRegulation.
         */
        public Builder newProductRegulation(Boolean newProductRegulation) {
            this.newProductRegulation = newProductRegulation;
            return this;
        }

        /**
         * RecallName.
         */
        public Builder recallName(String recallName) {
            this.recallName = recallName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SplitParts.
         */
        public Builder splitParts(SplitParts splitParts) {
            this.splitParts = splitParts;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * StatisPeriod.
         */
        public Builder statisPeriod(String statisPeriod) {
            this.statisPeriod = statisPeriod;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ToleranceValue.
         */
        public Builder toleranceValue(Long toleranceValue) {
            this.toleranceValue = toleranceValue;
            return this;
        }

        /**
         * TrafficControlTargetId.
         */
        public Builder trafficControlTargetId(String trafficControlTargetId) {
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Float value) {
            this.value = value;
            return this;
        }

        public GetTrafficControlTargetResponseBody build() {
            return new GetTrafficControlTargetResponseBody(this);
        } 

    } 

    public static class SplitParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SetValues")
        private java.util.List < Long > setValues;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private java.util.List < Long > timePoints;

        private SplitParts(Builder builder) {
            this.setValues = builder.setValues;
            this.timePoints = builder.timePoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SplitParts create() {
            return builder().build();
        }

        /**
         * @return setValues
         */
        public java.util.List < Long > getSetValues() {
            return this.setValues;
        }

        /**
         * @return timePoints
         */
        public java.util.List < Long > getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private java.util.List < Long > setValues; 
            private java.util.List < Long > timePoints; 

            /**
             * SetValues.
             */
            public Builder setValues(java.util.List < Long > setValues) {
                this.setValues = setValues;
                return this;
            }

            /**
             * TimePoints.
             */
            public Builder timePoints(java.util.List < Long > timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public SplitParts build() {
                return new SplitParts(this);
            } 

        } 

    }
}
