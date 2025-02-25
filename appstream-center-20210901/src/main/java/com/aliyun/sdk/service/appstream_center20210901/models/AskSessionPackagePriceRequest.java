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
 * {@link AskSessionPackagePriceRequest} extends {@link RequestModel}
 *
 * <p>AskSessionPackagePriceRequest</p>
 */
public class AskSessionPackagePriceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

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

    private AskSessionPackagePriceRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.maxSessions = builder.maxSessions;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.region = builder.region;
        this.sessionPackageType = builder.sessionPackageType;
        this.sessionSpec = builder.sessionSpec;
        this.sessionType = builder.sessionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AskSessionPackagePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder extends Request.Builder<AskSessionPackagePriceRequest, Builder> {
        private String chargeType; 
        private Integer maxSessions; 
        private Integer period; 
        private String periodUnit; 
        private String region; 
        private String sessionPackageType; 
        private String sessionSpec; 
        private String sessionType; 

        private Builder() {
            super();
        } 

        private Builder(AskSessionPackagePriceRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.maxSessions = request.maxSessions;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.region = request.region;
            this.sessionPackageType = request.sessionPackageType;
            this.sessionSpec = request.sessionSpec;
            this.sessionType = request.sessionType;
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
        public AskSessionPackagePriceRequest build() {
            return new AskSessionPackagePriceRequest(this);
        } 

    } 

}
