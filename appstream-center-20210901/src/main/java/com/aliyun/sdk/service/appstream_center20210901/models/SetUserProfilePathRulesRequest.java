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
 * {@link SetUserProfilePathRulesRequest} extends {@link RequestModel}
 *
 * <p>SetUserProfilePathRulesRequest</p>
 */
public class SetUserProfilePathRulesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserProfilePathRules")
    private String userProfilePathRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserProfileRuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userProfileRuleType;

    private SetUserProfilePathRulesRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupSetId = builder.appInstanceGroupSetId;
        this.regionId = builder.regionId;
        this.userProfilePathRules = builder.userProfilePathRules;
        this.userProfileRuleType = builder.userProfileRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserProfilePathRulesRequest create() {
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
     * @return userProfilePathRules
     */
    public String getUserProfilePathRules() {
        return this.userProfilePathRules;
    }

    /**
     * @return userProfileRuleType
     */
    public String getUserProfileRuleType() {
        return this.userProfileRuleType;
    }

    public static final class Builder extends Request.Builder<SetUserProfilePathRulesRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceGroupSetId; 
        private String regionId; 
        private String userProfilePathRules; 
        private String userProfileRuleType; 

        private Builder() {
            super();
        } 

        private Builder(SetUserProfilePathRulesRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupSetId = request.appInstanceGroupSetId;
            this.regionId = request.regionId;
            this.userProfilePathRules = request.userProfilePathRules;
            this.userProfileRuleType = request.userProfileRuleType;
        } 

        /**
         * <p>The ID of a single app instance group. You must specify either this parameter or AppInstanceGroupSetId. If the cloud application or cloud browser app instance group belongs to an enabled set, you must configure the rules for the set.</p>
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
         * <p>The ID of an enabled app instance group set. You must specify either this parameter or AppInstanceGroupId. You can configure rules for up to 200 member app instance groups at a time.</p>
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
         * <p>The region ID. When you query or configure rules for a specific app instance group, specify the region where the target app instance group resides.</p>
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
         * <p>The JSON array string that contains the complete list of rules. Each item uses <code>blackPath</code> to specify the excluded path and <code>whitePaths</code> to specify the relative paths that still require roaming within the excluded directory. The path type <code>file</code> indicates a file, and <code>folder</code> indicates a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;blackPath&quot;:{&quot;path&quot;:&quot;AppData\Local&quot;,&quot;type&quot;:&quot;folder&quot;},&quot;whitePaths&quot;:[{&quot;path&quot;:&quot;.\Microsoft\Office&quot;,&quot;type&quot;:&quot;folder&quot;}]}]</p>
         */
        public Builder userProfilePathRules(String userProfilePathRules) {
            this.putBodyParameter("UserProfilePathRules", userProfilePathRules);
            this.userProfilePathRules = userProfilePathRules;
            return this;
        }

        /**
         * <p>The type of rule to configure. Set this parameter to <code>AppInstanceGroup</code> when you configure rules for an app instance group or an app instance group set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroup</p>
         */
        public Builder userProfileRuleType(String userProfileRuleType) {
            this.putBodyParameter("UserProfileRuleType", userProfileRuleType);
            this.userProfileRuleType = userProfileRuleType;
            return this;
        }

        @Override
        public SetUserProfilePathRulesRequest build() {
            return new SetUserProfilePathRulesRequest(this);
        } 

    } 

}
