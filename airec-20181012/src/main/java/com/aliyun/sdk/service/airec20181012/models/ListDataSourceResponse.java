// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceResponse} extends {@link TeaModel}
 *
 * <p>ListDataSourceResponse</p>
 */
public class ListDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataSourceResponseBody body;

    private ListDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataSourceResponse create() {
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
    public ListDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataSourceResponseBody body);

        @Override
        ListDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataSourceResponse response) {
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
        public Builder body(ListDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataSourceResponse build() {
            return new ListDataSourceResponse(this);
        } 

    } 

}
