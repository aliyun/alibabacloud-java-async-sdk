// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainResponse} extends {@link TeaModel}
 *
 * <p>AddDomainResponse</p>
 */
public class AddDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDomainResponseBody body;

    private AddDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDomainResponse create() {
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
    public AddDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDomainResponseBody body);

        @Override
        AddDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDomainResponse response) {
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
        public Builder body(AddDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDomainResponse build() {
            return new AddDomainResponse(this);
        } 

    } 

}
