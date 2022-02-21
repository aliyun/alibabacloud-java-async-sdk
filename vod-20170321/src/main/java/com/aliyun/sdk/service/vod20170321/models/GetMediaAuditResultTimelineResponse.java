// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditResultTimelineResponse} extends {@link TeaModel}
 *
 * <p>GetMediaAuditResultTimelineResponse</p>
 */
public class GetMediaAuditResultTimelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMediaAuditResultTimelineResponseBody body;

    private GetMediaAuditResultTimelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMediaAuditResultTimelineResponse create() {
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
    public GetMediaAuditResultTimelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMediaAuditResultTimelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMediaAuditResultTimelineResponseBody body);

        @Override
        GetMediaAuditResultTimelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMediaAuditResultTimelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMediaAuditResultTimelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMediaAuditResultTimelineResponse response) {
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
        public Builder body(GetMediaAuditResultTimelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMediaAuditResultTimelineResponse build() {
            return new GetMediaAuditResultTimelineResponse(this);
        } 

    } 

}
