// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyVersionResponse} extends {@link TeaModel}
 *
 * <p>GetPolicyVersionResponse</p>
 */
public class GetPolicyVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPolicyVersionResponseBody body;

    private GetPolicyVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPolicyVersionResponse create() {
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
    public GetPolicyVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPolicyVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPolicyVersionResponseBody body);

        @Override
        GetPolicyVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPolicyVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPolicyVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPolicyVersionResponse response) {
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
        public Builder body(GetPolicyVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPolicyVersionResponse build() {
            return new GetPolicyVersionResponse(this);
        } 

    } 

}
