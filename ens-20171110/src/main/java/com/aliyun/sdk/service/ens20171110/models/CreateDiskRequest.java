// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskRequest</p>
 */
public class CreateDiskRequest extends Request {
    @Query
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    private String instanceChargeType;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private String size;

    private CreateDiskRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.ensRegionId = builder.ensRegionId;
        this.instanceChargeType = builder.instanceChargeType;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<CreateDiskRequest, Builder> {
        private String category; 
        private String ensRegionId; 
        private String instanceChargeType; 
        private String size; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskRequest request) {
            super(request);
            this.category = request.category;
            this.ensRegionId = request.ensRegionId;
            this.instanceChargeType = request.instanceChargeType;
            this.size = request.size;
        } 

        /**
         * ???????????? ????????????:cloud_efficiency ????????????:cloud_ssd
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * ??????????????????????????? PrePaid:???????????????????????? PostPaid:?????????????????????????????????PostPaid
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * ????????????,??????GB
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public CreateDiskRequest build() {
            return new CreateDiskRequest(this);
        } 

    } 

}
