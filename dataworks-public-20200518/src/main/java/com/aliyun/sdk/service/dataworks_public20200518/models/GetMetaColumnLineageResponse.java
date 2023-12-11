// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaColumnLineageResponse} extends {@link TeaModel}
 *
 * <p>GetMetaColumnLineageResponse</p>
 */
public class GetMetaColumnLineageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaColumnLineageResponseBody body;

    private GetMetaColumnLineageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaColumnLineageResponse create() {
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
    public GetMetaColumnLineageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaColumnLineageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaColumnLineageResponseBody body);

        @Override
        GetMetaColumnLineageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaColumnLineageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaColumnLineageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaColumnLineageResponse response) {
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
        public Builder body(GetMetaColumnLineageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaColumnLineageResponse build() {
            return new GetMetaColumnLineageResponse(this);
        } 

    } 

}
