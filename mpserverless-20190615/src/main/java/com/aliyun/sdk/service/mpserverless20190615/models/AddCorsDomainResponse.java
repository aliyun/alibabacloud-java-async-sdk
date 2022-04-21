// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCorsDomainResponse} extends {@link TeaModel}
 *
 * <p>AddCorsDomainResponse</p>
 */
public class AddCorsDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCorsDomainResponseBody body;

    private AddCorsDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCorsDomainResponse create() {
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
    public AddCorsDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCorsDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCorsDomainResponseBody body);

        @Override
        AddCorsDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCorsDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCorsDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCorsDomainResponse response) {
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
        public Builder body(AddCorsDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCorsDomainResponse build() {
            return new AddCorsDomainResponse(this);
        } 

    } 

}
