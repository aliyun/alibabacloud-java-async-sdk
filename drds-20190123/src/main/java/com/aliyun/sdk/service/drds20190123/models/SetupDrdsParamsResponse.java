// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupDrdsParamsResponse} extends {@link TeaModel}
 *
 * <p>SetupDrdsParamsResponse</p>
 */
public class SetupDrdsParamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetupDrdsParamsResponseBody body;

    private SetupDrdsParamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetupDrdsParamsResponse create() {
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
    public SetupDrdsParamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetupDrdsParamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetupDrdsParamsResponseBody body);

        @Override
        SetupDrdsParamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetupDrdsParamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetupDrdsParamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetupDrdsParamsResponse response) {
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
        public Builder body(SetupDrdsParamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetupDrdsParamsResponse build() {
            return new SetupDrdsParamsResponse(this);
        } 

    } 

}
