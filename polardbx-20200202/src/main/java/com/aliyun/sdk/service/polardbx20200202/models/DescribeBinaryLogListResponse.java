// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBinaryLogListResponse} extends {@link TeaModel}
 *
 * <p>DescribeBinaryLogListResponse</p>
 */
public class DescribeBinaryLogListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBinaryLogListResponseBody body;

    private DescribeBinaryLogListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBinaryLogListResponse create() {
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
    public DescribeBinaryLogListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBinaryLogListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBinaryLogListResponseBody body);

        @Override
        DescribeBinaryLogListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBinaryLogListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBinaryLogListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBinaryLogListResponse response) {
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
        public Builder body(DescribeBinaryLogListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBinaryLogListResponse build() {
            return new DescribeBinaryLogListResponse(this);
        } 

    } 

}
