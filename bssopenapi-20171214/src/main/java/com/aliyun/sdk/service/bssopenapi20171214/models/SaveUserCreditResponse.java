// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveUserCreditResponse} extends {@link TeaModel}
 *
 * <p>SaveUserCreditResponse</p>
 */
public class SaveUserCreditResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveUserCreditResponseBody body;

    private SaveUserCreditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveUserCreditResponse create() {
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
    public SaveUserCreditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveUserCreditResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveUserCreditResponseBody body);

        @Override
        SaveUserCreditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveUserCreditResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveUserCreditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveUserCreditResponse response) {
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
        public Builder body(SaveUserCreditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveUserCreditResponse build() {
            return new SaveUserCreditResponse(this);
        } 

    } 

}
