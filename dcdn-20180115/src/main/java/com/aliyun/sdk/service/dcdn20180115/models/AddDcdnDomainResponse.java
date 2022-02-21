// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDcdnDomainResponse} extends {@link TeaModel}
 *
 * <p>AddDcdnDomainResponse</p>
 */
public class AddDcdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDcdnDomainResponseBody body;

    private AddDcdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDcdnDomainResponse create() {
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
    public AddDcdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDcdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDcdnDomainResponseBody body);

        @Override
        AddDcdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDcdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDcdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDcdnDomainResponse response) {
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
        public Builder body(AddDcdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDcdnDomainResponse build() {
            return new AddDcdnDomainResponse(this);
        } 

    } 

}
