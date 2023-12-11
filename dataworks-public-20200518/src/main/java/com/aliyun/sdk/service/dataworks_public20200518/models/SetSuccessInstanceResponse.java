// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSuccessInstanceResponse} extends {@link TeaModel}
 *
 * <p>SetSuccessInstanceResponse</p>
 */
public class SetSuccessInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSuccessInstanceResponseBody body;

    private SetSuccessInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSuccessInstanceResponse create() {
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
    public SetSuccessInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSuccessInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSuccessInstanceResponseBody body);

        @Override
        SetSuccessInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSuccessInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSuccessInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSuccessInstanceResponse response) {
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
        public Builder body(SetSuccessInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSuccessInstanceResponse build() {
            return new SetSuccessInstanceResponse(this);
        } 

    } 

}
