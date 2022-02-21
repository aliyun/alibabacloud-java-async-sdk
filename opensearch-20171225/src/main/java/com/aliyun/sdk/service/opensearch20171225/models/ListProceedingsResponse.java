// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProceedingsResponse} extends {@link TeaModel}
 *
 * <p>ListProceedingsResponse</p>
 */
public class ListProceedingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProceedingsResponseBody body;

    private ListProceedingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProceedingsResponse create() {
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
    public ListProceedingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProceedingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProceedingsResponseBody body);

        @Override
        ListProceedingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProceedingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProceedingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProceedingsResponse response) {
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
        public Builder body(ListProceedingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProceedingsResponse build() {
            return new ListProceedingsResponse(this);
        } 

    } 

}
