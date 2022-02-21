// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpconnFromVbrResponse} extends {@link TeaModel}
 *
 * <p>CreateVpconnFromVbrResponse</p>
 */
public class CreateVpconnFromVbrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpconnFromVbrResponseBody body;

    private CreateVpconnFromVbrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpconnFromVbrResponse create() {
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
    public CreateVpconnFromVbrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpconnFromVbrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpconnFromVbrResponseBody body);

        @Override
        CreateVpconnFromVbrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpconnFromVbrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpconnFromVbrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpconnFromVbrResponse response) {
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
        public Builder body(CreateVpconnFromVbrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpconnFromVbrResponse build() {
            return new CreateVpconnFromVbrResponse(this);
        } 

    } 

}
