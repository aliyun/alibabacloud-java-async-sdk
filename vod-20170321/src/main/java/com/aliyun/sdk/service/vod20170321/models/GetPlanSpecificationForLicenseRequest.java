// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPlanSpecificationForLicenseRequest} extends {@link RequestModel}
 *
 * <p>GetPlanSpecificationForLicenseRequest</p>
 */
public class GetPlanSpecificationForLicenseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromApp")
    private String fromApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedItemSpecification")
    private Boolean needItemSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanCode")
    private String planCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    private GetPlanSpecificationForLicenseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fromApp = builder.fromApp;
        this.needItemSpecification = builder.needItemSpecification;
        this.planCode = builder.planCode;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlanSpecificationForLicenseRequest create() {
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
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return needItemSpecification
     */
    public Boolean getNeedItemSpecification() {
        return this.needItemSpecification;
    }

    /**
     * @return planCode
     */
    public String getPlanCode() {
        return this.planCode;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<GetPlanSpecificationForLicenseRequest, Builder> {
        private String regionId; 
        private String fromApp; 
        private Boolean needItemSpecification; 
        private String planCode; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(GetPlanSpecificationForLicenseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fromApp = request.fromApp;
            this.needItemSpecification = request.needItemSpecification;
            this.planCode = request.planCode;
            this.planId = request.planId;
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
         * FromApp.
         */
        public Builder fromApp(String fromApp) {
            this.putQueryParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * NeedItemSpecification.
         */
        public Builder needItemSpecification(Boolean needItemSpecification) {
            this.putQueryParameter("NeedItemSpecification", needItemSpecification);
            this.needItemSpecification = needItemSpecification;
            return this;
        }

        /**
         * PlanCode.
         */
        public Builder planCode(String planCode) {
            this.putQueryParameter("PlanCode", planCode);
            this.planCode = planCode;
            return this;
        }

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public GetPlanSpecificationForLicenseRequest build() {
            return new GetPlanSpecificationForLicenseRequest(this);
        } 

    } 

}
