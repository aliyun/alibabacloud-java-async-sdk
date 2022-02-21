// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIssueByIdResponse} extends {@link TeaModel}
 *
 * <p>GetIssueByIdResponse</p>
 */
public class GetIssueByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIssueByIdResponseBody body;

    private GetIssueByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIssueByIdResponse create() {
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
    public GetIssueByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIssueByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIssueByIdResponseBody body);

        @Override
        GetIssueByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIssueByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIssueByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIssueByIdResponse response) {
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
        public Builder body(GetIssueByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIssueByIdResponse build() {
            return new GetIssueByIdResponse(this);
        } 

    } 

}
