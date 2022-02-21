// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRetcodeShareStatusResponse} extends {@link TeaModel}
 *
 * <p>SetRetcodeShareStatusResponse</p>
 */
public class SetRetcodeShareStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRetcodeShareStatusResponseBody body;

    private SetRetcodeShareStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRetcodeShareStatusResponse create() {
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
    public SetRetcodeShareStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRetcodeShareStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRetcodeShareStatusResponseBody body);

        @Override
        SetRetcodeShareStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRetcodeShareStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRetcodeShareStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRetcodeShareStatusResponse response) {
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
        public Builder body(SetRetcodeShareStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRetcodeShareStatusResponse build() {
            return new SetRetcodeShareStatusResponse(this);
        } 

    } 

}
