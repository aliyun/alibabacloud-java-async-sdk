// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeUserLangResponse} extends {@link TeaModel}
 *
 * <p>ChangeUserLangResponse</p>
 */
public class ChangeUserLangResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeUserLangResponseBody body;

    private ChangeUserLangResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeUserLangResponse create() {
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
    public ChangeUserLangResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeUserLangResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeUserLangResponseBody body);

        @Override
        ChangeUserLangResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeUserLangResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeUserLangResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeUserLangResponse response) {
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
        public Builder body(ChangeUserLangResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeUserLangResponse build() {
            return new ChangeUserLangResponse(this);
        } 

    } 

}
