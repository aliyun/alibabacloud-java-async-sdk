// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParametersResponse} extends {@link TeaModel}
 *
 * <p>ListParametersResponse</p>
 */
public class ListParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListParametersResponseBody body;

    private ListParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListParametersResponse create() {
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
    public ListParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListParametersResponseBody body);

        @Override
        ListParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListParametersResponse response) {
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
        public Builder body(ListParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListParametersResponse build() {
            return new ListParametersResponse(this);
        } 

    } 

}
