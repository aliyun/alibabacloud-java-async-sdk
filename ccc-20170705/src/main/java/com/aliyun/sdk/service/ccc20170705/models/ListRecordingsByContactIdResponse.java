// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecordingsByContactIdResponse} extends {@link TeaModel}
 *
 * <p>ListRecordingsByContactIdResponse</p>
 */
public class ListRecordingsByContactIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecordingsByContactIdResponseBody body;

    private ListRecordingsByContactIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecordingsByContactIdResponse create() {
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
    public ListRecordingsByContactIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecordingsByContactIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecordingsByContactIdResponseBody body);

        @Override
        ListRecordingsByContactIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecordingsByContactIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecordingsByContactIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecordingsByContactIdResponse response) {
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
        public Builder body(ListRecordingsByContactIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecordingsByContactIdResponse build() {
            return new ListRecordingsByContactIdResponse(this);
        } 

    } 

}
