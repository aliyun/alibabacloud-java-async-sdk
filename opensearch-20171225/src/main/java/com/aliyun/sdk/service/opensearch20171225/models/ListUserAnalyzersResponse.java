// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserAnalyzersResponse} extends {@link TeaModel}
 *
 * <p>ListUserAnalyzersResponse</p>
 */
public class ListUserAnalyzersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserAnalyzersResponseBody body;

    private ListUserAnalyzersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserAnalyzersResponse create() {
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
    public ListUserAnalyzersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserAnalyzersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserAnalyzersResponseBody body);

        @Override
        ListUserAnalyzersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserAnalyzersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserAnalyzersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserAnalyzersResponse response) {
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
        public Builder body(ListUserAnalyzersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserAnalyzersResponse build() {
            return new ListUserAnalyzersResponse(this);
        } 

    } 

}
