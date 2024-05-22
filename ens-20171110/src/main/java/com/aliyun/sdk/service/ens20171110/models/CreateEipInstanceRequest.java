// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEipInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateEipInstanceRequest</p>
 */
public class CreateEipInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 5)
    private Long bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private CreateEipInstanceRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.isp = builder.isp;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEipInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateEipInstanceRequest, Builder> {
        private Long bandwidth; 
        private String description; 
        private String ensRegionId; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String isp; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateEipInstanceRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.description = request.description;
            this.ensRegionId = request.ensRegionId;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.isp = request.isp;
            this.name = request.name;
        } 

        /**
         * The peak bandwidth of the EIP. Default value: 5. Valid values: 5 to 10000. Unit: Mbit/s.
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The description of the EIP.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the Edge Node Service (ENS) node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The billing method of the EIP. Set the value to **PostPaid**.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The metering method of the EIP. Set the value to **95BandwidthByMonth**.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The Internet service provider. Valid values:
         * <p>
         * 
         * *   **cmcc**: China Mobile
         * *   **unicom**: China Unicom
         * *   **telecom**: China Telecom
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The name of the EIP.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateEipInstanceRequest build() {
            return new CreateEipInstanceRequest(this);
        } 

    } 

}
