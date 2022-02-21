// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddScdnDomainResponse} extends {@link TeaModel}
 *
 * <p>AddScdnDomainResponse</p>
 */
public class AddScdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddScdnDomainResponseBody body;

    private AddScdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddScdnDomainResponse create() {
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
    public AddScdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddScdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddScdnDomainResponseBody body);

        @Override
        AddScdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddScdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddScdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddScdnDomainResponse response) {
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
        public Builder body(AddScdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddScdnDomainResponse build() {
            return new AddScdnDomainResponse(this);
        } 

    } 

}
