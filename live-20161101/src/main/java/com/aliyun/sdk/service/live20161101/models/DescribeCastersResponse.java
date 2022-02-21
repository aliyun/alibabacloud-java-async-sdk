// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCastersResponse} extends {@link TeaModel}
 *
 * <p>DescribeCastersResponse</p>
 */
public class DescribeCastersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCastersResponseBody body;

    private DescribeCastersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCastersResponse create() {
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
    public DescribeCastersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCastersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCastersResponseBody body);

        @Override
        DescribeCastersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCastersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCastersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCastersResponse response) {
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
        public Builder body(DescribeCastersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCastersResponse build() {
            return new DescribeCastersResponse(this);
        } 

    } 

}
