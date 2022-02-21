// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnSubTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateDcdnSubTaskResponse</p>
 */
public class CreateDcdnSubTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDcdnSubTaskResponseBody body;

    private CreateDcdnSubTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDcdnSubTaskResponse create() {
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
    public CreateDcdnSubTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDcdnSubTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDcdnSubTaskResponseBody body);

        @Override
        CreateDcdnSubTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDcdnSubTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDcdnSubTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDcdnSubTaskResponse response) {
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
        public Builder body(CreateDcdnSubTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDcdnSubTaskResponse build() {
            return new CreateDcdnSubTaskResponse(this);
        } 

    } 

}
