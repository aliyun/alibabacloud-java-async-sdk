// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GisSearchDeviceTraceRequest} extends {@link RequestModel}
 *
 * <p>GisSearchDeviceTraceRequest</p>
 */
public class GisSearchDeviceTraceRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private String deviceName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("MapMatch")
    @Validation(required = true)
    private Integer mapMatch;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private GisSearchDeviceTraceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.endTime = builder.endTime;
        this.iotInstanceId = builder.iotInstanceId;
        this.mapMatch = builder.mapMatch;
        this.productKey = builder.productKey;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GisSearchDeviceTraceRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return mapMatch
     */
    public Integer getMapMatch() {
        return this.mapMatch;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GisSearchDeviceTraceRequest, Builder> {
        private String deviceName; 
        private Long endTime; 
        private String iotInstanceId; 
        private Integer mapMatch; 
        private String productKey; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GisSearchDeviceTraceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.endTime = request.endTime;
            this.iotInstanceId = request.iotInstanceId;
            this.mapMatch = request.mapMatch;
            this.productKey = request.productKey;
            this.startTime = request.startTime;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * MapMatch.
         */
        public Builder mapMatch(Integer mapMatch) {
            this.putQueryParameter("MapMatch", mapMatch);
            this.mapMatch = mapMatch;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GisSearchDeviceTraceRequest build() {
            return new GisSearchDeviceTraceRequest(this);
        } 

    } 

}
