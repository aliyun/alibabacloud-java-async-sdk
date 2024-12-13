// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    private GetClusterDiagnosisCheckItemsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.diagnosisId = builder.diagnosisId;
        this.language = builder.language;
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

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<GetClusterDiagnosisCheckItemsRequest, Builder> {
        private String clusterId; 
        private String diagnosisId; 
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterDiagnosisCheckItemsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.diagnosisId = request.diagnosisId;
            this.language = request.language;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cb95aa626a47740afbf6aa099b650****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The diagnostic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6f719f23098240818eb26fe3a37d****</p>
         */
        public Builder diagnosisId(String diagnosisId) {
            this.putPathParameter("diagnosis_id", diagnosisId);
            this.diagnosisId = diagnosisId;
            return this;
        }

        /**
         * <p>查询语言。</p>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        @Override
        public GetClusterDiagnosisCheckItemsRequest build() {
            return new GetClusterDiagnosisCheckItemsRequest(this);
        } 

    } 

}
