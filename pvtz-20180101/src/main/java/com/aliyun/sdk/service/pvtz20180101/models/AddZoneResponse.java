// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddZoneResponse} extends {@link TeaModel}
 *
 * <p>AddZoneResponse</p>
 */
public class AddZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddZoneResponseBody body;

    private AddZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddZoneResponse create() {
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
    public AddZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddZoneResponseBody body);

        @Override
        AddZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddZoneResponse response) {
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
        public Builder body(AddZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddZoneResponse build() {
            return new AddZoneResponse(this);
        } 

    } 

}
