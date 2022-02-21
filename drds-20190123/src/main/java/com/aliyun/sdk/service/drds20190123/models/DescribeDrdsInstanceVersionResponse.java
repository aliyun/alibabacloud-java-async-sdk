// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceVersionResponse</p>
 */
public class DescribeDrdsInstanceVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDrdsInstanceVersionResponseBody body;

    private DescribeDrdsInstanceVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDrdsInstanceVersionResponse create() {
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
    public DescribeDrdsInstanceVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDrdsInstanceVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDrdsInstanceVersionResponseBody body);

        @Override
        DescribeDrdsInstanceVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDrdsInstanceVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDrdsInstanceVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDrdsInstanceVersionResponse response) {
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
        public Builder body(DescribeDrdsInstanceVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDrdsInstanceVersionResponse build() {
            return new DescribeDrdsInstanceVersionResponse(this);
        } 

    } 

}
