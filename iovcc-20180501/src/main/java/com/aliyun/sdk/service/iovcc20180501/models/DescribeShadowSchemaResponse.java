// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShadowSchemaResponse} extends {@link TeaModel}
 *
 * <p>DescribeShadowSchemaResponse</p>
 */
public class DescribeShadowSchemaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeShadowSchemaResponseBody body;

    private DescribeShadowSchemaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeShadowSchemaResponse create() {
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
    public DescribeShadowSchemaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeShadowSchemaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeShadowSchemaResponseBody body);

        @Override
        DescribeShadowSchemaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeShadowSchemaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeShadowSchemaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeShadowSchemaResponse response) {
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
        public Builder body(DescribeShadowSchemaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeShadowSchemaResponse build() {
            return new DescribeShadowSchemaResponse(this);
        } 

    } 

}
