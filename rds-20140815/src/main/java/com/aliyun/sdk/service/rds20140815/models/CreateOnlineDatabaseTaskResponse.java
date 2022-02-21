// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOnlineDatabaseTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateOnlineDatabaseTaskResponse</p>
 */
public class CreateOnlineDatabaseTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOnlineDatabaseTaskResponseBody body;

    private CreateOnlineDatabaseTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOnlineDatabaseTaskResponse create() {
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
    public CreateOnlineDatabaseTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOnlineDatabaseTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOnlineDatabaseTaskResponseBody body);

        @Override
        CreateOnlineDatabaseTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOnlineDatabaseTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOnlineDatabaseTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOnlineDatabaseTaskResponse response) {
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
        public Builder body(CreateOnlineDatabaseTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOnlineDatabaseTaskResponse build() {
            return new CreateOnlineDatabaseTaskResponse(this);
        } 

    } 

}
