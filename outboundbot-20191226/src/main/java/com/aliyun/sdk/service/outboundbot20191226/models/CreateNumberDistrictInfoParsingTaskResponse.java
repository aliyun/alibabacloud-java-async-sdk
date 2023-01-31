// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNumberDistrictInfoParsingTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateNumberDistrictInfoParsingTaskResponse</p>
 */
public class CreateNumberDistrictInfoParsingTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNumberDistrictInfoParsingTaskResponseBody body;

    private CreateNumberDistrictInfoParsingTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNumberDistrictInfoParsingTaskResponse create() {
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
    public CreateNumberDistrictInfoParsingTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNumberDistrictInfoParsingTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNumberDistrictInfoParsingTaskResponseBody body);

        @Override
        CreateNumberDistrictInfoParsingTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNumberDistrictInfoParsingTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNumberDistrictInfoParsingTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNumberDistrictInfoParsingTaskResponse response) {
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
        public Builder body(CreateNumberDistrictInfoParsingTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNumberDistrictInfoParsingTaskResponse build() {
            return new CreateNumberDistrictInfoParsingTaskResponse(this);
        } 

    } 

}
