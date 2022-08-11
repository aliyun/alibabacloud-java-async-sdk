// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaTableIntroWikiResponse} extends {@link TeaModel}
 *
 * <p>UpdateMetaTableIntroWikiResponse</p>
 */
public class UpdateMetaTableIntroWikiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMetaTableIntroWikiResponseBody body;

    private UpdateMetaTableIntroWikiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMetaTableIntroWikiResponse create() {
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
    public UpdateMetaTableIntroWikiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMetaTableIntroWikiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMetaTableIntroWikiResponseBody body);

        @Override
        UpdateMetaTableIntroWikiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMetaTableIntroWikiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMetaTableIntroWikiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMetaTableIntroWikiResponse response) {
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
        public Builder body(UpdateMetaTableIntroWikiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMetaTableIntroWikiResponse build() {
            return new UpdateMetaTableIntroWikiResponse(this);
        } 

    } 

}
