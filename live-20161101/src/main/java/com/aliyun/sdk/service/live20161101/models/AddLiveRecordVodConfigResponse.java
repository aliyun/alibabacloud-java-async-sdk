// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveRecordVodConfigResponse} extends {@link TeaModel}
 *
 * <p>AddLiveRecordVodConfigResponse</p>
 */
public class AddLiveRecordVodConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveRecordVodConfigResponseBody body;

    private AddLiveRecordVodConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveRecordVodConfigResponse create() {
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
    public AddLiveRecordVodConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveRecordVodConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveRecordVodConfigResponseBody body);

        @Override
        AddLiveRecordVodConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveRecordVodConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveRecordVodConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveRecordVodConfigResponse response) {
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
        public Builder body(AddLiveRecordVodConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveRecordVodConfigResponse build() {
            return new AddLiveRecordVodConfigResponse(this);
        } 

    } 

}
