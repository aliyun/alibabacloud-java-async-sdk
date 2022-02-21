// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParameterVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListParameterVersionsResponse</p>
 */
public class ListParameterVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListParameterVersionsResponseBody body;

    private ListParameterVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListParameterVersionsResponse create() {
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
    public ListParameterVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListParameterVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListParameterVersionsResponseBody body);

        @Override
        ListParameterVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListParameterVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListParameterVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListParameterVersionsResponse response) {
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
        public Builder body(ListParameterVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListParameterVersionsResponse build() {
            return new ListParameterVersionsResponse(this);
        } 

    } 

}
