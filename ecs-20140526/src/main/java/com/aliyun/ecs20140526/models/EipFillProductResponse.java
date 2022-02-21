// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EipFillProductResponse} extends {@link TeaModel}
 *
 * <p>EipFillProductResponse</p>
 */
public class EipFillProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EipFillProductResponseBody body;

    private EipFillProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EipFillProductResponse create() {
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
    public EipFillProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EipFillProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EipFillProductResponseBody body);

        @Override
        EipFillProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EipFillProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EipFillProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EipFillProductResponse response) {
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
        public Builder body(EipFillProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EipFillProductResponse build() {
            return new EipFillProductResponse(this);
        } 

    } 

}
