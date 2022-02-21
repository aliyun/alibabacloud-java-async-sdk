// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMountedClientsResponse} extends {@link TeaModel}
 *
 * <p>DescribeMountedClientsResponse</p>
 */
public class DescribeMountedClientsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMountedClientsResponseBody body;

    private DescribeMountedClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMountedClientsResponse create() {
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
    public DescribeMountedClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMountedClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMountedClientsResponseBody body);

        @Override
        DescribeMountedClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMountedClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMountedClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMountedClientsResponse response) {
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
        public Builder body(DescribeMountedClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMountedClientsResponse build() {
            return new DescribeMountedClientsResponse(this);
        } 

    } 

}
