// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListTableVersionsResponse</p>
 */
public class ListTableVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTableVersionsResponseBody body;

    private ListTableVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTableVersionsResponse create() {
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
    public ListTableVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTableVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTableVersionsResponseBody body);

        @Override
        ListTableVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTableVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTableVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTableVersionsResponse response) {
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
        public Builder body(ListTableVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTableVersionsResponse build() {
            return new ListTableVersionsResponse(this);
        } 

    } 

}
