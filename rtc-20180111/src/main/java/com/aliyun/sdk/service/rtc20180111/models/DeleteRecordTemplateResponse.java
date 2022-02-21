// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRecordTemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteRecordTemplateResponse</p>
 */
public class DeleteRecordTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRecordTemplateResponseBody body;

    private DeleteRecordTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRecordTemplateResponse create() {
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
    public DeleteRecordTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRecordTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRecordTemplateResponseBody body);

        @Override
        DeleteRecordTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRecordTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRecordTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRecordTemplateResponse response) {
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
        public Builder body(DeleteRecordTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRecordTemplateResponse build() {
            return new DeleteRecordTemplateResponse(this);
        } 

    } 

}
