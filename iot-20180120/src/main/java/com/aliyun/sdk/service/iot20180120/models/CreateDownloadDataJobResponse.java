// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadDataJobResponse} extends {@link TeaModel}
 *
 * <p>CreateDownloadDataJobResponse</p>
 */
public class CreateDownloadDataJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDownloadDataJobResponseBody body;

    private CreateDownloadDataJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDownloadDataJobResponse create() {
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
    public CreateDownloadDataJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDownloadDataJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDownloadDataJobResponseBody body);

        @Override
        CreateDownloadDataJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDownloadDataJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDownloadDataJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDownloadDataJobResponse response) {
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
        public Builder body(CreateDownloadDataJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDownloadDataJobResponse build() {
            return new CreateDownloadDataJobResponse(this);
        } 

    } 

}
