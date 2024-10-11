// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTicketRequest} extends {@link RequestModel}
 *
 * <p>GetTicketRequest</p>
 */
public class GetTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    private GetTicketRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketRequest create() {
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
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    public static final class Builder extends Request.Builder<GetTicketRequest, Builder> {
        private String instanceId; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(GetTicketRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ticketId = request.ticketId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
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
         * <p>3d26b90a-c5d2-4b09-8219-********</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public GetTicketRequest build() {
            return new GetTicketRequest(this);
        } 

    } 

}
