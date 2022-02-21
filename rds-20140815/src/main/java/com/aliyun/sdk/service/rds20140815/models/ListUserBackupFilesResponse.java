// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserBackupFilesResponse} extends {@link TeaModel}
 *
 * <p>ListUserBackupFilesResponse</p>
 */
public class ListUserBackupFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserBackupFilesResponseBody body;

    private ListUserBackupFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserBackupFilesResponse create() {
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
    public ListUserBackupFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserBackupFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserBackupFilesResponseBody body);

        @Override
        ListUserBackupFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserBackupFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserBackupFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserBackupFilesResponse response) {
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
        public Builder body(ListUserBackupFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserBackupFilesResponse build() {
            return new ListUserBackupFilesResponse(this);
        } 

    } 

}
