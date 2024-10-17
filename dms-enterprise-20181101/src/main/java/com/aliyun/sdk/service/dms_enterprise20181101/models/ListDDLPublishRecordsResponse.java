// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDDLPublishRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListDDLPublishRecordsResponse</p>
 */
public class ListDDLPublishRecordsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListDDLPublishRecordsResponseBody body;

    private ListDDLPublishRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDDLPublishRecordsResponse create() {
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
    public ListDDLPublishRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDDLPublishRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDDLPublishRecordsResponseBody body);

        @Override
        ListDDLPublishRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDDLPublishRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListDDLPublishRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDDLPublishRecordsResponse response) {
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
        public Builder body(ListDDLPublishRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDDLPublishRecordsResponse build() {
            return new ListDDLPublishRecordsResponse(this);
        } 

    } 

}
