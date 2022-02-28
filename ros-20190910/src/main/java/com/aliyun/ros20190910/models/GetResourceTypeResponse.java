// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeResponse} extends {@link TeaModel}
 *
 * <p>GetResourceTypeResponse</p>
 */
public class GetResourceTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceTypeResponseBody body;

    private GetResourceTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceTypeResponse create() {
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
    public GetResourceTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceTypeResponseBody body);

        @Override
        GetResourceTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceTypeResponse response) {
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
        public Builder body(GetResourceTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceTypeResponse build() {
            return new GetResourceTypeResponse(this);
        } 

    } 

}
