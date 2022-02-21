// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSnapshotSettingResponse} extends {@link TeaModel}
 *
 * <p>UpdateSnapshotSettingResponse</p>
 */
public class UpdateSnapshotSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSnapshotSettingResponseBody body;

    private UpdateSnapshotSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSnapshotSettingResponse create() {
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
    public UpdateSnapshotSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSnapshotSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSnapshotSettingResponseBody body);

        @Override
        UpdateSnapshotSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSnapshotSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSnapshotSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSnapshotSettingResponse response) {
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
        public Builder body(UpdateSnapshotSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSnapshotSettingResponse build() {
            return new UpdateSnapshotSettingResponse(this);
        } 

    } 

}
