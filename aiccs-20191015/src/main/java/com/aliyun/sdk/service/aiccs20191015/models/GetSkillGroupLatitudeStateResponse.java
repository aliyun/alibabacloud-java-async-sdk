// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSkillGroupLatitudeStateResponse} extends {@link TeaModel}
 *
 * <p>GetSkillGroupLatitudeStateResponse</p>
 */
public class GetSkillGroupLatitudeStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSkillGroupLatitudeStateResponseBody body;

    private GetSkillGroupLatitudeStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSkillGroupLatitudeStateResponse create() {
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
    public GetSkillGroupLatitudeStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSkillGroupLatitudeStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSkillGroupLatitudeStateResponseBody body);

        @Override
        GetSkillGroupLatitudeStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSkillGroupLatitudeStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSkillGroupLatitudeStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSkillGroupLatitudeStateResponse response) {
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
        public Builder body(GetSkillGroupLatitudeStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSkillGroupLatitudeStateResponse build() {
            return new GetSkillGroupLatitudeStateResponse(this);
        } 

    } 

}
