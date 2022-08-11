// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FixNodePoolVulsResponse} extends {@link TeaModel}
 *
 * <p>FixNodePoolVulsResponse</p>
 */
public class FixNodePoolVulsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FixNodePoolVulsResponseBody body;

    private FixNodePoolVulsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FixNodePoolVulsResponse create() {
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
    public FixNodePoolVulsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FixNodePoolVulsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FixNodePoolVulsResponseBody body);

        @Override
        FixNodePoolVulsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FixNodePoolVulsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FixNodePoolVulsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FixNodePoolVulsResponse response) {
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
        public Builder body(FixNodePoolVulsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FixNodePoolVulsResponse build() {
            return new FixNodePoolVulsResponse(this);
        } 

    } 

}
