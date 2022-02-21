// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntranetDomainResponse} extends {@link TeaModel}
 *
 * <p>CreateIntranetDomainResponse</p>
 */
public class CreateIntranetDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIntranetDomainResponseBody body;

    private CreateIntranetDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIntranetDomainResponse create() {
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
    public CreateIntranetDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIntranetDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIntranetDomainResponseBody body);

        @Override
        CreateIntranetDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIntranetDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIntranetDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIntranetDomainResponse response) {
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
        public Builder body(CreateIntranetDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIntranetDomainResponse build() {
            return new CreateIntranetDomainResponse(this);
        } 

    } 

}
