// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDLAServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeDLAServiceResponse</p>
 */
public class DescribeDLAServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDLAServiceResponseBody body;

    private DescribeDLAServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDLAServiceResponse create() {
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
    public DescribeDLAServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDLAServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDLAServiceResponseBody body);

        @Override
        DescribeDLAServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDLAServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDLAServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDLAServiceResponse response) {
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
        public Builder body(DescribeDLAServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDLAServiceResponse build() {
            return new DescribeDLAServiceResponse(this);
        } 

    } 

}
