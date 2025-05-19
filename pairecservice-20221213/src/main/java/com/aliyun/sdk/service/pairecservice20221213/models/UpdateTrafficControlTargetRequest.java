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
 * {@link UpdateTrafficControlTargetRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficControlTargetRequest</p>
 */
public class UpdateTrafficControlTargetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    private String trafficControlTargetId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
    private String itemConditionArray;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionExpress")
    private String itemConditionExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionType")
    private String itemConditionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewProductRegulation")
    private Boolean newProductRegulation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecallName")
    private String recallName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisPeriod")
    private String statisPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToleranceValue")
    private Long toleranceValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    private Float value;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("new-param-3")
    private String newParam3;

    private UpdateTrafficControlTargetRequest(Builder builder) {
        super(builder);
        this.trafficControlTargetId = builder.trafficControlTargetId;
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.event = builder.event;
        this.itemConditionArray = builder.itemConditionArray;
        this.itemConditionExpress = builder.itemConditionExpress;
        this.itemConditionType = builder.itemConditionType;
        this.name = builder.name;
        this.newProductRegulation = builder.newProductRegulation;
        this.recallName = builder.recallName;
        this.startTime = builder.startTime;
        this.statisPeriod = builder.statisPeriod;
        this.status = builder.status;
        this.toleranceValue = builder.toleranceValue;
        this.value = builder.value;
        this.newParam3 = builder.newParam3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficControlTargetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trafficControlTargetId
     */
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    /**
     * @return newParam3
     */
    public String getNewParam3() {
        return this.newParam3;
    }

    public static final class Builder extends Request.Builder<UpdateTrafficControlTargetRequest, Builder> {
        private String trafficControlTargetId; 
        private String regionId; 
        private String endTime; 
        private String event; 
        private String itemConditionArray; 
        private String itemConditionExpress; 
        private String itemConditionType; 
        private String name; 
        private Boolean newProductRegulation; 
        private String recallName; 
        private String startTime; 
        private String statisPeriod; 
        private String status; 
        private Long toleranceValue; 
        private Float value; 
        private String newParam3; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficControlTargetRequest request) {
            super(request);
            this.trafficControlTargetId = request.trafficControlTargetId;
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.event = request.event;
            this.itemConditionArray = request.itemConditionArray;
            this.itemConditionExpress = request.itemConditionExpress;
            this.itemConditionType = request.itemConditionType;
            this.name = request.name;
            this.newProductRegulation = request.newProductRegulation;
            this.recallName = request.recallName;
            this.startTime = request.startTime;
            this.statisPeriod = request.statisPeriod;
            this.status = request.status;
            this.toleranceValue = request.toleranceValue;
            this.value = request.value;
            this.newParam3 = request.newParam3;
        } 

        /**
         * TrafficControlTargetId.
         */
        public Builder trafficControlTargetId(String trafficControlTargetId) {
            this.putPathParameter("TrafficControlTargetId", trafficControlTargetId);
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Event.
         */
        public Builder event(String event) {
            this.putBodyParameter("Event", event);
            this.event = event;
            return this;
        }

        /**
         * ItemConditionArray.
         */
        public Builder itemConditionArray(String itemConditionArray) {
            this.putBodyParameter("ItemConditionArray", itemConditionArray);
            this.itemConditionArray = itemConditionArray;
            return this;
        }

        /**
         * ItemConditionExpress.
         */
        public Builder itemConditionExpress(String itemConditionExpress) {
            this.putBodyParameter("ItemConditionExpress", itemConditionExpress);
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }

        /**
         * ItemConditionType.
         */
        public Builder itemConditionType(String itemConditionType) {
            this.putBodyParameter("ItemConditionType", itemConditionType);
            this.itemConditionType = itemConditionType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NewProductRegulation.
         */
        public Builder newProductRegulation(Boolean newProductRegulation) {
            this.putBodyParameter("NewProductRegulation", newProductRegulation);
            this.newProductRegulation = newProductRegulation;
            return this;
        }

        /**
         * RecallName.
         */
        public Builder recallName(String recallName) {
            this.putBodyParameter("RecallName", recallName);
            this.recallName = recallName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StatisPeriod.
         */
        public Builder statisPeriod(String statisPeriod) {
            this.putBodyParameter("StatisPeriod", statisPeriod);
            this.statisPeriod = statisPeriod;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * ToleranceValue.
         */
        public Builder toleranceValue(Long toleranceValue) {
            this.putBodyParameter("ToleranceValue", toleranceValue);
            this.toleranceValue = toleranceValue;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Float value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        /**
         * new-param-3.
         */
        public Builder newParam3(String newParam3) {
            this.putQueryParameter("new-param-3", newParam3);
            this.newParam3 = newParam3;
            return this;
        }

        @Override
        public UpdateTrafficControlTargetRequest build() {
            return new UpdateTrafficControlTargetRequest(this);
        } 

    } 

}
