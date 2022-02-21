// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetZoneRecordStatusResponse} extends {@link TeaModel}
 *
 * <p>SetZoneRecordStatusResponse</p>
 */
public class SetZoneRecordStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetZoneRecordStatusResponseBody body;

    private SetZoneRecordStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetZoneRecordStatusResponse create() {
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
    public SetZoneRecordStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetZoneRecordStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetZoneRecordStatusResponseBody body);

        @Override
        SetZoneRecordStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetZoneRecordStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetZoneRecordStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetZoneRecordStatusResponse response) {
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
        public Builder body(SetZoneRecordStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetZoneRecordStatusResponse build() {
            return new SetZoneRecordStatusResponse(this);
        } 

    } 

}
