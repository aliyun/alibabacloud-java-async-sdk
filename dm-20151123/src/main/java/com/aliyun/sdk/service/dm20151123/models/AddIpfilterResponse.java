// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpfilterResponse} extends {@link TeaModel}
 *
 * <p>AddIpfilterResponse</p>
 */
public class AddIpfilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddIpfilterResponseBody body;

    private AddIpfilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddIpfilterResponse create() {
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
    public AddIpfilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddIpfilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddIpfilterResponseBody body);

        @Override
        AddIpfilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddIpfilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddIpfilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddIpfilterResponse response) {
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
        public Builder body(AddIpfilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddIpfilterResponse build() {
            return new AddIpfilterResponse(this);
        } 

    } 

}
