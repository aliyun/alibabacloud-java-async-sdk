// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutomateResponseConfigCounterRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutomateResponseConfigCounterRequest</p>
 */
public class DescribeAutomateResponseConfigCounterRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAutomateResponseConfigCounterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutomateResponseConfigCounterRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAutomateResponseConfigCounterRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutomateResponseConfigCounterRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAutomateResponseConfigCounterRequest build() {
            return new DescribeAutomateResponseConfigCounterRequest(this);
        } 

    } 

}
