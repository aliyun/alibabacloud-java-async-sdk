// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelMuteAllGroupUserResponse} extends {@link TeaModel}
 *
 * <p>CancelMuteAllGroupUserResponse</p>
 */
public class CancelMuteAllGroupUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelMuteAllGroupUserResponseBody body;

    private CancelMuteAllGroupUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelMuteAllGroupUserResponse create() {
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
    public CancelMuteAllGroupUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelMuteAllGroupUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelMuteAllGroupUserResponseBody body);

        @Override
        CancelMuteAllGroupUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelMuteAllGroupUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelMuteAllGroupUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelMuteAllGroupUserResponse response) {
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
        public Builder body(CancelMuteAllGroupUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelMuteAllGroupUserResponse build() {
            return new CancelMuteAllGroupUserResponse(this);
        } 

    } 

}
