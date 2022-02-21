// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskInfoRequest</p>
 */
public class QueryTaskInfoRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    private QueryTaskInfoRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<QueryTaskInfoRequest, Builder> {
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskInfoRequest response) {
            super(response);
            this.orderId = response.orderId;
        } 

        /**
         * 任务单ID
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public QueryTaskInfoRequest build() {
            return new QueryTaskInfoRequest(this);
        } 

    } 

}
