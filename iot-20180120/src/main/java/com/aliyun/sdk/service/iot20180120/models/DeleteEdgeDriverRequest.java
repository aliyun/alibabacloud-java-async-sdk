// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEdgeDriverRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeDriverRequest</p>
 */
public class DeleteEdgeDriverRequest extends Request {
    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteEdgeDriverRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeDriverRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteEdgeDriverRequest, Builder> {
        private String driverId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEdgeDriverRequest request) {
            super(request);
            this.driverId = request.driverId;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public DeleteEdgeDriverRequest build() {
            return new DeleteEdgeDriverRequest(this);
        } 

    } 

}
