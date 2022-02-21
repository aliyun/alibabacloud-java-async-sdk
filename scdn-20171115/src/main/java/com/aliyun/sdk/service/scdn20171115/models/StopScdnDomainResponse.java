// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopScdnDomainResponse} extends {@link TeaModel}
 *
 * <p>StopScdnDomainResponse</p>
 */
public class StopScdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopScdnDomainResponseBody body;

    private StopScdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopScdnDomainResponse create() {
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
    public StopScdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopScdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopScdnDomainResponseBody body);

        @Override
        StopScdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopScdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopScdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopScdnDomainResponse response) {
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
        public Builder body(StopScdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopScdnDomainResponse build() {
            return new StopScdnDomainResponse(this);
        } 

    } 

}
