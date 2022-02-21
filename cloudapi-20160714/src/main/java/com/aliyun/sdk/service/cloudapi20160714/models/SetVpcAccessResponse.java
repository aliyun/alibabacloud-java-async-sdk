// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVpcAccessResponse} extends {@link TeaModel}
 *
 * <p>SetVpcAccessResponse</p>
 */
public class SetVpcAccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetVpcAccessResponseBody body;

    private SetVpcAccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetVpcAccessResponse create() {
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
    public SetVpcAccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetVpcAccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetVpcAccessResponseBody body);

        @Override
        SetVpcAccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetVpcAccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetVpcAccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetVpcAccessResponse response) {
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
        public Builder body(SetVpcAccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetVpcAccessResponse build() {
            return new SetVpcAccessResponse(this);
        } 

    } 

}
