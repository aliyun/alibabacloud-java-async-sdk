// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateRayClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRayClusterResponseBody</p>
 */
public class CreateRayClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateRayClusterResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRayClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRayClusterResponseBody model) {
            this.clusterId = model.clusterId;
            this.requestId = model.requestId;
        } 

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRayClusterResponseBody build() {
            return new CreateRayClusterResponseBody(this);
        } 

    } 

}
