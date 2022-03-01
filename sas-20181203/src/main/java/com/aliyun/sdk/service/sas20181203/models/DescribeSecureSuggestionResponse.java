// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecureSuggestionResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecureSuggestionResponse</p>
 */
public class DescribeSecureSuggestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecureSuggestionResponseBody body;

    private DescribeSecureSuggestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecureSuggestionResponse create() {
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
    public DescribeSecureSuggestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecureSuggestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecureSuggestionResponseBody body);

        @Override
        DescribeSecureSuggestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecureSuggestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecureSuggestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecureSuggestionResponse response) {
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
        public Builder body(DescribeSecureSuggestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecureSuggestionResponse build() {
            return new DescribeSecureSuggestionResponse(this);
        } 

    } 

}
