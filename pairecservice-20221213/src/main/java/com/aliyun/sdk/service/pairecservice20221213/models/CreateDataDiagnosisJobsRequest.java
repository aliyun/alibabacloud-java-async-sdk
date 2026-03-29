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
 * {@link CreateDataDiagnosisJobsRequest} extends {@link RequestModel}
 *
 * <p>CreateDataDiagnosisJobsRequest</p>
 */
public class CreateDataDiagnosisJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataDiagnosisId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private CreateDataDiagnosisJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataDiagnosisId = builder.dataDiagnosisId;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataDiagnosisJobsRequest create() {
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
     * @return dataDiagnosisId
     */
    public String getDataDiagnosisId() {
        return this.dataDiagnosisId;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<CreateDataDiagnosisJobsRequest, Builder> {
        private String regionId; 
        private String dataDiagnosisId; 
        private String endDate; 
        private String instanceId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataDiagnosisJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataDiagnosisId = request.dataDiagnosisId;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.startDate = request.startDate;
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
         * <p>3</p>
         */
        public Builder dataDiagnosisId(String dataDiagnosisId) {
            this.putBodyParameter("DataDiagnosisId", dataDiagnosisId);
            this.dataDiagnosisId = dataDiagnosisId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-01</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public CreateDataDiagnosisJobsRequest build() {
            return new CreateDataDiagnosisJobsRequest(this);
        } 

    } 

}
