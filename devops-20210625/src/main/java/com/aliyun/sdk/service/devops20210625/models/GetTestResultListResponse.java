// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTestResultListResponse} extends {@link TeaModel}
 *
 * <p>GetTestResultListResponse</p>
 */
public class GetTestResultListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTestResultListResponseBody body;

    private GetTestResultListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTestResultListResponse create() {
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
    public GetTestResultListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTestResultListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTestResultListResponseBody body);

        @Override
        GetTestResultListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTestResultListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTestResultListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTestResultListResponse response) {
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
        public Builder body(GetTestResultListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTestResultListResponse build() {
            return new GetTestResultListResponse(this);
        } 

    } 

}
