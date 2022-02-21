// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLorneLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeLorneLogResponse</p>
 */
public class DescribeLorneLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLorneLogResponseBody body;

    private DescribeLorneLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLorneLogResponse create() {
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
    public DescribeLorneLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLorneLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLorneLogResponseBody body);

        @Override
        DescribeLorneLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLorneLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLorneLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLorneLogResponse response) {
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
        public Builder body(DescribeLorneLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLorneLogResponse build() {
            return new DescribeLorneLogResponse(this);
        } 

    } 

}
