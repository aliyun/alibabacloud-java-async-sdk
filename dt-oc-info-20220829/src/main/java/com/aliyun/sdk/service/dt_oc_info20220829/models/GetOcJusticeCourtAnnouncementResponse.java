// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeCourtAnnouncementResponse} extends {@link TeaModel}
 *
 * <p>GetOcJusticeCourtAnnouncementResponse</p>
 */
public class GetOcJusticeCourtAnnouncementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcJusticeCourtAnnouncementResponseBody body;

    private GetOcJusticeCourtAnnouncementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcJusticeCourtAnnouncementResponse create() {
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
    public GetOcJusticeCourtAnnouncementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcJusticeCourtAnnouncementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcJusticeCourtAnnouncementResponseBody body);

        @Override
        GetOcJusticeCourtAnnouncementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcJusticeCourtAnnouncementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcJusticeCourtAnnouncementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcJusticeCourtAnnouncementResponse response) {
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
        public Builder body(GetOcJusticeCourtAnnouncementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcJusticeCourtAnnouncementResponse build() {
            return new GetOcJusticeCourtAnnouncementResponse(this);
        } 

    } 

}
