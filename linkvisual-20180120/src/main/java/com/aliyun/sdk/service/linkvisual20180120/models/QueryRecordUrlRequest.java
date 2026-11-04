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
 * {@link QueryRecordUrlRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordUrlRequest</p>
 */
public class QueryRecordUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeekTime")
    private Integer seekTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrlValidDuration")
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 10)
    private Integer urlValidDuration;

    private QueryRecordUrlRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.fileName = builder.fileName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.seekTime = builder.seekTime;
        this.urlValidDuration = builder.urlValidDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordUrlRequest create() {
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return seekTime
     */
    public Integer getSeekTime() {
        return this.seekTime;
    }

    /**
     * @return urlValidDuration
     */
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

    public static final class Builder extends Request.Builder<QueryRecordUrlRequest, Builder> {
        private String deviceName; 
        private String fileName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private Integer seekTime; 
        private Integer urlValidDuration; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordUrlRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.fileName = request.fileName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.seekTime = request.seekTime;
            this.urlValidDuration = request.urlValidDuration;
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
         * <p>The name of the cloud recording file. You can call the <a href="https://help.aliyun.com/document_detail/107922.html">QueryRecord</a> operation to query the file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file1</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The IotId of the IP camera. The IotId is the unique identifier that is issued by IoT Platform to the device. You can call the IoT Platform <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the IotId.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VrJwPGjC1sJlqPjZA3cxg4****</p>
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
         * <p>iot-cn-n6w1y****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * <p>The playback offset time of the recording, in seconds. Default value: 0.</p>
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
         * <p>The validity period of the URL, in seconds. Valid values: 10 to 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder urlValidDuration(Integer urlValidDuration) {
            this.putQueryParameter("UrlValidDuration", urlValidDuration);
            this.urlValidDuration = urlValidDuration;
            return this;
        }

        @Override
        public QueryRecordUrlRequest build() {
            return new QueryRecordUrlRequest(this);
        } 

    } 

}
