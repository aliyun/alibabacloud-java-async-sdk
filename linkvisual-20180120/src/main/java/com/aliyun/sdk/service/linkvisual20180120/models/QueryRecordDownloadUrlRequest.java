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
 * {@link QueryRecordDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordDownloadUrlRequest</p>
 */
public class QueryRecordDownloadUrlRequest extends Request {
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

    private QueryRecordDownloadUrlRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.fileName = builder.fileName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordDownloadUrlRequest create() {
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

    public static final class Builder extends Request.Builder<QueryRecordDownloadUrlRequest, Builder> {
        private String deviceName; 
        private String fileName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordDownloadUrlRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.fileName = request.fileName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The device name of the IPC device.
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
         * <p>The name of the recording file. You can call <a href="https://help.aliyun.com/document_detail/107922.html">QueryRecord</a> to query the file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1623999491_LYPsmZGeEN8GdKzMtYNiBXXXXXXXXX_0/c0064411-2065-400a-a13e-********</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The device ID of the IPC device. This is the unique identifier issued by IoT Platform for the device. You can call <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> of IoT Platform to query the device ID.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. <strong>IotId</strong> is the globally unique identifier of a device and corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong> on a one-to-one basis. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>C47T6xwp6ms4bNlkHRWR****</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>&lt;props=&quot;china&quot;&gt;You can view the <strong>ID</strong> of the current instance on the <strong>Overview</strong> page in the IoT Platform console. If the ID value is displayed, you must specify this parameter. Otherwise, the call fails.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>If no ID value is displayed for the public instance, refer to <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;You do not need to specify this parameter.</p>
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
         * <p>The ProductKey of the product to which the IPC device belongs.
         * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> to view the information about all products under the current account.</p>
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

        @Override
        public QueryRecordDownloadUrlRequest build() {
            return new QueryRecordDownloadUrlRequest(this);
        } 

    } 

}
