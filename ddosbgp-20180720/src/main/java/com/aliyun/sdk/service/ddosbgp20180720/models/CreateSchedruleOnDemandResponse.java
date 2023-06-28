// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchedruleOnDemandResponse} extends {@link TeaModel}
 *
 * <p>CreateSchedruleOnDemandResponse</p>
 */
public class CreateSchedruleOnDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSchedruleOnDemandResponseBody body;

    private CreateSchedruleOnDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSchedruleOnDemandResponse create() {
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
    public CreateSchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSchedruleOnDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSchedruleOnDemandResponseBody body);

        @Override
        CreateSchedruleOnDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSchedruleOnDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSchedruleOnDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSchedruleOnDemandResponse response) {
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
        public Builder body(CreateSchedruleOnDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSchedruleOnDemandResponse build() {
            return new CreateSchedruleOnDemandResponse(this);
        } 

    } 

}
