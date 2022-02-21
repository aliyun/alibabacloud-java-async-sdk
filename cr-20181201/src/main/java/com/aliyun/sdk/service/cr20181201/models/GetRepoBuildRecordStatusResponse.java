// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoBuildRecordStatusResponse} extends {@link TeaModel}
 *
 * <p>GetRepoBuildRecordStatusResponse</p>
 */
public class GetRepoBuildRecordStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRepoBuildRecordStatusResponseBody body;

    private GetRepoBuildRecordStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRepoBuildRecordStatusResponse create() {
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
    public GetRepoBuildRecordStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRepoBuildRecordStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRepoBuildRecordStatusResponseBody body);

        @Override
        GetRepoBuildRecordStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRepoBuildRecordStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRepoBuildRecordStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRepoBuildRecordStatusResponse response) {
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
        public Builder body(GetRepoBuildRecordStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRepoBuildRecordStatusResponse build() {
            return new GetRepoBuildRecordStatusResponse(this);
        } 

    } 

}
