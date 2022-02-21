// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopGWSInstanceResponse} extends {@link TeaModel}
 *
 * <p>StopGWSInstanceResponse</p>
 */
public class StopGWSInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopGWSInstanceResponseBody body;

    private StopGWSInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopGWSInstanceResponse create() {
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
    public StopGWSInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopGWSInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopGWSInstanceResponseBody body);

        @Override
        StopGWSInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopGWSInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopGWSInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopGWSInstanceResponse response) {
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
        public Builder body(StopGWSInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopGWSInstanceResponse build() {
            return new StopGWSInstanceResponse(this);
        } 

    } 

}
