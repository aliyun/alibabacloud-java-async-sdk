// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDDLResponse} extends {@link TeaModel}
 *
 * <p>GetTableDDLResponse</p>
 */
public class GetTableDDLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableDDLResponseBody body;

    private GetTableDDLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableDDLResponse create() {
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
    public GetTableDDLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableDDLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableDDLResponseBody body);

        @Override
        GetTableDDLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableDDLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableDDLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableDDLResponse response) {
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
        public Builder body(GetTableDDLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableDDLResponse build() {
            return new GetTableDDLResponse(this);
        } 

    } 

}
