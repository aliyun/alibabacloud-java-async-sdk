// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindPrepublishesByVersionIdResponse} extends {@link TeaModel}
 *
 * <p>FindPrepublishesByVersionIdResponse</p>
 */
public class FindPrepublishesByVersionIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindPrepublishesByVersionIdResponseBody body;

    private FindPrepublishesByVersionIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindPrepublishesByVersionIdResponse create() {
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
    public FindPrepublishesByVersionIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindPrepublishesByVersionIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindPrepublishesByVersionIdResponseBody body);

        @Override
        FindPrepublishesByVersionIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindPrepublishesByVersionIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindPrepublishesByVersionIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindPrepublishesByVersionIdResponse response) {
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
        public Builder body(FindPrepublishesByVersionIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindPrepublishesByVersionIdResponse build() {
            return new FindPrepublishesByVersionIdResponse(this);
        } 

    } 

}
