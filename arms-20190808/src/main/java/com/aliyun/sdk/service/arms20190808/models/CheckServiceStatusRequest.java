// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceStatusRequest</p>
 */
public class CheckServiceStatusRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SvcCode")
    @Validation(required = true)
    private String svcCode;

    private CheckServiceStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.svcCode = builder.svcCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceStatusRequest create() {
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
     * @return svcCode
     */
    public String getSvcCode() {
        return this.svcCode;
    }

    public static final class Builder extends Request.Builder<CheckServiceStatusRequest, Builder> {
        private String regionId; 
        private String svcCode; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceStatusRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.svcCode = response.svcCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SvcCode.
         */
        public Builder svcCode(String svcCode) {
            this.putQueryParameter("SvcCode", svcCode);
            this.svcCode = svcCode;
            return this;
        }

        @Override
        public CheckServiceStatusRequest build() {
            return new CheckServiceStatusRequest(this);
        } 

    } 

}
