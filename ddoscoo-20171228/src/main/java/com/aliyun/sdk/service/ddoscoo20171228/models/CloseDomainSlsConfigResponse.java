// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDomainSlsConfigResponse} extends {@link TeaModel}
 *
 * <p>CloseDomainSlsConfigResponse</p>
 */
public class CloseDomainSlsConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseDomainSlsConfigResponseBody body;

    private CloseDomainSlsConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseDomainSlsConfigResponse create() {
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
    public CloseDomainSlsConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseDomainSlsConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseDomainSlsConfigResponseBody body);

        @Override
        CloseDomainSlsConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseDomainSlsConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseDomainSlsConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseDomainSlsConfigResponse response) {
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
        public Builder body(CloseDomainSlsConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseDomainSlsConfigResponse build() {
            return new CloseDomainSlsConfigResponse(this);
        } 

    } 

}
