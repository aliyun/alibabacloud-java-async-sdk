// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppVersionReleaseNoteResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppVersionReleaseNoteResponse</p>
 */
public class UpdateAppVersionReleaseNoteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppVersionReleaseNoteResponseBody body;

    private UpdateAppVersionReleaseNoteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppVersionReleaseNoteResponse create() {
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
    public UpdateAppVersionReleaseNoteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppVersionReleaseNoteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppVersionReleaseNoteResponseBody body);

        @Override
        UpdateAppVersionReleaseNoteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppVersionReleaseNoteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppVersionReleaseNoteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppVersionReleaseNoteResponse response) {
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
        public Builder body(UpdateAppVersionReleaseNoteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppVersionReleaseNoteResponse build() {
            return new UpdateAppVersionReleaseNoteResponse(this);
        } 

    } 

}
