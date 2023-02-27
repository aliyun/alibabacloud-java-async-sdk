// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallDetailRecordResponse} extends {@link TeaModel}
 *
 * <p>GetCallDetailRecordResponse</p>
 */
public class GetCallDetailRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCallDetailRecordResponseBody body;

    private GetCallDetailRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCallDetailRecordResponse create() {
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
    public GetCallDetailRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCallDetailRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCallDetailRecordResponseBody body);

        @Override
        GetCallDetailRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCallDetailRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCallDetailRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCallDetailRecordResponse response) {
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
        public Builder body(GetCallDetailRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCallDetailRecordResponse build() {
            return new GetCallDetailRecordResponse(this);
        } 

    } 

}
