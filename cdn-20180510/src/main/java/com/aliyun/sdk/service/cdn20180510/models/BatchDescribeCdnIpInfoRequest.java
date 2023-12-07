// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDescribeCdnIpInfoRequest} extends {@link RequestModel}
 *
 * <p>BatchDescribeCdnIpInfoRequest</p>
 */
public class BatchDescribeCdnIpInfoRequest extends Request {
    @Query
    @NameInMap("IpAddrList")
    @Validation(required = true)
    private String ipAddrList;

    private BatchDescribeCdnIpInfoRequest(Builder builder) {
        super(builder);
        this.ipAddrList = builder.ipAddrList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDescribeCdnIpInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipAddrList
     */
    public String getIpAddrList() {
        return this.ipAddrList;
    }

    public static final class Builder extends Request.Builder<BatchDescribeCdnIpInfoRequest, Builder> {
        private String ipAddrList; 

        private Builder() {
            super();
        } 

        private Builder(BatchDescribeCdnIpInfoRequest request) {
            super(request);
            this.ipAddrList = request.ipAddrList;
        } 

        /**
         * The list of IP addresses to query. Separate IP addresses with commas (,). You can specify up to 20 IP addresses at a time.
         * <p>
         * 
         * > 
         * 
         * *   Example of an IPv4 address: 192.0.2.1
         * 
         * *   Example of an IPv6 address: 2001:db8:ffff:ffff:ffff:ffff:ffff:ffff
         */
        public Builder ipAddrList(String ipAddrList) {
            this.putQueryParameter("IpAddrList", ipAddrList);
            this.ipAddrList = ipAddrList;
            return this;
        }

        @Override
        public BatchDescribeCdnIpInfoRequest build() {
            return new BatchDescribeCdnIpInfoRequest(this);
        } 

    } 

}
