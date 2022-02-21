// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSummariesResponse} extends {@link TeaModel}
 *
 * <p>UpdateSummariesResponse</p>
 */
public class UpdateSummariesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSummariesResponseBody body;

    private UpdateSummariesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSummariesResponse create() {
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
    public UpdateSummariesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSummariesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSummariesResponseBody body);

        @Override
        UpdateSummariesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSummariesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSummariesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSummariesResponse response) {
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
        public Builder body(UpdateSummariesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSummariesResponse build() {
            return new UpdateSummariesResponse(this);
        } 

    } 

}
