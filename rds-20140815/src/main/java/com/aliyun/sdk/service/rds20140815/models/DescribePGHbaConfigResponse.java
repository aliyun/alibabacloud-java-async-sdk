// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePGHbaConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribePGHbaConfigResponse</p>
 */
public class DescribePGHbaConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePGHbaConfigResponseBody body;

    private DescribePGHbaConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePGHbaConfigResponse create() {
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
    public DescribePGHbaConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePGHbaConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePGHbaConfigResponseBody body);

        @Override
        DescribePGHbaConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePGHbaConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePGHbaConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePGHbaConfigResponse response) {
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
        public Builder body(DescribePGHbaConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePGHbaConfigResponse build() {
            return new DescribePGHbaConfigResponse(this);
        } 

    } 

}
