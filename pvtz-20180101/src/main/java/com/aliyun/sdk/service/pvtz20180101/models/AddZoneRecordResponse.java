// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddZoneRecordResponse} extends {@link TeaModel}
 *
 * <p>AddZoneRecordResponse</p>
 */
public class AddZoneRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddZoneRecordResponseBody body;

    private AddZoneRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddZoneRecordResponse create() {
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
    public AddZoneRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddZoneRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddZoneRecordResponseBody body);

        @Override
        AddZoneRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddZoneRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddZoneRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddZoneRecordResponse response) {
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
        public Builder body(AddZoneRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddZoneRecordResponse build() {
            return new AddZoneRecordResponse(this);
        } 

    } 

}
