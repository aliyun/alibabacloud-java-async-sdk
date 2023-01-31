// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeInstanceFromVbrResponse} extends {@link TeaModel}
 *
 * <p>RevokeInstanceFromVbrResponse</p>
 */
public class RevokeInstanceFromVbrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeInstanceFromVbrResponseBody body;

    private RevokeInstanceFromVbrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeInstanceFromVbrResponse create() {
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
    public RevokeInstanceFromVbrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeInstanceFromVbrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeInstanceFromVbrResponseBody body);

        @Override
        RevokeInstanceFromVbrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeInstanceFromVbrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeInstanceFromVbrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeInstanceFromVbrResponse response) {
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
        public Builder body(RevokeInstanceFromVbrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeInstanceFromVbrResponse build() {
            return new RevokeInstanceFromVbrResponse(this);
        } 

    } 

}
