// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsVersionReleaseNoteResponse} extends {@link TeaModel}
 *
 * <p>UpdateOsVersionReleaseNoteResponse</p>
 */
public class UpdateOsVersionReleaseNoteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOsVersionReleaseNoteResponseBody body;

    private UpdateOsVersionReleaseNoteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOsVersionReleaseNoteResponse create() {
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
    public UpdateOsVersionReleaseNoteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOsVersionReleaseNoteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOsVersionReleaseNoteResponseBody body);

        @Override
        UpdateOsVersionReleaseNoteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOsVersionReleaseNoteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOsVersionReleaseNoteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOsVersionReleaseNoteResponse response) {
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
        public Builder body(UpdateOsVersionReleaseNoteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOsVersionReleaseNoteResponse build() {
            return new UpdateOsVersionReleaseNoteResponse(this);
        } 

    } 

}
