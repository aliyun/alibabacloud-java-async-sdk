// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFaultDiagnosisFactorDistributionStatRequest} extends {@link RequestModel}
 *
 * <p>DescribeFaultDiagnosisFactorDistributionStatRequest</p>
 */
public class DescribeFaultDiagnosisFactorDistributionStatRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("StartTs")
    @Validation(required = true)
    private Long startTs;

    private DescribeFaultDiagnosisFactorDistributionStatRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTs = builder.endTs;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisFactorDistributionStatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    public static final class Builder extends Request.Builder<DescribeFaultDiagnosisFactorDistributionStatRequest, Builder> {
        private String appId; 
        private Long endTs; 
        private Long startTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFaultDiagnosisFactorDistributionStatRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTs = request.endTs;
            this.startTs = request.startTs;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EndTs.
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * StartTs.
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        @Override
        public DescribeFaultDiagnosisFactorDistributionStatRequest build() {
            return new DescribeFaultDiagnosisFactorDistributionStatRequest(this);
        } 

    } 

}
