// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDictInformationResponse} extends {@link TeaModel}
 *
 * <p>ListDictInformationResponse</p>
 */
public class ListDictInformationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDictInformationResponseBody body;

    private ListDictInformationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDictInformationResponse create() {
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
    public ListDictInformationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDictInformationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDictInformationResponseBody body);

        @Override
        ListDictInformationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDictInformationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDictInformationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDictInformationResponse response) {
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
        public Builder body(ListDictInformationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDictInformationResponse build() {
            return new ListDictInformationResponse(this);
        } 

    } 

}
