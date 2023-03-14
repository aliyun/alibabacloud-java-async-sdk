// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribleLayer7InstanceRelationsResponse} extends {@link TeaModel}
 *
 * <p>DescribleLayer7InstanceRelationsResponse</p>
 */
public class DescribleLayer7InstanceRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribleLayer7InstanceRelationsResponseBody body;

    private DescribleLayer7InstanceRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribleLayer7InstanceRelationsResponse create() {
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
    public DescribleLayer7InstanceRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribleLayer7InstanceRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribleLayer7InstanceRelationsResponseBody body);

        @Override
        DescribleLayer7InstanceRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribleLayer7InstanceRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribleLayer7InstanceRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribleLayer7InstanceRelationsResponse response) {
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
        public Builder body(DescribleLayer7InstanceRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribleLayer7InstanceRelationsResponse build() {
            return new DescribleLayer7InstanceRelationsResponse(this);
        } 

    } 

}
