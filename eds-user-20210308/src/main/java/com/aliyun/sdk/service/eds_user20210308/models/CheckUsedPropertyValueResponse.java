// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUsedPropertyValueResponse} extends {@link TeaModel}
 *
 * <p>CheckUsedPropertyValueResponse</p>
 */
public class CheckUsedPropertyValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckUsedPropertyValueResponseBody body;

    private CheckUsedPropertyValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckUsedPropertyValueResponse create() {
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
    public CheckUsedPropertyValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckUsedPropertyValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckUsedPropertyValueResponseBody body);

        @Override
        CheckUsedPropertyValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckUsedPropertyValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckUsedPropertyValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckUsedPropertyValueResponse response) {
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
        public Builder body(CheckUsedPropertyValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckUsedPropertyValueResponse build() {
            return new CheckUsedPropertyValueResponse(this);
        } 

    } 

}
