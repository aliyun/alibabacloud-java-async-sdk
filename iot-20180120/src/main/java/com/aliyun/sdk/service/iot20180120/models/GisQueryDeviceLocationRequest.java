// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GisQueryDeviceLocationRequest} extends {@link RequestModel}
 *
 * <p>GisQueryDeviceLocationRequest</p>
 */
public class GisQueryDeviceLocationRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ThingList")
    @Validation(required = true)
    private java.util.List < ThingList> thingList;

    private GisQueryDeviceLocationRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.thingList = builder.thingList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GisQueryDeviceLocationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return thingList
     */
    public java.util.List < ThingList> getThingList() {
        return this.thingList;
    }

    public static final class Builder extends Request.Builder<GisQueryDeviceLocationRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List < ThingList> thingList; 

        private Builder() {
            super();
        } 

        private Builder(GisQueryDeviceLocationRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.thingList = request.thingList;
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
         * ThingList.
         */
        public Builder thingList(java.util.List < ThingList> thingList) {
            this.putQueryParameter("ThingList", thingList);
            this.thingList = thingList;
            return this;
        }

        @Override
        public GisQueryDeviceLocationRequest build() {
            return new GisQueryDeviceLocationRequest(this);
        } 

    } 

    public static class ThingList extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("ProductKey")
        private String productKey;

        private ThingList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThingList create() {
            return builder().build();
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

        public static final class Builder {
            private String deviceName; 
            private String productKey; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public ThingList build() {
                return new ThingList(this);
            } 

        } 

    }
}
