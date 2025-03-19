// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CheckServiceDeployableRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceDeployableRequest</p>
 */
public class CheckServiceDeployableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPaidAmount")
    private String postPaidAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrePaidAmount")
    private String prePaidAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrialType")
    private String trialType;

    private CheckServiceDeployableRequest(Builder builder) {
        super(builder);
        this.postPaidAmount = builder.postPaidAmount;
        this.prePaidAmount = builder.prePaidAmount;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
        this.trialType = builder.trialType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceDeployableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return postPaidAmount
     */
    public String getPostPaidAmount() {
        return this.postPaidAmount;
    }

    /**
     * @return prePaidAmount
     */
    public String getPrePaidAmount() {
        return this.prePaidAmount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return trialType
     */
    public String getTrialType() {
        return this.trialType;
    }

    public static final class Builder extends Request.Builder<CheckServiceDeployableRequest, Builder> {
        private String postPaidAmount; 
        private String prePaidAmount; 
        private String regionId; 
        private String serviceId; 
        private String serviceVersion; 
        private String trialType; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceDeployableRequest request) {
            super(request);
            this.postPaidAmount = request.postPaidAmount;
            this.prePaidAmount = request.prePaidAmount;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
            this.trialType = request.trialType;
        } 

        /**
         * <p>Total amount of postpaid.</p>
         * 
         * <strong>example:</strong>
         * <p>1.29</p>
         */
        public Builder postPaidAmount(String postPaidAmount) {
            this.putQueryParameter("PostPaidAmount", postPaidAmount);
            this.postPaidAmount = postPaidAmount;
            return this;
        }

        /**
         * <p>Total amount of prepayment.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder prePaidAmount(String prePaidAmount) {
            this.putQueryParameter("PrePaidAmount", prePaidAmount);
            this.prePaidAmount = prePaidAmount;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a544xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The trial type of the service instance. Valid values:</p>
         * <ul>
         * <li><strong>Trial</strong>: Trials are supported.</li>
         * <li><strong>NotTrial</strong>: Trials are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotTrial</p>
         */
        public Builder trialType(String trialType) {
            this.putQueryParameter("TrialType", trialType);
            this.trialType = trialType;
            return this;
        }

        @Override
        public CheckServiceDeployableRequest build() {
            return new CheckServiceDeployableRequest(this);
        } 

    } 

}
