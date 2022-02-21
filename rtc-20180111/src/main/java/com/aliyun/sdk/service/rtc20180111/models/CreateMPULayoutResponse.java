// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMPULayoutResponse} extends {@link TeaModel}
 *
 * <p>CreateMPULayoutResponse</p>
 */
public class CreateMPULayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMPULayoutResponseBody body;

    private CreateMPULayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMPULayoutResponse create() {
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
    public CreateMPULayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMPULayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMPULayoutResponseBody body);

        @Override
        CreateMPULayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMPULayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMPULayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMPULayoutResponse response) {
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
        public Builder body(CreateMPULayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMPULayoutResponse build() {
            return new CreateMPULayoutResponse(this);
        } 

    } 

}
