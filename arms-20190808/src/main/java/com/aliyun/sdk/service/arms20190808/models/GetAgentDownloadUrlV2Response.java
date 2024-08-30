// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentDownloadUrlV2Response} extends {@link TeaModel}
 *
 * <p>GetAgentDownloadUrlV2Response</p>
 */
public class GetAgentDownloadUrlV2Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAgentDownloadUrlV2ResponseBody body;

    private GetAgentDownloadUrlV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAgentDownloadUrlV2Response create() {
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
    public GetAgentDownloadUrlV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentDownloadUrlV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAgentDownloadUrlV2ResponseBody body);

        @Override
        GetAgentDownloadUrlV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentDownloadUrlV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAgentDownloadUrlV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentDownloadUrlV2Response response) {
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
        public Builder body(GetAgentDownloadUrlV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentDownloadUrlV2Response build() {
            return new GetAgentDownloadUrlV2Response(this);
        } 

    } 

}
