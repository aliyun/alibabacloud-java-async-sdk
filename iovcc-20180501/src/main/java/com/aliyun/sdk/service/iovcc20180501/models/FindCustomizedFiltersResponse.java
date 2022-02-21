// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindCustomizedFiltersResponse} extends {@link TeaModel}
 *
 * <p>FindCustomizedFiltersResponse</p>
 */
public class FindCustomizedFiltersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindCustomizedFiltersResponseBody body;

    private FindCustomizedFiltersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindCustomizedFiltersResponse create() {
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
    public FindCustomizedFiltersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindCustomizedFiltersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindCustomizedFiltersResponseBody body);

        @Override
        FindCustomizedFiltersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindCustomizedFiltersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindCustomizedFiltersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindCustomizedFiltersResponse response) {
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
        public Builder body(FindCustomizedFiltersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindCustomizedFiltersResponse build() {
            return new FindCustomizedFiltersResponse(this);
        } 

    } 

}
