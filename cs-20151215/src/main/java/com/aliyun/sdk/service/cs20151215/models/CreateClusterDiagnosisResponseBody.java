// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c5cdf7e3938bc4f8eb0e44b21a80f****</p>
         */
        public Builder clusterId(String clusterId) {
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
            this.diagnosisId = diagnosisId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>687C5BAA-D103-4993-884B-C35E4314****</p>
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
