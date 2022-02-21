// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateZoneRecordResponse} extends {@link TeaModel}
 *
 * <p>UpdateZoneRecordResponse</p>
 */
public class UpdateZoneRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateZoneRecordResponseBody body;

    private UpdateZoneRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateZoneRecordResponse create() {
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
    public UpdateZoneRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateZoneRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateZoneRecordResponseBody body);

        @Override
        UpdateZoneRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateZoneRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateZoneRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateZoneRecordResponse response) {
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
        public Builder body(UpdateZoneRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateZoneRecordResponse build() {
            return new UpdateZoneRecordResponse(this);
        } 

    } 

}
