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
 * {@link DescribeOssStatusV2Request} extends {@link RequestModel}
 *
 * <p>DescribeOssStatusV2Request</p>
 */
public class DescribeOssStatusV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeOssStatusV2Request(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssStatusV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeOssStatusV2Request, Builder> {
        private String serviceCode; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssStatusV2Request request) {
            super(request);
            this.serviceCode = request.serviceCode;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>ServiceCode for Real Person Cloud products:</p>
         * <ul>
         * <li><strong>antcloudauth</strong>: Financial-grade real person authentication</li>
         * <li><strong>cloudauthst (discontinued)</strong>: Enhanced real person authentication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Visitor&quot;s source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>120.25.41.25</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeOssStatusV2Request build() {
            return new DescribeOssStatusV2Request(this);
        } 

    } 

}
