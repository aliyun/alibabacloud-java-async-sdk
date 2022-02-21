// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAiotStorageInfoResponse} extends {@link TeaModel}
 *
 * <p>SetAiotStorageInfoResponse</p>
 */
public class SetAiotStorageInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetAiotStorageInfoResponseBody body;

    private SetAiotStorageInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetAiotStorageInfoResponse create() {
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
    public SetAiotStorageInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetAiotStorageInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetAiotStorageInfoResponseBody body);

        @Override
        SetAiotStorageInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetAiotStorageInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetAiotStorageInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetAiotStorageInfoResponse response) {
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
        public Builder body(SetAiotStorageInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetAiotStorageInfoResponse build() {
            return new SetAiotStorageInfoResponse(this);
        } 

    } 

}
