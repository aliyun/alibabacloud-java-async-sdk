// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableThemeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTableThemeResponse</p>
 */
public class UpdateTableThemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTableThemeResponseBody body;

    private UpdateTableThemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTableThemeResponse create() {
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
    public UpdateTableThemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTableThemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTableThemeResponseBody body);

        @Override
        UpdateTableThemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTableThemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTableThemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTableThemeResponse response) {
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
        public Builder body(UpdateTableThemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTableThemeResponse build() {
            return new UpdateTableThemeResponse(this);
        } 

    } 

}
