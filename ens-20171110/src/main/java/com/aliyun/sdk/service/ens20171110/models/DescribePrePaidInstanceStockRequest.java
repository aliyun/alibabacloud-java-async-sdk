// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrePaidInstanceStockRequest} extends {@link RequestModel}
 *
 * <p>DescribePrePaidInstanceStockRequest</p>
 */
public class DescribePrePaidInstanceStockRequest extends Request {
    @Query
    @NameInMap("DataDiskSize")
    @Validation(required = true)
    private Integer dataDiskSize;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("InstanceSpec")
    @Validation(required = true)
    private String instanceSpec;

    @Query
    @NameInMap("SystemDiskSize")
    @Validation(required = true, minimum = 20)
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
         * DataDiskSize.
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * InstanceSpec.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * SystemDiskSize.
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
