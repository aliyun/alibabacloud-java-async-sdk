// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyEnsEipAddressAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyEnsEipAddressAttributeRequest</p>
 */
public class ModifyEnsEipAddressAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String name;

    private ModifyEnsEipAddressAttributeRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEnsEipAddressAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModifyEnsEipAddressAttributeRequest, Builder> {
        private String allocationId; 
        private Integer bandwidth; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEnsEipAddressAttributeRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.bandwidth = request.bandwidth;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>The ID of the EIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-5sw5dxzgi6umq4uexxkt8wpma</p>
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The peak bandwidth of the EIP. Default value: 5. Valid values: <strong>5</strong> to <strong>10000</strong>. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The new description of the EIP. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The new name of the EIP. The name must be 2 to 128 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test-api-modify</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModifyEnsEipAddressAttributeRequest build() {
            return new ModifyEnsEipAddressAttributeRequest(this);
        } 

    } 

}
