// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpControlResponse} extends {@link TeaModel}
 *
 * <p>CreateIpControlResponse</p>
 */
public class CreateIpControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIpControlResponseBody body;

    private CreateIpControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIpControlResponse create() {
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
    public CreateIpControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIpControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIpControlResponseBody body);

        @Override
        CreateIpControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIpControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIpControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIpControlResponse response) {
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
        public Builder body(CreateIpControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIpControlResponse build() {
            return new CreateIpControlResponse(this);
        } 

    } 

}
