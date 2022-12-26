// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomBlockRecordResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomBlockRecordResponse</p>
 */
public class CreateCustomBlockRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomBlockRecordResponseBody body;

    private CreateCustomBlockRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomBlockRecordResponse create() {
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
    public CreateCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomBlockRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomBlockRecordResponseBody body);

        @Override
        CreateCustomBlockRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomBlockRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomBlockRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomBlockRecordResponse response) {
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
        public Builder body(CreateCustomBlockRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomBlockRecordResponse build() {
            return new CreateCustomBlockRecordResponse(this);
        } 

    } 

}
