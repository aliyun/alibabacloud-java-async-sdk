// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeFaultDiagnosisOverallDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeFaultDiagnosisOverallDataRequest</p>
 */
public class DescribeFaultDiagnosisOverallDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatDim")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statDim;

    private DescribeFaultDiagnosisOverallDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTs = builder.endTs;
        this.startTs = builder.startTs;
        this.statDim = builder.statDim;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisOverallDataRequest create() {
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

    /**
     * @return statDim
     */
    public String getStatDim() {
        return this.statDim;
    }

    public static final class Builder extends Request.Builder<DescribeFaultDiagnosisOverallDataRequest, Builder> {
        private String appId; 
        private Long endTs; 
        private Long startTs; 
        private String statDim; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFaultDiagnosisOverallDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTs = request.endTs;
            this.startTs = request.startTs;
            this.statDim = request.statDim;
        } 

        /**
         * <p>APP ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4eah****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615910399</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615824000</p>
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JOIN_SLOW_USER</p>
         */
        public Builder statDim(String statDim) {
            this.putQueryParameter("StatDim", statDim);
            this.statDim = statDim;
            return this;
        }

        @Override
        public DescribeFaultDiagnosisOverallDataRequest build() {
            return new DescribeFaultDiagnosisOverallDataRequest(this);
        } 

    } 

}
