// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterScenesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCasterScenesResponse</p>
 */
public class DescribeCasterScenesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCasterScenesResponseBody body;

    private DescribeCasterScenesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCasterScenesResponse create() {
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
    public DescribeCasterScenesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCasterScenesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCasterScenesResponseBody body);

        @Override
        DescribeCasterScenesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCasterScenesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCasterScenesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCasterScenesResponse response) {
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
        public Builder body(DescribeCasterScenesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCasterScenesResponse build() {
            return new DescribeCasterScenesResponse(this);
        } 

    } 

}
