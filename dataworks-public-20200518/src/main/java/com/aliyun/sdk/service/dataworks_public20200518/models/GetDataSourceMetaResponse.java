// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceMetaResponse} extends {@link TeaModel}
 *
 * <p>GetDataSourceMetaResponse</p>
 */
public class GetDataSourceMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataSourceMetaResponseBody body;

    private GetDataSourceMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataSourceMetaResponse create() {
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
    public GetDataSourceMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataSourceMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataSourceMetaResponseBody body);

        @Override
        GetDataSourceMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataSourceMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataSourceMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataSourceMetaResponse response) {
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
        public Builder body(GetDataSourceMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataSourceMetaResponse build() {
            return new GetDataSourceMetaResponse(this);
        } 

    } 

}
