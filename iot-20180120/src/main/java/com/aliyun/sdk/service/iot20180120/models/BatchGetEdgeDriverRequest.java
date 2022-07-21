// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeDriverRequest} extends {@link RequestModel}
 *
 * <p>BatchGetEdgeDriverRequest</p>
 */
public class BatchGetEdgeDriverRequest extends Request {
    @Query
    @NameInMap("DriverIds")
    @Validation(required = true)
    private java.util.List < String > driverIds;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchGetEdgeDriverRequest(Builder builder) {
        super(builder);
        this.driverIds = builder.driverIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeDriverRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchGetEdgeDriverRequest, Builder> {
        private java.util.List < String > driverIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetEdgeDriverRequest request) {
            super(request);
            this.driverIds = request.driverIds;
            this.iotInstanceId = request.iotInstanceId;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BatchGetEdgeDriverRequest build() {
            return new BatchGetEdgeDriverRequest(this);
        } 

    } 

}
