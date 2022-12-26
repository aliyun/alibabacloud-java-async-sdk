// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCheckInstanceResultWhiteListResponse} extends {@link TeaModel}
 *
 * <p>AddCheckInstanceResultWhiteListResponse</p>
 */
public class AddCheckInstanceResultWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCheckInstanceResultWhiteListResponseBody body;

    private AddCheckInstanceResultWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCheckInstanceResultWhiteListResponse create() {
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
    public AddCheckInstanceResultWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCheckInstanceResultWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCheckInstanceResultWhiteListResponseBody body);

        @Override
        AddCheckInstanceResultWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCheckInstanceResultWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCheckInstanceResultWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCheckInstanceResultWhiteListResponse response) {
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
        public Builder body(AddCheckInstanceResultWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCheckInstanceResultWhiteListResponse build() {
            return new AddCheckInstanceResultWhiteListResponse(this);
        } 

    } 

}
