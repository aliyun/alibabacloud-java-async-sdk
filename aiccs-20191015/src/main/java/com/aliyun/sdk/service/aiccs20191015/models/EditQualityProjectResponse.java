// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditQualityProjectResponse} extends {@link TeaModel}
 *
 * <p>EditQualityProjectResponse</p>
 */
public class EditQualityProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditQualityProjectResponseBody body;

    private EditQualityProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditQualityProjectResponse create() {
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
    public EditQualityProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditQualityProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditQualityProjectResponseBody body);

        @Override
        EditQualityProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditQualityProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditQualityProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditQualityProjectResponse response) {
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
        public Builder body(EditQualityProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditQualityProjectResponse build() {
            return new EditQualityProjectResponse(this);
        } 

    } 

}
