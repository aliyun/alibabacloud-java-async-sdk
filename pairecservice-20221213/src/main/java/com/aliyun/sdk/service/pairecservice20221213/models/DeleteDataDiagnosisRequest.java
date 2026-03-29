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
 * {@link DeleteDataDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataDiagnosisRequest</p>
 */
public class DeleteDataDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataDiagnosisId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteDataDiagnosisRequest(Builder builder) {
        super(builder);
        this.dataDiagnosisId = builder.dataDiagnosisId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataDiagnosisRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDataDiagnosisRequest, Builder> {
        private String dataDiagnosisId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataDiagnosisRequest request) {
            super(request);
            this.dataDiagnosisId = request.dataDiagnosisId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
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
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteDataDiagnosisRequest build() {
            return new DeleteDataDiagnosisRequest(this);
        } 

    } 

}
