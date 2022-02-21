// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMotorAlgorithmResultsResponse} extends {@link TeaModel}
 *
 * <p>ListMotorAlgorithmResultsResponse</p>
 */
public class ListMotorAlgorithmResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMotorAlgorithmResultsResponseBody body;

    private ListMotorAlgorithmResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMotorAlgorithmResultsResponse create() {
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
    public ListMotorAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMotorAlgorithmResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMotorAlgorithmResultsResponseBody body);

        @Override
        ListMotorAlgorithmResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMotorAlgorithmResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMotorAlgorithmResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMotorAlgorithmResultsResponse response) {
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
        public Builder body(ListMotorAlgorithmResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMotorAlgorithmResultsResponse build() {
            return new ListMotorAlgorithmResultsResponse(this);
        } 

    } 

}
