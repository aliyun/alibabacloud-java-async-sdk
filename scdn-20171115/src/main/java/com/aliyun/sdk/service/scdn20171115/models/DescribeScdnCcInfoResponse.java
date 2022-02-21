// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnCcInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeScdnCcInfoResponse</p>
 */
public class DescribeScdnCcInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScdnCcInfoResponseBody body;

    private DescribeScdnCcInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScdnCcInfoResponse create() {
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
    public DescribeScdnCcInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScdnCcInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScdnCcInfoResponseBody body);

        @Override
        DescribeScdnCcInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScdnCcInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScdnCcInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScdnCcInfoResponse response) {
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
        public Builder body(DescribeScdnCcInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScdnCcInfoResponse build() {
            return new DescribeScdnCcInfoResponse(this);
        } 

    } 

}
