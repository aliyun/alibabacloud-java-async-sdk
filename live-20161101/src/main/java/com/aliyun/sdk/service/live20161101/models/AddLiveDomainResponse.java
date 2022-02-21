// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveDomainResponse} extends {@link TeaModel}
 *
 * <p>AddLiveDomainResponse</p>
 */
public class AddLiveDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveDomainResponseBody body;

    private AddLiveDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveDomainResponse create() {
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
    public AddLiveDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveDomainResponseBody body);

        @Override
        AddLiveDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveDomainResponse response) {
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
        public Builder body(AddLiveDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveDomainResponse build() {
            return new AddLiveDomainResponse(this);
        } 

    } 

}
