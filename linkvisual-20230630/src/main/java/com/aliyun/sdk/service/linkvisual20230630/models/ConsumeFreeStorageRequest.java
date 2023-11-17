// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConsumeFreeStorageRequest} extends {@link RequestModel}
 *
 * <p>ConsumeFreeStorageRequest</p>
 */
public class ConsumeFreeStorageRequest extends Request {
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
    @NameInMap("ImmediateUse")
    private Boolean immediateUse;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("PreRecordDuration")
    @Validation(maximum = 5)
    private Integer preRecordDuration;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("Quota")
    @Validation(maximum = 100, minimum = 1)
    private Integer quota;

    private ConsumeFreeStorageRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.enableDefaultPlan = builder.enableDefaultPlan;
        this.eventRecordDuration = builder.eventRecordDuration;
        this.eventRecordProlong = builder.eventRecordProlong;
        this.immediateUse = builder.immediateUse;
        this.iotId = builder.iotId;
        this.preRecordDuration = builder.preRecordDuration;
        this.productKey = builder.productKey;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumeFreeStorageRequest create() {
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
     * @return quota
     */
    public Integer getQuota() {
        return this.quota;
    }

    public static final class Builder extends Request.Builder<ConsumeFreeStorageRequest, Builder> {
        private String deviceName; 
        private Boolean enableDefaultPlan; 
        private Integer eventRecordDuration; 
        private Boolean eventRecordProlong; 
        private Boolean immediateUse; 
        private String iotId; 
        private Integer preRecordDuration; 
        private String productKey; 
        private Integer quota; 

        private Builder() {
            super();
        } 

        private Builder(ConsumeFreeStorageRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.enableDefaultPlan = request.enableDefaultPlan;
            this.eventRecordDuration = request.eventRecordDuration;
            this.eventRecordProlong = request.eventRecordProlong;
            this.immediateUse = request.immediateUse;
            this.iotId = request.iotId;
            this.preRecordDuration = request.preRecordDuration;
            this.productKey = request.productKey;
            this.quota = request.quota;
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
         * Quota.
         */
        public Builder quota(Integer quota) {
            this.putQueryParameter("Quota", quota);
            this.quota = quota;
            return this;
        }

        @Override
        public ConsumeFreeStorageRequest build() {
            return new ConsumeFreeStorageRequest(this);
        } 

    } 

}
