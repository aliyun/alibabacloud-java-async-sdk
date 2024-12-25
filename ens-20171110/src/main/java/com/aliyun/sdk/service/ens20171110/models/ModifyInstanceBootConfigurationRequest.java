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
 * {@link ModifyInstanceBootConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceBootConfigurationRequest</p>
 */
public class ModifyInstanceBootConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BootSet")
    private String bootSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BootType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bootType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSet")
    private String diskSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ModifyInstanceBootConfigurationRequest(Builder builder) {
        super(builder);
        this.bootSet = builder.bootSet;
        this.bootType = builder.bootType;
        this.diskSet = builder.diskSet;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceBootConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bootSet
     */
    public String getBootSet() {
        return this.bootSet;
    }

    /**
     * @return bootType
     */
    public String getBootType() {
        return this.bootType;
    }

    /**
     * @return diskSet
     */
    public String getDiskSet() {
        return this.diskSet;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceBootConfigurationRequest, Builder> {
        private String bootSet; 
        private String bootType; 
        private String diskSet; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceBootConfigurationRequest request) {
            super(request);
            this.bootSet = request.bootSet;
            this.bootType = request.bootType;
            this.diskSet = request.diskSet;
            this.instanceId = request.instanceId;
        } 

        /**
         * BootSet.
         */
        public Builder bootSet(String bootSet) {
            this.putQueryParameter("BootSet", bootSet);
            this.bootSet = bootSet;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxe</p>
         */
        public Builder bootType(String bootType) {
            this.putQueryParameter("BootType", bootType);
            this.bootType = bootType;
            return this;
        }

        /**
         * DiskSet.
         */
        public Builder diskSet(String diskSet) {
            this.putQueryParameter("DiskSet", diskSet);
            this.diskSet = diskSet;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-instance****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyInstanceBootConfigurationRequest build() {
            return new ModifyInstanceBootConfigurationRequest(this);
        } 

    } 

}
