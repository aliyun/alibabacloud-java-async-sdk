// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOutboundCallNumberRequest} extends {@link RequestModel}
 *
 * <p>DeleteOutboundCallNumberRequest</p>
 */
public class DeleteOutboundCallNumberRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OutboundCallNumberId")
    @Validation(required = true)
    private String outboundCallNumberId;

    private DeleteOutboundCallNumberRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.outboundCallNumberId = builder.outboundCallNumberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOutboundCallNumberRequest create() {
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
     * @return outboundCallNumberId
     */
    public String getOutboundCallNumberId() {
        return this.outboundCallNumberId;
    }

    public static final class Builder extends Request.Builder<DeleteOutboundCallNumberRequest, Builder> {
        private String instanceId; 
        private String outboundCallNumberId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOutboundCallNumberRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.outboundCallNumberId = request.outboundCallNumberId;
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
         * OutboundCallNumberId.
         */
        public Builder outboundCallNumberId(String outboundCallNumberId) {
            this.putQueryParameter("OutboundCallNumberId", outboundCallNumberId);
            this.outboundCallNumberId = outboundCallNumberId;
            return this;
        }

        @Override
        public DeleteOutboundCallNumberRequest build() {
            return new DeleteOutboundCallNumberRequest(this);
        } 

    } 

}
