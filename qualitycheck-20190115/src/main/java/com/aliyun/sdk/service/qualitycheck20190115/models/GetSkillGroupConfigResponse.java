// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSkillGroupConfigResponse} extends {@link TeaModel}
 *
 * <p>GetSkillGroupConfigResponse</p>
 */
public class GetSkillGroupConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSkillGroupConfigResponseBody body;

    private GetSkillGroupConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSkillGroupConfigResponse create() {
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
    public GetSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSkillGroupConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSkillGroupConfigResponseBody body);

        @Override
        GetSkillGroupConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSkillGroupConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSkillGroupConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSkillGroupConfigResponse response) {
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
        public Builder body(GetSkillGroupConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSkillGroupConfigResponse build() {
            return new GetSkillGroupConfigResponse(this);
        } 

    } 

}
