// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileDetectResponse} extends {@link TeaModel}
 *
 * <p>CreateFileDetectResponse</p>
 */
public class CreateFileDetectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFileDetectResponseBody body;

    private CreateFileDetectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFileDetectResponse create() {
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
    public CreateFileDetectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFileDetectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFileDetectResponseBody body);

        @Override
        CreateFileDetectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFileDetectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFileDetectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFileDetectResponse response) {
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
        public Builder body(CreateFileDetectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFileDetectResponse build() {
            return new CreateFileDetectResponse(this);
        } 

    } 

}
