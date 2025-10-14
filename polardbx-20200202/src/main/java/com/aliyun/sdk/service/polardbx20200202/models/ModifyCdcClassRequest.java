// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ModifyCdcClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdcClassRequest</p>
 */
public class ModifyCdcClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CDCNodeCount")
    private String CDCNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdcClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdcClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchMode")
    private String switchMode;

    private ModifyCdcClassRequest(Builder builder) {
        super(builder);
        this.CDCNodeCount = builder.CDCNodeCount;
        this.cdcClass = builder.cdcClass;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.switchMode = builder.switchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdcClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CDCNodeCount
     */
    public String getCDCNodeCount() {
        return this.CDCNodeCount;
    }

    /**
     * @return cdcClass
     */
    public String getCdcClass() {
        return this.cdcClass;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return switchMode
     */
    public String getSwitchMode() {
        return this.switchMode;
    }

    public static final class Builder extends Request.Builder<ModifyCdcClassRequest, Builder> {
        private String CDCNodeCount; 
        private String cdcClass; 
        private String instanceName; 
        private String regionId; 
        private String switchMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCdcClassRequest request) {
            super(request);
            this.CDCNodeCount = request.CDCNodeCount;
            this.cdcClass = request.cdcClass;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
            this.switchMode = request.switchMode;
        } 

        /**
         * CDCNodeCount.
         */
        public Builder CDCNodeCount(String CDCNodeCount) {
            this.putQueryParameter("CDCNodeCount", CDCNodeCount);
            this.CDCNodeCount = CDCNodeCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>premium</p>
         */
        public Builder cdcClass(String cdcClass) {
            this.putQueryParameter("CdcClass", cdcClass);
            this.cdcClass = cdcClass;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzrh51fze****pon-cdc</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SwitchMode.
         */
        public Builder switchMode(String switchMode) {
            this.putQueryParameter("SwitchMode", switchMode);
            this.switchMode = switchMode;
            return this;
        }

        @Override
        public ModifyCdcClassRequest build() {
            return new ModifyCdcClassRequest(this);
        } 

    } 

}
