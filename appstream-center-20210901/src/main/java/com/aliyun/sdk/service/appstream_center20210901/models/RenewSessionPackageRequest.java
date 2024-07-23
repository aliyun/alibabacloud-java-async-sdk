// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewSessionPackageRequest} extends {@link RequestModel}
 *
 * <p>RenewSessionPackageRequest</p>
 */
public class RenewSessionPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionPackageId;

    private RenewSessionPackageRequest(Builder builder) {
        super(builder);
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.sessionPackageId = builder.sessionPackageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewSessionPackageRequest create() {
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

    public static final class Builder extends Request.Builder<RenewSessionPackageRequest, Builder> {
        private Integer period; 
        private String periodUnit; 
        private String sessionPackageId; 

        private Builder() {
            super();
        } 

        private Builder(RenewSessionPackageRequest request) {
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
        public RenewSessionPackageRequest build() {
            return new RenewSessionPackageRequest(this);
        } 

    } 

}
