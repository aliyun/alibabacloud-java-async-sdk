// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentClientVersionResponse} extends {@link TeaModel}
 *
 * <p>ListCurrentClientVersionResponse</p>
 */
public class ListCurrentClientVersionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListCurrentClientVersionResponseBody body;

    private ListCurrentClientVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListCurrentClientVersionResponse create() {
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
    public ListCurrentClientVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCurrentClientVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListCurrentClientVersionResponseBody body);

        @Override
        ListCurrentClientVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCurrentClientVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListCurrentClientVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCurrentClientVersionResponse response) {
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
        public Builder body(ListCurrentClientVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCurrentClientVersionResponse build() {
            return new ListCurrentClientVersionResponse(this);
        } 

    } 

}
