// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMqttRootTopicsResponse} extends {@link TeaModel}
 *
 * <p>ListMqttRootTopicsResponse</p>
 */
public class ListMqttRootTopicsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMqttRootTopicsResponseBody body;

    private ListMqttRootTopicsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMqttRootTopicsResponse create() {
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
    public ListMqttRootTopicsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMqttRootTopicsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMqttRootTopicsResponseBody body);

        @Override
        ListMqttRootTopicsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMqttRootTopicsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMqttRootTopicsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMqttRootTopicsResponse response) {
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
        public Builder body(ListMqttRootTopicsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMqttRootTopicsResponse build() {
            return new ListMqttRootTopicsResponse(this);
        } 

    } 

}
