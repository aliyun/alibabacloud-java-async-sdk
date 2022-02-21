// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTranscodeTemplateGroupResponse} extends {@link TeaModel}
 *
 * <p>ListTranscodeTemplateGroupResponse</p>
 */
public class ListTranscodeTemplateGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTranscodeTemplateGroupResponseBody body;

    private ListTranscodeTemplateGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTranscodeTemplateGroupResponse create() {
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
    public ListTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTranscodeTemplateGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTranscodeTemplateGroupResponseBody body);

        @Override
        ListTranscodeTemplateGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTranscodeTemplateGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTranscodeTemplateGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTranscodeTemplateGroupResponse response) {
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
        public Builder body(ListTranscodeTemplateGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTranscodeTemplateGroupResponse build() {
            return new ListTranscodeTemplateGroupResponse(this);
        } 

    } 

}
