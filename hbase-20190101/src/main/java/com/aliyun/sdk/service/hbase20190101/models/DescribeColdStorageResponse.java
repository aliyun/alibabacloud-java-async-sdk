// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColdStorageResponse} extends {@link TeaModel}
 *
 * <p>DescribeColdStorageResponse</p>
 */
public class DescribeColdStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeColdStorageResponseBody body;

    private DescribeColdStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeColdStorageResponse create() {
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
    public DescribeColdStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeColdStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeColdStorageResponseBody body);

        @Override
        DescribeColdStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeColdStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeColdStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeColdStorageResponse response) {
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
        public Builder body(DescribeColdStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeColdStorageResponse build() {
            return new DescribeColdStorageResponse(this);
        } 

    } 

}
