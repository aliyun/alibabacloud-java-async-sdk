// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryLiveStreamingRequest} extends {@link RequestModel}
 *
 * <p>QueryLiveStreamingRequest</p>
 */
public class QueryLiveStreamingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheDuration")
    @com.aliyun.core.annotation.Validation(maximum = 10000)
    private Integer cacheDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStun")
    private Boolean enableStun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptType")
    private Integer encryptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceIFrame")
    private Boolean forceIFrame;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayUnLimited")
    private Boolean playUnLimited;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheme")
    private String scheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShouldEncrypt")
    private Boolean shouldEncrypt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamType")
    private Integer streamType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrlValidDuration")
    private Integer urlValidDuration;

    private QueryLiveStreamingRequest(Builder builder) {
        super(builder);
        this.cacheDuration = builder.cacheDuration;
        this.deviceName = builder.deviceName;
        this.enableStun = builder.enableStun;
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
        private Boolean enableStun; 
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

        private Builder(QueryLiveStreamingRequest request) {
            super(request);
            this.cacheDuration = request.cacheDuration;
            this.deviceName = request.deviceName;
            this.enableStun = request.enableStun;
            this.encryptType = request.encryptType;
            this.forceIFrame = request.forceIFrame;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.playUnLimited = request.playUnLimited;
            this.productKey = request.productKey;
            this.scheme = request.scheme;
            this.shouldEncrypt = request.shouldEncrypt;
            this.streamType = request.streamType;
            this.urlValidDuration = request.urlValidDuration;
        } 

        /**
         * <p>The duration of video cached data. Valid values: 0 to 10000. Unit: milliseconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cacheDuration(Integer cacheDuration) {
            this.putQueryParameter("CacheDuration", cacheDuration);
            this.cacheDuration = cacheDuration;
            return this;
        }

        /**
         * <p>The DeviceName of the IPC device. You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>camera1</p>
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
         * <p>The encryption type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): Keyframe encryption.</li>
         * <li><strong>0</strong>: No encryption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder encryptType(Integer encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>Specifies whether to send a force I-frame command to the device. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sent.</li>
         * <li><strong>false</strong> (default): Not sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceIFrame(Boolean forceIFrame) {
            this.putQueryParameter("ForceIFrame", forceIFrame);
            this.forceIFrame = forceIFrame;
            return this;
        }

        /**
         * <p>The IotId of the IPC device. The IotId is the globally unique identifier that is issued by IoT Platform to the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the globally unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>If an ID value is displayed, you must specify this parameter. Otherwise, the call fails.</li>
         * <li>If the &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or </ph>ID value is not displayed, you do not need to specify this parameter.</li>
         * </ul>
         * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-n6w1y59****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether the playback URL can be used for an unlimited number of times within the validity period. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Allowed.</li>
         * <li><strong>false</strong> (default): Not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder playUnLimited(Boolean playUnLimited) {
            this.putQueryParameter("PlayUnLimited", playUnLimited);
            this.playUnLimited = playUnLimited;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the IPC device belongs. You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The playback protocol type. Valid values:</p>
         * <ul>
         * <li><strong>rtmp</strong> (default): RTMP.</li>
         * <li><strong>hls</strong>: HLS.</li>
         * <li><strong>flv</strong>: HTTP-FLV.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        public Builder scheme(String scheme) {
            this.putQueryParameter("Scheme", scheme);
            this.scheme = scheme;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the stream. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Encrypted.</li>
         * <li><strong>false</strong> (default): Not encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder shouldEncrypt(Boolean shouldEncrypt) {
            this.putQueryParameter("ShouldEncrypt", shouldEncrypt);
            this.shouldEncrypt = shouldEncrypt;
            return this;
        }

        /**
         * <p>The stream type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): Main stream.</li>
         * <li><strong>1</strong>: Sub stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * <p>The validity period of the URL. Valid values: 10 to 14400. Unit: seconds. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
