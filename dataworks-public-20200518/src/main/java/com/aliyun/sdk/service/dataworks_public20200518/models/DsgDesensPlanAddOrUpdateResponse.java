// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DsgDesensPlanAddOrUpdateResponse} extends {@link TeaModel}
 *
 * <p>DsgDesensPlanAddOrUpdateResponse</p>
 */
public class DsgDesensPlanAddOrUpdateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DsgDesensPlanAddOrUpdateResponseBody body;

    private DsgDesensPlanAddOrUpdateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DsgDesensPlanAddOrUpdateResponse create() {
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
    public DsgDesensPlanAddOrUpdateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DsgDesensPlanAddOrUpdateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DsgDesensPlanAddOrUpdateResponseBody body);

        @Override
        DsgDesensPlanAddOrUpdateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DsgDesensPlanAddOrUpdateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DsgDesensPlanAddOrUpdateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DsgDesensPlanAddOrUpdateResponse response) {
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
        public Builder body(DsgDesensPlanAddOrUpdateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DsgDesensPlanAddOrUpdateResponse build() {
            return new DsgDesensPlanAddOrUpdateResponse(this);
        } 

    } 

}
