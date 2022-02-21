// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGWSInstanceUserResponse} extends {@link TeaModel}
 *
 * <p>SetGWSInstanceUserResponse</p>
 */
public class SetGWSInstanceUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetGWSInstanceUserResponseBody body;

    private SetGWSInstanceUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetGWSInstanceUserResponse create() {
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
    public SetGWSInstanceUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetGWSInstanceUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetGWSInstanceUserResponseBody body);

        @Override
        SetGWSInstanceUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetGWSInstanceUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetGWSInstanceUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetGWSInstanceUserResponse response) {
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
        public Builder body(SetGWSInstanceUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetGWSInstanceUserResponse build() {
            return new SetGWSInstanceUserResponse(this);
        } 

    } 

}
