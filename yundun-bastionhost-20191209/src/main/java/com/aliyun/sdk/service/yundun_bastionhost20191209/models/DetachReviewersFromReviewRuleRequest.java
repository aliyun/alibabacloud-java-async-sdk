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
 * {@link DetachReviewersFromReviewRuleRequest} extends {@link RequestModel}
 *
 * <p>DetachReviewersFromReviewRuleRequest</p>
 */
public class DetachReviewersFromReviewRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReviewRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewRuleId;

    private DetachReviewersFromReviewRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.principalIds = builder.principalIds;
        this.regionId = builder.regionId;
        this.reviewRuleId = builder.reviewRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachReviewersFromReviewRuleRequest create() {
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
     * @return principalIds
     */
    public String getPrincipalIds() {
        return this.principalIds;
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

    public static final class Builder extends Request.Builder<DetachReviewersFromReviewRuleRequest, Builder> {
        private String instanceId; 
        private String principalIds; 
        private String regionId; 
        private Long reviewRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DetachReviewersFromReviewRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.principalIds = request.principalIds;
            this.regionId = request.regionId;
            this.reviewRuleId = request.reviewRuleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
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
         * <p>1,2</p>
         */
        public Builder principalIds(String principalIds) {
            this.putQueryParameter("PrincipalIds", principalIds);
            this.principalIds = principalIds;
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
        public DetachReviewersFromReviewRuleRequest build() {
            return new DetachReviewersFromReviewRuleRequest(this);
        } 

    } 

}
