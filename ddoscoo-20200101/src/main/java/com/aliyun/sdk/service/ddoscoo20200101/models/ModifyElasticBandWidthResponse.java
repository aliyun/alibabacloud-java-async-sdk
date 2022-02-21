// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticBandWidthResponse} extends {@link TeaModel}
 *
 * <p>ModifyElasticBandWidthResponse</p>
 */
public class ModifyElasticBandWidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyElasticBandWidthResponseBody body;

    private ModifyElasticBandWidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyElasticBandWidthResponse create() {
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
    public ModifyElasticBandWidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyElasticBandWidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyElasticBandWidthResponseBody body);

        @Override
        ModifyElasticBandWidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyElasticBandWidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyElasticBandWidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyElasticBandWidthResponse response) {
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
        public Builder body(ModifyElasticBandWidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyElasticBandWidthResponse build() {
            return new ModifyElasticBandWidthResponse(this);
        } 

    } 

}
