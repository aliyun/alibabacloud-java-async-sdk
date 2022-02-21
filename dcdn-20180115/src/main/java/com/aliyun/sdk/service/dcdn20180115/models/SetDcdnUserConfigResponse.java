// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnUserConfigResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnUserConfigResponse</p>
 */
public class SetDcdnUserConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDcdnUserConfigResponseBody body;

    private SetDcdnUserConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDcdnUserConfigResponse create() {
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
    public SetDcdnUserConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnUserConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDcdnUserConfigResponseBody body);

        @Override
        SetDcdnUserConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnUserConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDcdnUserConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnUserConfigResponse response) {
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
        public Builder body(SetDcdnUserConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDcdnUserConfigResponse build() {
            return new SetDcdnUserConfigResponse(this);
        } 

    } 

}
