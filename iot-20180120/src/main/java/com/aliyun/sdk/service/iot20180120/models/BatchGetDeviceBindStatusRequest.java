// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetDeviceBindStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchGetDeviceBindStatusRequest</p>
 */
public class BatchGetDeviceBindStatusRequest extends Request {
    @Query
    @NameInMap("IotIds")
    @Validation(required = true)
    private java.util.List < String > iotIds;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchGetDeviceBindStatusRequest(Builder builder) {
        super(builder);
        this.iotIds = builder.iotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetDeviceBindStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<BatchGetDeviceBindStatusRequest, Builder> {
        private java.util.List < String > iotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetDeviceBindStatusRequest response) {
            super(response);
            this.iotIds = response.iotIds;
            this.iotInstanceId = response.iotInstanceId;
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
        public BatchGetDeviceBindStatusRequest build() {
            return new BatchGetDeviceBindStatusRequest(this);
        } 

    } 

}
