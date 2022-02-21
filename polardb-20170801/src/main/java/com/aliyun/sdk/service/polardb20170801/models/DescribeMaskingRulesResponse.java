// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMaskingRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeMaskingRulesResponse</p>
 */
public class DescribeMaskingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMaskingRulesResponseBody body;

    private DescribeMaskingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMaskingRulesResponse create() {
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
    public DescribeMaskingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMaskingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMaskingRulesResponseBody body);

        @Override
        DescribeMaskingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMaskingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMaskingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMaskingRulesResponse response) {
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
        public Builder body(DescribeMaskingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMaskingRulesResponse build() {
            return new DescribeMaskingRulesResponse(this);
        } 

    } 

}
