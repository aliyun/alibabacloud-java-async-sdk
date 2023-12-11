// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServicePublishedApiResponse} extends {@link TeaModel}
 *
 * <p>GetDataServicePublishedApiResponse</p>
 */
public class GetDataServicePublishedApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataServicePublishedApiResponseBody body;

    private GetDataServicePublishedApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataServicePublishedApiResponse create() {
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
    public GetDataServicePublishedApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataServicePublishedApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataServicePublishedApiResponseBody body);

        @Override
        GetDataServicePublishedApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataServicePublishedApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataServicePublishedApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataServicePublishedApiResponse response) {
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
        public Builder body(GetDataServicePublishedApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataServicePublishedApiResponse build() {
            return new GetDataServicePublishedApiResponse(this);
        } 

    } 

}
