// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindStorageOrderRequest} extends {@link RequestModel}
 *
 * <p>BindStorageOrderRequest</p>
 */
public class BindStorageOrderRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("EnableDefaultPlan")
    private Boolean enableDefaultPlan;

    @Query
    @NameInMap("EventRecordDuration")
    @Validation(maximum = 30)
    private Integer eventRecordDuration;

    @Query
    @NameInMap("EventRecordProlong")
    private Boolean eventRecordProlong;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("MaxRecordFileDuration")
    @Validation(maximum = 3600, minimum = 600)
    private Integer maxRecordFileDuration;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("PreRecordDuration")
    @Validation(maximum = 5)
    private Integer preRecordDuration;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private BindStorageOrderRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.enableDefaultPlan = builder.enableDefaultPlan;
        this.eventRecordDuration = builder.eventRecordDuration;
        this.eventRecordProlong = builder.eventRecordProlong;
        this.iotId = builder.iotId;
        this.maxRecordFileDuration = builder.maxRecordFileDuration;
        this.orderId = builder.orderId;
        this.preRecordDuration = builder.preRecordDuration;
        this.productKey = builder.productKey;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindStorageOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return enableDefaultPlan
     */
    public Boolean getEnableDefaultPlan() {
        return this.enableDefaultPlan;
    }

    /**
     * @return eventRecordDuration
     */
    public Integer getEventRecordDuration() {
        return this.eventRecordDuration;
    }

    /**
     * @return eventRecordProlong
     */
    public Boolean getEventRecordProlong() {
        return this.eventRecordProlong;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return maxRecordFileDuration
     */
    public Integer getMaxRecordFileDuration() {
        return this.maxRecordFileDuration;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return preRecordDuration
     */
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<BindStorageOrderRequest, Builder> {
        private String deviceName; 
        private Boolean enableDefaultPlan; 
        private Integer eventRecordDuration; 
        private Boolean eventRecordProlong; 
        private String iotId; 
        private Integer maxRecordFileDuration; 
        private String orderId; 
        private Integer preRecordDuration; 
        private String productKey; 
        private String userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(BindStorageOrderRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.enableDefaultPlan = request.enableDefaultPlan;
            this.eventRecordDuration = request.eventRecordDuration;
            this.eventRecordProlong = request.eventRecordProlong;
            this.iotId = request.iotId;
            this.maxRecordFileDuration = request.maxRecordFileDuration;
            this.orderId = request.orderId;
            this.preRecordDuration = request.preRecordDuration;
            this.productKey = request.productKey;
            this.userId = request.userId;
            this.userName = request.userName;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * EnableDefaultPlan.
         */
        public Builder enableDefaultPlan(Boolean enableDefaultPlan) {
            this.putQueryParameter("EnableDefaultPlan", enableDefaultPlan);
            this.enableDefaultPlan = enableDefaultPlan;
            return this;
        }

        /**
         * EventRecordDuration.
         */
        public Builder eventRecordDuration(Integer eventRecordDuration) {
            this.putQueryParameter("EventRecordDuration", eventRecordDuration);
            this.eventRecordDuration = eventRecordDuration;
            return this;
        }

        /**
         * EventRecordProlong.
         */
        public Builder eventRecordProlong(Boolean eventRecordProlong) {
            this.putQueryParameter("EventRecordProlong", eventRecordProlong);
            this.eventRecordProlong = eventRecordProlong;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * MaxRecordFileDuration.
         */
        public Builder maxRecordFileDuration(Integer maxRecordFileDuration) {
            this.putQueryParameter("MaxRecordFileDuration", maxRecordFileDuration);
            this.maxRecordFileDuration = maxRecordFileDuration;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * PreRecordDuration.
         */
        public Builder preRecordDuration(Integer preRecordDuration) {
            this.putQueryParameter("PreRecordDuration", preRecordDuration);
            this.preRecordDuration = preRecordDuration;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public BindStorageOrderRequest build() {
            return new BindStorageOrderRequest(this);
        } 

    } 

}
