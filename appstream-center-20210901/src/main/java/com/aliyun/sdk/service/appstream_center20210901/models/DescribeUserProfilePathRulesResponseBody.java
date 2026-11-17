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
 * {@link DescribeUserProfilePathRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserProfilePathRulesResponseBody</p>
 */
public class DescribeUserProfilePathRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserProfilePathRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserProfilePathRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserProfilePathRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.RuleType</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The path rules and user profile roaming configurations.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter RuleType is invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

            private Builder() {
            } 

            private Builder(BlackPath model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The excluded path relative to the user profile directory.</p>
             * 
             * <strong>example:</strong>
             * <p>AppData\Local</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The path type. Valid values:</p>
             * <ul>
             * <li><code>file</code>: File.</li>
             * <li><code>folder</code>: Folder.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>folder</p>
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

            private Builder() {
            } 

            private Builder(WhitePaths model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The exception path relative to BlackPath.Path.</p>
             * 
             * <strong>example:</strong>
             * <p>.\Microsoft\Office</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The path type. Valid values:</p>
             * <ul>
             * <li><code>file</code>: File.</li>
             * <li><code>folder</code>: Folder.</li>
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
        private java.util.List<WhitePaths> whitePaths;

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
        public java.util.List<WhitePaths> getWhitePaths() {
            return this.whitePaths;
        }

        public static final class Builder {
            private BlackPath blackPath; 
            private java.util.List<WhitePaths> whitePaths; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.blackPath = model.blackPath;
                this.whitePaths = model.whitePaths;
            } 

            /**
             * <p>The file or directory excluded from user profile roaming.</p>
             */
            public Builder blackPath(BlackPath blackPath) {
                this.blackPath = blackPath;
                return this;
            }

            /**
             * <p>The list of files or directories that still participate in user profile roaming under the excluded directories.</p>
             */
            public Builder whitePaths(java.util.List<WhitePaths> whitePaths) {
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupSetId")
        private String appInstanceGroupSetId;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("ProfileFollowSwitch")
        private Boolean profileFollowSwitch;

        @com.aliyun.core.annotation.NameInMap("RemoteStoragePath")
        private String remoteStoragePath;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("UserProfileSize")
        private Long userProfileSize;

        @com.aliyun.core.annotation.NameInMap("UserProfileSwitch")
        private Boolean userProfileSwitch;

        private Data(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupSetId = builder.appInstanceGroupSetId;
            this.domainId = builder.domainId;
            this.fileSystemId = builder.fileSystemId;
            this.profileFollowSwitch = builder.profileFollowSwitch;
            this.remoteStoragePath = builder.remoteStoragePath;
            this.ruleType = builder.ruleType;
            this.rules = builder.rules;
            this.userProfileSize = builder.userProfileSize;
            this.userProfileSwitch = builder.userProfileSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return profileFollowSwitch
         */
        public Boolean getProfileFollowSwitch() {
            return this.profileFollowSwitch;
        }

        /**
         * @return remoteStoragePath
         */
        public String getRemoteStoragePath() {
            return this.remoteStoragePath;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return userProfileSize
         */
        public Long getUserProfileSize() {
            return this.userProfileSize;
        }

        /**
         * @return userProfileSwitch
         */
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceGroupSetId; 
            private String domainId; 
            private String fileSystemId; 
            private Boolean profileFollowSwitch; 
            private String remoteStoragePath; 
            private String ruleType; 
            private java.util.List<Rules> rules; 
            private Long userProfileSize; 
            private Boolean userProfileSwitch; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupSetId = model.appInstanceGroupSetId;
                this.domainId = model.domainId;
                this.fileSystemId = model.fileSystemId;
                this.profileFollowSwitch = model.profileFollowSwitch;
                this.remoteStoragePath = model.remoteStoragePath;
                this.ruleType = model.ruleType;
                this.rules = model.rules;
                this.userProfileSize = model.userProfileSize;
                this.userProfileSwitch = model.userProfileSwitch;
            } 

            /**
             * <p>The app instance group ID corresponding to the rule. When querying set rules, this is the primary app instance group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-0bi83v****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The app instance group set ID corresponding to the rule. This is returned when querying set rules.</p>
             * 
             * <strong>example:</strong>
             * <p>set-3jm9d0abc00example</p>
             */
            public Builder appInstanceGroupSetId(String appInstanceGroupSetId) {
                this.appInstanceGroupSetId = appInstanceGroupSetId;
                return this;
            }

            /**
             * <p>The user profile roaming storage domain ID bound to the app instance group. This field may be omitted if no domain is bound.</p>
             * 
             * <strong>example:</strong>
             * <p>domain-existing</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>Not enabled. The current query result does not provide the file system ID. The example is used to illustrate the field status.</p>
             * 
             * <strong>example:</strong>
             * <p>Not applicable (not enabled)</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The user profile roaming switch. A value of <code>true</code> indicates that the feature is enabled, and a value of <code>false</code> indicates that the feature is disabled.</p>
             */
            public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
                this.profileFollowSwitch = profileFollowSwitch;
                return this;
            }

            /**
             * <p>The remote storage path for user profile roaming. If this path is not separately configured for the app instance group, the app instance group ID is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-0bi83v****</p>
             */
            public Builder remoteStoragePath(String remoteStoragePath) {
                this.remoteStoragePath = remoteStoragePath;
                return this;
            }

            /**
             * <p>The path rule type. Valid values:</p>
             * <ul>
             * <li><code>Default</code>: Queries system default rules. Both target IDs can be omitted.</li>
             * <li><code>AppInstanceGroup</code>: Queries the rules of an app instance group or an app instance group set.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AppInstanceGroup</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The list of user profile roaming path rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The storage quota for user profile roaming, in GB. This field may be omitted if it is not configured.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder userProfileSize(Long userProfileSize) {
                this.userProfileSize = userProfileSize;
                return this;
            }

            /**
             * <p>The user profile roaming switch. The value is the same as ProfileFollowSwitch. A value of <code>true</code> indicates that the feature is enabled, and a value of <code>false</code> indicates that the feature is disabled.</p>
             */
            public Builder userProfileSwitch(Boolean userProfileSwitch) {
                this.userProfileSwitch = userProfileSwitch;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
