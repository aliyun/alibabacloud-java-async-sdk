// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetImageNameResponse} extends {@link TeaModel}
 *
 * <p>SetImageNameResponse</p>
 */
public class SetImageNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetImageNameResponseBody body;

    private SetImageNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetImageNameResponse create() {
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
    public SetImageNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetImageNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetImageNameResponseBody body);

        @Override
        SetImageNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetImageNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetImageNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetImageNameResponse response) {
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
        public Builder body(SetImageNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetImageNameResponse build() {
            return new SetImageNameResponse(this);
        } 

    } 

}
