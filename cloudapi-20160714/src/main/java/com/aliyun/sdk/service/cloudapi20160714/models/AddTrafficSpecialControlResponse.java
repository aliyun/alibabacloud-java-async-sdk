// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTrafficSpecialControlResponse} extends {@link TeaModel}
 *
 * <p>AddTrafficSpecialControlResponse</p>
 */
public class AddTrafficSpecialControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddTrafficSpecialControlResponseBody body;

    private AddTrafficSpecialControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddTrafficSpecialControlResponse create() {
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
    public AddTrafficSpecialControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddTrafficSpecialControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddTrafficSpecialControlResponseBody body);

        @Override
        AddTrafficSpecialControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddTrafficSpecialControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddTrafficSpecialControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddTrafficSpecialControlResponse response) {
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
        public Builder body(AddTrafficSpecialControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddTrafficSpecialControlResponse build() {
            return new AddTrafficSpecialControlResponse(this);
        } 

    } 

}
