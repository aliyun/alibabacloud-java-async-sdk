// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMirrorFilterResponse} extends {@link TeaModel}
 *
 * <p>CreateTrafficMirrorFilterResponse</p>
 */
public class CreateTrafficMirrorFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTrafficMirrorFilterResponseBody body;

    private CreateTrafficMirrorFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTrafficMirrorFilterResponse create() {
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
    public CreateTrafficMirrorFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTrafficMirrorFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTrafficMirrorFilterResponseBody body);

        @Override
        CreateTrafficMirrorFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTrafficMirrorFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTrafficMirrorFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTrafficMirrorFilterResponse response) {
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
        public Builder body(CreateTrafficMirrorFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTrafficMirrorFilterResponse build() {
            return new CreateTrafficMirrorFilterResponse(this);
        } 

    } 

}
