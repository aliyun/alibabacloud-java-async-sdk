// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EipFillParamsResponse} extends {@link TeaModel}
 *
 * <p>EipFillParamsResponse</p>
 */
public class EipFillParamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EipFillParamsResponseBody body;

    private EipFillParamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EipFillParamsResponse create() {
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
    public EipFillParamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EipFillParamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EipFillParamsResponseBody body);

        @Override
        EipFillParamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EipFillParamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EipFillParamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EipFillParamsResponse response) {
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
        public Builder body(EipFillParamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EipFillParamsResponse build() {
            return new EipFillParamsResponse(this);
        } 

    } 

}
