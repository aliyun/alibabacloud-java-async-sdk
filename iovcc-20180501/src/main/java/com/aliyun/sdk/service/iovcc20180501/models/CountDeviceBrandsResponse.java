// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDeviceBrandsResponse} extends {@link TeaModel}
 *
 * <p>CountDeviceBrandsResponse</p>
 */
public class CountDeviceBrandsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountDeviceBrandsResponseBody body;

    private CountDeviceBrandsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountDeviceBrandsResponse create() {
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
    public CountDeviceBrandsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountDeviceBrandsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountDeviceBrandsResponseBody body);

        @Override
        CountDeviceBrandsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountDeviceBrandsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountDeviceBrandsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountDeviceBrandsResponse response) {
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
        public Builder body(CountDeviceBrandsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountDeviceBrandsResponse build() {
            return new CountDeviceBrandsResponse(this);
        } 

    } 

}
