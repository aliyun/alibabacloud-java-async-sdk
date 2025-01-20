// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link UpdateCallSummaryRequest} extends {@link RequestModel}
 *
 * <p>UpdateCallSummaryRequest</p>
 */
public class UpdateCallSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Context")
    private String context;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    private UpdateCallSummaryRequest(Builder builder) {
        super(builder);
        this.context = builder.context;
        this.instanceId = builder.instanceId;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCallSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
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

    public static final class Builder extends Request.Builder<UpdateCallSummaryRequest, Builder> {
        private String context; 
        private String instanceId; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCallSummaryRequest request) {
            super(request);
            this.context = request.context;
            this.instanceId = request.instanceId;
            this.ticketId = request.ticketId;
        } 

        /**
         * Context.
         */
        public Builder context(String context) {
            this.putQueryParameter("Context", context);
            this.context = context;
            return this;
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
         * <p>f2c6722b-cd13-442d-bf10-22a07c70d6d5</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public UpdateCallSummaryRequest build() {
            return new UpdateCallSummaryRequest(this);
        } 

    } 

}
