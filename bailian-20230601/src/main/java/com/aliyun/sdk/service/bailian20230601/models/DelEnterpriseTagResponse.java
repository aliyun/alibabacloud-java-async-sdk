// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelEnterpriseTagResponse} extends {@link TeaModel}
 *
 * <p>DelEnterpriseTagResponse</p>
 */
public class DelEnterpriseTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DelEnterpriseTagResponseBody body;

    private DelEnterpriseTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DelEnterpriseTagResponse create() {
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
    public DelEnterpriseTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DelEnterpriseTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DelEnterpriseTagResponseBody body);

        @Override
        DelEnterpriseTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DelEnterpriseTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DelEnterpriseTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DelEnterpriseTagResponse response) {
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
        public Builder body(DelEnterpriseTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DelEnterpriseTagResponse build() {
            return new DelEnterpriseTagResponse(this);
        } 

    } 

}
