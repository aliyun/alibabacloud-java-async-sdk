// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDeviceDriverRequest} extends {@link RequestModel}
 *
 * <p>BatchGetEdgeInstanceDeviceDriverRequest</p>
 */
public class BatchGetEdgeInstanceDeviceDriverRequest extends Request {
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

    private BatchGetEdgeInstanceDeviceDriverRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.iotIds = builder.iotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeInstanceDeviceDriverRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<BatchGetEdgeInstanceDeviceDriverRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > iotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetEdgeInstanceDeviceDriverRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.iotIds = request.iotIds;
            this.iotInstanceId = request.iotInstanceId;
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
        public BatchGetEdgeInstanceDeviceDriverRequest build() {
            return new BatchGetEdgeInstanceDeviceDriverRequest(this);
        } 

    } 

}
