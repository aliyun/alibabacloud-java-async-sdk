// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeThingsServiceRequest} extends {@link RequestModel}
 *
 * <p>InvokeThingsServiceRequest</p>
 */
public class InvokeThingsServiceRequest extends Request {
    @Query
    @NameInMap("Args")
    @Validation(required = true)
    private String args;

    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private java.util.List < String > deviceName;

    @Query
    @NameInMap("Identifier")
    @Validation(required = true)
    private String identifier;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private InvokeThingsServiceRequest(Builder builder) {
        super(builder);
        this.args = builder.args;
        this.deviceName = builder.deviceName;
        this.identifier = builder.identifier;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeThingsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return deviceName
     */
    public java.util.List < String > getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
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

    public static final class Builder extends Request.Builder<InvokeThingsServiceRequest, Builder> {
        private String args; 
        private java.util.List < String > deviceName; 
        private String identifier; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(InvokeThingsServiceRequest response) {
            super(response);
            this.args = response.args;
            this.deviceName = response.deviceName;
            this.identifier = response.identifier;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
        } 

        /**
         * Args.
         */
        public Builder args(String args) {
            this.putQueryParameter("Args", args);
            this.args = args;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(java.util.List < String > deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * IotInstanceId.
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
        public InvokeThingsServiceRequest build() {
            return new InvokeThingsServiceRequest(this);
        } 

    } 

}
