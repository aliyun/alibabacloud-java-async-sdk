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
         * <p>The column store specifications.</p>
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
         * <p>The number of column store nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        public Builder columnarNodeCount(String columnarNodeCount) {
            this.putQueryParameter("ColumnarNodeCount", columnarNodeCount);
            this.columnarNodeCount = columnarNodeCount;
            return this;
        }

        /**
         * <p>The instance name.</p>
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
         * <p>The region in which the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
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
         * <p>The switch mode.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
