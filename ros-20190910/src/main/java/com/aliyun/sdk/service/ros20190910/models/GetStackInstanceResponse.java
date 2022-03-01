// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetStackInstanceResponse</p>
 */
public class GetStackInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStackInstanceResponseBody body;

    private GetStackInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStackInstanceResponse create() {
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
    public GetStackInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStackInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStackInstanceResponseBody body);

        @Override
        GetStackInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStackInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStackInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStackInstanceResponse response) {
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
        public Builder body(GetStackInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStackInstanceResponse build() {
            return new GetStackInstanceResponse(this);
        } 

    } 

}
