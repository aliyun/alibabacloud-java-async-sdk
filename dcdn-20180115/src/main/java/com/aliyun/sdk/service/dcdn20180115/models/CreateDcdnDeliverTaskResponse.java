// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnDeliverTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateDcdnDeliverTaskResponse</p>
 */
public class CreateDcdnDeliverTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDcdnDeliverTaskResponseBody body;

    private CreateDcdnDeliverTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDcdnDeliverTaskResponse create() {
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
    public CreateDcdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDcdnDeliverTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDcdnDeliverTaskResponseBody body);

        @Override
        CreateDcdnDeliverTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDcdnDeliverTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDcdnDeliverTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDcdnDeliverTaskResponse response) {
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
        public Builder body(CreateDcdnDeliverTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDcdnDeliverTaskResponse build() {
            return new CreateDcdnDeliverTaskResponse(this);
        } 

    } 

}
