// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ADMiniCogResponse} extends {@link TeaModel}
 *
 * <p>ADMiniCogResponse</p>
 */
public class ADMiniCogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ADMiniCogResponseBody body;

    private ADMiniCogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ADMiniCogResponse create() {
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
    public ADMiniCogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ADMiniCogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ADMiniCogResponseBody body);

        @Override
        ADMiniCogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ADMiniCogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ADMiniCogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ADMiniCogResponse response) {
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
        public Builder body(ADMiniCogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ADMiniCogResponse build() {
            return new ADMiniCogResponse(this);
        } 

    } 

}
