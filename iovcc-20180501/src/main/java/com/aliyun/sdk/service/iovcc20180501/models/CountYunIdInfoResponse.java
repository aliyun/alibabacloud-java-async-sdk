// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountYunIdInfoResponse} extends {@link TeaModel}
 *
 * <p>CountYunIdInfoResponse</p>
 */
public class CountYunIdInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountYunIdInfoResponseBody body;

    private CountYunIdInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountYunIdInfoResponse create() {
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
    public CountYunIdInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountYunIdInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountYunIdInfoResponseBody body);

        @Override
        CountYunIdInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountYunIdInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountYunIdInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountYunIdInfoResponse response) {
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
        public Builder body(CountYunIdInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountYunIdInfoResponse build() {
            return new CountYunIdInfoResponse(this);
        } 

    } 

}
