// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateABTestGroupResponse</p>
 */
public class CreateABTestGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateABTestGroupResponseBody body;

    private CreateABTestGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateABTestGroupResponse create() {
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
    public CreateABTestGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateABTestGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateABTestGroupResponseBody body);

        @Override
        CreateABTestGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateABTestGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateABTestGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateABTestGroupResponse response) {
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
        public Builder body(CreateABTestGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateABTestGroupResponse build() {
            return new CreateABTestGroupResponse(this);
        } 

    } 

}
