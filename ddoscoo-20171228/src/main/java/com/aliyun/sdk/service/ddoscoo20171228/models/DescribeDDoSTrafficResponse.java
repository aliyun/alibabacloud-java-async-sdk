// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDoSTrafficResponse} extends {@link TeaModel}
 *
 * <p>DescribeDDoSTrafficResponse</p>
 */
public class DescribeDDoSTrafficResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDDoSTrafficResponseBody body;

    private DescribeDDoSTrafficResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDDoSTrafficResponse create() {
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
    public DescribeDDoSTrafficResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDDoSTrafficResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDDoSTrafficResponseBody body);

        @Override
        DescribeDDoSTrafficResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDDoSTrafficResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDDoSTrafficResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDDoSTrafficResponse response) {
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
        public Builder body(DescribeDDoSTrafficResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDDoSTrafficResponse build() {
            return new DescribeDDoSTrafficResponse(this);
        } 

    } 

}
