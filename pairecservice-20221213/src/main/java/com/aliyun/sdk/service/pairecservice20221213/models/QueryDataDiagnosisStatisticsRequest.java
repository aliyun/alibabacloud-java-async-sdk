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
 * {@link QueryDataDiagnosisStatisticsRequest} extends {@link RequestModel}
 *
 * <p>QueryDataDiagnosisStatisticsRequest</p>
 */
public class QueryDataDiagnosisStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataDiagnosisId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemainRateType")
    private String remainRateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private QueryDataDiagnosisStatisticsRequest(Builder builder) {
        super(builder);
        this.dataDiagnosisId = builder.dataDiagnosisId;
        this.regionId = builder.regionId;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.remainRateType = builder.remainRateType;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataDiagnosisStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDataDiagnosisStatisticsRequest, Builder> {
        private String dataDiagnosisId; 
        private String regionId; 
        private String endDate; 
        private String instanceId; 
        private String remainRateType; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryDataDiagnosisStatisticsRequest request) {
            super(request);
            this.dataDiagnosisId = request.dataDiagnosisId;
            this.regionId = request.regionId;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.remainRateType = request.remainRateType;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The ID of the data diagnosis task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The end date.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-08</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The retention rate report type.</p>
         * <ul>
         * <li>Period: A periodic report.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Period</p>
         */
        public Builder remainRateType(String remainRateType) {
            this.putQueryParameter("RemainRateType", remainRateType);
            this.remainRateType = remainRateType;
            return this;
        }

        /**
         * <p>The start date.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryDataDiagnosisStatisticsRequest build() {
            return new QueryDataDiagnosisStatisticsRequest(this);
        } 

    } 

}
