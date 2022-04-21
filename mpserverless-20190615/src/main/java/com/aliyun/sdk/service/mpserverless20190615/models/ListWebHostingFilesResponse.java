// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWebHostingFilesResponse} extends {@link TeaModel}
 *
 * <p>ListWebHostingFilesResponse</p>
 */
public class ListWebHostingFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWebHostingFilesResponseBody body;

    private ListWebHostingFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWebHostingFilesResponse create() {
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
    public ListWebHostingFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWebHostingFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWebHostingFilesResponseBody body);

        @Override
        ListWebHostingFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWebHostingFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWebHostingFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWebHostingFilesResponse response) {
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
        public Builder body(ListWebHostingFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWebHostingFilesResponse build() {
            return new ListWebHostingFilesResponse(this);
        } 

    } 

}
