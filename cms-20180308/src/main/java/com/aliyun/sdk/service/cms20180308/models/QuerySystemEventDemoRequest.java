// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link QuerySystemEventDemoRequest} extends {@link RequestModel}
 *
 * <p>QuerySystemEventDemoRequest</p>
 */
public class QuerySystemEventDemoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private QuerySystemEventDemoRequest(Builder builder) {
        super(builder);
        this.eventName = builder.eventName;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySystemEventDemoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<QuerySystemEventDemoRequest, Builder> {
        private String eventName; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(QuerySystemEventDemoRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.product = request.product;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public QuerySystemEventDemoRequest build() {
            return new QuerySystemEventDemoRequest(this);
        } 

    } 

}
