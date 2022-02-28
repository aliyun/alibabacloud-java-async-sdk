// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcHoneyPotResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcHoneyPotResponse</p>
 */
public class DeleteVpcHoneyPotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpcHoneyPotResponseBody body;

    private DeleteVpcHoneyPotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpcHoneyPotResponse create() {
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
    public DeleteVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpcHoneyPotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpcHoneyPotResponseBody body);

        @Override
        DeleteVpcHoneyPotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpcHoneyPotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpcHoneyPotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpcHoneyPotResponse response) {
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
        public Builder body(DeleteVpcHoneyPotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpcHoneyPotResponse build() {
            return new DeleteVpcHoneyPotResponse(this);
        } 

    } 

}
