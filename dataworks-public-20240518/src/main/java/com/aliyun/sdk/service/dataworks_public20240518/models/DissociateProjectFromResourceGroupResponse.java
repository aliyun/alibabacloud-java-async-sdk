// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DissociateProjectFromResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>DissociateProjectFromResourceGroupResponse</p>
 */
public class DissociateProjectFromResourceGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DissociateProjectFromResourceGroupResponseBody body;

    private DissociateProjectFromResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DissociateProjectFromResourceGroupResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public DissociateProjectFromResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateProjectFromResourceGroupResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DissociateProjectFromResourceGroupResponseBody body);

        @Override
        DissociateProjectFromResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateProjectFromResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DissociateProjectFromResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateProjectFromResourceGroupResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(DissociateProjectFromResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateProjectFromResourceGroupResponse build() {
            return new DissociateProjectFromResourceGroupResponse(this);
        } 

    } 

}
