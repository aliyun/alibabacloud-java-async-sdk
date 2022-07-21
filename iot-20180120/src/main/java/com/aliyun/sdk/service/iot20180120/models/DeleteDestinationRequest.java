// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDestinationRequest} extends {@link RequestModel}
 *
 * <p>DeleteDestinationRequest</p>
 */
public class DeleteDestinationRequest extends Request {
    @Query
    @NameInMap("DestinationId")
    @Validation(required = true, maximum = 9999999)
    private Long destinationId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteDestinationRequest(Builder builder) {
        super(builder);
        this.destinationId = builder.destinationId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDestinationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationId
     */
    public Long getDestinationId() {
        return this.destinationId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDestinationRequest, Builder> {
        private Long destinationId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDestinationRequest request) {
            super(request);
            this.destinationId = request.destinationId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * DestinationId.
         */
        public Builder destinationId(Long destinationId) {
            this.putQueryParameter("DestinationId", destinationId);
            this.destinationId = destinationId;
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
        public DeleteDestinationRequest build() {
            return new DeleteDestinationRequest(this);
        } 

    } 

}
