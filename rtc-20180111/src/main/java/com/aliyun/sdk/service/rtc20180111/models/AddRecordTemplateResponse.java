// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRecordTemplateResponse} extends {@link TeaModel}
 *
 * <p>AddRecordTemplateResponse</p>
 */
public class AddRecordTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRecordTemplateResponseBody body;

    private AddRecordTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRecordTemplateResponse create() {
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
    public AddRecordTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRecordTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRecordTemplateResponseBody body);

        @Override
        AddRecordTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRecordTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRecordTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRecordTemplateResponse response) {
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
        public Builder body(AddRecordTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRecordTemplateResponse build() {
            return new AddRecordTemplateResponse(this);
        } 

    } 

}
