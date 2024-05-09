// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceStatusRequest</p>
 */
public class CheckServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SvcCode")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CheckServiceStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.svcCode = request.svcCode;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The service code of an Alibaba Cloud service. The service code of Managed Service for Prometheus is prometheus.
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
