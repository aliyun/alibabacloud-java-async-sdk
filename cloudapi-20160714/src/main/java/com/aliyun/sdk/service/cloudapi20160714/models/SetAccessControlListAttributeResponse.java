// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccessControlListAttributeResponse} extends {@link TeaModel}
 *
 * <p>SetAccessControlListAttributeResponse</p>
 */
public class SetAccessControlListAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetAccessControlListAttributeResponseBody body;

    private SetAccessControlListAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetAccessControlListAttributeResponse create() {
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
    public SetAccessControlListAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetAccessControlListAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetAccessControlListAttributeResponseBody body);

        @Override
        SetAccessControlListAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetAccessControlListAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetAccessControlListAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetAccessControlListAttributeResponse response) {
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
        public Builder body(SetAccessControlListAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetAccessControlListAttributeResponse build() {
            return new SetAccessControlListAttributeResponse(this);
        } 

    } 

}
