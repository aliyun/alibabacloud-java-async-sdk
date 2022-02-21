// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDbscResponse} extends {@link TeaModel}
 *
 * <p>CreateDbscResponse</p>
 */
public class CreateDbscResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDbscResponseBody body;

    private CreateDbscResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDbscResponse create() {
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
    public CreateDbscResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDbscResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDbscResponseBody body);

        @Override
        CreateDbscResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDbscResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDbscResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDbscResponse response) {
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
        public Builder body(CreateDbscResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDbscResponse build() {
            return new CreateDbscResponse(this);
        } 

    } 

}
