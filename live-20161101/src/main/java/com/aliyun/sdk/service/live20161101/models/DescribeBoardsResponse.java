// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBoardsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBoardsResponse</p>
 */
public class DescribeBoardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBoardsResponseBody body;

    private DescribeBoardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBoardsResponse create() {
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
    public DescribeBoardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBoardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBoardsResponseBody body);

        @Override
        DescribeBoardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBoardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBoardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBoardsResponse response) {
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
        public Builder body(DescribeBoardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBoardsResponse build() {
            return new DescribeBoardsResponse(this);
        } 

    } 

}
