// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableColumnResponse} extends {@link TeaModel}
 *
 * <p>GetMetaTableColumnResponse</p>
 */
public class GetMetaTableColumnResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaTableColumnResponseBody body;

    private GetMetaTableColumnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaTableColumnResponse create() {
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
    public GetMetaTableColumnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaTableColumnResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaTableColumnResponseBody body);

        @Override
        GetMetaTableColumnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaTableColumnResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaTableColumnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaTableColumnResponse response) {
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
        public Builder body(GetMetaTableColumnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaTableColumnResponse build() {
            return new GetMetaTableColumnResponse(this);
        } 

    } 

}
