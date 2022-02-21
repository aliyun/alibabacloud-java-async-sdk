// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchemaSubscribesResponse} extends {@link TeaModel}
 *
 * <p>ListSchemaSubscribesResponse</p>
 */
public class ListSchemaSubscribesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSchemaSubscribesResponseBody body;

    private ListSchemaSubscribesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSchemaSubscribesResponse create() {
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
    public ListSchemaSubscribesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSchemaSubscribesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSchemaSubscribesResponseBody body);

        @Override
        ListSchemaSubscribesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSchemaSubscribesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSchemaSubscribesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSchemaSubscribesResponse response) {
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
        public Builder body(ListSchemaSubscribesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSchemaSubscribesResponse build() {
            return new ListSchemaSubscribesResponse(this);
        } 

    } 

}
