// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCdnDomainResponse} extends {@link TeaModel}
 *
 * <p>StopCdnDomainResponse</p>
 */
public class StopCdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopCdnDomainResponseBody body;

    private StopCdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopCdnDomainResponse create() {
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
    public StopCdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopCdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopCdnDomainResponseBody body);

        @Override
        StopCdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopCdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopCdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopCdnDomainResponse response) {
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
        public Builder body(StopCdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopCdnDomainResponse build() {
            return new StopCdnDomainResponse(this);
        } 

    } 

}
