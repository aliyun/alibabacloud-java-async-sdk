// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EstablishRelationTableToBusinessResponse} extends {@link TeaModel}
 *
 * <p>EstablishRelationTableToBusinessResponse</p>
 */
public class EstablishRelationTableToBusinessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EstablishRelationTableToBusinessResponseBody body;

    private EstablishRelationTableToBusinessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EstablishRelationTableToBusinessResponse create() {
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
    public EstablishRelationTableToBusinessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EstablishRelationTableToBusinessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EstablishRelationTableToBusinessResponseBody body);

        @Override
        EstablishRelationTableToBusinessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EstablishRelationTableToBusinessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EstablishRelationTableToBusinessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EstablishRelationTableToBusinessResponse response) {
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
        public Builder body(EstablishRelationTableToBusinessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EstablishRelationTableToBusinessResponse build() {
            return new EstablishRelationTableToBusinessResponse(this);
        } 

    } 

}
