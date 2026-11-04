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
 * {@link QueryDevicePictureByListRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePictureByListRequest</p>
 */
public class QueryDevicePictureByListRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PictureIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> pictureIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureType")
    private Integer pictureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThumbWidth")
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
    public java.util.List<String> getPictureIdList() {
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
        private java.util.List<String> pictureIdList; 
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
         * <p>The DeviceName of the IP camera.
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
         * <p>The expiration time of the image URL. Unit: minutes.</p>
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
         * <p>The ID of the IP camera. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. <strong>IotId</strong> uniquely identifies the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1CJ0****e7qiq8VkQi1000000</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>&lt;props=&quot;china&quot;&gt;You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console. If the instance has an ID, you must specify the ID. Otherwise, the call fails.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>If the public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;You do not need to specify this parameter.</p>
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
         * <p>The list of image IDs. Image IDs are generated when you call the <a href="https://help.aliyun.com/document_detail/107914.html">TriggerCapturePicture</a> operation.</p>
         * <blockquote>
         * <p>You can specify up to 50 image IDs in a single call.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cFc5MzZ<em><em><strong>npYT1</strong></em>TDFzX1hrVzA0Z</em>***</p>
         */
        public Builder pictureIdList(java.util.List<String> pictureIdList) {
            this.putQueryParameter("PictureIdList", pictureIdList);
            this.pictureIdList = pictureIdList;
            return this;
        }

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: thumbnail.</li>
         * <li><strong>1</strong>: original image. </li>
         * <li><strong>2</strong>: all. Default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pictureType(Integer pictureType) {
            this.putQueryParameter("PictureType", pictureType);
            this.pictureType = pictureType;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the IP camera belongs.
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
         * <p>Specifies the width of the target thumbnail. Unit: px. Valid values: 1 to 4096.</p>
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
        public QueryDevicePictureByListRequest build() {
            return new QueryDevicePictureByListRequest(this);
        } 

    } 

}
