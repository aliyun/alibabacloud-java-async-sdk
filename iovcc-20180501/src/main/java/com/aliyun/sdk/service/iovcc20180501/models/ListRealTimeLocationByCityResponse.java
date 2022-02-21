// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealTimeLocationByCityResponse} extends {@link TeaModel}
 *
 * <p>ListRealTimeLocationByCityResponse</p>
 */
public class ListRealTimeLocationByCityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRealTimeLocationByCityResponseBody body;

    private ListRealTimeLocationByCityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRealTimeLocationByCityResponse create() {
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
    public ListRealTimeLocationByCityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRealTimeLocationByCityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRealTimeLocationByCityResponseBody body);

        @Override
        ListRealTimeLocationByCityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRealTimeLocationByCityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRealTimeLocationByCityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRealTimeLocationByCityResponse response) {
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
        public Builder body(ListRealTimeLocationByCityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRealTimeLocationByCityResponse build() {
            return new ListRealTimeLocationByCityResponse(this);
        } 

    } 

}
