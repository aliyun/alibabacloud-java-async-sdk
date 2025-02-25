// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CalculateMemberLevelResponse} extends {@link TeaModel}
 *
 * <p>CalculateMemberLevelResponse</p>
 */
public class CalculateMemberLevelResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CalculateMemberLevelResponseBody body;

    private CalculateMemberLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CalculateMemberLevelResponse create() {
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
    public CalculateMemberLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CalculateMemberLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CalculateMemberLevelResponseBody body);

        @Override
        CalculateMemberLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CalculateMemberLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CalculateMemberLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CalculateMemberLevelResponse response) {
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
        public Builder body(CalculateMemberLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CalculateMemberLevelResponse build() {
            return new CalculateMemberLevelResponse(this);
        } 

    } 

}
