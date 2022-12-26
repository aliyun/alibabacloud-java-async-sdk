// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCheckResultWhiteListResponse} extends {@link TeaModel}
 *
 * <p>AddCheckResultWhiteListResponse</p>
 */
public class AddCheckResultWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCheckResultWhiteListResponseBody body;

    private AddCheckResultWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCheckResultWhiteListResponse create() {
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
    public AddCheckResultWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCheckResultWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCheckResultWhiteListResponseBody body);

        @Override
        AddCheckResultWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCheckResultWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCheckResultWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCheckResultWhiteListResponse response) {
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
        public Builder body(AddCheckResultWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCheckResultWhiteListResponse build() {
            return new AddCheckResultWhiteListResponse(this);
        } 

    } 

}
