// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePictureByListRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePictureByListRequest</p>
 */
public class QueryDevicePictureByListRequest extends Request {
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
    @NameInMap("PictureIdList")
    @Validation(required = true)
    private java.util.List < String > pictureIdList;

    @Query
    @NameInMap("PictureType")
    private Integer pictureType;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("ThumbWidth")
    private Integer thumbWidth;

    private QueryDevicePictureByListRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.expireTime = builder.expireTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pictureIdList = builder.pictureIdList;
        this.pictureType = builder.pictureType;
        this.productKey = builder.productKey;
        this.thumbWidth = builder.thumbWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePictureByListRequest create() {
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
     * @return pictureIdList
     */
    public java.util.List < String > getPictureIdList() {
        return this.pictureIdList;
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

    public static final class Builder extends Request.Builder<QueryDevicePictureByListRequest, Builder> {
        private String deviceName; 
        private Integer expireTime; 
        private String iotId; 
        private String iotInstanceId; 
        private java.util.List < String > pictureIdList; 
        private Integer pictureType; 
        private String productKey; 
        private Integer thumbWidth; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePictureByListRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.expireTime = request.expireTime;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.pictureIdList = request.pictureIdList;
            this.pictureType = request.pictureType;
            this.productKey = request.productKey;
            this.thumbWidth = request.thumbWidth;
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
         * PictureIdList.
         */
        public Builder pictureIdList(java.util.List < String > pictureIdList) {
            this.putQueryParameter("PictureIdList", pictureIdList);
            this.pictureIdList = pictureIdList;
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
        public QueryDevicePictureByListRequest build() {
            return new QueryDevicePictureByListRequest(this);
        } 

    } 

}
