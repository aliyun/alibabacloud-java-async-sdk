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
 * {@link ReleaseEdgeDriverVersionRequest} extends {@link RequestModel}
 *
 * <p>ReleaseEdgeDriverVersionRequest</p>
 */
public class ReleaseEdgeDriverVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private ReleaseEdgeDriverVersionRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.driverVersion = builder.driverVersion;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseEdgeDriverVersionRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseEdgeDriverVersionRequest, Builder> {
        private String driverId; 
        private String driverVersion; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseEdgeDriverVersionRequest request) {
            super(request);
            this.driverId = request.driverId;
            this.driverVersion = request.driverVersion;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fec565038d7544978d9aed5c1a******</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
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
        public ReleaseEdgeDriverVersionRequest build() {
            return new ReleaseEdgeDriverVersionRequest(this);
        } 

    } 

}
