// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutomateResponseConfigFeatureRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutomateResponseConfigFeatureRequest</p>
 */
public class DescribeAutomateResponseConfigFeatureRequest extends Request {
    @Body
    @NameInMap("AutoResponseType")
    private String autoResponseType;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAutomateResponseConfigFeatureRequest(Builder builder) {
        super(builder);
        this.autoResponseType = builder.autoResponseType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutomateResponseConfigFeatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoResponseType
     */
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAutomateResponseConfigFeatureRequest, Builder> {
        private String autoResponseType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutomateResponseConfigFeatureRequest request) {
            super(request);
            this.autoResponseType = request.autoResponseType;
            this.regionId = request.regionId;
        } 

        /**
         * AutoResponseType.
         */
        public Builder autoResponseType(String autoResponseType) {
            this.putBodyParameter("AutoResponseType", autoResponseType);
            this.autoResponseType = autoResponseType;
            return this;
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
        public DescribeAutomateResponseConfigFeatureRequest build() {
            return new DescribeAutomateResponseConfigFeatureRequest(this);
        } 

    } 

}
