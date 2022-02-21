// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEventRecordPlanDeviceResponse} extends {@link TeaModel}
 *
 * <p>AddEventRecordPlanDeviceResponse</p>
 */
public class AddEventRecordPlanDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddEventRecordPlanDeviceResponseBody body;

    private AddEventRecordPlanDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddEventRecordPlanDeviceResponse create() {
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
    public AddEventRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddEventRecordPlanDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddEventRecordPlanDeviceResponseBody body);

        @Override
        AddEventRecordPlanDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddEventRecordPlanDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddEventRecordPlanDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddEventRecordPlanDeviceResponse response) {
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
        public Builder body(AddEventRecordPlanDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddEventRecordPlanDeviceResponse build() {
            return new AddEventRecordPlanDeviceResponse(this);
        } 

    } 

}
