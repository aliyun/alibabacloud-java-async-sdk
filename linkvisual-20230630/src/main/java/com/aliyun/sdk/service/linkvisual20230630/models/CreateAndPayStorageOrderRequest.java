// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndPayStorageOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateAndPayStorageOrderRequest</p>
 */
public class CreateAndPayStorageOrderRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("Copies")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer copies;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("DeviceNoOwner")
    private Boolean deviceNoOwner;

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
    @NameInMap("ImmediateUse")
    private Boolean immediateUse;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("MaxRecordFileDuration")
    @Validation(maximum = 3600, minimum = 600)
    private Integer maxRecordFileDuration;

    @Query
    @NameInMap("PreRecordDuration")
    @Validation(maximum = 5)
    private Integer preRecordDuration;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("Specification")
    @Validation(required = true)
    private String specification;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private CreateAndPayStorageOrderRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.copies = builder.copies;
        this.deviceName = builder.deviceName;
        this.deviceNoOwner = builder.deviceNoOwner;
        this.enableDefaultPlan = builder.enableDefaultPlan;
        this.eventRecordDuration = builder.eventRecordDuration;
        this.eventRecordProlong = builder.eventRecordProlong;
        this.immediateUse = builder.immediateUse;
        this.iotId = builder.iotId;
        this.maxRecordFileDuration = builder.maxRecordFileDuration;
        this.preRecordDuration = builder.preRecordDuration;
        this.productKey = builder.productKey;
        this.specification = builder.specification;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndPayStorageOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return copies
     */
    public Integer getCopies() {
        return this.copies;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceNoOwner
     */
    public Boolean getDeviceNoOwner() {
        return this.deviceNoOwner;
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
     * @return immediateUse
     */
    public Boolean getImmediateUse() {
        return this.immediateUse;
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
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
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

    public static final class Builder extends Request.Builder<CreateAndPayStorageOrderRequest, Builder> {
        private String commodityCode; 
        private Integer copies; 
        private String deviceName; 
        private Boolean deviceNoOwner; 
        private Boolean enableDefaultPlan; 
        private Integer eventRecordDuration; 
        private Boolean eventRecordProlong; 
        private Boolean immediateUse; 
        private String iotId; 
        private Integer maxRecordFileDuration; 
        private Integer preRecordDuration; 
        private String productKey; 
        private String specification; 
        private String userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndPayStorageOrderRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.copies = request.copies;
            this.deviceName = request.deviceName;
            this.deviceNoOwner = request.deviceNoOwner;
            this.enableDefaultPlan = request.enableDefaultPlan;
            this.eventRecordDuration = request.eventRecordDuration;
            this.eventRecordProlong = request.eventRecordProlong;
            this.immediateUse = request.immediateUse;
            this.iotId = request.iotId;
            this.maxRecordFileDuration = request.maxRecordFileDuration;
            this.preRecordDuration = request.preRecordDuration;
            this.productKey = request.productKey;
            this.specification = request.specification;
            this.userId = request.userId;
            this.userName = request.userName;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * Copies.
         */
        public Builder copies(Integer copies) {
            this.putQueryParameter("Copies", copies);
            this.copies = copies;
            return this;
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
         * DeviceNoOwner.
         */
        public Builder deviceNoOwner(Boolean deviceNoOwner) {
            this.putQueryParameter("DeviceNoOwner", deviceNoOwner);
            this.deviceNoOwner = deviceNoOwner;
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
         * ImmediateUse.
         */
        public Builder immediateUse(Boolean immediateUse) {
            this.putQueryParameter("ImmediateUse", immediateUse);
            this.immediateUse = immediateUse;
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
         * Specification.
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
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
        public CreateAndPayStorageOrderRequest build() {
            return new CreateAndPayStorageOrderRequest(this);
        } 

    } 

}
