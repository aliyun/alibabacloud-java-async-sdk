// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AskSessionPackageRenewPriceRequest} extends {@link RequestModel}
 *
 * <p>AskSessionPackageRenewPriceRequest</p>
 */
public class AskSessionPackageRenewPriceRequest extends Request {
    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    @Validation(required = true)
    private String periodUnit;

    @Query
    @NameInMap("SessionPackageId")
    @Validation(required = true)
    private String sessionPackageId;

    private AskSessionPackageRenewPriceRequest(Builder builder) {
        super(builder);
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.sessionPackageId = builder.sessionPackageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AskSessionPackageRenewPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sessionPackageId
     */
    public String getSessionPackageId() {
        return this.sessionPackageId;
    }

    public static final class Builder extends Request.Builder<AskSessionPackageRenewPriceRequest, Builder> {
        private Integer period; 
        private String periodUnit; 
        private String sessionPackageId; 

        private Builder() {
            super();
        } 

        private Builder(AskSessionPackageRenewPriceRequest request) {
            super(request);
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.sessionPackageId = request.sessionPackageId;
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
         * SessionPackageId.
         */
        public Builder sessionPackageId(String sessionPackageId) {
            this.putQueryParameter("SessionPackageId", sessionPackageId);
            this.sessionPackageId = sessionPackageId;
            return this;
        }

        @Override
        public AskSessionPackageRenewPriceRequest build() {
            return new AskSessionPackageRenewPriceRequest(this);
        } 

    } 

}
