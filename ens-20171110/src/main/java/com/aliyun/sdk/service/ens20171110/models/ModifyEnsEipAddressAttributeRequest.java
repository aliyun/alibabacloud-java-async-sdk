// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEnsEipAddressAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyEnsEipAddressAttributeRequest</p>
 */
public class ModifyEnsEipAddressAttributeRequest extends Request {
    @Query
    @NameInMap("AllocationId")
    @Validation(required = true)
    private String allocationId;

    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 10000, minimum = 1)
    private Integer bandwidth;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 256, minLength = 2)
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(maxLength = 128, minLength = 2)
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
         * AllocationId.
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
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
