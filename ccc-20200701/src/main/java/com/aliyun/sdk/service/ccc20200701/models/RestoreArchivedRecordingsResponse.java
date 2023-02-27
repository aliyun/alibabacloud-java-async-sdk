// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreArchivedRecordingsResponse} extends {@link TeaModel}
 *
 * <p>RestoreArchivedRecordingsResponse</p>
 */
public class RestoreArchivedRecordingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestoreArchivedRecordingsResponseBody body;

    private RestoreArchivedRecordingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestoreArchivedRecordingsResponse create() {
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
    public RestoreArchivedRecordingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestoreArchivedRecordingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestoreArchivedRecordingsResponseBody body);

        @Override
        RestoreArchivedRecordingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestoreArchivedRecordingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestoreArchivedRecordingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestoreArchivedRecordingsResponse response) {
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
        public Builder body(RestoreArchivedRecordingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestoreArchivedRecordingsResponse build() {
            return new RestoreArchivedRecordingsResponse(this);
        } 

    } 

}
