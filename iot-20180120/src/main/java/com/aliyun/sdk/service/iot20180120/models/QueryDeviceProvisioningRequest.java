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
 * {@link QueryDeviceProvisioningRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceProvisioningRequest</p>
 */
public class QueryDeviceProvisioningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private QueryDeviceProvisioningRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceProvisioningRequest create() {
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QueryDeviceProvisioningRequest, Builder> {
        private String deviceName; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceProvisioningRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.productKey = request.productKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testDevcieBwT3Un</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1ji*****</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public QueryDeviceProvisioningRequest build() {
            return new QueryDeviceProvisioningRequest(this);
        } 

    } 

}
