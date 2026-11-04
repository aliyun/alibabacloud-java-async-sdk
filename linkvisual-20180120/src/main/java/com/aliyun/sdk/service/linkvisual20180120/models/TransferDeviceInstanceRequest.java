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
 * {@link TransferDeviceInstanceRequest} extends {@link RequestModel}
 *
 * <p>TransferDeviceInstanceRequest</p>
 */
public class TransferDeviceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInstanceId;

    private TransferDeviceInstanceRequest(Builder builder) {
        super(builder);
        this.deviceNameList = builder.deviceNameList;
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.targetInstanceId = builder.targetInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferDeviceInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceNameList
     */
    public java.util.List<String> getDeviceNameList() {
        return this.deviceNameList;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public static final class Builder extends Request.Builder<TransferDeviceInstanceRequest, Builder> {
        private java.util.List<String> deviceNameList; 
        private String productKey; 
        private String sourceInstanceId; 
        private String targetInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(TransferDeviceInstanceRequest request) {
            super(request);
            this.deviceNameList = request.deviceNameList;
            this.productKey = request.productKey;
            this.sourceInstanceId = request.sourceInstanceId;
            this.targetInstanceId = request.targetInstanceId;
        } 

        /**
         * <p>The list of names of the devices to be transferred. You can specify up to 100 device names.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RepeatList</p>
         */
        public Builder deviceNameList(java.util.List<String> deviceNameList) {
            this.putQueryParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the devices belong. IoT Platform generates this unique identifier when the product is created.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the source instance to which the devices belong:</p>
         * <ul>
         * <li><p>Public instance ID: iotx-oxssharez200.</p>
         * <blockquote>
         * <p>Only the China (Shanghai) region is supported. Enterprise instance ID is iotx-oxssharez200.</p>
         * </blockquote>
         * </li>
         * <li><p>Enterprise Edition instance ID: Log on to the IoT Platform console. On the <strong>Instance Overview</strong> page, click Enterprise instance name. On the <strong>Instance Details</strong> page, view the <strong>Instance ID</strong> in the <strong>Basic Information</strong> section.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iotx-oxssharez200</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * <p>The ID of the target instance to which the devices are transferred. Only Enterprise Edition instances are supported as target instances.</p>
         * <p>You can log on to the IoT Platform console. On the <strong>Instance Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the <strong>Instance ID</strong> in the <strong>Basic Information</strong> section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-060***</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        @Override
        public TransferDeviceInstanceRequest build() {
            return new TransferDeviceInstanceRequest(this);
        } 

    } 

}
