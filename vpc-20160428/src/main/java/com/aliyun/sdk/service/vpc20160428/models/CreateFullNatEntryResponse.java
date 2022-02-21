// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFullNatEntryResponse} extends {@link TeaModel}
 *
 * <p>CreateFullNatEntryResponse</p>
 */
public class CreateFullNatEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFullNatEntryResponseBody body;

    private CreateFullNatEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFullNatEntryResponse create() {
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
    public CreateFullNatEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFullNatEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFullNatEntryResponseBody body);

        @Override
        CreateFullNatEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFullNatEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFullNatEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFullNatEntryResponse response) {
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
        public Builder body(CreateFullNatEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFullNatEntryResponse build() {
            return new CreateFullNatEntryResponse(this);
        } 

    } 

}
