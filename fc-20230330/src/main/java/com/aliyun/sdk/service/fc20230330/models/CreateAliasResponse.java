// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAliasResponse} extends {@link TeaModel}
 *
 * <p>CreateAliasResponse</p>
 */
public class CreateAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Alias body;

    private CreateAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAliasResponse create() {
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
    public Alias getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Alias body);

        @Override
        CreateAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Alias body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAliasResponse response) {
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
        public Builder body(Alias body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAliasResponse build() {
            return new CreateAliasResponse(this);
        } 

    } 

}
