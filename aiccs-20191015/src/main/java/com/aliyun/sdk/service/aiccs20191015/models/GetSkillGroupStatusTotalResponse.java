// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSkillGroupStatusTotalResponse} extends {@link TeaModel}
 *
 * <p>GetSkillGroupStatusTotalResponse</p>
 */
public class GetSkillGroupStatusTotalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSkillGroupStatusTotalResponseBody body;

    private GetSkillGroupStatusTotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSkillGroupStatusTotalResponse create() {
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
    public GetSkillGroupStatusTotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSkillGroupStatusTotalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSkillGroupStatusTotalResponseBody body);

        @Override
        GetSkillGroupStatusTotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSkillGroupStatusTotalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSkillGroupStatusTotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSkillGroupStatusTotalResponse response) {
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
        public Builder body(GetSkillGroupStatusTotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSkillGroupStatusTotalResponse build() {
            return new GetSkillGroupStatusTotalResponse(this);
        } 

    } 

}
