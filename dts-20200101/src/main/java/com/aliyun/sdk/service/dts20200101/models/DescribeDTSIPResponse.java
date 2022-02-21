// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDTSIPResponse} extends {@link TeaModel}
 *
 * <p>DescribeDTSIPResponse</p>
 */
public class DescribeDTSIPResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDTSIPResponseBody body;

    private DescribeDTSIPResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDTSIPResponse create() {
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
    public DescribeDTSIPResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDTSIPResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDTSIPResponseBody body);

        @Override
        DescribeDTSIPResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDTSIPResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDTSIPResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDTSIPResponse response) {
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
        public Builder body(DescribeDTSIPResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDTSIPResponse build() {
            return new DescribeDTSIPResponse(this);
        } 

    } 

}
