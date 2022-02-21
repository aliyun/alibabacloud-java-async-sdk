// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePictureFileRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePictureFileRequest</p>
 */
public class QueryDevicePictureFileRequest extends Request {
    @Query
    @NameInMap("CaptureId")
    @Validation(required = true)
    private String captureId;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("ExpireTime")
    private Integer expireTime;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PictureType")
    private Integer pictureType;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("ThumbWidth")
    private Integer thumbWidth;

    private QueryDevicePictureFileRequest(Builder builder) {
        super(builder);
        this.captureId = builder.captureId;
        this.deviceName = builder.deviceName;
        this.expireTime = builder.expireTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pictureType = builder.pictureType;
        this.productKey = builder.productKey;
        this.thumbWidth = builder.thumbWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePictureFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captureId
     */
    public String getCaptureId() {
        return this.captureId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
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
     * @return pictureType
     */
    public Integer getPictureType() {
        return this.pictureType;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return thumbWidth
     */
    public Integer getThumbWidth() {
        return this.thumbWidth;
    }

    public static final class Builder extends Request.Builder<QueryDevicePictureFileRequest, Builder> {
        private String captureId; 
        private String deviceName; 
        private Integer expireTime; 
        private String iotId; 
        private String iotInstanceId; 
        private Integer pictureType; 
        private String productKey; 
        private Integer thumbWidth; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePictureFileRequest response) {
            super(response);
            this.captureId = response.captureId;
            this.deviceName = response.deviceName;
            this.expireTime = response.expireTime;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.pictureType = response.pictureType;
            this.productKey = response.productKey;
            this.thumbWidth = response.thumbWidth;
        } 

        /**
         * CaptureId.
         */
        public Builder captureId(String captureId) {
            this.putQueryParameter("CaptureId", captureId);
            this.captureId = captureId;
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
         * ExpireTime.
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
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
         * PictureType.
         */
        public Builder pictureType(Integer pictureType) {
            this.putQueryParameter("PictureType", pictureType);
            this.pictureType = pictureType;
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
         * ThumbWidth.
         */
        public Builder thumbWidth(Integer thumbWidth) {
            this.putQueryParameter("ThumbWidth", thumbWidth);
            this.thumbWidth = thumbWidth;
            return this;
        }

        @Override
        public QueryDevicePictureFileRequest build() {
            return new QueryDevicePictureFileRequest(this);
        } 

    } 

}
