// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ExecuteCrossCloudOpenAPIRequest} extends {@link RequestModel}
 *
 * <p>ExecuteCrossCloudOpenAPIRequest</p>
 */
public class ExecuteCrossCloudOpenAPIRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyInfo")
    private String proxyInfo;

    private ExecuteCrossCloudOpenAPIRequest(Builder builder) {
        super(builder);
        this.proxyInfo = builder.proxyInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteCrossCloudOpenAPIRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return proxyInfo
     */
    public String getProxyInfo() {
        return this.proxyInfo;
    }

    public static final class Builder extends Request.Builder<ExecuteCrossCloudOpenAPIRequest, Builder> {
        private String proxyInfo; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteCrossCloudOpenAPIRequest request) {
            super(request);
            this.proxyInfo = request.proxyInfo;
        } 

        /**
         * ProxyInfo.
         */
        public Builder proxyInfo(String proxyInfo) {
            this.putQueryParameter("ProxyInfo", proxyInfo);
            this.proxyInfo = proxyInfo;
            return this;
        }

        @Override
        public ExecuteCrossCloudOpenAPIRequest build() {
            return new ExecuteCrossCloudOpenAPIRequest(this);
        } 

    } 

}
