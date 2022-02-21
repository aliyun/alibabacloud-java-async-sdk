// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDcdnProjectExistResponse} extends {@link TeaModel}
 *
 * <p>CheckDcdnProjectExistResponse</p>
 */
public class CheckDcdnProjectExistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDcdnProjectExistResponseBody body;

    private CheckDcdnProjectExistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDcdnProjectExistResponse create() {
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
    public CheckDcdnProjectExistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDcdnProjectExistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDcdnProjectExistResponseBody body);

        @Override
        CheckDcdnProjectExistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDcdnProjectExistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDcdnProjectExistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDcdnProjectExistResponse response) {
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
        public Builder body(CheckDcdnProjectExistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDcdnProjectExistResponse build() {
            return new CheckDcdnProjectExistResponse(this);
        } 

    } 

}
