// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionsResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionsResponse</p>
 */
public class ListFunctionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionsResponseBody body;

    private ListFunctionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFunctionsResponse create() {
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
    public ListFunctionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFunctionsResponseBody body);

        @Override
        ListFunctionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionsResponse response) {
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
        public Builder body(ListFunctionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionsResponse build() {
            return new ListFunctionsResponse(this);
        } 

    } 

}
