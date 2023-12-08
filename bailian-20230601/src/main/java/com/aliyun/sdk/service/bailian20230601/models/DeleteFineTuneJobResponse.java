// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFineTuneJobResponse} extends {@link TeaModel}
 *
 * <p>DeleteFineTuneJobResponse</p>
 */
public class DeleteFineTuneJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFineTuneJobResponseBody body;

    private DeleteFineTuneJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFineTuneJobResponse create() {
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
    public DeleteFineTuneJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFineTuneJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFineTuneJobResponseBody body);

        @Override
        DeleteFineTuneJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFineTuneJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFineTuneJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFineTuneJobResponse response) {
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
        public Builder body(DeleteFineTuneJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFineTuneJobResponse build() {
            return new DeleteFineTuneJobResponse(this);
        } 

    } 

}
