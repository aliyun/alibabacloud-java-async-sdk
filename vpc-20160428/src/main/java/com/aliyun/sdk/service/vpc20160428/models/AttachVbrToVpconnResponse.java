// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachVbrToVpconnResponse} extends {@link TeaModel}
 *
 * <p>AttachVbrToVpconnResponse</p>
 */
public class AttachVbrToVpconnResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AttachVbrToVpconnResponseBody body;

    private AttachVbrToVpconnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AttachVbrToVpconnResponse create() {
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
    public AttachVbrToVpconnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachVbrToVpconnResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AttachVbrToVpconnResponseBody body);

        @Override
        AttachVbrToVpconnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachVbrToVpconnResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AttachVbrToVpconnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachVbrToVpconnResponse response) {
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
        public Builder body(AttachVbrToVpconnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachVbrToVpconnResponse build() {
            return new AttachVbrToVpconnResponse(this);
        } 

    } 

}
