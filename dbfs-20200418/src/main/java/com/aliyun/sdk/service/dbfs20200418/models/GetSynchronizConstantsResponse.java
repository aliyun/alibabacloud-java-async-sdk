// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSynchronizConstantsResponse} extends {@link TeaModel}
 *
 * <p>GetSynchronizConstantsResponse</p>
 */
public class GetSynchronizConstantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSynchronizConstantsResponseBody body;

    private GetSynchronizConstantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSynchronizConstantsResponse create() {
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
    public GetSynchronizConstantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSynchronizConstantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSynchronizConstantsResponseBody body);

        @Override
        GetSynchronizConstantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSynchronizConstantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSynchronizConstantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSynchronizConstantsResponse response) {
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
        public Builder body(GetSynchronizConstantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSynchronizConstantsResponse build() {
            return new GetSynchronizConstantsResponse(this);
        } 

    } 

}
