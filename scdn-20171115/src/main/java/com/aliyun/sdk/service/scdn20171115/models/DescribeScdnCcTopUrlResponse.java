// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnCcTopUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeScdnCcTopUrlResponse</p>
 */
public class DescribeScdnCcTopUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScdnCcTopUrlResponseBody body;

    private DescribeScdnCcTopUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScdnCcTopUrlResponse create() {
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
    public DescribeScdnCcTopUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScdnCcTopUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScdnCcTopUrlResponseBody body);

        @Override
        DescribeScdnCcTopUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScdnCcTopUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScdnCcTopUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScdnCcTopUrlResponse response) {
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
        public Builder body(DescribeScdnCcTopUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScdnCcTopUrlResponse build() {
            return new DescribeScdnCcTopUrlResponse(this);
        } 

    } 

}
