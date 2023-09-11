// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKmsInstanceBindVpcResponse} extends {@link TeaModel}
 *
 * <p>UpdateKmsInstanceBindVpcResponse</p>
 */
public class UpdateKmsInstanceBindVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateKmsInstanceBindVpcResponseBody body;

    private UpdateKmsInstanceBindVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateKmsInstanceBindVpcResponse create() {
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
    public UpdateKmsInstanceBindVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateKmsInstanceBindVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateKmsInstanceBindVpcResponseBody body);

        @Override
        UpdateKmsInstanceBindVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateKmsInstanceBindVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateKmsInstanceBindVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateKmsInstanceBindVpcResponse response) {
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
        public Builder body(UpdateKmsInstanceBindVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateKmsInstanceBindVpcResponse build() {
            return new UpdateKmsInstanceBindVpcResponse(this);
        } 

    } 

}
