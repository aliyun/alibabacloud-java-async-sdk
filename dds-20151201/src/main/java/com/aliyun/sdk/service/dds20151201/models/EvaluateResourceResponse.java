// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateResourceResponse} extends {@link TeaModel}
 *
 * <p>EvaluateResourceResponse</p>
 */
public class EvaluateResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EvaluateResourceResponseBody body;

    private EvaluateResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EvaluateResourceResponse create() {
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
    public EvaluateResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EvaluateResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EvaluateResourceResponseBody body);

        @Override
        EvaluateResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EvaluateResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EvaluateResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EvaluateResourceResponse response) {
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
        public Builder body(EvaluateResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EvaluateResourceResponse build() {
            return new EvaluateResourceResponse(this);
        } 

    } 

}
