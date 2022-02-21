// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultTranscodeTemplateGroupResponse} extends {@link TeaModel}
 *
 * <p>SetDefaultTranscodeTemplateGroupResponse</p>
 */
public class SetDefaultTranscodeTemplateGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDefaultTranscodeTemplateGroupResponseBody body;

    private SetDefaultTranscodeTemplateGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDefaultTranscodeTemplateGroupResponse create() {
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
    public SetDefaultTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDefaultTranscodeTemplateGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDefaultTranscodeTemplateGroupResponseBody body);

        @Override
        SetDefaultTranscodeTemplateGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDefaultTranscodeTemplateGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDefaultTranscodeTemplateGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDefaultTranscodeTemplateGroupResponse response) {
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
        public Builder body(SetDefaultTranscodeTemplateGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDefaultTranscodeTemplateGroupResponse build() {
            return new SetDefaultTranscodeTemplateGroupResponse(this);
        } 

    } 

}
