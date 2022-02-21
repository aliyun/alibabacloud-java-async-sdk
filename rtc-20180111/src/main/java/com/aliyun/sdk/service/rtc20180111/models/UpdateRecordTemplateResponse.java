// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRecordTemplateResponse} extends {@link TeaModel}
 *
 * <p>UpdateRecordTemplateResponse</p>
 */
public class UpdateRecordTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRecordTemplateResponseBody body;

    private UpdateRecordTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRecordTemplateResponse create() {
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
    public UpdateRecordTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRecordTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRecordTemplateResponseBody body);

        @Override
        UpdateRecordTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRecordTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRecordTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRecordTemplateResponse response) {
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
        public Builder body(UpdateRecordTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRecordTemplateResponse build() {
            return new UpdateRecordTemplateResponse(this);
        } 

    } 

}
