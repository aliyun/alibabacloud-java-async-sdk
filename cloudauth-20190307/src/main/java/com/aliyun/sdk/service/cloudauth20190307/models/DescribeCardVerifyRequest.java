// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeCardVerifyRequest} extends {@link RequestModel}
 *
 * <p>DescribeCardVerifyRequest</p>
 */
public class DescribeCardVerifyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certifyId;

    private DescribeCardVerifyRequest(Builder builder) {
        super(builder);
        this.certifyId = builder.certifyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCardVerifyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    public static final class Builder extends Request.Builder<DescribeCardVerifyRequest, Builder> {
        private String certifyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCardVerifyRequest request) {
            super(request);
            this.certifyId = request.certifyId;
        } 

        /**
         * <p>Authentication request ID.
         * You must first call the initialization interface InitCardVerify to submit an authentication request in order to get the authentication request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>91707dc296d469ad38e4c5efa6a0xxxx</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        @Override
        public DescribeCardVerifyRequest build() {
            return new DescribeCardVerifyRequest(this);
        } 

    } 

}
