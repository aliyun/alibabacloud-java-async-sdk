// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindCustomizedPropertiesResponse} extends {@link TeaModel}
 *
 * <p>FindCustomizedPropertiesResponse</p>
 */
public class FindCustomizedPropertiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindCustomizedPropertiesResponseBody body;

    private FindCustomizedPropertiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindCustomizedPropertiesResponse create() {
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
    public FindCustomizedPropertiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindCustomizedPropertiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindCustomizedPropertiesResponseBody body);

        @Override
        FindCustomizedPropertiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindCustomizedPropertiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindCustomizedPropertiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindCustomizedPropertiesResponse response) {
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
        public Builder body(FindCustomizedPropertiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindCustomizedPropertiesResponse build() {
            return new FindCustomizedPropertiesResponse(this);
        } 

    } 

}
