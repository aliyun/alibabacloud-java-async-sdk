// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIpsecServerResponse} extends {@link TeaModel}
 *
 * <p>UpdateIpsecServerResponse</p>
 */
public class UpdateIpsecServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIpsecServerResponseBody body;

    private UpdateIpsecServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIpsecServerResponse create() {
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
    public UpdateIpsecServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIpsecServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIpsecServerResponseBody body);

        @Override
        UpdateIpsecServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIpsecServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIpsecServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIpsecServerResponse response) {
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
        public Builder body(UpdateIpsecServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIpsecServerResponse build() {
            return new UpdateIpsecServerResponse(this);
        } 

    } 

}
