// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForSynchronizingDnsHostResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForSynchronizingDnsHostResponse</p>
 */
public class SaveSingleTaskForSynchronizingDnsHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSingleTaskForSynchronizingDnsHostResponseBody body;

    private SaveSingleTaskForSynchronizingDnsHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSingleTaskForSynchronizingDnsHostResponse create() {
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
    public SaveSingleTaskForSynchronizingDnsHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForSynchronizingDnsHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSingleTaskForSynchronizingDnsHostResponseBody body);

        @Override
        SaveSingleTaskForSynchronizingDnsHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForSynchronizingDnsHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSingleTaskForSynchronizingDnsHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForSynchronizingDnsHostResponse response) {
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
        public Builder body(SaveSingleTaskForSynchronizingDnsHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForSynchronizingDnsHostResponse build() {
            return new SaveSingleTaskForSynchronizingDnsHostResponse(this);
        } 

    } 

}
