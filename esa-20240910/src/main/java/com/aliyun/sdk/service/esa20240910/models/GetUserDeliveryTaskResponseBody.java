// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserDeliveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserDeliveryTaskResponseBody</p>
 */
public class GetUserDeliveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.NameInMap("DiscardRate")
    private Float discardRate;

    @com.aliyun.core.annotation.NameInMap("FieldList")
    private String fieldList;

    @com.aliyun.core.annotation.NameInMap("FilterRules")
    private String filterRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SinkConfig")
    private Object sinkConfig;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private GetUserDeliveryTaskResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.dataCenter = builder.dataCenter;
        this.deliveryType = builder.deliveryType;
        this.discardRate = builder.discardRate;
        this.fieldList = builder.fieldList;
        this.filterRules = builder.filterRules;
        this.requestId = builder.requestId;
        this.sinkConfig = builder.sinkConfig;
        this.status = builder.status;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDeliveryTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return discardRate
     */
    public Float getDiscardRate() {
        return this.discardRate;
    }

    /**
     * @return fieldList
     */
    public String getFieldList() {
        return this.fieldList;
    }

    /**
     * @return filterRules
     */
    public String getFilterRules() {
        return this.filterRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sinkConfig
     */
    public Object getSinkConfig() {
        return this.sinkConfig;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String businessType; 
        private String dataCenter; 
        private String deliveryType; 
        private Float discardRate; 
        private String fieldList; 
        private String filterRules; 
        private String requestId; 
        private Object sinkConfig; 
        private String status; 
        private String taskName; 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * DataCenter.
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * DeliveryType.
         */
        public Builder deliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * DiscardRate.
         */
        public Builder discardRate(Float discardRate) {
            this.discardRate = discardRate;
            return this;
        }

        /**
         * FieldList.
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * FilterRules.
         */
        public Builder filterRules(String filterRules) {
            this.filterRules = filterRules;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7072132a-bd3c-46a6-9e81-aba3e0e3f861</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SinkConfig.
         */
        public Builder sinkConfig(Object sinkConfig) {
            this.sinkConfig = sinkConfig;
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
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public GetUserDeliveryTaskResponseBody build() {
            return new GetUserDeliveryTaskResponseBody(this);
        } 

    } 

}
