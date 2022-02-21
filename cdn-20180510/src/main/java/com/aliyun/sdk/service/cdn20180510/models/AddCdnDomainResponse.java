// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCdnDomainResponse} extends {@link TeaModel}
 *
 * <p>AddCdnDomainResponse</p>
 */
public class AddCdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCdnDomainResponseBody body;

    private AddCdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCdnDomainResponse create() {
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
    public AddCdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCdnDomainResponseBody body);

        @Override
        AddCdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCdnDomainResponse response) {
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
        public Builder body(AddCdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCdnDomainResponse build() {
            return new AddCdnDomainResponse(this);
        } 

    } 

}
