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
 * {@link ExecuteCrossCloudOpenAPIResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteCrossCloudOpenAPIResponseBody</p>
 */
public class ExecuteCrossCloudOpenAPIResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProxyData")
    private String proxyData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExecuteCrossCloudOpenAPIResponseBody(Builder builder) {
        this.proxyData = builder.proxyData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteCrossCloudOpenAPIResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return proxyData
     */
    public String getProxyData() {
        return this.proxyData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String proxyData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteCrossCloudOpenAPIResponseBody model) {
            this.proxyData = model.proxyData;
            this.requestId = model.requestId;
        } 

        /**
         * ProxyData.
         */
        public Builder proxyData(String proxyData) {
            this.proxyData = proxyData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteCrossCloudOpenAPIResponseBody build() {
            return new ExecuteCrossCloudOpenAPIResponseBody(this);
        } 

    } 

}
