// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMajorProtectionBlackIpResponse} extends {@link TeaModel}
 *
 * <p>CreateMajorProtectionBlackIpResponse</p>
 */
public class CreateMajorProtectionBlackIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMajorProtectionBlackIpResponseBody body;

    private CreateMajorProtectionBlackIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMajorProtectionBlackIpResponse create() {
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
    public CreateMajorProtectionBlackIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMajorProtectionBlackIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMajorProtectionBlackIpResponseBody body);

        @Override
        CreateMajorProtectionBlackIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMajorProtectionBlackIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMajorProtectionBlackIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMajorProtectionBlackIpResponse response) {
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
        public Builder body(CreateMajorProtectionBlackIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMajorProtectionBlackIpResponse build() {
            return new CreateMajorProtectionBlackIpResponse(this);
        } 

    } 

}
