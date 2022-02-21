// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse} extends {@link TeaModel}
 *
 * <p>SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse</p>
 */
public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody body;

    private SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse create() {
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
    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody body);

        @Override
        SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse response) {
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
        public Builder body(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse build() {
            return new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse(this);
        } 

    } 

}
