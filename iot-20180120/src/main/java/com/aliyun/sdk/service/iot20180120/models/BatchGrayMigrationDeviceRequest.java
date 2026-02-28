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
 * {@link BatchGrayMigrationDeviceRequest} extends {@link RequestModel}
 *
 * <p>BatchGrayMigrationDeviceRequest</p>
 */
public class BatchGrayMigrationDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private BatchGrayMigrationDeviceRequest(Builder builder) {
        super(builder);
        this.deviceNames = builder.deviceNames;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGrayMigrationDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceNames
     */
    public java.util.List<String> getDeviceNames() {
        return this.deviceNames;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<BatchGrayMigrationDeviceRequest, Builder> {
        private java.util.List<String> deviceNames; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BatchGrayMigrationDeviceRequest request) {
            super(request);
            this.deviceNames = request.deviceNames;
            this.productKey = request.productKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        public Builder deviceNames(java.util.List<String> deviceNames) {
            this.putBodyParameter("DeviceNames", deviceNames);
            this.deviceNames = deviceNames;
            return this;
        }

        /**
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

        @Override
        public BatchGrayMigrationDeviceRequest build() {
            return new BatchGrayMigrationDeviceRequest(this);
        } 

    } 

}
