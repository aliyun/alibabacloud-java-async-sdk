// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationResponse} extends {@link TeaModel}
 *
 * <p>ListIntegrationResponse</p>
 */
public class ListIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntegrationResponseBody body;

    private ListIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntegrationResponse create() {
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
    public ListIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntegrationResponseBody body);

        @Override
        ListIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntegrationResponse response) {
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
        public Builder body(ListIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntegrationResponse build() {
            return new ListIntegrationResponse(this);
        } 

    } 

}
