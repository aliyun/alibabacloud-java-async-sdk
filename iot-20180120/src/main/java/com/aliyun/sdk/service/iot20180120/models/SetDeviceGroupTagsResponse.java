// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeviceGroupTagsResponse} extends {@link TeaModel}
 *
 * <p>SetDeviceGroupTagsResponse</p>
 */
public class SetDeviceGroupTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDeviceGroupTagsResponseBody body;

    private SetDeviceGroupTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDeviceGroupTagsResponse create() {
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
    public SetDeviceGroupTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDeviceGroupTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDeviceGroupTagsResponseBody body);

        @Override
        SetDeviceGroupTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDeviceGroupTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDeviceGroupTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDeviceGroupTagsResponse response) {
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
        public Builder body(SetDeviceGroupTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDeviceGroupTagsResponse build() {
            return new SetDeviceGroupTagsResponse(this);
        } 

    } 

}
