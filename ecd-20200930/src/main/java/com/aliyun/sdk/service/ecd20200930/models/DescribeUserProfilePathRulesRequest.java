// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserProfilePathRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserProfilePathRulesRequest</p>
 */
public class DescribeUserProfilePathRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    private DescribeUserProfilePathRulesRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
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
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
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
        private String desktopGroupId; 
        private String regionId; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserProfilePathRulesRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.regionId = request.regionId;
            this.ruleType = request.ruleType;
        } 

        /**
         * The desktop group ID. This parameter is required when you set RuleType parameter to DesktopGroup.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The rule type that you want to configure for the directory.
         * <p>
         * 
         * Valid values:
         * 
         * *   DesktopGroup
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Default
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public DescribeUserProfilePathRulesRequest build() {
            return new DescribeUserProfilePathRulesRequest(this);
        } 

    } 

}
