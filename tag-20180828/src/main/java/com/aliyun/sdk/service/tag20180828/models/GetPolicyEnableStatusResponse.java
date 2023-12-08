// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyEnableStatusResponse} extends {@link TeaModel}
 *
 * <p>GetPolicyEnableStatusResponse</p>
 */
public class GetPolicyEnableStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPolicyEnableStatusResponseBody body;

    private GetPolicyEnableStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPolicyEnableStatusResponse create() {
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
    public GetPolicyEnableStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPolicyEnableStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPolicyEnableStatusResponseBody body);

        @Override
        GetPolicyEnableStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPolicyEnableStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPolicyEnableStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPolicyEnableStatusResponse response) {
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
        public Builder body(GetPolicyEnableStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPolicyEnableStatusResponse build() {
            return new GetPolicyEnableStatusResponse(this);
        } 

    } 

}
