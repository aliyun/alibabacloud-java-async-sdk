// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DryRunSwaggerResponse} extends {@link TeaModel}
 *
 * <p>DryRunSwaggerResponse</p>
 */
public class DryRunSwaggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DryRunSwaggerResponseBody body;

    private DryRunSwaggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DryRunSwaggerResponse create() {
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
    public DryRunSwaggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DryRunSwaggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DryRunSwaggerResponseBody body);

        @Override
        DryRunSwaggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DryRunSwaggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DryRunSwaggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DryRunSwaggerResponse response) {
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
        public Builder body(DryRunSwaggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DryRunSwaggerResponse build() {
            return new DryRunSwaggerResponse(this);
        } 

    } 

}
