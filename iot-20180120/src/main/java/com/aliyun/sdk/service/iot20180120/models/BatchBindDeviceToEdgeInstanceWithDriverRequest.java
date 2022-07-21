// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindDeviceToEdgeInstanceWithDriverRequest} extends {@link RequestModel}
 *
 * <p>BatchBindDeviceToEdgeInstanceWithDriverRequest</p>
 */
public class BatchBindDeviceToEdgeInstanceWithDriverRequest extends Request {
    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotIds")
    @Validation(required = true)
    private java.util.List < String > iotIds;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchBindDeviceToEdgeInstanceWithDriverRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.instanceId = builder.instanceId;
        this.iotIds = builder.iotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindDeviceToEdgeInstanceWithDriverRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotIds
     */
    public java.util.List < String > getIotIds() {
        return this.iotIds;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchBindDeviceToEdgeInstanceWithDriverRequest, Builder> {
        private String driverId; 
        private String instanceId; 
        private java.util.List < String > iotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindDeviceToEdgeInstanceWithDriverRequest request) {
            super(request);
            this.driverId = request.driverId;
            this.instanceId = request.instanceId;
            this.iotIds = request.iotIds;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * DriverId.
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotIds.
         */
        public Builder iotIds(java.util.List < String > iotIds) {
            this.putQueryParameter("IotIds", iotIds);
            this.iotIds = iotIds;
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

        @Override
        public BatchBindDeviceToEdgeInstanceWithDriverRequest build() {
            return new BatchBindDeviceToEdgeInstanceWithDriverRequest(this);
        } 

    } 

}
