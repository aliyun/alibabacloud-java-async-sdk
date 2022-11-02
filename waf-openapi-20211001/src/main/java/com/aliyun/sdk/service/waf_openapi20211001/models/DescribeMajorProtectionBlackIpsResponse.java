// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMajorProtectionBlackIpsResponse} extends {@link TeaModel}
 *
 * <p>DescribeMajorProtectionBlackIpsResponse</p>
 */
public class DescribeMajorProtectionBlackIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMajorProtectionBlackIpsResponseBody body;

    private DescribeMajorProtectionBlackIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMajorProtectionBlackIpsResponse create() {
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
    public DescribeMajorProtectionBlackIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMajorProtectionBlackIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMajorProtectionBlackIpsResponseBody body);

        @Override
        DescribeMajorProtectionBlackIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMajorProtectionBlackIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMajorProtectionBlackIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMajorProtectionBlackIpsResponse response) {
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
        public Builder body(DescribeMajorProtectionBlackIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMajorProtectionBlackIpsResponse build() {
            return new DescribeMajorProtectionBlackIpsResponse(this);
        } 

    } 

}
