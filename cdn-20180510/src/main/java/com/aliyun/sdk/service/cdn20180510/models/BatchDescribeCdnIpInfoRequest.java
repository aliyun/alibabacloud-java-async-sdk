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
 * {@link BatchDescribeCdnIpInfoRequest} extends {@link RequestModel}
 *
 * <p>BatchDescribeCdnIpInfoRequest</p>
 */
public class BatchDescribeCdnIpInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpAddrList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipAddrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    private BatchDescribeCdnIpInfoRequest(Builder builder) {
        super(builder);
        this.ipAddrList = builder.ipAddrList;
        this.language = builder.language;
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

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<BatchDescribeCdnIpInfoRequest, Builder> {
        private String ipAddrList; 
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(BatchDescribeCdnIpInfoRequest request) {
            super(request);
            this.ipAddrList = request.ipAddrList;
            this.language = request.language;
        } 

        /**
         * <p>The list of IP addresses to query. Separate IP addresses with commas (,). You can specify up to 20 IP addresses at a time.</p>
         * <blockquote>
         * <ul>
         * <li>Example of an IPv4 address: 192.0.2.1</li>
         * <li>Example of an IPv6 address: 2001:db8:ffff:ffff:ffff:****:ffff.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111.XXX.XXX.230,47.XXX.XXX.243</p>
         */
        public Builder ipAddrList(String ipAddrList) {
            this.putQueryParameter("IpAddrList", ipAddrList);
            this.ipAddrList = ipAddrList;
            return this;
        }

        /**
         * <p>The language of the query results. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Simplified Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        @Override
        public BatchDescribeCdnIpInfoRequest build() {
            return new BatchDescribeCdnIpInfoRequest(this);
        } 

    } 

}
