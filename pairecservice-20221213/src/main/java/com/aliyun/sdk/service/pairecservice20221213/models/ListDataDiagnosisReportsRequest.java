// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListDataDiagnosisReportsRequest} extends {@link RequestModel}
 *
 * <p>ListDataDiagnosisReportsRequest</p>
 */
public class ListDataDiagnosisReportsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataDiagnosisId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureName")
    private String featureName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemainRateType")
    private String remainRateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
    private Long topN;

    private ListDataDiagnosisReportsRequest(Builder builder) {
        super(builder);
        this.dataDiagnosisId = builder.dataDiagnosisId;
        this.regionId = builder.regionId;
        this.endDate = builder.endDate;
        this.featureName = builder.featureName;
        this.instanceId = builder.instanceId;
        this.remainRateType = builder.remainRateType;
        this.startDate = builder.startDate;
        this.topN = builder.topN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataDiagnosisReportsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiagnosisId
     */
    public String getDataDiagnosisId() {
        return this.dataDiagnosisId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return remainRateType
     */
    public String getRemainRateType() {
        return this.remainRateType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return topN
     */
    public Long getTopN() {
        return this.topN;
    }

    public static final class Builder extends Request.Builder<ListDataDiagnosisReportsRequest, Builder> {
        private String dataDiagnosisId; 
        private String regionId; 
        private String endDate; 
        private String featureName; 
        private String instanceId; 
        private String remainRateType; 
        private String startDate; 
        private Long topN; 

        private Builder() {
            super();
        } 

        private Builder(ListDataDiagnosisReportsRequest request) {
            super(request);
            this.dataDiagnosisId = request.dataDiagnosisId;
            this.regionId = request.regionId;
            this.endDate = request.endDate;
            this.featureName = request.featureName;
            this.instanceId = request.instanceId;
            this.remainRateType = request.remainRateType;
            this.startDate = request.startDate;
            this.topN = request.topN;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder dataDiagnosisId(String dataDiagnosisId) {
            this.putPathParameter("DataDiagnosisId", dataDiagnosisId);
            this.dataDiagnosisId = dataDiagnosisId;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-01</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * FeatureName.
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RemainRateType.
         */
        public Builder remainRateType(String remainRateType) {
            this.putQueryParameter("RemainRateType", remainRateType);
            this.remainRateType = remainRateType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TopN.
         */
        public Builder topN(Long topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        @Override
        public ListDataDiagnosisReportsRequest build() {
            return new ListDataDiagnosisReportsRequest(this);
        } 

    } 

}
