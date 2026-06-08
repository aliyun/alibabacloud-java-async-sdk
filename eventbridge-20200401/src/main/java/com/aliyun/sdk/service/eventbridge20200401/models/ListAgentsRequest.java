// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListAgentsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentsRequest</p>
 */
public class ListAgentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("After")
    private String after;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    private ListAgentsRequest(Builder builder) {
        super(builder);
        this.after = builder.after;
        this.limit = builder.limit;
        this.order = builder.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return after
     */
    public String getAfter() {
        return this.after;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    public static final class Builder extends Request.Builder<ListAgentsRequest, Builder> {
        private String after; 
        private String limit; 
        private String order; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentsRequest request) {
            super(request);
            this.after = request.after;
            this.limit = request.limit;
            this.order = request.order;
        } 

        /**
         * After.
         */
        public Builder after(String after) {
            this.putBodyParameter("After", after);
            this.after = after;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(String limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        @Override
        public ListAgentsRequest build() {
            return new ListAgentsRequest(this);
        } 

    } 

}
