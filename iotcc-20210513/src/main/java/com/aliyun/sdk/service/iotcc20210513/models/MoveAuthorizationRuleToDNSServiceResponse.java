// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveAuthorizationRuleToDNSServiceResponse} extends {@link TeaModel}
 *
 * <p>MoveAuthorizationRuleToDNSServiceResponse</p>
 */
public class MoveAuthorizationRuleToDNSServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveAuthorizationRuleToDNSServiceResponseBody body;

    private MoveAuthorizationRuleToDNSServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveAuthorizationRuleToDNSServiceResponse create() {
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
    public MoveAuthorizationRuleToDNSServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveAuthorizationRuleToDNSServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveAuthorizationRuleToDNSServiceResponseBody body);

        @Override
        MoveAuthorizationRuleToDNSServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveAuthorizationRuleToDNSServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveAuthorizationRuleToDNSServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveAuthorizationRuleToDNSServiceResponse response) {
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
        public Builder body(MoveAuthorizationRuleToDNSServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveAuthorizationRuleToDNSServiceResponse build() {
            return new MoveAuthorizationRuleToDNSServiceResponse(this);
        } 

    } 

}
