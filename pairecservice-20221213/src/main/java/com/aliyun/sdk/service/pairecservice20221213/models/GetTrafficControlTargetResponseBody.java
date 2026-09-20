// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

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
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficControlTargetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
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
        private String trafficControlTaskId; 
        private Float value; 

        private Builder() {
        } 

        private Builder(GetTrafficControlTargetResponseBody model) {
            this.endTime = model.endTime;
            this.event = model.event;
            this.gmtCreateTime = model.gmtCreateTime;
            this.itemConditionArray = model.itemConditionArray;
            this.itemConditionExpress = model.itemConditionExpress;
            this.itemConditionType = model.itemConditionType;
            this.name = model.name;
            this.newProductRegulation = model.newProductRegulation;
            this.recallName = model.recallName;
            this.requestId = model.requestId;
            this.splitParts = model.splitParts;
            this.startTime = model.startTime;
            this.statisPeriod = model.statisPeriod;
            this.status = model.status;
            this.toleranceValue = model.toleranceValue;
            this.trafficControlTargetId = model.trafficControlTargetId;
            this.trafficControlTaskId = model.trafficControlTaskId;
            this.value = model.value;
        } 

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-25</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event of the control target.</p>
         * 
         * <strong>example:</strong>
         * <p>click</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The time when the traffic control target was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-03T02:28:00.000Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The item condition, specified in an array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
         */
        public Builder itemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }

        /**
         * <p>The item condition, specified in an expression format.</p>
         * 
         * <strong>example:</strong>
         * <p>status=1</p>
         */
        public Builder itemConditionExpress(String itemConditionExpress) {
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }

        /**
         * <p>The item condition type.</p>
         * 
         * <strong>example:</strong>
         * <p>Array</p>
         */
        public Builder itemConditionType(String itemConditionType) {
            this.itemConditionType = itemConditionType;
            return this;
        }

        /**
         * <p>The name of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>target-1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether new product regulation is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder newProductRegulation(Boolean newProductRegulation) {
            this.newProductRegulation = newProductRegulation;
            return this;
        }

        /**
         * <p>The name of the recall strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>recall-1</p>
         */
        public Builder recallName(String recallName) {
            this.recallName = recallName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The piecewise control settings.</p>
         */
        public Builder splitParts(SplitParts splitParts) {
            this.splitParts = splitParts;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The statistics period.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder statisPeriod(String statisPeriod) {
            this.statisPeriod = statisPeriod;
            return this;
        }

        /**
         * <p>The status of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举值：开启：Opened关闭：Closed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The tolerance value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder toleranceValue(Long toleranceValue) {
            this.toleranceValue = toleranceValue;
            return this;
        }

        /**
         * <p>The ID of the traffic control target.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder trafficControlTargetId(String trafficControlTargetId) {
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }

        /**
         * <p>The ID of the traffic control task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }

        /**
         * <p>The value of the control target.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder value(Float value) {
            this.value = value;
            return this;
        }

        public GetTrafficControlTargetResponseBody build() {
            return new GetTrafficControlTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTrafficControlTargetResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrafficControlTargetResponseBody</p>
     */
    public static class SplitParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SetPoints")
        private java.util.List<Long> setPoints;

        @com.aliyun.core.annotation.NameInMap("SetValues")
        private java.util.List<Long> setValues;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private java.util.List<Long> timePoints;

        private SplitParts(Builder builder) {
            this.setPoints = builder.setPoints;
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
         * @return setPoints
         */
        public java.util.List<Long> getSetPoints() {
            return this.setPoints;
        }

        /**
         * @return setValues
         */
        public java.util.List<Long> getSetValues() {
            return this.setValues;
        }

        /**
         * @return timePoints
         */
        public java.util.List<Long> getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private java.util.List<Long> setPoints; 
            private java.util.List<Long> setValues; 
            private java.util.List<Long> timePoints; 

            private Builder() {
            } 

            private Builder(SplitParts model) {
                this.setPoints = model.setPoints;
                this.setValues = model.setValues;
                this.timePoints = model.timePoints;
            } 

            /**
             * <p>The set points.</p>
             */
            public Builder setPoints(java.util.List<Long> setPoints) {
                this.setPoints = setPoints;
                return this;
            }

            /**
             * <p>The set values.</p>
             */
            public Builder setValues(java.util.List<Long> setValues) {
                this.setValues = setValues;
                return this;
            }

            /**
             * <p>The time points.</p>
             */
            public Builder timePoints(java.util.List<Long> timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public SplitParts build() {
                return new SplitParts(this);
            } 

        } 

    }
}
