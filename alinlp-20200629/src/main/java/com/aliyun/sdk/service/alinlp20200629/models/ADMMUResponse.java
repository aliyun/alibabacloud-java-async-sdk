// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ADMMUResponse} extends {@link TeaModel}
 *
 * <p>ADMMUResponse</p>
 */
public class ADMMUResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ADMMUResponseBody body;

    private ADMMUResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ADMMUResponse create() {
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
    public ADMMUResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ADMMUResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ADMMUResponseBody body);

        @Override
        ADMMUResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ADMMUResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ADMMUResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ADMMUResponse response) {
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
        public Builder body(ADMMUResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ADMMUResponse build() {
            return new ADMMUResponse(this);
        } 

    } 

}
