// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEdgeDriverVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeDriverVersionRequest</p>
 */
public class DeleteEdgeDriverVersionRequest extends Request {
    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("DriverVersion")
    @Validation(required = true)
    private String driverVersion;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteEdgeDriverVersionRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.driverVersion = builder.driverVersion;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeDriverVersionRequest create() {
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
     * @return driverVersion
     */
    public String getDriverVersion() {
        return this.driverVersion;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteEdgeDriverVersionRequest, Builder> {
        private String driverId; 
        private String driverVersion; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEdgeDriverVersionRequest response) {
            super(response);
            this.driverId = response.driverId;
            this.driverVersion = response.driverVersion;
            this.iotInstanceId = response.iotInstanceId;
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
         * DriverVersion.
         */
        public Builder driverVersion(String driverVersion) {
            this.putQueryParameter("DriverVersion", driverVersion);
            this.driverVersion = driverVersion;
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
        public DeleteEdgeDriverVersionRequest build() {
            return new DeleteEdgeDriverVersionRequest(this);
        } 

    } 

}
