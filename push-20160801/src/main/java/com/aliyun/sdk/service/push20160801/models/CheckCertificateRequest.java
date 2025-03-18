// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link CheckCertificateRequest} extends {@link RequestModel}
 *
 * <p>CheckCertificateRequest</p>
 */
public class CheckCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000000000)
    private Long appKey;

    private CheckCertificateRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    public static final class Builder extends Request.Builder<CheckCertificateRequest, Builder> {
        private Long appKey; 

        private Builder() {
            super();
        } 

        private Builder(CheckCertificateRequest request) {
            super(request);
            this.appKey = request.appKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        @Override
        public CheckCertificateRequest build() {
            return new CheckCertificateRequest(this);
        } 

    } 

}
