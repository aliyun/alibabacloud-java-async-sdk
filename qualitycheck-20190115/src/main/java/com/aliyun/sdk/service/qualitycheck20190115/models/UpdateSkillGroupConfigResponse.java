// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSkillGroupConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateSkillGroupConfigResponse</p>
 */
public class UpdateSkillGroupConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSkillGroupConfigResponseBody body;

    private UpdateSkillGroupConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSkillGroupConfigResponse create() {
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
    public UpdateSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSkillGroupConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSkillGroupConfigResponseBody body);

        @Override
        UpdateSkillGroupConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSkillGroupConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSkillGroupConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSkillGroupConfigResponse response) {
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
        public Builder body(UpdateSkillGroupConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSkillGroupConfigResponse build() {
            return new UpdateSkillGroupConfigResponse(this);
        } 

    } 

}
