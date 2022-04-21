// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveGroupAuthorizationRuleToDNSServiceResponse} extends {@link TeaModel}
 *
 * <p>MoveGroupAuthorizationRuleToDNSServiceResponse</p>
 */
public class MoveGroupAuthorizationRuleToDNSServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveGroupAuthorizationRuleToDNSServiceResponseBody body;

    private MoveGroupAuthorizationRuleToDNSServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveGroupAuthorizationRuleToDNSServiceResponse create() {
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
    public MoveGroupAuthorizationRuleToDNSServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveGroupAuthorizationRuleToDNSServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveGroupAuthorizationRuleToDNSServiceResponseBody body);

        @Override
        MoveGroupAuthorizationRuleToDNSServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveGroupAuthorizationRuleToDNSServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveGroupAuthorizationRuleToDNSServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveGroupAuthorizationRuleToDNSServiceResponse response) {
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
        public Builder body(MoveGroupAuthorizationRuleToDNSServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveGroupAuthorizationRuleToDNSServiceResponse build() {
            return new MoveGroupAuthorizationRuleToDNSServiceResponse(this);
        } 

    } 

}
