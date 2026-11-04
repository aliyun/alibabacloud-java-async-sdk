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
 * {@link QueryDeviceVodUrlByTimeRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceVodUrlByTimeRequest</p>
 */
public class QueryDeviceVodUrlByTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483648D)
    private Integer beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStun")
    private Boolean enableStun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptType")
    @com.aliyun.core.annotation.Validation(maximum = 2147483648D)
    private Integer encryptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483648D)
    private Integer endTime;

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
    @com.aliyun.core.annotation.NameInMap("SeekTime")
    @com.aliyun.core.annotation.Validation(maximum = 2147483648D)
    private Integer seekTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShouldEncrypt")
    private Boolean shouldEncrypt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrlValidDuration")
    private Integer urlValidDuration;

    private QueryDeviceVodUrlByTimeRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.deviceName = builder.deviceName;
        this.enableStun = builder.enableStun;
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
        private Boolean enableStun; 
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

        private Builder(QueryDeviceVodUrlByTimeRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.deviceName = request.deviceName;
            this.enableStun = request.enableStun;
            this.encryptType = request.encryptType;
            this.endTime = request.endTime;
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
         * <p>The recording start time. The value must be a 10-digit UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1508200012</p>
         */
        public Builder beginTime(Integer beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The DeviceName of the IPC device.
         * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
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
         * <p>The encryption type. Only I-frame encryption is supported. Set the value to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder encryptType(Integer encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>The recording end time. The value must be a 10-digit UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1582420940</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the IPC device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> uniquely identifies the device and has a one-to-one mapping with the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
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
         * <li>If the instance has an ID, you must specify this ID. Otherwise, the call fails.</li>
         * <li>If the instance does not have an &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or </ph>ID, you do not need to specify this parameter.</li>
         * </ul>
         * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-n6w1y****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether the playback URL can be used an unlimited number of times. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The URL can be used an unlimited number of times within 10 seconds.</li>
         * <li><strong>false</strong>: The URL can be used only once. This is the default value.</li>
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
         * <p>The ProductKey of the product to which the IPC device belongs.
         * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
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
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>rtmp</strong>: RTMP.</li>
         * <li><strong>flv</strong>: HTTP-FLV.</li>
         * <li><strong>hls</strong>: HLS.<blockquote>
         * <p>For more information about the limits of HLS, see <a href="https://help.aliyun.com/document_detail/208584.html">Cloud development</a>.</p>
         * </blockquote>
         * </li>
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
         * <p>The offset relative to the recording start time specified by <strong>BeginTime</strong>. Unit: seconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder seekTime(Integer seekTime) {
            this.putQueryParameter("SeekTime", seekTime);
            this.seekTime = seekTime;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the stream. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Encrypts the stream.</li>
         * <li><strong>false</strong>: Does not encrypt the stream. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder shouldEncrypt(Boolean shouldEncrypt) {
            this.putQueryParameter("ShouldEncrypt", shouldEncrypt);
            this.shouldEncrypt = shouldEncrypt;
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
        public QueryDeviceVodUrlByTimeRequest build() {
            return new QueryDeviceVodUrlByTimeRequest(this);
        } 

    } 

}
