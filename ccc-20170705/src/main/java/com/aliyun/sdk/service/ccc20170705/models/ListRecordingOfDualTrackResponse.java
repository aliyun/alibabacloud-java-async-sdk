// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecordingOfDualTrackResponse} extends {@link TeaModel}
 *
 * <p>ListRecordingOfDualTrackResponse</p>
 */
public class ListRecordingOfDualTrackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecordingOfDualTrackResponseBody body;

    private ListRecordingOfDualTrackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecordingOfDualTrackResponse create() {
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
    public ListRecordingOfDualTrackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecordingOfDualTrackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecordingOfDualTrackResponseBody body);

        @Override
        ListRecordingOfDualTrackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecordingOfDualTrackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecordingOfDualTrackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecordingOfDualTrackResponse response) {
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
        public Builder body(ListRecordingOfDualTrackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecordingOfDualTrackResponse build() {
            return new ListRecordingOfDualTrackResponse(this);
        } 

    } 

}
