// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCriteriaResponse} extends {@link TeaModel}
 *
 * <p>DescribeCriteriaResponse</p>
 */
public class DescribeCriteriaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCriteriaResponseBody body;

    private DescribeCriteriaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCriteriaResponse create() {
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
    public DescribeCriteriaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCriteriaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCriteriaResponseBody body);

        @Override
        DescribeCriteriaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCriteriaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCriteriaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCriteriaResponse response) {
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
        public Builder body(DescribeCriteriaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCriteriaResponse build() {
            return new DescribeCriteriaResponse(this);
        } 

    } 

}
