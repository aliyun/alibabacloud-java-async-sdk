// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIoTCloudConnectorGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteIoTCloudConnectorGroupResponse</p>
 */
public class DeleteIoTCloudConnectorGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIoTCloudConnectorGroupResponseBody body;

    private DeleteIoTCloudConnectorGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIoTCloudConnectorGroupResponse create() {
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
    public DeleteIoTCloudConnectorGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIoTCloudConnectorGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIoTCloudConnectorGroupResponseBody body);

        @Override
        DeleteIoTCloudConnectorGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIoTCloudConnectorGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIoTCloudConnectorGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIoTCloudConnectorGroupResponse response) {
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
        public Builder body(DeleteIoTCloudConnectorGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIoTCloudConnectorGroupResponse build() {
            return new DeleteIoTCloudConnectorGroupResponse(this);
        } 

    } 

}
