// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListLiveSnapshotFilesResponse} extends {@link TeaModel}
 *
 * <p>ListLiveSnapshotFilesResponse</p>
 */
public class ListLiveSnapshotFilesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListLiveSnapshotFilesResponseBody body;

    private ListLiveSnapshotFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListLiveSnapshotFilesResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ListLiveSnapshotFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLiveSnapshotFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListLiveSnapshotFilesResponseBody body);

        @Override
        ListLiveSnapshotFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLiveSnapshotFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListLiveSnapshotFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLiveSnapshotFilesResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ListLiveSnapshotFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLiveSnapshotFilesResponse build() {
            return new ListLiveSnapshotFilesResponse(this);
        } 

    } 

}
