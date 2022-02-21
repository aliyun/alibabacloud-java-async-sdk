// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventAlgorithmDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListEventAlgorithmDetailsResponse</p>
 */
public class ListEventAlgorithmDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEventAlgorithmDetailsResponseBody body;

    private ListEventAlgorithmDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEventAlgorithmDetailsResponse create() {
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
    public ListEventAlgorithmDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEventAlgorithmDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEventAlgorithmDetailsResponseBody body);

        @Override
        ListEventAlgorithmDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEventAlgorithmDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEventAlgorithmDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEventAlgorithmDetailsResponse response) {
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
        public Builder body(ListEventAlgorithmDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEventAlgorithmDetailsResponse build() {
            return new ListEventAlgorithmDetailsResponse(this);
        } 

    } 

}
