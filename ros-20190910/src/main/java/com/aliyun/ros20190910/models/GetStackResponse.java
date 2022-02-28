// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackResponse} extends {@link TeaModel}
 *
 * <p>GetStackResponse</p>
 */
public class GetStackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStackResponseBody body;

    private GetStackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStackResponse create() {
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
    public GetStackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStackResponseBody body);

        @Override
        GetStackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStackResponse response) {
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
        public Builder body(GetStackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStackResponse build() {
            return new GetStackResponse(this);
        } 

    } 

}
