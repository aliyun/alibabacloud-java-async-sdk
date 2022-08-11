// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableThemeResponse} extends {@link TeaModel}
 *
 * <p>CreateTableThemeResponse</p>
 */
public class CreateTableThemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTableThemeResponseBody body;

    private CreateTableThemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTableThemeResponse create() {
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
    public CreateTableThemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTableThemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTableThemeResponseBody body);

        @Override
        CreateTableThemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTableThemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTableThemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTableThemeResponse response) {
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
        public Builder body(CreateTableThemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTableThemeResponse build() {
            return new CreateTableThemeResponse(this);
        } 

    } 

}
