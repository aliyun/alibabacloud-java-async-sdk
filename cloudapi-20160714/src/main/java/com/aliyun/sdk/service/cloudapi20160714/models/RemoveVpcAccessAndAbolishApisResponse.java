// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVpcAccessAndAbolishApisResponse} extends {@link TeaModel}
 *
 * <p>RemoveVpcAccessAndAbolishApisResponse</p>
 */
public class RemoveVpcAccessAndAbolishApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveVpcAccessAndAbolishApisResponseBody body;

    private RemoveVpcAccessAndAbolishApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveVpcAccessAndAbolishApisResponse create() {
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
    public RemoveVpcAccessAndAbolishApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveVpcAccessAndAbolishApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveVpcAccessAndAbolishApisResponseBody body);

        @Override
        RemoveVpcAccessAndAbolishApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveVpcAccessAndAbolishApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveVpcAccessAndAbolishApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveVpcAccessAndAbolishApisResponse response) {
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
        public Builder body(RemoveVpcAccessAndAbolishApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveVpcAccessAndAbolishApisResponse build() {
            return new RemoveVpcAccessAndAbolishApisResponse(this);
        } 

    } 

}
