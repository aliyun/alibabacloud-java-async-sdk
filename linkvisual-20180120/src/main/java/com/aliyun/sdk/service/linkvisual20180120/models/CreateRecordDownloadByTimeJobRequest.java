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
 * {@link CreateRecordDownloadByTimeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRecordDownloadByTimeJobRequest</p>
 */
public class CreateRecordDownloadByTimeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483648D)
    private Integer beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999999999D)
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordType")
    private Integer recordType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamType")
    private Integer streamType;

    private CreateRecordDownloadByTimeJobRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.deviceName = builder.deviceName;
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.recordType = builder.recordType;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecordDownloadByTimeJobRequest create() {
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return recordType
     */
    public Integer getRecordType() {
        return this.recordType;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<CreateRecordDownloadByTimeJobRequest, Builder> {
        private Integer beginTime; 
        private String deviceName; 
        private Integer endTime; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private Integer recordType; 
        private Integer streamType; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecordDownloadByTimeJobRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.deviceName = request.deviceName;
            this.endTime = request.endTime;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.recordType = request.recordType;
            this.streamType = request.streamType;
        } 

        /**
         * <p>The start time. The value must be a 10-digit UNIX timestamp in seconds. Valid values: 0 to 2147483647.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1900000000</p>
         */
        public Builder beginTime(Integer beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The DeviceName of the video device. You can view the <strong>DeviceName</strong> of devices under a specified product on the <strong>Devices</strong> page in the <a href="https://iot.console.aliyun.com/devices">IoT Platform console</a> or by calling the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Device01</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The end time. The value must be a 10-digit UNIX timestamp in seconds. Valid values: 0 to 2147483647. The value must be greater than the start time specified by <strong>BeginTime</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2100000000</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the video device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the ID.</p>
         * <blockquote>
         * <p>Notice:  <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
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
         * <p>The instance ID. You can view the ID of the current instance on the <strong>Instance Overview</strong> tab in the IoT Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-******</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the video device belongs.</p>
         * <p>You can view the information about all products under the current instance on the <strong>Products</strong> page in the <a href="https://iot.console.aliyun.com/product">IoT Platform console</a> or by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1Bw******</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The recording type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: continuous recording.</li>
         * <li><strong>1</strong>: event recording.</li>
         * <li><strong>2</strong>: on-demand recording.</li>
         * <li><strong>4</strong>: local-to-cloud recording.</li>
         * <li><strong>Empty</strong>: all recordings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder recordType(Integer recordType) {
            this.putQueryParameter("RecordType", recordType);
            this.recordType = recordType;
            return this;
        }

        /**
         * <p>The stream type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): main stream.</li>
         * <li><strong>1</strong>: sub stream.</li>
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

        @Override
        public CreateRecordDownloadByTimeJobRequest build() {
            return new CreateRecordDownloadByTimeJobRequest(this);
        } 

    } 

}
