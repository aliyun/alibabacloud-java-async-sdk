// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceResponse</p>
 */
public class GetInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceResponseBody body;

    private GetInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceResponse create() {
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
    public GetInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceResponseBody body);

        @Override
        GetInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceResponse response) {
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
        public Builder body(GetInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceResponse build() {
            return new GetInstanceResponse(this);
        } 

    } 

}
