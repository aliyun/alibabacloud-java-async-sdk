// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskListResponse} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskListResponse</p>
 */
public class GetSyntheticTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSyntheticTaskListResponseBody body;

    private GetSyntheticTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSyntheticTaskListResponse create() {
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
    public GetSyntheticTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSyntheticTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSyntheticTaskListResponseBody body);

        @Override
        GetSyntheticTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSyntheticTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSyntheticTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSyntheticTaskListResponse response) {
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
        public Builder body(GetSyntheticTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSyntheticTaskListResponse build() {
            return new GetSyntheticTaskListResponse(this);
        } 

    } 

}
