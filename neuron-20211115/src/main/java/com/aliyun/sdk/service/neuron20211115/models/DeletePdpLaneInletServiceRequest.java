// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeletePdpLaneInletServiceRequest} extends {@link RequestModel}
 *
 * <p>DeletePdpLaneInletServiceRequest</p>
 */
public class DeletePdpLaneInletServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("laneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long laneId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    private DeletePdpLaneInletServiceRequest(Builder builder) {
        super(builder);
        this.laneId = builder.laneId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePdpLaneInletServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<DeletePdpLaneInletServiceRequest, Builder> {
        private Long laneId; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePdpLaneInletServiceRequest request) {
            super(request);
            this.laneId = request.laneId;
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder laneId(Long laneId) {
            this.putPathParameter("laneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(Long serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DeletePdpLaneInletServiceRequest build() {
            return new DeletePdpLaneInletServiceRequest(this);
        } 

    } 

}
