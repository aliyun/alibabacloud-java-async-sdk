// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProtectedBranchesResponseBody</p>
 */
public class ListProtectedBranchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListProtectedBranchesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectedBranchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProtectedBranchesResponseBody build() {
            return new ListProtectedBranchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class AllowMergeUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private AllowMergeUsers(Builder builder) {
            this.avatar = builder.avatar;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowMergeUsers create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatar; 
            private String email; 
            private Long id; 
            private String name; 
            private String username; 

            /**
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public AllowMergeUsers build() {
                return new AllowMergeUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class AllowPushUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private AllowPushUsers(Builder builder) {
            this.avatar = builder.avatar;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowPushUsers create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatar; 
            private String email; 
            private Long id; 
            private String name; 
            private String username; 

            /**
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public AllowPushUsers build() {
                return new AllowPushUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class DefaultAssignees extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private DefaultAssignees(Builder builder) {
            this.avatar = builder.avatar;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultAssignees create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatar; 
            private String email; 
            private Long id; 
            private String name; 
            private String username; 

            /**
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public DefaultAssignees build() {
                return new DefaultAssignees(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class MergeRequestSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowMergeRequestRoles")
        private java.util.List<Integer> allowMergeRequestRoles;

        @com.aliyun.core.annotation.NameInMap("defaultAssignees")
        private java.util.List<DefaultAssignees> defaultAssignees;

        @com.aliyun.core.annotation.NameInMap("isAllowSelfApproval")
        private Boolean isAllowSelfApproval;

        @com.aliyun.core.annotation.NameInMap("isRequireDiscussionProcessed")
        private Boolean isRequireDiscussionProcessed;

        @com.aliyun.core.annotation.NameInMap("isRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("isResetApprovalWhenNewPush")
        private Boolean isResetApprovalWhenNewPush;

        @com.aliyun.core.annotation.NameInMap("minimumApproval")
        private Integer minimumApproval;

        @com.aliyun.core.annotation.NameInMap("mrMode")
        private String mrMode;

        @com.aliyun.core.annotation.NameInMap("whiteList")
        private String whiteList;

        private MergeRequestSetting(Builder builder) {
            this.allowMergeRequestRoles = builder.allowMergeRequestRoles;
            this.defaultAssignees = builder.defaultAssignees;
            this.isAllowSelfApproval = builder.isAllowSelfApproval;
            this.isRequireDiscussionProcessed = builder.isRequireDiscussionProcessed;
            this.isRequired = builder.isRequired;
            this.isResetApprovalWhenNewPush = builder.isResetApprovalWhenNewPush;
            this.minimumApproval = builder.minimumApproval;
            this.mrMode = builder.mrMode;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeRequestSetting create() {
            return builder().build();
        }

        /**
         * @return allowMergeRequestRoles
         */
        public java.util.List<Integer> getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        /**
         * @return defaultAssignees
         */
        public java.util.List<DefaultAssignees> getDefaultAssignees() {
            return this.defaultAssignees;
        }

        /**
         * @return isAllowSelfApproval
         */
        public Boolean getIsAllowSelfApproval() {
            return this.isAllowSelfApproval;
        }

        /**
         * @return isRequireDiscussionProcessed
         */
        public Boolean getIsRequireDiscussionProcessed() {
            return this.isRequireDiscussionProcessed;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return isResetApprovalWhenNewPush
         */
        public Boolean getIsResetApprovalWhenNewPush() {
            return this.isResetApprovalWhenNewPush;
        }

        /**
         * @return minimumApproval
         */
        public Integer getMinimumApproval() {
            return this.minimumApproval;
        }

        /**
         * @return mrMode
         */
        public String getMrMode() {
            return this.mrMode;
        }

        /**
         * @return whiteList
         */
        public String getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private java.util.List<Integer> allowMergeRequestRoles; 
            private java.util.List<DefaultAssignees> defaultAssignees; 
            private Boolean isAllowSelfApproval; 
            private Boolean isRequireDiscussionProcessed; 
            private Boolean isRequired; 
            private Boolean isResetApprovalWhenNewPush; 
            private Integer minimumApproval; 
            private String mrMode; 
            private String whiteList; 

            /**
             * allowMergeRequestRoles.
             */
            public Builder allowMergeRequestRoles(java.util.List<Integer> allowMergeRequestRoles) {
                this.allowMergeRequestRoles = allowMergeRequestRoles;
                return this;
            }

            /**
             * defaultAssignees.
             */
            public Builder defaultAssignees(java.util.List<DefaultAssignees> defaultAssignees) {
                this.defaultAssignees = defaultAssignees;
                return this;
            }

            /**
             * isAllowSelfApproval.
             */
            public Builder isAllowSelfApproval(Boolean isAllowSelfApproval) {
                this.isAllowSelfApproval = isAllowSelfApproval;
                return this;
            }

            /**
             * isRequireDiscussionProcessed.
             */
            public Builder isRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
                this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
                return this;
            }

            /**
             * isRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * isResetApprovalWhenNewPush.
             */
            public Builder isResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
                this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
                return this;
            }

