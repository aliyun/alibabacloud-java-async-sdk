// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMaliciousNoteResponse} extends {@link TeaModel}
 *
 * <p>CreateMaliciousNoteResponse</p>
 */
public class CreateMaliciousNoteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMaliciousNoteResponseBody body;

    private CreateMaliciousNoteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMaliciousNoteResponse create() {
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
    public CreateMaliciousNoteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMaliciousNoteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMaliciousNoteResponseBody body);

        @Override
        CreateMaliciousNoteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMaliciousNoteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMaliciousNoteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMaliciousNoteResponse response) {
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
        public Builder body(CreateMaliciousNoteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMaliciousNoteResponse build() {
            return new CreateMaliciousNoteResponse(this);
        } 

    } 

}
