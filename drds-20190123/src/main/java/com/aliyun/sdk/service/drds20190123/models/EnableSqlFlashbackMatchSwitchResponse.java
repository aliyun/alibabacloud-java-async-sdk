// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSqlFlashbackMatchSwitchResponse} extends {@link TeaModel}
 *
 * <p>EnableSqlFlashbackMatchSwitchResponse</p>
 */
public class EnableSqlFlashbackMatchSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSqlFlashbackMatchSwitchResponseBody body;

    private EnableSqlFlashbackMatchSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSqlFlashbackMatchSwitchResponse create() {
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
    public EnableSqlFlashbackMatchSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSqlFlashbackMatchSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSqlFlashbackMatchSwitchResponseBody body);

        @Override
        EnableSqlFlashbackMatchSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSqlFlashbackMatchSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSqlFlashbackMatchSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSqlFlashbackMatchSwitchResponse response) {
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
        public Builder body(EnableSqlFlashbackMatchSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSqlFlashbackMatchSwitchResponse build() {
            return new EnableSqlFlashbackMatchSwitchResponse(this);
        } 

    } 

}
