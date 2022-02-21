// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForSubmittingDomainDeleteResponse} extends {@link TeaModel}
 *
 * <p>SaveTaskForSubmittingDomainDeleteResponse</p>
 */
public class SaveTaskForSubmittingDomainDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveTaskForSubmittingDomainDeleteResponseBody body;

    private SaveTaskForSubmittingDomainDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveTaskForSubmittingDomainDeleteResponse create() {
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
    public SaveTaskForSubmittingDomainDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTaskForSubmittingDomainDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveTaskForSubmittingDomainDeleteResponseBody body);

        @Override
        SaveTaskForSubmittingDomainDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTaskForSubmittingDomainDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveTaskForSubmittingDomainDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTaskForSubmittingDomainDeleteResponse response) {
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
        public Builder body(SaveTaskForSubmittingDomainDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveTaskForSubmittingDomainDeleteResponse build() {
            return new SaveTaskForSubmittingDomainDeleteResponse(this);
        } 

    } 

}
