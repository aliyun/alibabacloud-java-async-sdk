// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrackListByMailFromAndTagNameResponse} extends {@link TeaModel}
 *
 * <p>GetTrackListByMailFromAndTagNameResponse</p>
 */
public class GetTrackListByMailFromAndTagNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrackListByMailFromAndTagNameResponseBody body;

    private GetTrackListByMailFromAndTagNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrackListByMailFromAndTagNameResponse create() {
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
    public GetTrackListByMailFromAndTagNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrackListByMailFromAndTagNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrackListByMailFromAndTagNameResponseBody body);

        @Override
        GetTrackListByMailFromAndTagNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrackListByMailFromAndTagNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrackListByMailFromAndTagNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrackListByMailFromAndTagNameResponse response) {
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
        public Builder body(GetTrackListByMailFromAndTagNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrackListByMailFromAndTagNameResponse build() {
            return new GetTrackListByMailFromAndTagNameResponse(this);
        } 

    } 

}
