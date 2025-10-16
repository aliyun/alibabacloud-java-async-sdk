// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyUserSlsLogStorageTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserSlsLogStorageTimeRequest</p>
 */
public class ModifyUserSlsLogStorageTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer storageTime;

    private ModifyUserSlsLogStorageTimeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.storageTime = builder.storageTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserSlsLogStorageTimeRequest create() {
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
     * @return storageTime
     */
    public Integer getStorageTime() {
        return this.storageTime;
    }

    public static final class Builder extends Request.Builder<ModifyUserSlsLogStorageTimeRequest, Builder> {
        private String instanceId; 
        private Integer storageTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserSlsLogStorageTimeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.storageTime = request.storageTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vipcloudfw-cn-uqm3fz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder storageTime(Integer storageTime) {
            this.putQueryParameter("StorageTime", storageTime);
            this.storageTime = storageTime;
            return this;
        }

        @Override
        public ModifyUserSlsLogStorageTimeRequest build() {
            return new ModifyUserSlsLogStorageTimeRequest(this);
        } 

    } 

}
