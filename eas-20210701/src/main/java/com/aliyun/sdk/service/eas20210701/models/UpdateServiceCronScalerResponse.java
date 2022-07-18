// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceCronScalerResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceCronScalerResponse</p>
 */
public class UpdateServiceCronScalerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServiceCronScalerResponseBody body;

    private UpdateServiceCronScalerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServiceCronScalerResponse create() {
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
    public UpdateServiceCronScalerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceCronScalerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServiceCronScalerResponseBody body);

        @Override
        UpdateServiceCronScalerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceCronScalerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServiceCronScalerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceCronScalerResponse response) {
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
        public Builder body(UpdateServiceCronScalerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceCronScalerResponse build() {
            return new UpdateServiceCronScalerResponse(this);
        } 

    } 

}
