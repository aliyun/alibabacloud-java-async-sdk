// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RejectTicketRequest} extends {@link RequestModel}
 *
 * <p>RejectTicketRequest</p>
 */
public class RejectTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    private String ticketId;

    private RejectTicketRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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

    public static final class Builder extends Request.Builder<RejectTicketRequest, Builder> {
        private String comment; 
        private String instanceId; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(RejectTicketRequest request) {
            super(request);
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.ticketId = request.ticketId;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
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
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public RejectTicketRequest build() {
            return new RejectTicketRequest(this);
        } 

    } 

}