            /**
             * minimumApproval.
             */
            public Builder minimumApproval(Integer minimumApproval) {
                this.minimumApproval = minimumApproval;
                return this;
            }

            /**
             * mrMode.
             */
            public Builder mrMode(String mrMode) {
                this.mrMode = mrMode;
                return this;
            }

            /**
             * whiteList.
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public MergeRequestSetting build() {
                return new MergeRequestSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class CheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private CheckItems(Builder builder) {
            this.isRequired = builder.isRequired;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItems create() {
            return builder().build();
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean isRequired; 
            private String name; 

            /**
             * isRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CheckItems build() {
                return new CheckItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class CheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkItems")
        private java.util.List<CheckItems> checkItems;

        private CheckConfig(Builder builder) {
            this.checkItems = builder.checkItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckConfig create() {
            return builder().build();
        }

        /**
         * @return checkItems
         */
        public java.util.List<CheckItems> getCheckItems() {
            return this.checkItems;
        }

        public static final class Builder {
            private java.util.List<CheckItems> checkItems; 

            /**
             * checkItems.
             */
            public Builder checkItems(java.util.List<CheckItems> checkItems) {
                this.checkItems = checkItems;
                return this;
            }

            public CheckConfig build() {
                return new CheckConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class CheckTaskQualityConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizNo")
        private String bizNo;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        private CheckTaskQualityConfig(Builder builder) {
            this.bizNo = builder.bizNo;
            this.enabled = builder.enabled;
            this.message = builder.message;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckTaskQualityConfig create() {
            return builder().build();
        }

        /**
         * @return bizNo
         */
        public String getBizNo() {
            return this.bizNo;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String bizNo; 
            private Boolean enabled; 
            private String message; 
            private String taskName; 

            /**
             * bizNo.
             */
            public Builder bizNo(String bizNo) {
                this.bizNo = bizNo;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public CheckTaskQualityConfig build() {
                return new CheckTaskQualityConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class CodeGuidelinesDetection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private CodeGuidelinesDetection(Builder builder) {
            this.enabled = builder.enabled;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeGuidelinesDetection create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String message; 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public CodeGuidelinesDetection build() {
                return new CodeGuidelinesDetection(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class SensitiveInfoDetection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private SensitiveInfoDetection(Builder builder) {
            this.enabled = builder.enabled;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveInfoDetection create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String message; 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public SensitiveInfoDetection build() {
                return new SensitiveInfoDetection(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class TestSettingDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkConfig")
        private CheckConfig checkConfig;

        @com.aliyun.core.annotation.NameInMap("checkTaskQualityConfig")
        private CheckTaskQualityConfig checkTaskQualityConfig;

        @com.aliyun.core.annotation.NameInMap("codeGuidelinesDetection")
        private CodeGuidelinesDetection codeGuidelinesDetection;

        @com.aliyun.core.annotation.NameInMap("isRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("sensitiveInfoDetection")
        private SensitiveInfoDetection sensitiveInfoDetection;

        private TestSettingDTO(Builder builder) {
            this.checkConfig = builder.checkConfig;
            this.checkTaskQualityConfig = builder.checkTaskQualityConfig;
            this.codeGuidelinesDetection = builder.codeGuidelinesDetection;
            this.isRequired = builder.isRequired;
            this.sensitiveInfoDetection = builder.sensitiveInfoDetection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestSettingDTO create() {
            return builder().build();
        }

        /**
         * @return checkConfig
         */
        public CheckConfig getCheckConfig() {
            return this.checkConfig;
        }

        /**
         * @return checkTaskQualityConfig
         */
        public CheckTaskQualityConfig getCheckTaskQualityConfig() {
            return this.checkTaskQualityConfig;
        }

        /**
         * @return codeGuidelinesDetection
         */
        public CodeGuidelinesDetection getCodeGuidelinesDetection() {
            return this.codeGuidelinesDetection;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return sensitiveInfoDetection
         */
        public SensitiveInfoDetection getSensitiveInfoDetection() {
            return this.sensitiveInfoDetection;
        }

        public static final class Builder {
            private CheckConfig checkConfig; 
            private CheckTaskQualityConfig checkTaskQualityConfig; 
            private CodeGuidelinesDetection codeGuidelinesDetection; 
            private Boolean isRequired; 
            private SensitiveInfoDetection sensitiveInfoDetection; 

            /**
             * checkConfig.
             */
            public Builder checkConfig(CheckConfig checkConfig) {
                this.checkConfig = checkConfig;
                return this;
            }

            /**
             * checkTaskQualityConfig.
             */
            public Builder checkTaskQualityConfig(CheckTaskQualityConfig checkTaskQualityConfig) {
                this.checkTaskQualityConfig = checkTaskQualityConfig;
                return this;
            }

            /**
             * codeGuidelinesDetection.
             */
            public Builder codeGuidelinesDetection(CodeGuidelinesDetection codeGuidelinesDetection) {
                this.codeGuidelinesDetection = codeGuidelinesDetection;
                return this;
            }

            /**
             * isRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * sensitiveInfoDetection.
             */
            public Builder sensitiveInfoDetection(SensitiveInfoDetection sensitiveInfoDetection) {
                this.sensitiveInfoDetection = sensitiveInfoDetection;
                return this;
            }

            public TestSettingDTO build() {
                return new TestSettingDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectedBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedBranchesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowMergeRoles")
        private java.util.List<Integer> allowMergeRoles;

        @com.aliyun.core.annotation.NameInMap("allowMergeUserIds")
        private java.util.List<Long> allowMergeUserIds;

        @com.aliyun.core.annotation.NameInMap("allowMergeUsers")
        private java.util.List<AllowMergeUsers> allowMergeUsers;

        @com.aliyun.core.annotation.NameInMap("allowPushRoles")
        private java.util.List<Integer> allowPushRoles;

        @com.aliyun.core.annotation.NameInMap("allowPushUserIds")
        private java.util.List<Long> allowPushUserIds;

        @com.aliyun.core.annotation.NameInMap("allowPushUsers")
        private java.util.List<AllowPushUsers> allowPushUsers;

        @com.aliyun.core.annotation.NameInMap("branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("matches")
        private java.util.List<String> matches;

        @com.aliyun.core.annotation.NameInMap("mergeRequestSetting")
        private MergeRequestSetting mergeRequestSetting;

        @com.aliyun.core.annotation.NameInMap("testSettingDTO")
        private TestSettingDTO testSettingDTO;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Result(Builder builder) {
            this.allowMergeRoles = builder.allowMergeRoles;
            this.allowMergeUserIds = builder.allowMergeUserIds;
            this.allowMergeUsers = builder.allowMergeUsers;
            this.allowPushRoles = builder.allowPushRoles;
            this.allowPushUserIds = builder.allowPushUserIds;
            this.allowPushUsers = builder.allowPushUsers;
            this.branch = builder.branch;
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.matches = builder.matches;
            this.mergeRequestSetting = builder.mergeRequestSetting;
            this.testSettingDTO = builder.testSettingDTO;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return allowMergeRoles
         */
        public java.util.List<Integer> getAllowMergeRoles() {
            return this.allowMergeRoles;
        }

        /**
         * @return allowMergeUserIds
         */
        public java.util.List<Long> getAllowMergeUserIds() {
            return this.allowMergeUserIds;
        }

        /**
         * @return allowMergeUsers
         */
        public java.util.List<AllowMergeUsers> getAllowMergeUsers() {
            return this.allowMergeUsers;
        }

        /**
         * @return allowPushRoles
         */
        public java.util.List<Integer> getAllowPushRoles() {
            return this.allowPushRoles;
        }

        /**
         * @return allowPushUserIds
         */
        public java.util.List<Long> getAllowPushUserIds() {
            return this.allowPushUserIds;
        }

        /**
         * @return allowPushUsers
         */
        public java.util.List<AllowPushUsers> getAllowPushUsers() {
            return this.allowPushUsers;
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return matches
         */
        public java.util.List<String> getMatches() {
            return this.matches;
        }

        /**
         * @return mergeRequestSetting
         */
        public MergeRequestSetting getMergeRequestSetting() {
            return this.mergeRequestSetting;
        }

        /**
         * @return testSettingDTO
         */
        public TestSettingDTO getTestSettingDTO() {
            return this.testSettingDTO;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private java.util.List<Integer> allowMergeRoles; 
            private java.util.List<Long> allowMergeUserIds; 
            private java.util.List<AllowMergeUsers> allowMergeUsers; 
            private java.util.List<Integer> allowPushRoles; 
            private java.util.List<Long> allowPushUserIds; 
            private java.util.List<AllowPushUsers> allowPushUsers; 
            private String branch; 
            private String createdAt; 
            private Long id; 
            private java.util.List<String> matches; 
            private MergeRequestSetting mergeRequestSetting; 
            private TestSettingDTO testSettingDTO; 
            private String updatedAt; 

            /**
             * allowMergeRoles.
             */
            public Builder allowMergeRoles(java.util.List<Integer> allowMergeRoles) {
                this.allowMergeRoles = allowMergeRoles;
                return this;
            }

            /**
             * allowMergeUserIds.
             */
            public Builder allowMergeUserIds(java.util.List<Long> allowMergeUserIds) {
                this.allowMergeUserIds = allowMergeUserIds;
                return this;
            }

            /**
             * allowMergeUsers.
             */
            public Builder allowMergeUsers(java.util.List<AllowMergeUsers> allowMergeUsers) {
                this.allowMergeUsers = allowMergeUsers;
                return this;
            }

            /**
             * allowPushRoles.
             */
            public Builder allowPushRoles(java.util.List<Integer> allowPushRoles) {
                this.allowPushRoles = allowPushRoles;
                return this;
            }

            /**
             * allowPushUserIds.
             */
            public Builder allowPushUserIds(java.util.List<Long> allowPushUserIds) {
                this.allowPushUserIds = allowPushUserIds;
                return this;
            }

            /**
             * allowPushUsers.
             */
            public Builder allowPushUsers(java.util.List<AllowPushUsers> allowPushUsers) {
                this.allowPushUsers = allowPushUsers;
                return this;
            }

            /**
             * branch.
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * matches.
             */
            public Builder matches(java.util.List<String> matches) {
                this.matches = matches;
                return this;
            }

            /**
             * mergeRequestSetting.
             */
            public Builder mergeRequestSetting(MergeRequestSetting mergeRequestSetting) {
                this.mergeRequestSetting = mergeRequestSetting;
                return this;
            }

            /**
             * testSettingDTO.
             */
            public Builder testSettingDTO(TestSettingDTO testSettingDTO) {
                this.testSettingDTO = testSettingDTO;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
