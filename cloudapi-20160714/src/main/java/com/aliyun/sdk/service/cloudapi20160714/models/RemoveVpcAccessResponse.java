// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVpcAccessResponse} extends {@link TeaModel}
 *
 * <p>RemoveVpcAccessResponse</p>
 */
public class RemoveVpcAccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveVpcAccessResponseBody body;

    private RemoveVpcAccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveVpcAccessResponse create() {
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
    public RemoveVpcAccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveVpcAccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveVpcAccessResponseBody body);

        @Override
        RemoveVpcAccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveVpcAccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveVpcAccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveVpcAccessResponse response) {
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
        public Builder body(RemoveVpcAccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveVpcAccessResponse build() {
            return new RemoveVpcAccessResponse(this);
        } 

    } 

}
