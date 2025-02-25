// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DeleteResourceInstanceLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceInstanceLabelRequest</p>
 */
public class DeleteResourceInstanceLabelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllInstances")
    private Boolean allInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List<String> keys;

    private DeleteResourceInstanceLabelRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.allInstances = builder.allInstances;
        this.instanceIds = builder.instanceIds;
        this.keys = builder.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceInstanceLabelRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return allInstances
     */
    public Boolean getAllInstances() {
        return this.allInstances;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return keys
     */
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public static final class Builder extends Request.Builder<DeleteResourceInstanceLabelRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private Boolean allInstances; 
        private java.util.List<String> instanceIds; 
        private java.util.List<String> keys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceInstanceLabelRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.allInstances = request.allInstances;
            this.instanceIds = request.instanceIds;
            this.keys = request.keys;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-h7lcw24dyqztwxxxxxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * AllInstances.
         */
        public Builder allInstances(Boolean allInstances) {
            this.putQueryParameter("AllInstances", allInstances);
            this.allInstances = allInstances;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "simple");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Keys.
         */
        public Builder keys(java.util.List<String> keys) {
            String keysShrink = shrink(keys, "Keys", "simple");
            this.putQueryParameter("Keys", keysShrink);
            this.keys = keys;
            return this;
        }

        @Override
        public DeleteResourceInstanceLabelRequest build() {
            return new DeleteResourceInstanceLabelRequest(this);
        } 

    } 

}
