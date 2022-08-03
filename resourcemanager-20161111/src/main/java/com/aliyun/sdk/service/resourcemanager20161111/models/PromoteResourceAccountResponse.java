// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PromoteResourceAccountResponse} extends {@link TeaModel}
 *
 * <p>PromoteResourceAccountResponse</p>
 */
public class PromoteResourceAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PromoteResourceAccountResponseBody body;

    private PromoteResourceAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PromoteResourceAccountResponse create() {
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
    public PromoteResourceAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PromoteResourceAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PromoteResourceAccountResponseBody body);

        @Override
        PromoteResourceAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PromoteResourceAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PromoteResourceAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PromoteResourceAccountResponse response) {
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
        public Builder body(PromoteResourceAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PromoteResourceAccountResponse build() {
            return new PromoteResourceAccountResponse(this);
        } 

    } 

}
