// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConcernNecessityResponse} extends {@link TeaModel}
 *
 * <p>DescribeConcernNecessityResponse</p>
 */
public class DescribeConcernNecessityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConcernNecessityResponseBody body;

    private DescribeConcernNecessityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConcernNecessityResponse create() {
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
    public DescribeConcernNecessityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConcernNecessityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConcernNecessityResponseBody body);

        @Override
        DescribeConcernNecessityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConcernNecessityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConcernNecessityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConcernNecessityResponse response) {
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
        public Builder body(DescribeConcernNecessityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConcernNecessityResponse build() {
            return new DescribeConcernNecessityResponse(this);
        } 

    } 

}
