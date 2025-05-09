// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link BuySessionPackageRequest} extends {@link RequestModel}
 *
 * <p>BuySessionPackageRequest</p>
 */
public class BuySessionPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSessions")
    private Integer maxSessions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionPackageName")
    private String sessionPackageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionPackageType")
    private String sessionPackageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionType;

    private BuySessionPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.chargeType = builder.chargeType;
        this.maxSessions = builder.maxSessions;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.projectId = builder.projectId;
        this.region = builder.region;
        this.sessionPackageName = builder.sessionPackageName;
        this.sessionPackageType = builder.sessionPackageType;
        this.sessionSpec = builder.sessionSpec;
        this.sessionType = builder.sessionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuySessionPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return maxSessions
     */
    public Integer getMaxSessions() {
        return this.maxSessions;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return sessionPackageName
     */
    public String getSessionPackageName() {
        return this.sessionPackageName;
    }

    /**
     * @return sessionPackageType
     */
    public String getSessionPackageType() {
        return this.sessionPackageType;
    }

    /**
     * @return sessionSpec
     */
    public String getSessionSpec() {
        return this.sessionSpec;
    }

    /**
     * @return sessionType
     */
    public String getSessionType() {
        return this.sessionType;
    }

    public static final class Builder extends Request.Builder<BuySessionPackageRequest, Builder> {
        private Boolean autoPay; 
        private String chargeType; 
        private Integer maxSessions; 
        private Integer period; 
        private String periodUnit; 
        private String projectId; 
        private String region; 
        private String sessionPackageName; 
        private String sessionPackageType; 
        private String sessionSpec; 
        private String sessionType; 

        private Builder() {
            super();
        } 

        private Builder(BuySessionPackageRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.chargeType = request.chargeType;
            this.maxSessions = request.maxSessions;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.projectId = request.projectId;
            this.region = request.region;
            this.sessionPackageName = request.sessionPackageName;
            this.sessionPackageType = request.sessionPackageType;
            this.sessionSpec = request.sessionSpec;
            this.sessionType = request.sessionType;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * MaxSessions.
         */
        public Builder maxSessions(Integer maxSessions) {
            this.putQueryParameter("MaxSessions", maxSessions);
            this.maxSessions = maxSessions;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * SessionPackageName.
         */
        public Builder sessionPackageName(String sessionPackageName) {
            this.putQueryParameter("SessionPackageName", sessionPackageName);
            this.sessionPackageName = sessionPackageName;
            return this;
        }

        /**
         * SessionPackageType.
         */
        public Builder sessionPackageType(String sessionPackageType) {
            this.putQueryParameter("SessionPackageType", sessionPackageType);
            this.sessionPackageType = sessionPackageType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general.entry</p>
         */
        public Builder sessionSpec(String sessionSpec) {
            this.putQueryParameter("SessionSpec", sessionSpec);
            this.sessionSpec = sessionSpec;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder sessionType(String sessionType) {
            this.putQueryParameter("SessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        @Override
        public BuySessionPackageRequest build() {
            return new BuySessionPackageRequest(this);
        } 

    } 

}
