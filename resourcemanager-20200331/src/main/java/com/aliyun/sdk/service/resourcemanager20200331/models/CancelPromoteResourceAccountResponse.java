// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPromoteResourceAccountResponse} extends {@link TeaModel}
 *
 * <p>CancelPromoteResourceAccountResponse</p>
 */
public class CancelPromoteResourceAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelPromoteResourceAccountResponseBody body;

    private CancelPromoteResourceAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelPromoteResourceAccountResponse create() {
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
    public CancelPromoteResourceAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelPromoteResourceAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelPromoteResourceAccountResponseBody body);

        @Override
        CancelPromoteResourceAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelPromoteResourceAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelPromoteResourceAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelPromoteResourceAccountResponse response) {
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
        public Builder body(CancelPromoteResourceAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelPromoteResourceAccountResponse build() {
            return new CancelPromoteResourceAccountResponse(this);
        } 

    } 

}
