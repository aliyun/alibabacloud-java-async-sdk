// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMainDomainNameResponse} extends {@link TeaModel}
 *
 * <p>GetMainDomainNameResponse</p>
 */
public class GetMainDomainNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMainDomainNameResponseBody body;

    private GetMainDomainNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMainDomainNameResponse create() {
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
    public GetMainDomainNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMainDomainNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMainDomainNameResponseBody body);

        @Override
        GetMainDomainNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMainDomainNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMainDomainNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMainDomainNameResponse response) {
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
        public Builder body(GetMainDomainNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMainDomainNameResponse build() {
            return new GetMainDomainNameResponse(this);
        } 

    } 

}
