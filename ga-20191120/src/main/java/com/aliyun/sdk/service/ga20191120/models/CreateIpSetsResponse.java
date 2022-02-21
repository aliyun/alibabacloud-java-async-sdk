// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpSetsResponse} extends {@link TeaModel}
 *
 * <p>CreateIpSetsResponse</p>
 */
public class CreateIpSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIpSetsResponseBody body;

    private CreateIpSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIpSetsResponse create() {
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
    public CreateIpSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIpSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIpSetsResponseBody body);

        @Override
        CreateIpSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIpSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIpSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIpSetsResponse response) {
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
        public Builder body(CreateIpSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIpSetsResponse build() {
            return new CreateIpSetsResponse(this);
        } 

    } 

}
