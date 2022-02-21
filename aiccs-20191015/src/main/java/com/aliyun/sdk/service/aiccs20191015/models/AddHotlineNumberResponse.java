// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddHotlineNumberResponse} extends {@link TeaModel}
 *
 * <p>AddHotlineNumberResponse</p>
 */
public class AddHotlineNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddHotlineNumberResponseBody body;

    private AddHotlineNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddHotlineNumberResponse create() {
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
    public AddHotlineNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddHotlineNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddHotlineNumberResponseBody body);

        @Override
        AddHotlineNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddHotlineNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddHotlineNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddHotlineNumberResponse response) {
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
        public Builder body(AddHotlineNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddHotlineNumberResponse build() {
            return new AddHotlineNumberResponse(this);
        } 

    } 

}
