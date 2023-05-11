// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApiDatasourceResponse} extends {@link TeaModel}
 *
 * <p>ListApiDatasourceResponse</p>
 */
public class ListApiDatasourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApiDatasourceResponseBody body;

    private ListApiDatasourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApiDatasourceResponse create() {
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
    public ListApiDatasourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApiDatasourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApiDatasourceResponseBody body);

        @Override
        ListApiDatasourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApiDatasourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApiDatasourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApiDatasourceResponse response) {
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
        public Builder body(ListApiDatasourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApiDatasourceResponse build() {
            return new ListApiDatasourceResponse(this);
        } 

    } 

}
