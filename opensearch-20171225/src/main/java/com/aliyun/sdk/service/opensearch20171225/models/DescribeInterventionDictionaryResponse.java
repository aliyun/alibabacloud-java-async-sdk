// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInterventionDictionaryResponse} extends {@link TeaModel}
 *
 * <p>DescribeInterventionDictionaryResponse</p>
 */
public class DescribeInterventionDictionaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInterventionDictionaryResponseBody body;

    private DescribeInterventionDictionaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInterventionDictionaryResponse create() {
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
    public DescribeInterventionDictionaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInterventionDictionaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInterventionDictionaryResponseBody body);

        @Override
        DescribeInterventionDictionaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInterventionDictionaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInterventionDictionaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInterventionDictionaryResponse response) {
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
        public Builder body(DescribeInterventionDictionaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInterventionDictionaryResponse build() {
            return new DescribeInterventionDictionaryResponse(this);
        } 

    } 

}
