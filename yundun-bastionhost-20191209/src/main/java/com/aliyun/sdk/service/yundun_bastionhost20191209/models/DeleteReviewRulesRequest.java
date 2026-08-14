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
 * {@link DeleteReviewRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteReviewRulesRequest</p>
 */
public class DeleteReviewRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReviewRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reviewRuleIds;

    private DeleteReviewRulesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.reviewRuleIds = builder.reviewRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteReviewRulesRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reviewRuleIds
     */
    public String getReviewRuleIds() {
        return this.reviewRuleIds;
    }

    public static final class Builder extends Request.Builder<DeleteReviewRulesRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String reviewRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteReviewRulesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.reviewRuleIds = request.reviewRuleIds;
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
         * <p>2,3</p>
         */
        public Builder reviewRuleIds(String reviewRuleIds) {
            this.putQueryParameter("ReviewRuleIds", reviewRuleIds);
            this.reviewRuleIds = reviewRuleIds;
            return this;
        }

        @Override
        public DeleteReviewRulesRequest build() {
            return new DeleteReviewRulesRequest(this);
        } 

    } 

}
