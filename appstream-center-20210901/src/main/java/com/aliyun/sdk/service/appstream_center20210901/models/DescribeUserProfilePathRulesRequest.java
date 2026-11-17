// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeUserProfilePathRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserProfilePathRulesRequest</p>
 */
public class DescribeUserProfilePathRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupSetId")
    private String appInstanceGroupSetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    private DescribeUserProfilePathRulesRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupSetId = builder.appInstanceGroupSetId;
        this.regionId = builder.regionId;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserProfilePathRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupSetId
     */
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<DescribeUserProfilePathRulesRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceGroupSetId; 
        private String regionId; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserProfilePathRulesRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupSetId = request.appInstanceGroupSetId;
            this.regionId = request.regionId;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The app instance group ID. Specify either this parameter or AppInstanceGroupSetId when querying app instance group rules. This parameter can be omitted when querying system default rules.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-0bi83v****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The app instance group set ID. Specify either this parameter or AppInstanceGroupId when querying app instance group set rules. This parameter can be omitted when querying system default rules.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        public Builder appInstanceGroupSetId(String appInstanceGroupSetId) {
            this.putBodyParameter("AppInstanceGroupSetId", appInstanceGroupSetId);
            this.appInstanceGroupSetId = appInstanceGroupSetId;
            return this;
        }

        /**
         * <p>The region ID of the request. When querying or setting rules for a specified app instance group, use the region where the target app instance group is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The path rule type. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: Queries system default rules. Both target IDs can be omitted.</li>
         * <li><code>AppInstanceGroup</code>: Queries the rules of an app instance group or an app instance group set.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroup</p>
         */
        public Builder ruleType(String ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public DescribeUserProfilePathRulesRequest build() {
            return new DescribeUserProfilePathRulesRequest(this);
        } 

    } 

}
