// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeLogResponse} extends {@link TeaModel}
 *
 * <p>GetChangeLogResponse</p>
 */
public class GetChangeLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChangeLogResponseBody body;

    private GetChangeLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChangeLogResponse create() {
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
    public GetChangeLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChangeLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChangeLogResponseBody body);

        @Override
        GetChangeLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChangeLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChangeLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChangeLogResponse response) {
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
        public Builder body(GetChangeLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChangeLogResponse build() {
            return new GetChangeLogResponse(this);
        } 

    } 

}
