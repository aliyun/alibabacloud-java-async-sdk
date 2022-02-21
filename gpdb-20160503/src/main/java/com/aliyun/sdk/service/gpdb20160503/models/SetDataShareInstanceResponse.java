// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataShareInstanceResponse} extends {@link TeaModel}
 *
 * <p>SetDataShareInstanceResponse</p>
 */
public class SetDataShareInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDataShareInstanceResponseBody body;

    private SetDataShareInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDataShareInstanceResponse create() {
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
    public SetDataShareInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDataShareInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDataShareInstanceResponseBody body);

        @Override
        SetDataShareInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDataShareInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDataShareInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDataShareInstanceResponse response) {
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
        public Builder body(SetDataShareInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDataShareInstanceResponse build() {
            return new SetDataShareInstanceResponse(this);
        } 

    } 

}
