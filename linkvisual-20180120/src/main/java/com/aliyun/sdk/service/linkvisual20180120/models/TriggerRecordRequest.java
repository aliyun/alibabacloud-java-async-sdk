// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerRecordRequest} extends {@link RequestModel}
 *
 * <p>TriggerRecordRequest</p>
 */
public class TriggerRecordRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PreRecordDuration")
    private Integer preRecordDuration;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("RecordDuration")
    @Validation(required = true)
    private Integer recordDuration;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    private TriggerRecordRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.preRecordDuration = builder.preRecordDuration;
        this.productKey = builder.productKey;
        this.recordDuration = builder.recordDuration;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerRecordRequest create() {
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
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
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
     * @return recordDuration
     */
    public Integer getRecordDuration() {
        return this.recordDuration;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<TriggerRecordRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private Integer preRecordDuration; 
        private String productKey; 
        private Integer recordDuration; 
        private Integer streamType; 

        private Builder() {
            super();
        } 

        private Builder(TriggerRecordRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.preRecordDuration = response.preRecordDuration;
            this.productKey = response.productKey;
            this.recordDuration = response.recordDuration;
            this.streamType = response.streamType;
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
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * RecordDuration.
         */
        public Builder recordDuration(Integer recordDuration) {
            this.putQueryParameter("RecordDuration", recordDuration);
            this.recordDuration = recordDuration;
            return this;
        }

        /**
         * StreamType.
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        @Override
        public TriggerRecordRequest build() {
            return new TriggerRecordRequest(this);
        } 

    } 

}
