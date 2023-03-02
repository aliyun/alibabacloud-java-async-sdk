// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPCoSAuthorizedInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeMPCoSAuthorizedInfoResponse</p>
 */
public class DescribeMPCoSAuthorizedInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMPCoSAuthorizedInfoResponseBody body;

    private DescribeMPCoSAuthorizedInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMPCoSAuthorizedInfoResponse create() {
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
    public DescribeMPCoSAuthorizedInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMPCoSAuthorizedInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMPCoSAuthorizedInfoResponseBody body);

        @Override
        DescribeMPCoSAuthorizedInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMPCoSAuthorizedInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMPCoSAuthorizedInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMPCoSAuthorizedInfoResponse response) {
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
        public Builder body(DescribeMPCoSAuthorizedInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMPCoSAuthorizedInfoResponse build() {
            return new DescribeMPCoSAuthorizedInfoResponse(this);
        } 

    } 

}
