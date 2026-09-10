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
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProxyData&quot;: &quot;{\&quot;DBCluster\&quot;:[{\&quot;AliyunRegionId\&quot;:\&quot;cn-beijing\&quot;,\&quot;CloudProvider\&quot;:\&quot;huawei\&quot;,\&quot;CreateTime\&quot;:\&quot;2024-11-25T14:49:10Z\&quot;,\&quot;CrossCloudRegionId\&quot;:\&quot;cn-east-3\&quot;,\&quot;DBClusterDescription\&quot;:\&quot;\&quot;,\&quot;DBClusterId\&quot;:\&quot;pc-2zej3qvf5fg******\&quot;,\&quot;DBClusterStatus\&quot;:\&quot;Creating\&quot;,\&quot;DBType\&quot;:\&quot;polardb_mysql\&quot;,\&quot;DBVersion\&quot;:\&quot;8.0\&quot;,\&quot;ProjectId\&quot;:\&quot;pj-bp1m8oh1k68******\&quot;},{\&quot;AliyunRegionId\&quot;:\&quot;cn-beijing\&quot;,\&quot;CloudProvider\&quot;:\&quot;huawei\&quot;,\&quot;CreateTime\&quot;:\&quot;2024-11-25T14:59:10Z\&quot;,\&quot;CrossCloudRegionId\&quot;:\&quot;cn-east-3\&quot;,\&quot;DBClusterDescription\&quot;:\&quot;\&quot;,\&quot;DBClusterId\&quot;:\&quot;pc-2ze29994l17******\&quot;,\&quot;DBClusterStatus\&quot;:\&quot;Running\&quot;,\&quot;DBType\&quot;:\&quot;polardb_mysql\&quot;,\&quot;DBVersion\&quot;:\&quot;8.0\&quot;,\&quot;ProjectId\&quot;:\&quot;pj-bp1m8oh1k68******\&quot;}]}&quot;,&quot;RequestId&quot;: &quot;E56531A4-E552-40BA-9C58-137B80******&quot;}</p>
         */
        public Builder proxyData(String proxyData) {
            this.proxyData = proxyData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E56531A4-E552-40BA-9C58-137B80******</p>
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
