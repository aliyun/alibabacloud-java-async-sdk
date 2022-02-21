// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulePolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeLayer4RulePolicyRequest</p>
 */
public class DescribeLayer4RulePolicyRequest extends Request {
    @Query
    @NameInMap("Listeners")
    @Validation(required = true)
    private String listeners;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeLayer4RulePolicyRequest(Builder builder) {
        super(builder);
        this.listeners = builder.listeners;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer4RulePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLayer4RulePolicyRequest, Builder> {
        private String listeners; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLayer4RulePolicyRequest response) {
            super(response);
            this.listeners = response.listeners;
            this.regionId = response.regionId;
        } 

        /**
         * Listeners.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeLayer4RulePolicyRequest build() {
            return new DescribeLayer4RulePolicyRequest(this);
        } 

    } 

}
