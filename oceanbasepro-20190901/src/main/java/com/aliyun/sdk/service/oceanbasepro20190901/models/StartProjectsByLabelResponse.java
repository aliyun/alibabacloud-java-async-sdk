// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartProjectsByLabelResponse} extends {@link TeaModel}
 *
 * <p>StartProjectsByLabelResponse</p>
 */
public class StartProjectsByLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartProjectsByLabelResponseBody body;

    private StartProjectsByLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartProjectsByLabelResponse create() {
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
    public StartProjectsByLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartProjectsByLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartProjectsByLabelResponseBody body);

        @Override
        StartProjectsByLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartProjectsByLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartProjectsByLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartProjectsByLabelResponse response) {
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
        public Builder body(StartProjectsByLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartProjectsByLabelResponse build() {
            return new StartProjectsByLabelResponse(this);
        } 

    } 

}
