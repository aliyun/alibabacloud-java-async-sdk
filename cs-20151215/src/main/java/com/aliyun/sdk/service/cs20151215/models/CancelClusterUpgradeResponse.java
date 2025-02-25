// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CancelClusterUpgradeResponse} extends {@link TeaModel}
 *
 * <p>CancelClusterUpgradeResponse</p>
 */
public class CancelClusterUpgradeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    private CancelClusterUpgradeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
    }

    public static CancelClusterUpgradeResponse create() {
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

    public interface Builder extends Response.Builder<CancelClusterUpgradeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        @Override
        CancelClusterUpgradeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelClusterUpgradeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelClusterUpgradeResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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

        @Override
        public CancelClusterUpgradeResponse build() {
            return new CancelClusterUpgradeResponse(this);
        } 

    } 

}
