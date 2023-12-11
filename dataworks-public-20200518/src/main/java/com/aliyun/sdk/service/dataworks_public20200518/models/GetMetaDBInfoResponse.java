// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDBInfoResponse} extends {@link TeaModel}
 *
 * <p>GetMetaDBInfoResponse</p>
 */
public class GetMetaDBInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaDBInfoResponseBody body;

    private GetMetaDBInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaDBInfoResponse create() {
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
    public GetMetaDBInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaDBInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaDBInfoResponseBody body);

        @Override
        GetMetaDBInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaDBInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaDBInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaDBInfoResponse response) {
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
        public Builder body(GetMetaDBInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaDBInfoResponse build() {
            return new GetMetaDBInfoResponse(this);
        } 

    } 

}
