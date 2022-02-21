// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListAttributesResponse} extends {@link TeaModel}
 *
 * <p>DescribePrefixListAttributesResponse</p>
 */
public class DescribePrefixListAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePrefixListAttributesResponseBody body;

    private DescribePrefixListAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePrefixListAttributesResponse create() {
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
    public DescribePrefixListAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePrefixListAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePrefixListAttributesResponseBody body);

        @Override
        DescribePrefixListAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePrefixListAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePrefixListAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePrefixListAttributesResponse response) {
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
        public Builder body(DescribePrefixListAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePrefixListAttributesResponse build() {
            return new DescribePrefixListAttributesResponse(this);
        } 

    } 

}
