// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrTemplatesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCrTemplatesResponse</p>
 */
public class DescribeCrTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCrTemplatesResponseBody body;

    private DescribeCrTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCrTemplatesResponse create() {
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
    public DescribeCrTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCrTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCrTemplatesResponseBody body);

        @Override
        DescribeCrTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCrTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCrTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCrTemplatesResponse response) {
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
        public Builder body(DescribeCrTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCrTemplatesResponse build() {
            return new DescribeCrTemplatesResponse(this);
        } 

    } 

}
