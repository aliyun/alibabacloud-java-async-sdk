// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLiveStreamingRequest} extends {@link RequestModel}
 *
 * <p>QueryLiveStreamingRequest</p>
 */
public class QueryLiveStreamingRequest extends Request {
    @Query
    @NameInMap("CacheDuration")
    @Validation(maximum = 10000)
    private Integer cacheDuration;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("EncryptType")
    private Integer encryptType;

    @Query
    @NameInMap("ForceIFrame")
    private Boolean forceIFrame;

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
    @NameInMap("ShouldEncrypt")
    private Boolean shouldEncrypt;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    @Query
    @NameInMap("UrlValidDuration")
    private Integer urlValidDuration;

    private QueryLiveStreamingRequest(Builder builder) {
        super(builder);
        this.cacheDuration = builder.cacheDuration;
        this.deviceName = builder.deviceName;
        this.encryptType = builder.encryptType;
        this.forceIFrame = builder.forceIFrame;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.playUnLimited = builder.playUnLimited;
        this.productKey = builder.productKey;
        this.scheme = builder.scheme;
        this.shouldEncrypt = builder.shouldEncrypt;
        this.streamType = builder.streamType;
        this.urlValidDuration = builder.urlValidDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLiveStreamingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheDuration
     */
    public Integer getCacheDuration() {
        return this.cacheDuration;
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
     * @return forceIFrame
     */
    public Boolean getForceIFrame() {
        return this.forceIFrame;
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
     * @return shouldEncrypt
     */
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    /**
     * @return urlValidDuration
     */
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

    public static final class Builder extends Request.Builder<QueryLiveStreamingRequest, Builder> {
        private Integer cacheDuration; 
        private String deviceName; 
        private Integer encryptType; 
        private Boolean forceIFrame; 
        private String iotId; 
        private String iotInstanceId; 
        private Boolean playUnLimited; 
        private String productKey; 
        private String scheme; 
        private Boolean shouldEncrypt; 
        private Integer streamType; 
        private Integer urlValidDuration; 

        private Builder() {
            super();
        } 

        private Builder(QueryLiveStreamingRequest response) {
            super(response);
            this.cacheDuration = response.cacheDuration;
            this.deviceName = response.deviceName;
            this.encryptType = response.encryptType;
            this.forceIFrame = response.forceIFrame;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.playUnLimited = response.playUnLimited;
            this.productKey = response.productKey;
            this.scheme = response.scheme;
            this.shouldEncrypt = response.shouldEncrypt;
            this.streamType = response.streamType;
            this.urlValidDuration = response.urlValidDuration;
        } 

        /**
         * CacheDuration.
         */
        public Builder cacheDuration(Integer cacheDuration) {
            this.putQueryParameter("CacheDuration", cacheDuration);
            this.cacheDuration = cacheDuration;
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
         * ForceIFrame.
         */
        public Builder forceIFrame(Boolean forceIFrame) {
            this.putQueryParameter("ForceIFrame", forceIFrame);
            this.forceIFrame = forceIFrame;
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
         * ShouldEncrypt.
         */
        public Builder shouldEncrypt(Boolean shouldEncrypt) {
            this.putQueryParameter("ShouldEncrypt", shouldEncrypt);
            this.shouldEncrypt = shouldEncrypt;
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

        /**
         * UrlValidDuration.
         */
        public Builder urlValidDuration(Integer urlValidDuration) {
            this.putQueryParameter("UrlValidDuration", urlValidDuration);
            this.urlValidDuration = urlValidDuration;
            return this;
        }

        @Override
        public QueryLiveStreamingRequest build() {
            return new QueryLiveStreamingRequest(this);
        } 

    } 

}
