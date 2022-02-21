// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceVodUrlByTimeRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceVodUrlByTimeRequest</p>
 */
public class QueryDeviceVodUrlByTimeRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true, maximum = 2147483648D)
    private Integer beginTime;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("EncryptType")
    @Validation(maximum = 2147483648D)
    private Integer encryptType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 2147483648D)
    private Integer endTime;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PlayUnLimited")
    private Boolean playUnLimited;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("Scheme")
    private String scheme;

    @Query
    @NameInMap("SeekTime")
    @Validation(maximum = 2147483648D)
    private Integer seekTime;

    @Query
    @NameInMap("ShouldEncrypt")
    private Boolean shouldEncrypt;

    @Query
    @NameInMap("UrlValidDuration")
    private Integer urlValidDuration;

    private QueryDeviceVodUrlByTimeRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.deviceName = builder.deviceName;
        this.encryptType = builder.encryptType;
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.playUnLimited = builder.playUnLimited;
        this.productKey = builder.productKey;
        this.scheme = builder.scheme;
        this.seekTime = builder.seekTime;
        this.shouldEncrypt = builder.shouldEncrypt;
        this.urlValidDuration = builder.urlValidDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceVodUrlByTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Integer getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return encryptType
     */
    public Integer getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
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
     * @return playUnLimited
     */
    public Boolean getPlayUnLimited() {
        return this.playUnLimited;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return scheme
     */
    public String getScheme() {
        return this.scheme;
    }

    /**
     * @return seekTime
     */
    public Integer getSeekTime() {
        return this.seekTime;
    }

    /**
     * @return shouldEncrypt
     */
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    /**
     * @return urlValidDuration
     */
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

    public static final class Builder extends Request.Builder<QueryDeviceVodUrlByTimeRequest, Builder> {
        private Integer beginTime; 
        private String deviceName; 
        private Integer encryptType; 
        private Integer endTime; 
        private String iotId; 
        private String iotInstanceId; 
        private Boolean playUnLimited; 
        private String productKey; 
        private String scheme; 
        private Integer seekTime; 
        private Boolean shouldEncrypt; 
        private Integer urlValidDuration; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceVodUrlByTimeRequest response) {
            super(response);
            this.beginTime = response.beginTime;
            this.deviceName = response.deviceName;
            this.encryptType = response.encryptType;
            this.endTime = response.endTime;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.playUnLimited = response.playUnLimited;
            this.productKey = response.productKey;
            this.scheme = response.scheme;
            this.seekTime = response.seekTime;
            this.shouldEncrypt = response.shouldEncrypt;
            this.urlValidDuration = response.urlValidDuration;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Integer beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
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
         * EncryptType.
         */
        public Builder encryptType(Integer encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * PlayUnLimited.
         */
        public Builder playUnLimited(Boolean playUnLimited) {
            this.putQueryParameter("PlayUnLimited", playUnLimited);
            this.playUnLimited = playUnLimited;
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
         * Scheme.
         */
        public Builder scheme(String scheme) {
            this.putQueryParameter("Scheme", scheme);
            this.scheme = scheme;
            return this;
        }

        /**
         * SeekTime.
         */
        public Builder seekTime(Integer seekTime) {
            this.putQueryParameter("SeekTime", seekTime);
            this.seekTime = seekTime;
            return this;
        }

        /**
         * ShouldEncrypt.
         */
        public Builder shouldEncrypt(Boolean shouldEncrypt) {
            this.putQueryParameter("ShouldEncrypt", shouldEncrypt);
            this.shouldEncrypt = shouldEncrypt;
            return this;
        }

        /**
         * UrlValidDuration.
         */
        public Builder urlValidDuration(Integer urlValidDuration) {
            this.putQueryParameter("UrlValidDuration", urlValidDuration);
            this.urlValidDuration = urlValidDuration;
            return this;
        }

        @Override
        public QueryDeviceVodUrlByTimeRequest build() {
            return new QueryDeviceVodUrlByTimeRequest(this);
        } 

    } 

}
