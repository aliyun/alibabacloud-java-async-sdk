// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrivesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDrivesResponse</p>
 */
public class DescribeDrivesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDrivesResponseBody body;

    private DescribeDrivesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDrivesResponse create() {
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
    public DescribeDrivesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDrivesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDrivesResponseBody body);

        @Override
        DescribeDrivesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDrivesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDrivesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDrivesResponse response) {
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
        public Builder body(DescribeDrivesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDrivesResponse build() {
            return new DescribeDrivesResponse(this);
        } 

    } 

}
