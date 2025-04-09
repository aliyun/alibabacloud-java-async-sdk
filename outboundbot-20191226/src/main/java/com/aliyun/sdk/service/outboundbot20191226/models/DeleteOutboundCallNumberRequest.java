// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DeleteOutboundCallNumberRequest} extends {@link RequestModel}
 *
 * <p>DeleteOutboundCallNumberRequest</p>
 */
public class DeleteOutboundCallNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundCallNumberId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>33014787-cc13-49d3-ab2f-a98aa8f15fbb</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ffa367e0-58f3-43b6-9615-c63db99c5add</p>
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
