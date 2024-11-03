// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIpStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpStatusRequest</p>
 */
public class DescribeIpStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ips")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ips;

    private DescribeIpStatusRequest(Builder builder) {
        super(builder);
        this.ips = builder.ips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ips
     */
    public String getIps() {
        return this.ips;
    }

    public static final class Builder extends Request.Builder<DescribeIpStatusRequest, Builder> {
        private String ips; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpStatusRequest request) {
            super(request);
            this.ips = request.ips;
        } 

        /**
         * <p>The IP addresses that you want to query. Separate IP addresses with underscores (_), such as Ips=ip1_ip2.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip1_ip2</p>
         */
        public Builder ips(String ips) {
            this.putQueryParameter("Ips", ips);
            this.ips = ips;
            return this;
        }

        @Override
        public DescribeIpStatusRequest build() {
            return new DescribeIpStatusRequest(this);
        } 

    } 

}
