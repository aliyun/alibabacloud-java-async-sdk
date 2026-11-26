// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link MarketingDiagnosisSummary} extends {@link TeaModel}
 *
 * <p>MarketingDiagnosisSummary</p>
 */
public class MarketingDiagnosisSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BrandMentionRate")
    private Double brandMentionRate;

    @com.aliyun.core.annotation.NameInMap("BrandName")
    private String brandName;

    @com.aliyun.core.annotation.NameInMap("CompletedAt")
    private Long completedAt;

    @com.aliyun.core.annotation.NameInMap("DiagnosisId")
    private String diagnosisId;

    @com.aliyun.core.annotation.NameInMap("TargetUrl")
    private String targetUrl;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private MarketingDiagnosisSummary(Builder builder) {
        this.brandMentionRate = builder.brandMentionRate;
        this.brandName = builder.brandName;
        this.completedAt = builder.completedAt;
        this.diagnosisId = builder.diagnosisId;
        this.targetUrl = builder.targetUrl;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarketingDiagnosisSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandMentionRate
     */
    public Double getBrandMentionRate() {
        return this.brandMentionRate;
    }

    /**
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return completedAt
     */
    public Long getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return diagnosisId
     */
    public String getDiagnosisId() {
        return this.diagnosisId;
    }

    /**
     * @return targetUrl
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Double brandMentionRate; 
        private String brandName; 
        private Long completedAt; 
        private String diagnosisId; 
        private String targetUrl; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(MarketingDiagnosisSummary model) {
            this.brandMentionRate = model.brandMentionRate;
            this.brandName = model.brandName;
            this.completedAt = model.completedAt;
            this.diagnosisId = model.diagnosisId;
            this.targetUrl = model.targetUrl;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The brand mention rate, as a percentage from 0 to 100, where 25 indicates 25%. This field is empty when the value is missing.</p>
         * 
         * <strong>example:</strong>
         * <p>0.42</p>
         */
        public Builder brandMentionRate(Double brandMentionRate) {
            this.brandMentionRate = brandMentionRate;
            return this;
        }

        /**
         * <p>The brand name used for analysis or diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Technology</p>
         */
        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        /**
         * <p>The diagnosis completion time, as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1795658460000</p>
         */
        public Builder completedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * <p>The ID of the diagnosis record.</p>
         * 
         * <strong>example:</strong>
         * <p>diagnosis_example001</p>
         */
        public Builder diagnosisId(String diagnosisId) {
            this.diagnosisId = diagnosisId;
            return this;
        }

        /**
         * <p>The web address of the diagnosis target.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/">https://example.com/</a></p>
         */
        public Builder targetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        /**
         * <p>The task ID used to query the processing progress.</p>
         * 
         * <strong>example:</strong>
         * <p>bwb_example001</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public MarketingDiagnosisSummary build() {
            return new MarketingDiagnosisSummary(this);
        } 

    } 

}
