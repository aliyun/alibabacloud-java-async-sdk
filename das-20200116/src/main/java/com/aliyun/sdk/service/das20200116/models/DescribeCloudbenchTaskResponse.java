// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudbenchTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudbenchTaskResponse</p>
 */
public class DescribeCloudbenchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudbenchTaskResponseBody body;

    private DescribeCloudbenchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudbenchTaskResponse create() {
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
    public DescribeCloudbenchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudbenchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudbenchTaskResponseBody body);

        @Override
        DescribeCloudbenchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudbenchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudbenchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudbenchTaskResponse response) {
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
        public Builder body(DescribeCloudbenchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudbenchTaskResponse build() {
            return new DescribeCloudbenchTaskResponse(this);
        } 

    } 

}
