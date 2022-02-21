// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVbrHaResponse} extends {@link TeaModel}
 *
 * <p>CreateVbrHaResponse</p>
 */
public class CreateVbrHaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVbrHaResponseBody body;

    private CreateVbrHaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVbrHaResponse create() {
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
    public CreateVbrHaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVbrHaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVbrHaResponseBody body);

        @Override
        CreateVbrHaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVbrHaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVbrHaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVbrHaResponse response) {
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
        public Builder body(CreateVbrHaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVbrHaResponse build() {
            return new CreateVbrHaResponse(this);
        } 

    } 

}
