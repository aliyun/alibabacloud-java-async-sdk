// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link SelectObjectResponse} extends {@link TeaModel}
 *
 * <p>SelectObjectResponse</p>
 */
public class SelectObjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.io.InputStream body;

    private SelectObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SelectObjectResponse create() {
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
    public java.io.InputStream getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SelectObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.io.InputStream body);

        @Override
        SelectObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SelectObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.io.InputStream body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SelectObjectResponse response) {
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
        public Builder body(java.io.InputStream body) {
            this.body = body;
            return this;
        }

        @Override
        public SelectObjectResponse build() {
            return new SelectObjectResponse(this);
        } 

    } 

}
