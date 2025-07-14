// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateHybridCloudClusterRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHybridCloudClusterRuleResponseBody</p>
 */
public class CreateHybridCloudClusterRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterRuleResourceId")
    private String clusterRuleResourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHybridCloudClusterRuleResponseBody(Builder builder) {
        this.clusterRuleResourceId = builder.clusterRuleResourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridCloudClusterRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterRuleResourceId
     */
    public String getClusterRuleResourceId() {
        return this.clusterRuleResourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterRuleResourceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHybridCloudClusterRuleResponseBody model) {
            this.clusterRuleResourceId = model.clusterRuleResourceId;
            this.requestId = model.requestId;
        } 

        /**
         * ClusterRuleResourceId.
         */
        public Builder clusterRuleResourceId(String clusterRuleResourceId) {
            this.clusterRuleResourceId = clusterRuleResourceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHybridCloudClusterRuleResponseBody build() {
            return new CreateHybridCloudClusterRuleResponseBody(this);
        } 

    } 

}
