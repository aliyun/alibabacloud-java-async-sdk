// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGWSInstanceNameResponse} extends {@link TeaModel}
 *
 * <p>SetGWSInstanceNameResponse</p>
 */
public class SetGWSInstanceNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetGWSInstanceNameResponseBody body;

    private SetGWSInstanceNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetGWSInstanceNameResponse create() {
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
    public SetGWSInstanceNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetGWSInstanceNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetGWSInstanceNameResponseBody body);

        @Override
        SetGWSInstanceNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetGWSInstanceNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetGWSInstanceNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetGWSInstanceNameResponse response) {
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
        public Builder body(SetGWSInstanceNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetGWSInstanceNameResponse build() {
            return new SetGWSInstanceNameResponse(this);
        } 

    } 

}
