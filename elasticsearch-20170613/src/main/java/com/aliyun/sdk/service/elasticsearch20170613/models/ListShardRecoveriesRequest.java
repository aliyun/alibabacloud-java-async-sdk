// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShardRecoveriesRequest} extends {@link RequestModel}
 *
 * <p>ListShardRecoveriesRequest</p>
 */
public class ListShardRecoveriesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("activeOnly")
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

        private Builder(ListShardRecoveriesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.activeOnly = response.activeOnly;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * activeOnly.
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
