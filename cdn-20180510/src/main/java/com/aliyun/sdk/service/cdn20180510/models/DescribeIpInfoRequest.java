// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeIpInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpInfoRequest</p>
 */
public class DescribeIpInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IP")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    private DescribeIpInfoRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder extends Request.Builder<DescribeIpInfoRequest, Builder> {
        private String ip; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpInfoRequest request) {
            super(request);
            this.ip = request.ip;
        } 

        /**
         * <p>The IP address. You can specify only one IP address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("IP", ip);
            this.ip = ip;
            return this;
        }

        @Override
        public DescribeIpInfoRequest build() {
            return new DescribeIpInfoRequest(this);
        } 

    } 

}
