// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterDiagnosisCheckItemsRequest} extends {@link RequestModel}
 *
 * <p>GetClusterDiagnosisCheckItemsRequest</p>
 */
public class GetClusterDiagnosisCheckItemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("diagnosis_id")
    private String diagnosisId;

    private GetClusterDiagnosisCheckItemsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.diagnosisId = builder.diagnosisId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDiagnosisCheckItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return diagnosisId
     */
    public String getDiagnosisId() {
        return this.diagnosisId;
    }

    public static final class Builder extends Request.Builder<GetClusterDiagnosisCheckItemsRequest, Builder> {
        private String clusterId; 
        private String diagnosisId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterDiagnosisCheckItemsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.diagnosisId = request.diagnosisId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The diagnostic ID.
         */
        public Builder diagnosisId(String diagnosisId) {
            this.putPathParameter("diagnosis_id", diagnosisId);
            this.diagnosisId = diagnosisId;
            return this;
        }

        @Override
        public GetClusterDiagnosisCheckItemsRequest build() {
            return new GetClusterDiagnosisCheckItemsRequest(this);
        } 

    } 

}
