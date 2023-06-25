// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTestResultResponse} extends {@link TeaModel}
 *
 * <p>UpdateTestResultResponse</p>
 */
public class UpdateTestResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTestResultResponseBody body;

    private UpdateTestResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTestResultResponse create() {
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
    public UpdateTestResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTestResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTestResultResponseBody body);

        @Override
        UpdateTestResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTestResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTestResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTestResultResponse response) {
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
        public Builder body(UpdateTestResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTestResultResponse build() {
            return new UpdateTestResultResponse(this);
        } 

    } 

}
