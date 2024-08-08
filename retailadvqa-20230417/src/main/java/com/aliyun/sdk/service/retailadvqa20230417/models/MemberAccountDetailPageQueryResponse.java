// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MemberAccountDetailPageQueryResponse} extends {@link TeaModel}
 *
 * <p>MemberAccountDetailPageQueryResponse</p>
 */
public class MemberAccountDetailPageQueryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private MemberAccountDetailPageQueryResponseBody body;

    private MemberAccountDetailPageQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static MemberAccountDetailPageQueryResponse create() {
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
    public MemberAccountDetailPageQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MemberAccountDetailPageQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(MemberAccountDetailPageQueryResponseBody body);

        @Override
        MemberAccountDetailPageQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MemberAccountDetailPageQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private MemberAccountDetailPageQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MemberAccountDetailPageQueryResponse response) {
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
        public Builder body(MemberAccountDetailPageQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MemberAccountDetailPageQueryResponse build() {
            return new MemberAccountDetailPageQueryResponse(this);
        } 

    } 

}
