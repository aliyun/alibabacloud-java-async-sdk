// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListK8sIngressRulesRequest} extends {@link RequestModel}
 *
 * <p>ListK8sIngressRulesRequest</p>
 */
public class ListK8sIngressRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListK8sIngressRulesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.condition = builder.condition;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sIngressRulesRequest create() {
        return builder().build();
    }

@Override
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
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListK8sIngressRulesRequest, Builder> {
        private String clusterId; 
        private String condition; 
        private String namespace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListK8sIngressRulesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.condition = request.condition;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5b2b4ab4-efbc-4a81-9c45-xxxxxxxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The filter conditions. Set the value to a JSON string in the format of {&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;my-&quot;}, where:</p>
         * <ul>
         * <li>field: the parameter to be matched. Valid values: Name and ClusterName.</li>
         * <li>pattern: the content to be matched.</li>
         * </ul>
         * <p>For example, a value of {&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;my-&quot;} indicates that the specified filter conditions match the routing rules whose names start with my-.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;my-&quot;}</p>
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The ID of the region where the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListK8sIngressRulesRequest build() {
            return new ListK8sIngressRulesRequest(this);
        } 

    } 

}
