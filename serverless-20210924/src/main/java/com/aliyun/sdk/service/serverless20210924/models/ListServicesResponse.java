// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesResponse} extends {@link TeaModel}
 *
 * <p>ListServicesResponse</p>
 */
public class ListServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < Service > body;

    private ListServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServicesResponse create() {
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
    public java.util.List < Service > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < Service > body);

        @Override
        ListServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < Service > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServicesResponse response) {
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
        public Builder body(java.util.List < Service > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServicesResponse build() {
            return new ListServicesResponse(this);
        } 

    } 

}
