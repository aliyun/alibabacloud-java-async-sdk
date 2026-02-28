// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CancelOTATaskByDeviceRequest} extends {@link RequestModel}
 *
 * <p>CancelOTATaskByDeviceRequest</p>
 */
public class CancelOTATaskByDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firmwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private CancelOTATaskByDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.firmwareId = builder.firmwareId;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOTATaskByDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return firmwareId
     */
    public String getFirmwareId() {
        return this.firmwareId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<CancelOTATaskByDeviceRequest, Builder> {
        private java.util.List<String> deviceName; 
        private String firmwareId; 
        private String iotInstanceId; 
        private String jobId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(CancelOTATaskByDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.firmwareId = request.firmwareId;
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device1</p>
         */
        public Builder deviceName(java.util.List<String> deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The unique ID of the OTA update package.</p>
         * <p>An update package ID is returned after you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create the update package.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/147450.html">ListOTAFirmware</a> operation and view the update package ID in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>T0F5b5tpFnHQrgfk****030100</p>
         */
        public Builder firmwareId(String firmwareId) {
            this.putQueryParameter("FirmwareId", firmwareId);
            this.firmwareId = firmwareId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the update batch. If you configure this parameter, only the device update tasks in the specified update batch are deleted.</p>
         * <p>After you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation to create a device update task, you can obtain the value of the <strong>JobId</strong> parameter. You can also view the batch ID on the <strong>Firmware Details</strong> page in the IoT Platform console.</p>
         * 
         * <strong>example:</strong>
         * <p>wahVIzGkCMuAUE2gDERM02****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1V4kde****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public CancelOTATaskByDeviceRequest build() {
            return new CancelOTATaskByDeviceRequest(this);
        } 

    } 

}
