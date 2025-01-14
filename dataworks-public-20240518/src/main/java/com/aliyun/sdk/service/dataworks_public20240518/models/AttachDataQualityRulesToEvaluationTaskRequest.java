// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link AttachDataQualityRulesToEvaluationTaskRequest} extends {@link RequestModel}
 *
 * <p>AttachDataQualityRulesToEvaluationTaskRequest</p>
 */
public class AttachDataQualityRulesToEvaluationTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataQualityEvaluationTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataQualityRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> dataQualityRuleIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private AttachDataQualityRulesToEvaluationTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataQualityEvaluationTaskId = builder.dataQualityEvaluationTaskId;
        this.dataQualityRuleIds = builder.dataQualityRuleIds;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDataQualityRulesToEvaluationTaskRequest create() {
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
     * @return dataQualityEvaluationTaskId
     */
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    /**
     * @return dataQualityRuleIds
     */
    public java.util.List<Long> getDataQualityRuleIds() {
        return this.dataQualityRuleIds;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<AttachDataQualityRulesToEvaluationTaskRequest, Builder> {
        private String regionId; 
        private Long dataQualityEvaluationTaskId; 
        private java.util.List<Long> dataQualityRuleIds; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDataQualityRulesToEvaluationTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataQualityEvaluationTaskId = request.dataQualityEvaluationTaskId;
            this.dataQualityRuleIds = request.dataQualityRuleIds;
            this.projectId = request.projectId;
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
         * <p>200001</p>
         */
        public Builder dataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
            this.putBodyParameter("DataQualityEvaluationTaskId", dataQualityEvaluationTaskId);
            this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dataQualityRuleIds(java.util.List<Long> dataQualityRuleIds) {
            String dataQualityRuleIdsShrink = shrink(dataQualityRuleIds, "DataQualityRuleIds", "json");
            this.putBodyParameter("DataQualityRuleIds", dataQualityRuleIdsShrink);
            this.dataQualityRuleIds = dataQualityRuleIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public AttachDataQualityRulesToEvaluationTaskRequest build() {
            return new AttachDataQualityRulesToEvaluationTaskRequest(this);
        } 

    } 

}
