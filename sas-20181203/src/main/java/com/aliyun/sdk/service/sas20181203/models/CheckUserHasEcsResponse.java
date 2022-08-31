// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUserHasEcsResponse} extends {@link TeaModel}
 *
 * <p>CheckUserHasEcsResponse</p>
 */
public class CheckUserHasEcsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckUserHasEcsResponseBody body;

    private CheckUserHasEcsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckUserHasEcsResponse create() {
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
    public CheckUserHasEcsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckUserHasEcsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckUserHasEcsResponseBody body);

        @Override
        CheckUserHasEcsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckUserHasEcsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckUserHasEcsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckUserHasEcsResponse response) {
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
        public Builder body(CheckUserHasEcsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckUserHasEcsResponse build() {
            return new CheckUserHasEcsResponse(this);
        } 

    } 

}
