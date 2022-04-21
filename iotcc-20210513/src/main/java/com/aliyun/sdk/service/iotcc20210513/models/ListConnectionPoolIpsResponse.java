// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoolIpsResponse} extends {@link TeaModel}
 *
 * <p>ListConnectionPoolIpsResponse</p>
 */
public class ListConnectionPoolIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnectionPoolIpsResponseBody body;

    private ListConnectionPoolIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnectionPoolIpsResponse create() {
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
    public ListConnectionPoolIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnectionPoolIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnectionPoolIpsResponseBody body);

        @Override
        ListConnectionPoolIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnectionPoolIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnectionPoolIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnectionPoolIpsResponse response) {
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
        public Builder body(ListConnectionPoolIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnectionPoolIpsResponse build() {
            return new ListConnectionPoolIpsResponse(this);
        } 

    } 

}
