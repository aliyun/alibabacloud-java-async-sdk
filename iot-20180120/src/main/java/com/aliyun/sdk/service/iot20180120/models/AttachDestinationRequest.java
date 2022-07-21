// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDestinationRequest} extends {@link RequestModel}
 *
 * <p>AttachDestinationRequest</p>
 */
public class AttachDestinationRequest extends Request {
    @Query
    @NameInMap("DestinationId")
    @Validation(required = true, maximum = 999999999999D)
    private Long destinationId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("IsFailover")
    @Validation(required = true)
    private Boolean isFailover;

    @Query
    @NameInMap("ParserId")
    @Validation(required = true, maximum = 999999999, minimum = 1)
    private Long parserId;

    private AttachDestinationRequest(Builder builder) {
        super(builder);
        this.destinationId = builder.destinationId;
        this.iotInstanceId = builder.iotInstanceId;
        this.isFailover = builder.isFailover;
        this.parserId = builder.parserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDestinationRequest create() {
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

    /**
     * @return isFailover
     */
    public Boolean getIsFailover() {
        return this.isFailover;
    }

    /**
     * @return parserId
     */
    public Long getParserId() {
        return this.parserId;
    }

    public static final class Builder extends Request.Builder<AttachDestinationRequest, Builder> {
        private Long destinationId; 
        private String iotInstanceId; 
        private Boolean isFailover; 
        private Long parserId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDestinationRequest request) {
            super(request);
            this.destinationId = request.destinationId;
            this.iotInstanceId = request.iotInstanceId;
            this.isFailover = request.isFailover;
            this.parserId = request.parserId;
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

        /**
         * IsFailover.
         */
        public Builder isFailover(Boolean isFailover) {
            this.putQueryParameter("IsFailover", isFailover);
            this.isFailover = isFailover;
            return this;
        }

        /**
         * ParserId.
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        @Override
        public AttachDestinationRequest build() {
            return new AttachDestinationRequest(this);
        } 

    } 

}
