// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBResponse} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBResponse</p>
 */
public class DescribeDrdsDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDrdsDBResponseBody body;

    private DescribeDrdsDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDrdsDBResponse create() {
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
    public DescribeDrdsDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDrdsDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDrdsDBResponseBody body);

        @Override
        DescribeDrdsDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDrdsDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDrdsDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDrdsDBResponse response) {
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
        public Builder body(DescribeDrdsDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDrdsDBResponse build() {
            return new DescribeDrdsDBResponse(this);
        } 

    } 

}
