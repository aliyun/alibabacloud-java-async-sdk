// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShardRecoveriesRequest} extends {@link RequestModel}
 *
 * <p>ListShardRecoveriesRequest</p>
 */
public class ListShardRecoveriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("activeOnly")
    private Boolean activeOnly;

    private ListShardRecoveriesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.activeOnly = builder.activeOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShardRecoveriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return activeOnly
     */
    public Boolean getActiveOnly() {
        return this.activeOnly;
    }

    public static final class Builder extends Request.Builder<ListShardRecoveriesRequest, Builder> {
        private String instanceId; 
        private Boolean activeOnly; 

        private Builder() {
            super();
        } 

        private Builder(ListShardRecoveriesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.activeOnly = request.activeOnly;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to return information about data restoration of shards. Valid values:
         * <p>
         * 
         * *   true: returns information about data restoration of shards that are being restored.
         * *   false: returns information about data restoration of all shards.
         */
        public Builder activeOnly(Boolean activeOnly) {
            this.putQueryParameter("activeOnly", activeOnly);
            this.activeOnly = activeOnly;
            return this;
        }

        @Override
        public ListShardRecoveriesRequest build() {
            return new ListShardRecoveriesRequest(this);
        } 

    } 

}
