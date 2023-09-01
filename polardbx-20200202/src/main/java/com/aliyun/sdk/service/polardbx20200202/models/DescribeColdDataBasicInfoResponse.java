// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColdDataBasicInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeColdDataBasicInfoResponse</p>
 */
public class DescribeColdDataBasicInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeColdDataBasicInfoResponseBody body;

    private DescribeColdDataBasicInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeColdDataBasicInfoResponse create() {
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
    public DescribeColdDataBasicInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeColdDataBasicInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeColdDataBasicInfoResponseBody body);

        @Override
        DescribeColdDataBasicInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeColdDataBasicInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeColdDataBasicInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeColdDataBasicInfoResponse response) {
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
        public Builder body(DescribeColdDataBasicInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeColdDataBasicInfoResponse build() {
            return new DescribeColdDataBasicInfoResponse(this);
        } 

    } 

}
