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
    @com.aliyun.core.annotation.NameInMap("LogVersion")
    private Integer logVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    private String slsRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer storageTime;

    private ModifyUserSlsLogStorageTimeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.logVersion = builder.logVersion;
        this.slsRegionId = builder.slsRegionId;
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
     * @return logVersion
     */
    public Integer getLogVersion() {
        return this.logVersion;
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    /**
     * @return storageTime
     */
    public Integer getStorageTime() {
        return this.storageTime;
    }

    public static final class Builder extends Request.Builder<ModifyUserSlsLogStorageTimeRequest, Builder> {
        private String instanceId; 
        private Integer logVersion; 
        private String slsRegionId; 
        private Integer storageTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserSlsLogStorageTimeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.logVersion = request.logVersion;
            this.slsRegionId = request.slsRegionId;
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
         * LogVersion.
         */
        public Builder logVersion(Integer logVersion) {
            this.putQueryParameter("LogVersion", logVersion);
            this.logVersion = logVersion;
            return this;
        }

        /**
         * SlsRegionId.
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putQueryParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
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
