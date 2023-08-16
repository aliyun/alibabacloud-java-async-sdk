// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReserveDomainResponse} extends {@link TeaModel}
 *
 * <p>ReserveDomainResponse</p>
 */
public class ReserveDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReserveDomainResponseBody body;

    private ReserveDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReserveDomainResponse create() {
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
    public ReserveDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReserveDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReserveDomainResponseBody body);

        @Override
        ReserveDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReserveDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReserveDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReserveDomainResponse response) {
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
        public Builder body(ReserveDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReserveDomainResponse build() {
            return new ReserveDomainResponse(this);
        } 

    } 

}
