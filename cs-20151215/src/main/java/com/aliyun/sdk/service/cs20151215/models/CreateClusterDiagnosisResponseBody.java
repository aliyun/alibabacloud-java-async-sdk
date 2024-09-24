// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterDiagnosisResponseBody</p>
 */
public class CreateClusterDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("diagnosis_id")
    private String diagnosisId;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private CreateClusterDiagnosisResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.diagnosisId = builder.diagnosisId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterDiagnosisResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String diagnosisId; 
        private String requestId; 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The diagnostic ID.
         */
        public Builder diagnosisId(String diagnosisId) {
            this.diagnosisId = diagnosisId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClusterDiagnosisResponseBody build() {
            return new CreateClusterDiagnosisResponseBody(this);
        } 

    } 

}
