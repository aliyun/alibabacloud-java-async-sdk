// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDomainResponse} extends {@link TeaModel}
 *
 * <p>StopDomainResponse</p>
 */
public class StopDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDomainResponseBody body;

    private StopDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDomainResponse create() {
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
    public StopDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDomainResponseBody body);

        @Override
        StopDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDomainResponse response) {
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
        public Builder body(StopDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDomainResponse build() {
            return new StopDomainResponse(this);
        } 

    } 

}
