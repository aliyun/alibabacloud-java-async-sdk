// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppendCasesResponse} extends {@link TeaModel}
 *
 * <p>AppendCasesResponse</p>
 */
public class AppendCasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AppendCasesResponseBody body;

    private AppendCasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AppendCasesResponse create() {
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
    public AppendCasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AppendCasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AppendCasesResponseBody body);

        @Override
        AppendCasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AppendCasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AppendCasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AppendCasesResponse response) {
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
        public Builder body(AppendCasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AppendCasesResponse build() {
            return new AppendCasesResponse(this);
        } 

    } 

}
