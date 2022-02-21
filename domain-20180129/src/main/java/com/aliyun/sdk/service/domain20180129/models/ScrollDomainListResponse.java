// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScrollDomainListResponse} extends {@link TeaModel}
 *
 * <p>ScrollDomainListResponse</p>
 */
public class ScrollDomainListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ScrollDomainListResponseBody body;

    private ScrollDomainListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ScrollDomainListResponse create() {
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
    public ScrollDomainListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScrollDomainListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ScrollDomainListResponseBody body);

        @Override
        ScrollDomainListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScrollDomainListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ScrollDomainListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScrollDomainListResponse response) {
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
        public Builder body(ScrollDomainListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScrollDomainListResponse build() {
            return new ScrollDomainListResponse(this);
        } 

    } 

}
