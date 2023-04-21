// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserProfilePathRulesRequest} extends {@link RequestModel}
 *
 * <p>SetUserProfilePathRulesRequest</p>
 */
public class SetUserProfilePathRulesRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UserProfilePathRule")
    private java.util.List < UserProfilePathRule> userProfilePathRule;

    @Query
    @NameInMap("UserProfileRuleType")
    private String userProfileRuleType;

    private SetUserProfilePathRulesRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.regionId = builder.regionId;
        this.userProfilePathRule = builder.userProfilePathRule;
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
     * @return userProfilePathRule
     */
    public java.util.List < UserProfilePathRule> getUserProfilePathRule() {
        return this.userProfilePathRule;
    }

    /**
     * @return userProfileRuleType
     */
    public String getUserProfileRuleType() {
        return this.userProfileRuleType;
    }

    public static final class Builder extends Request.Builder<SetUserProfilePathRulesRequest, Builder> {
        private String desktopGroupId; 
        private String regionId; 
        private java.util.List < UserProfilePathRule> userProfilePathRule; 
        private String userProfileRuleType; 

        private Builder() {
            super();
        } 

        private Builder(SetUserProfilePathRulesRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.regionId = request.regionId;
            this.userProfilePathRule = request.userProfilePathRule;
            this.userProfileRuleType = request.userProfileRuleType;
        } 

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
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
         * UserProfilePathRule.
         */
        public Builder userProfilePathRule(java.util.List < UserProfilePathRule> userProfilePathRule) {
            String userProfilePathRuleShrink = shrink(userProfilePathRule, "UserProfilePathRule", "json");
            this.putQueryParameter("UserProfilePathRule", userProfilePathRuleShrink);
            this.userProfilePathRule = userProfilePathRule;
            return this;
        }

        /**
         * UserProfileRuleType.
         */
        public Builder userProfileRuleType(String userProfileRuleType) {
            this.putQueryParameter("UserProfileRuleType", userProfileRuleType);
            this.userProfileRuleType = userProfileRuleType;
            return this;
        }

        @Override
        public SetUserProfilePathRulesRequest build() {
            return new SetUserProfilePathRulesRequest(this);
        } 

    } 

    public static class BlackPath extends TeaModel {
        @NameInMap("Path")
        @Validation(maxLength = 260)
        private String path;

        @NameInMap("Type")
        private String type;

        private BlackPath(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackPath create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BlackPath build() {
                return new BlackPath(this);
            } 

        } 

    }
    public static class WhitePaths extends TeaModel {
        @NameInMap("Path")
        @Validation(maxLength = 260)
        private String path;

        @NameInMap("Type")
        private String type;

        private WhitePaths(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhitePaths create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public WhitePaths build() {
                return new WhitePaths(this);
            } 

        } 

    }
    public static class UserProfilePathRule extends TeaModel {
        @NameInMap("BlackPath")
        private BlackPath blackPath;

        @NameInMap("WhitePaths")
        private java.util.List < WhitePaths> whitePaths;

        private UserProfilePathRule(Builder builder) {
            this.blackPath = builder.blackPath;
            this.whitePaths = builder.whitePaths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfilePathRule create() {
            return builder().build();
        }

        /**
         * @return blackPath
         */
        public BlackPath getBlackPath() {
            return this.blackPath;
        }

        /**
         * @return whitePaths
         */
        public java.util.List < WhitePaths> getWhitePaths() {
            return this.whitePaths;
        }

        public static final class Builder {
            private BlackPath blackPath; 
            private java.util.List < WhitePaths> whitePaths; 

            /**
             * BlackPath.
             */
            public Builder blackPath(BlackPath blackPath) {
                this.blackPath = blackPath;
                return this;
            }

            /**
             * WhitePaths.
             */
            public Builder whitePaths(java.util.List < WhitePaths> whitePaths) {
                this.whitePaths = whitePaths;
                return this;
            }

            public UserProfilePathRule build() {
                return new UserProfilePathRule(this);
            } 

        } 

    }
}
