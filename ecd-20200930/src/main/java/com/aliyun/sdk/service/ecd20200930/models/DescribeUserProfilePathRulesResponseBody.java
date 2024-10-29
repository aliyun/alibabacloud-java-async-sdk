// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserProfilePathRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserProfilePathRulesResponseBody</p>
 */
public class DescribeUserProfilePathRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserProfilePathRule")
    private UserProfilePathRule userProfilePathRule;

    private DescribeUserProfilePathRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProfilePathRule = builder.userProfilePathRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserProfilePathRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userProfilePathRule
     */
    public UserProfilePathRule getUserProfilePathRule() {
        return this.userProfilePathRule;
    }

    public static final class Builder {
        private String requestId; 
        private UserProfilePathRule userProfilePathRule; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A87DBB05-653A-5E4B-B72B-5F4A1E07****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The directory blacklist and whitelist.</p>
         */
        public Builder userProfilePathRule(UserProfilePathRule userProfilePathRule) {
            this.userProfilePathRule = userProfilePathRule;
            return this;
        }

        public DescribeUserProfilePathRulesResponseBody build() {
            return new DescribeUserProfilePathRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserProfilePathRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserProfilePathRulesResponseBody</p>
     */
    public static class BlackPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>AppLocal/Data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The path type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>file</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>folder</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
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
    /**
     * 
     * {@link DescribeUserProfilePathRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserProfilePathRulesResponseBody</p>
     */
    public static class WhitePaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>games</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The path type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>file</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>folder</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>folder</p>
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
    /**
     * 
     * {@link DescribeUserProfilePathRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserProfilePathRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackPath")
        private BlackPath blackPath;

        @com.aliyun.core.annotation.NameInMap("WhitePaths")
        private java.util.List < WhitePaths> whitePaths;

        private Rules(Builder builder) {
            this.blackPath = builder.blackPath;
            this.whitePaths = builder.whitePaths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
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
             * <p>The blacklist that is configured.</p>
             */
            public Builder blackPath(BlackPath blackPath) {
                this.blackPath = blackPath;
                return this;
            }

            /**
             * <p>The directories in the whitelist.</p>
             */
            public Builder whitePaths(java.util.List < WhitePaths> whitePaths) {
                this.whitePaths = whitePaths;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserProfilePathRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserProfilePathRulesResponseBody</p>
     */
    public static class UserProfilePathRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        @com.aliyun.core.annotation.NameInMap("UserProfileRuleType")
        private String userProfileRuleType;

        private UserProfilePathRule(Builder builder) {
            this.desktopGroupId = builder.desktopGroupId;
            this.rules = builder.rules;
            this.userProfileRuleType = builder.userProfileRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfilePathRule create() {
            return builder().build();
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        /**
         * @return userProfileRuleType
         */
        public String getUserProfileRuleType() {
            return this.userProfileRuleType;
        }

        public static final class Builder {
            private String desktopGroupId; 
            private java.util.List < Rules> rules; 
            private String userProfileRuleType; 

            /**
             * <p>The desktop group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-4i8fvpv6tfs03****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The directory rules.</p>
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The directory type that is configured for the directory.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>DesktopGroup</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Default</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder userProfileRuleType(String userProfileRuleType) {
                this.userProfileRuleType = userProfileRuleType;
                return this;
            }

            public UserProfilePathRule build() {
                return new UserProfilePathRule(this);
            } 

        } 

    }
}
