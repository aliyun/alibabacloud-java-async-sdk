// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomDomainResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomDomainResponse</p>
 */
public class CreateCustomDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CustomDomain body;

    private CreateCustomDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomDomainResponse create() {
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
    public CustomDomain getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CustomDomain body);

        @Override
        CreateCustomDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CustomDomain body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomDomainResponse response) {
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
        public Builder body(CustomDomain body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomDomainResponse build() {
            return new CreateCustomDomainResponse(this);
        } 

    } 

}
