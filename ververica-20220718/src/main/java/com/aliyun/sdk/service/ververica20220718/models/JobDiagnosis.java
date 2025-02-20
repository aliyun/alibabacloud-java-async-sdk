// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link JobDiagnosis} extends {@link TeaModel}
 *
 * <p>JobDiagnosis</p>
 */
public class JobDiagnosis extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("diagnoseId")
    private String diagnoseId;

    @com.aliyun.core.annotation.NameInMap("diagnoseTime")
    private Long diagnoseTime;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("riskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.NameInMap("symptoms")
    private JobDiagnosisSymptoms symptoms;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private JobDiagnosis(Builder builder) {
        this.diagnoseId = builder.diagnoseId;
        this.diagnoseTime = builder.diagnoseTime;
        this.namespace = builder.namespace;
        this.riskLevel = builder.riskLevel;
        this.symptoms = builder.symptoms;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobDiagnosis create() {
        return builder().build();
    }

    /**
     * @return diagnoseId
     */
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    /**
     * @return diagnoseTime
     */
    public Long getDiagnoseTime() {
        return this.diagnoseTime;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return symptoms
     */
    public JobDiagnosisSymptoms getSymptoms() {
        return this.symptoms;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String diagnoseId; 
        private Long diagnoseTime; 
        private String namespace; 
        private String riskLevel; 
        private JobDiagnosisSymptoms symptoms; 
        private String workspace; 

        /**
         * diagnoseId.
         */
        public Builder diagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }

        /**
         * diagnoseTime.
         */
        public Builder diagnoseTime(Long diagnoseTime) {
            this.diagnoseTime = diagnoseTime;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * riskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * symptoms.
         */
        public Builder symptoms(JobDiagnosisSymptoms symptoms) {
            this.symptoms = symptoms;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public JobDiagnosis build() {
            return new JobDiagnosis(this);
        } 

    } 

}
