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
 * {@link MigrateResourceInstanceRequest} extends {@link RequestModel}
 *
 * <p>MigrateResourceInstanceRequest</p>
 */
public class MigrateResourceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MigrateToHybrid")
    private Boolean migrateToHybrid;

    private MigrateResourceInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.destResourceId = builder.destResourceId;
        this.instanceIds = builder.instanceIds;
        this.migrateToHybrid = builder.migrateToHybrid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateResourceInstanceRequest create() {
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
     * @return destResourceId
     */
    public String getDestResourceId() {
        return this.destResourceId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return migrateToHybrid
     */
    public Boolean getMigrateToHybrid() {
        return this.migrateToHybrid;
    }

    public static final class Builder extends Request.Builder<MigrateResourceInstanceRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String destResourceId; 
        private java.util.List<String> instanceIds; 
        private Boolean migrateToHybrid; 

        private Builder() {
            super();
        } 

        private Builder(MigrateResourceInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.destResourceId = request.destResourceId;
            this.instanceIds = request.instanceIds;
            this.migrateToHybrid = request.migrateToHybrid;
        } 

        /**
         * <p>The ID of the cluster to which the resource group belongs.</p>
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
         * <p>The resource group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-asdasdasd****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The ID of the destination resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-asdasdasd****</p>
         */
        public Builder destResourceId(String destResourceId) {
            this.putBodyParameter("DestResourceId", destResourceId);
            this.destResourceId = destResourceId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * MigrateToHybrid.
         */
        public Builder migrateToHybrid(Boolean migrateToHybrid) {
            this.putBodyParameter("MigrateToHybrid", migrateToHybrid);
            this.migrateToHybrid = migrateToHybrid;
            return this;
        }

        @Override
        public MigrateResourceInstanceRequest build() {
            return new MigrateResourceInstanceRequest(this);
        } 

    } 

}
