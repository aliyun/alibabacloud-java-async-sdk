// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link AttachProjectsToReviewRuleRequest} extends {@link RequestModel}
 *
 * <p>AttachProjectsToReviewRuleRequest</p>
 */
public class AttachProjectsToReviewRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReviewRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewRuleId;

    private AttachProjectsToReviewRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.projectIds = builder.projectIds;
        this.regionId = builder.regionId;
        this.reviewRuleId = builder.reviewRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachProjectsToReviewRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectIds
     */
    public String getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reviewRuleId
     */
    public Long getReviewRuleId() {
        return this.reviewRuleId;
    }

    public static final class Builder extends Request.Builder<AttachProjectsToReviewRuleRequest, Builder> {
        private String instanceId; 
        private String projectIds; 
        private String regionId; 
        private Long reviewRuleId; 

        private Builder() {
            super();
        } 

        private Builder(AttachProjectsToReviewRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.projectIds = request.projectIds;
            this.regionId = request.regionId;
            this.reviewRuleId = request.reviewRuleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1ghxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder projectIds(String projectIds) {
            this.putQueryParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewRuleId(Long reviewRuleId) {
            this.putQueryParameter("ReviewRuleId", reviewRuleId);
            this.reviewRuleId = reviewRuleId;
            return this;
        }

        @Override
        public AttachProjectsToReviewRuleRequest build() {
            return new AttachProjectsToReviewRuleRequest(this);
        } 

    } 

}
