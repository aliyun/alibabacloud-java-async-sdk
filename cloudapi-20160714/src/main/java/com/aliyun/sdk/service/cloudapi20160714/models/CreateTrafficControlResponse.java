// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficControlResponse} extends {@link TeaModel}
 *
 * <p>CreateTrafficControlResponse</p>
 */
public class CreateTrafficControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTrafficControlResponseBody body;

    private CreateTrafficControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTrafficControlResponse create() {
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
    public CreateTrafficControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTrafficControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTrafficControlResponseBody body);

        @Override
        CreateTrafficControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTrafficControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTrafficControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTrafficControlResponse response) {
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
        public Builder body(CreateTrafficControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTrafficControlResponse build() {
            return new CreateTrafficControlResponse(this);
        } 

    } 

}
