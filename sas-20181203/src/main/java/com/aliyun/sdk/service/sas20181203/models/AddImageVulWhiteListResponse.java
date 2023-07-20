// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageVulWhiteListResponse} extends {@link TeaModel}
 *
 * <p>AddImageVulWhiteListResponse</p>
 */
public class AddImageVulWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddImageVulWhiteListResponseBody body;

    private AddImageVulWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddImageVulWhiteListResponse create() {
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
    public AddImageVulWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddImageVulWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddImageVulWhiteListResponseBody body);

        @Override
        AddImageVulWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddImageVulWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddImageVulWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddImageVulWhiteListResponse response) {
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
        public Builder body(AddImageVulWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddImageVulWhiteListResponse build() {
            return new AddImageVulWhiteListResponse(this);
        } 

    } 

}
