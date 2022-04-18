// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataLimitResponse} extends {@link TeaModel}
 *
 * <p>CreateDataLimitResponse</p>
 */
public class CreateDataLimitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataLimitResponseBody body;

    private CreateDataLimitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataLimitResponse create() {
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
    public CreateDataLimitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataLimitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataLimitResponseBody body);

        @Override
        CreateDataLimitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataLimitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataLimitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataLimitResponse response) {
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
        public Builder body(CreateDataLimitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataLimitResponse build() {
            return new CreateDataLimitResponse(this);
        } 

    } 

}
