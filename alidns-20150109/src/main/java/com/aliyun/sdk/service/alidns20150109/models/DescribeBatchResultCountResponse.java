// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBatchResultCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeBatchResultCountResponse</p>
 */
public class DescribeBatchResultCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBatchResultCountResponseBody body;

    private DescribeBatchResultCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBatchResultCountResponse create() {
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
    public DescribeBatchResultCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBatchResultCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBatchResultCountResponseBody body);

        @Override
        DescribeBatchResultCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBatchResultCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBatchResultCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBatchResultCountResponse response) {
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
        public Builder body(DescribeBatchResultCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBatchResultCountResponse build() {
            return new DescribeBatchResultCountResponse(this);
        } 

    } 

}
