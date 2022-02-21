// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsUserInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribePdnsUserInfoResponse</p>
 */
public class DescribePdnsUserInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePdnsUserInfoResponseBody body;

    private DescribePdnsUserInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePdnsUserInfoResponse create() {
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
    public DescribePdnsUserInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePdnsUserInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePdnsUserInfoResponseBody body);

        @Override
        DescribePdnsUserInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePdnsUserInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePdnsUserInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePdnsUserInfoResponse response) {
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
        public Builder body(DescribePdnsUserInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePdnsUserInfoResponse build() {
            return new DescribePdnsUserInfoResponse(this);
        } 

    } 

}
