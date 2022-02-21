// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoBuildRecordResponse} extends {@link TeaModel}
 *
 * <p>GetRepoBuildRecordResponse</p>
 */
public class GetRepoBuildRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepoBuildRecordResponseBody body;

    private GetRepoBuildRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRepoBuildRecordResponse create() {
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
    public GetRepoBuildRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRepoBuildRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRepoBuildRecordResponseBody body);

        @Override
        GetRepoBuildRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRepoBuildRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRepoBuildRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRepoBuildRecordResponse response) {
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
        public Builder body(GetRepoBuildRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRepoBuildRecordResponse build() {
            return new GetRepoBuildRecordResponse(this);
        } 

    } 

}
