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
 * {@link BatchQueryVisionDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryVisionDeviceInfoRequest</p>
 */
public class BatchQueryVisionDeviceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceNameList")
    private java.util.List<String> deviceNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotIdList")
    private java.util.List<String> iotIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private BatchQueryVisionDeviceInfoRequest(Builder builder) {
        super(builder);
        this.deviceNameList = builder.deviceNameList;
        this.iotIdList = builder.iotIdList;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryVisionDeviceInfoRequest create() {
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
     * @return iotIdList
     */
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
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

    public static final class Builder extends Request.Builder<BatchQueryVisionDeviceInfoRequest, Builder> {
        private java.util.List<String> deviceNameList; 
        private java.util.List<String> iotIdList; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryVisionDeviceInfoRequest request) {
            super(request);
            this.deviceNameList = request.deviceNameList;
            this.iotIdList = request.iotIdList;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * DeviceNameList.
         */
        public Builder deviceNameList(java.util.List<String> deviceNameList) {
            this.putQueryParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
            return this;
        }

        /**
         * IotIdList.
         */
        public Builder iotIdList(java.util.List<String> iotIdList) {
            this.putQueryParameter("IotIdList", iotIdList);
            this.iotIdList = iotIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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

        @Override
        public BatchQueryVisionDeviceInfoRequest build() {
            return new BatchQueryVisionDeviceInfoRequest(this);
        } 

    } 

}
