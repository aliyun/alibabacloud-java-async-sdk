// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFineTuneJobResponse} extends {@link TeaModel}
 *
 * <p>CreateFineTuneJobResponse</p>
 */
public class CreateFineTuneJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFineTuneJobResponseBody body;

    private CreateFineTuneJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFineTuneJobResponse create() {
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
    public CreateFineTuneJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFineTuneJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFineTuneJobResponseBody body);

        @Override
        CreateFineTuneJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFineTuneJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFineTuneJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFineTuneJobResponse response) {
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
        public Builder body(CreateFineTuneJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFineTuneJobResponse build() {
            return new CreateFineTuneJobResponse(this);
        } 

    } 

}
