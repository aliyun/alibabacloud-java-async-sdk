// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDriverConfigsRequest} extends {@link RequestModel}
 *
 * <p>BatchGetEdgeInstanceDriverConfigsRequest</p>
 */
public class BatchGetEdgeInstanceDriverConfigsRequest extends Request {
    @Query
    @NameInMap("DriverIds")
    @Validation(required = true)
    private java.util.List < String > driverIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchGetEdgeInstanceDriverConfigsRequest(Builder builder) {
        super(builder);
        this.driverIds = builder.driverIds;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeInstanceDriverConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driverIds
     */
    public java.util.List < String > getDriverIds() {
        return this.driverIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchGetEdgeInstanceDriverConfigsRequest, Builder> {
        private java.util.List < String > driverIds; 
        private String instanceId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetEdgeInstanceDriverConfigsRequest response) {
            super(response);
            this.driverIds = response.driverIds;
            this.instanceId = response.instanceId;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * DriverIds.
         */
        public Builder driverIds(java.util.List < String > driverIds) {
            this.putQueryParameter("DriverIds", driverIds);
            this.driverIds = driverIds;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BatchGetEdgeInstanceDriverConfigsRequest build() {
            return new BatchGetEdgeInstanceDriverConfigsRequest(this);
        } 

    } 

}
