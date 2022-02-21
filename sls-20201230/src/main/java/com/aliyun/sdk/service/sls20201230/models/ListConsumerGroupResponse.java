// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListConsumerGroupResponse} extends {@link TeaModel}
 *
 * <p>ListConsumerGroupResponse</p>
 */
public class ListConsumerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < ConsumerGroup > body;

    private ListConsumerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConsumerGroupResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public java.util.List < ConsumerGroup > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConsumerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < ConsumerGroup > body);

        @Override
        ListConsumerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConsumerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < ConsumerGroup > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConsumerGroupResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < ConsumerGroup > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConsumerGroupResponse build() {
            return new ListConsumerGroupResponse(this);
        } 

    } 

}
