// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

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
 * {@link DescribeIpLocationServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpLocationServiceRequest</p>
 */
public class DescribeIpLocationServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internetIp;

    private DescribeIpLocationServiceRequest(Builder builder) {
        super(builder);
        this.internetIp = builder.internetIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpLocationServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    public static final class Builder extends Request.Builder<DescribeIpLocationServiceRequest, Builder> {
        private String internetIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpLocationServiceRequest request) {
            super(request);
            this.internetIp = request.internetIp;
        } 

        /**
         * <p>The IP address of the asset to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121.199.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        @Override
        public DescribeIpLocationServiceRequest build() {
            return new DescribeIpLocationServiceRequest(this);
        } 

    } 

}
