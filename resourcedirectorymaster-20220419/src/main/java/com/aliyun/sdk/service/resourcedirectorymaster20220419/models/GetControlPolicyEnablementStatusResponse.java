// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetControlPolicyEnablementStatusResponse} extends {@link TeaModel}
 *
 * <p>GetControlPolicyEnablementStatusResponse</p>
 */
public class GetControlPolicyEnablementStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetControlPolicyEnablementStatusResponseBody body;

    private GetControlPolicyEnablementStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetControlPolicyEnablementStatusResponse create() {
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
    public GetControlPolicyEnablementStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetControlPolicyEnablementStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetControlPolicyEnablementStatusResponseBody body);

        @Override
        GetControlPolicyEnablementStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetControlPolicyEnablementStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetControlPolicyEnablementStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetControlPolicyEnablementStatusResponse response) {
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
        public Builder body(GetControlPolicyEnablementStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetControlPolicyEnablementStatusResponse build() {
            return new GetControlPolicyEnablementStatusResponse(this);
        } 

    } 

}
