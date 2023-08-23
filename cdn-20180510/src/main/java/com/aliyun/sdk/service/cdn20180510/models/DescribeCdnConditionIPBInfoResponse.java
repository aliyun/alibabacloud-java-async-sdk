// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnConditionIPBInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnConditionIPBInfoResponse</p>
 */
public class DescribeCdnConditionIPBInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnConditionIPBInfoResponseBody body;

    private DescribeCdnConditionIPBInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnConditionIPBInfoResponse create() {
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
    public DescribeCdnConditionIPBInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnConditionIPBInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnConditionIPBInfoResponseBody body);

        @Override
        DescribeCdnConditionIPBInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnConditionIPBInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnConditionIPBInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnConditionIPBInfoResponse response) {
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
        public Builder body(DescribeCdnConditionIPBInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnConditionIPBInfoResponse build() {
            return new DescribeCdnConditionIPBInfoResponse(this);
        } 

    } 

}
