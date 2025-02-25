// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceVodUrlRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceVodUrlRequest</p>
 */
public class QueryDeviceVodUrlRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("EnableStun")
    private Boolean enableStun;

    @Query
    @NameInMap("EncryptType")
    private Integer encryptType;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

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
    private Integer seekTime;

    @Query
    @NameInMap("ShouldEncrypt")
    private Boolean shouldEncrypt;

    @Query
    @NameInMap("UrlValidDuration")
    private Integer urlValidDuration;

    private QueryDeviceVodUrlRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.enableStun = builder.enableStun;
        this.encryptType = builder.encryptType;
        this.fileName = builder.fileName;
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

    public static QueryDeviceVodUrlRequest create() {
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
     * @return enableStun
     */
    public Boolean getEnableStun() {
        return this.enableStun;
    }

    /**
     * @return encryptType
     */
    public Integer getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
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

    public static final class Builder extends Request.Builder<QueryDeviceVodUrlRequest, Builder> {
        private String deviceName; 
        private Boolean enableStun; 
        private Integer encryptType; 
        private String fileName; 
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

        private Builder(QueryDeviceVodUrlRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.enableStun = request.enableStun;
            this.encryptType = request.encryptType;
            this.fileName = request.fileName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.playUnLimited = request.playUnLimited;
            this.productKey = request.productKey;
            this.scheme = request.scheme;
            this.seekTime = request.seekTime;
            this.shouldEncrypt = request.shouldEncrypt;
            this.urlValidDuration = request.urlValidDuration;
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
         * EnableStun.
         */
        public Builder enableStun(Boolean enableStun) {
            this.putQueryParameter("EnableStun", enableStun);
            this.enableStun = enableStun;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
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
        public QueryDeviceVodUrlRequest build() {
            return new QueryDeviceVodUrlRequest(this);
        } 

    } 

}
