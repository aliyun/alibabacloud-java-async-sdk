// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdnComputeDomainResponse} extends {@link TeaModel}
 *
 * <p>CreateCdnComputeDomainResponse</p>
 */
public class CreateCdnComputeDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCdnComputeDomainResponseBody body;

    private CreateCdnComputeDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCdnComputeDomainResponse create() {
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
    public CreateCdnComputeDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCdnComputeDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCdnComputeDomainResponseBody body);

        @Override
        CreateCdnComputeDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCdnComputeDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCdnComputeDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCdnComputeDomainResponse response) {
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
        public Builder body(CreateCdnComputeDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCdnComputeDomainResponse build() {
            return new CreateCdnComputeDomainResponse(this);
        } 

    } 

}
