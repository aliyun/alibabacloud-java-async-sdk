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
 * {@link ModifyColumnarClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyColumnarClassRequest</p>
 */
public class ModifyColumnarClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnarClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columnarClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnarNodeCount")
    private String columnarNodeCount;

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

    private ModifyColumnarClassRequest(Builder builder) {
        super(builder);
        this.columnarClass = builder.columnarClass;
        this.columnarNodeCount = builder.columnarNodeCount;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.switchMode = builder.switchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyColumnarClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnarClass
     */
    public String getColumnarClass() {
        return this.columnarClass;
    }

    /**
     * @return columnarNodeCount
     */
    public String getColumnarNodeCount() {
        return this.columnarNodeCount;
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

    public static final class Builder extends Request.Builder<ModifyColumnarClassRequest, Builder> {
        private String columnarClass; 
        private String columnarNodeCount; 
        private String instanceName; 
        private String regionId; 
        private String switchMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyColumnarClassRequest request) {
            super(request);
            this.columnarClass = request.columnarClass;
            this.columnarNodeCount = request.columnarNodeCount;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
            this.switchMode = request.switchMode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.n8.large.col</p>
         */
        public Builder columnarClass(String columnarClass) {
            this.putQueryParameter("ColumnarClass", columnarClass);
            this.columnarClass = columnarClass;
            return this;
        }

        /**
         * ColumnarNodeCount.
         */
        public Builder columnarNodeCount(String columnarNodeCount) {
            this.putQueryParameter("ColumnarNodeCount", columnarNodeCount);
            this.columnarNodeCount = columnarNodeCount;
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
        public ModifyColumnarClassRequest build() {
            return new ModifyColumnarClassRequest(this);
        } 

    } 

}
