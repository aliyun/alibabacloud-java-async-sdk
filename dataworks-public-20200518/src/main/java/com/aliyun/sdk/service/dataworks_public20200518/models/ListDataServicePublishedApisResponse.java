// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServicePublishedApisResponse} extends {@link TeaModel}
 *
 * <p>ListDataServicePublishedApisResponse</p>
 */
public class ListDataServicePublishedApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataServicePublishedApisResponseBody body;

    private ListDataServicePublishedApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataServicePublishedApisResponse create() {
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
    public ListDataServicePublishedApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataServicePublishedApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataServicePublishedApisResponseBody body);

        @Override
        ListDataServicePublishedApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataServicePublishedApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataServicePublishedApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataServicePublishedApisResponse response) {
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
        public Builder body(ListDataServicePublishedApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataServicePublishedApisResponse build() {
            return new ListDataServicePublishedApisResponse(this);
        } 

    } 

}
