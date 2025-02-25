// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlotRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlotRequest</p>
 */
public class DescribeSlotRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("SlotId")
    @Validation(required = true)
    private String slotId;

    private DescribeSlotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.slotId = builder.slotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slotId
     */
    public String getSlotId() {
        return this.slotId;
    }

    public static final class Builder extends Request.Builder<DescribeSlotRequest, Builder> {
        private String regionId; 
        private String slotId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.slotId = request.slotId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SlotId.
         */
        public Builder slotId(String slotId) {
            this.putPathParameter("SlotId", slotId);
            this.slotId = slotId;
            return this;
        }

        @Override
        public DescribeSlotRequest build() {
            return new DescribeSlotRequest(this);
        } 

    } 

}
