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
 * {@link QueryDevicePictureFileRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePictureFileRequest</p>
 */
public class QueryDevicePictureFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaptureId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String captureId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureType")
    private Integer pictureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThumbWidth")
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

        private Builder(QueryDevicePictureFileRequest request) {
            super(request);
            this.captureId = request.captureId;
            this.deviceName = request.deviceName;
            this.expireTime = request.expireTime;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.pictureType = request.pictureType;
            this.productKey = request.productKey;
            this.thumbWidth = request.thumbWidth;
        } 

        /**
         * <p>The ID of the image generated when a snapshot capture event occurs:</p>
         * <ul>
         * <li>For active snapshot capture, see <a href="https://help.aliyun.com/document_detail/107914.html">TriggerCapturePicture</a> for the image ID.</li>
         * <li>For snapshot capture triggered by an intelligent alert event, see <a href="https://help.aliyun.com/document_detail/107916.html">QueryDeviceEvent</a> for the image ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fdc576d03c094faea9fa10fbf48c****</p>
         */
        public Builder captureId(String captureId) {
            this.putQueryParameter("CaptureId", captureId);
            this.captureId = captureId;
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
         * <p>Specifies the expiration time of the image URL. Unit: minutes. Valid values: 1 to 43200.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The IotId of the IPC device. The IotId is the globally unique identifier (GUID) that is issued by IoT Platform to the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the globally unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zLZyi6aOLyOSHa9hsPyD00****</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>If the instance has an ID, you must specify the ID. Otherwise, the call fails.</li>
         * <li>If the &lt;props=&quot;intl&quot;&gt;<ph><strong>Overview</strong> page is not displayed or the instance does not have an </ph>ID, you do not need to specify this parameter.</li>
         * </ul>
         * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-n6w1y******</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: thumbnail.</li>
         * <li><strong>1</strong>: original image.</li>
         * <li><strong>2</strong>: all images. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pictureType(Integer pictureType) {
            this.putQueryParameter("PictureType", pictureType);
            this.pictureType = pictureType;
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
         * <p>Specifies the width of the target scaled image. Unit: px. Valid values: 1 to 4096.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
