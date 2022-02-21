// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDingtalkGroupResponse} extends {@link TeaModel}
 *
 * <p>GetEnterpriseDingtalkGroupResponse</p>
 */
public class GetEnterpriseDingtalkGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEnterpriseDingtalkGroupResponseBody body;

    private GetEnterpriseDingtalkGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEnterpriseDingtalkGroupResponse create() {
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
    public GetEnterpriseDingtalkGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEnterpriseDingtalkGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEnterpriseDingtalkGroupResponseBody body);

        @Override
        GetEnterpriseDingtalkGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEnterpriseDingtalkGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEnterpriseDingtalkGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEnterpriseDingtalkGroupResponse response) {
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
        public Builder body(GetEnterpriseDingtalkGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEnterpriseDingtalkGroupResponse build() {
            return new GetEnterpriseDingtalkGroupResponse(this);
        } 

    } 

}
