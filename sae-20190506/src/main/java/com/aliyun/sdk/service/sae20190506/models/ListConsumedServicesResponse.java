// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConsumedServicesResponse} extends {@link TeaModel}
 *
 * <p>ListConsumedServicesResponse</p>
 */
public class ListConsumedServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConsumedServicesResponseBody body;

    private ListConsumedServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConsumedServicesResponse create() {
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
    public ListConsumedServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConsumedServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConsumedServicesResponseBody body);

        @Override
        ListConsumedServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConsumedServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConsumedServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConsumedServicesResponse response) {
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
        public Builder body(ListConsumedServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConsumedServicesResponse build() {
            return new ListConsumedServicesResponse(this);
        } 

    } 

}
