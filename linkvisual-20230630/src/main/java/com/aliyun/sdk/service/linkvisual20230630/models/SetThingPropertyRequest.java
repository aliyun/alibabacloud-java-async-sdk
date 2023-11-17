// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetThingPropertyRequest} extends {@link RequestModel}
 *
 * <p>SetThingPropertyRequest</p>
 */
public class SetThingPropertyRequest extends Request {
    @Query
    @NameInMap("Args")
    @Validation(required = true)
    private String args;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private SetThingPropertyRequest(Builder builder) {
        super(builder);
        this.args = builder.args;
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetThingPropertyRequest create() {
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
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<SetThingPropertyRequest, Builder> {
        private String args; 
        private String deviceName; 
        private String iotId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(SetThingPropertyRequest request) {
            super(request);
            this.args = request.args;
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.productKey = request.productKey;
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
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
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
        public SetThingPropertyRequest build() {
            return new SetThingPropertyRequest(this);
        } 

    } 

}
