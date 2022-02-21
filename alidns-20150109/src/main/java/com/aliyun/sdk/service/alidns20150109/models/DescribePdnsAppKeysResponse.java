// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsAppKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribePdnsAppKeysResponse</p>
 */
public class DescribePdnsAppKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePdnsAppKeysResponseBody body;

    private DescribePdnsAppKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePdnsAppKeysResponse create() {
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
    public DescribePdnsAppKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePdnsAppKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePdnsAppKeysResponseBody body);

        @Override
        DescribePdnsAppKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePdnsAppKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePdnsAppKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePdnsAppKeysResponse response) {
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
        public Builder body(DescribePdnsAppKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePdnsAppKeysResponse build() {
            return new DescribePdnsAppKeysResponse(this);
        } 

    } 

}
