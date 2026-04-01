// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AttachInstancesToNodePoolRequest} extends {@link RequestModel}
 *
 * <p>AttachInstancesToNodePoolRequest</p>
 */
public class AttachInstancesToNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodepoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    private AttachInstancesToNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instances = builder.instances;
        this.nodepoolId = builder.nodepoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstancesToNodePoolRequest create() {
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
     * @return instances
     */
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public static final class Builder extends Request.Builder<AttachInstancesToNodePoolRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> instances; 
        private String nodepoolId; 

        private Builder() {
            super();
        } 

        private Builder(AttachInstancesToNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instances = request.instances;
            this.nodepoolId = request.nodepoolId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List<String> instances) {
            String instancesShrink = shrink(instances, "Instances", "json");
            this.putQueryParameter("Instances", instancesShrink);
            this.instances = instances;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putQueryParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        @Override
        public AttachInstancesToNodePoolRequest build() {
            return new AttachInstancesToNodePoolRequest(this);
        } 

    } 

}
