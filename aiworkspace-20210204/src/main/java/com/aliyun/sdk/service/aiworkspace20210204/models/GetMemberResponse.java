// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMemberResponse} extends {@link TeaModel}
 *
 * <p>GetMemberResponse</p>
 */
public class GetMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMemberResponseBody body;

    private GetMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMemberResponse create() {
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
    public GetMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMemberResponseBody body);

        @Override
        GetMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMemberResponse response) {
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
        public Builder body(GetMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMemberResponse build() {
            return new GetMemberResponse(this);
        } 

    } 

}
