// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sIngressRulesRequest} extends {@link RequestModel}
 *
 * <p>ListK8sIngressRulesRequest</p>
 */
public class ListK8sIngressRulesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Condition")
    private String condition;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("RegionId")
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
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The filter conditions. Set the value to a JSON string in the format of {"field":"Name", "pattern":"my-"}, where:
         * <p>
         * 
         * *   field: the parameter to be matched. Valid values: Name and ClusterName.
         * *   pattern: the content to be matched.
         * 
         * For example, a value of {"field":"Name", "pattern":"my-"} indicates that the specified filter conditions match the routing rules whose names start with my-.
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * The namespace of the Kubernetes cluster.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The ID of the region where the cluster resides.
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
