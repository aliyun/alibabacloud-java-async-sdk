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
 * {@link DescribePrePaidInstanceStockRequest} extends {@link RequestModel}
 *
 * <p>DescribePrePaidInstanceStockRequest</p>
 */
public class DescribePrePaidInstanceStockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dataDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 20)
    private Integer systemDiskSize;

    private DescribePrePaidInstanceStockRequest(Builder builder) {
        super(builder);
        this.dataDiskSize = builder.dataDiskSize;
        this.ensRegionId = builder.ensRegionId;
        this.instanceSpec = builder.instanceSpec;
        this.systemDiskSize = builder.systemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrePaidInstanceStockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public static final class Builder extends Request.Builder<DescribePrePaidInstanceStockRequest, Builder> {
        private Integer dataDiskSize; 
        private String ensRegionId; 
        private String instanceSpec; 
        private Integer systemDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrePaidInstanceStockRequest request) {
            super(request);
            this.dataDiskSize = request.dataDiskSize;
            this.ensRegionId = request.ensRegionId;
            this.instanceSpec = request.instanceSpec;
            this.systemDiskSize = request.systemDiskSize;
        } 

        /**
         * <p>The size of the data disk. Unit: GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * <p>The ID of the edge node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-suzhou-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The specification of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.sn1.stiny</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>The size of the system disk. Unit: GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        @Override
        public DescribePrePaidInstanceStockRequest build() {
            return new DescribePrePaidInstanceStockRequest(this);
        } 

    } 

}
