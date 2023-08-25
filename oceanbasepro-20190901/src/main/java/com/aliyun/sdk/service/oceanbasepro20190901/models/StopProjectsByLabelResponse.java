// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopProjectsByLabelResponse} extends {@link TeaModel}
 *
 * <p>StopProjectsByLabelResponse</p>
 */
public class StopProjectsByLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopProjectsByLabelResponseBody body;

    private StopProjectsByLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopProjectsByLabelResponse create() {
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
    public StopProjectsByLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopProjectsByLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopProjectsByLabelResponseBody body);

        @Override
        StopProjectsByLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopProjectsByLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopProjectsByLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopProjectsByLabelResponse response) {
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
        public Builder body(StopProjectsByLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopProjectsByLabelResponse build() {
            return new StopProjectsByLabelResponse(this);
        } 

    } 

}
