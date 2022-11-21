// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProtectedBranchesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProtectedBranchesResponseBody</p>
 */
public class UpdateProtectedBranchesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    @NameInMap("success")
    private Boolean success;

    private UpdateProtectedBranchesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProtectedBranchesResponseBody create() {
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
    public Result getResult() {
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
        private Result result; 
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
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

        public UpdateProtectedBranchesResponseBody build() {
            return new UpdateProtectedBranchesResponseBody(this);
        } 

    } 

    public static class MergeRequestSetting extends TeaModel {
        @NameInMap("allowMergeRequestRoles")
        private java.util.List < Integer > allowMergeRequestRoles;

        @NameInMap("defaultAssignees")
        private java.util.List < String > defaultAssignees;

        @NameInMap("isAllowSelfApproval")
        private Boolean isAllowSelfApproval;

        @NameInMap("isRequireDiscussionProcessed")
        private Boolean isRequireDiscussionProcessed;

        @NameInMap("isRequired")
        private Boolean isRequired;

        @NameInMap("isResetApprovalWhenNewPush")
        private Boolean isResetApprovalWhenNewPush;

        @NameInMap("minimumApproval")
        private Integer minimumApproval;

        @NameInMap("mrMode")
        private String mrMode;

        @NameInMap("whiteList")
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
        public java.util.List < Integer > getAllowMergeRequestRoles() {
            return this.allowMergeRequestRoles;
        }

        /**
         * @return defaultAssignees
         */
        public java.util.List < String > getDefaultAssignees() {
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
            private java.util.List < Integer > allowMergeRequestRoles; 
            private java.util.List < String > defaultAssignees; 
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
            public Builder allowMergeRequestRoles(java.util.List < Integer > allowMergeRequestRoles) {
                this.allowMergeRequestRoles = allowMergeRequestRoles;
                return this;
            }

            /**
             * defaultAssignees.
             */
            public Builder defaultAssignees(java.util.List < String > defaultAssignees) {
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
    public static class CheckItems extends TeaModel {
        @NameInMap("isRequired")
        private Boolean isRequired;

        @NameInMap("name")
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
    public static class CheckConfig extends TeaModel {
        @NameInMap("checkItems")
        private java.util.List < CheckItems> checkItems;

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
        public java.util.List < CheckItems> getCheckItems() {
            return this.checkItems;
        }

        public static final class Builder {
            private java.util.List < CheckItems> checkItems; 

            /**
             * checkItems.
             */
            public Builder checkItems(java.util.List < CheckItems> checkItems) {
                this.checkItems = checkItems;
                return this;
            }

            public CheckConfig build() {
                return new CheckConfig(this);
            } 

        } 

    }
    public static class CheckTaskQualityConfig extends TeaModel {
        @NameInMap("bizNo")
        private String bizNo;

        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("message")
        private String message;

        @NameInMap("taskName")
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
    public static class CodeGuidelinesDetection extends TeaModel {
        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("message")
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
    public static class SensitiveInfoDetection extends TeaModel {
        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("message")
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
    public static class TestSettingDTO extends TeaModel {
        @NameInMap("checkConfig")
        private CheckConfig checkConfig;

        @NameInMap("checkTaskQualityConfig")
        private CheckTaskQualityConfig checkTaskQualityConfig;

        @NameInMap("codeGuidelinesDetection")
        private CodeGuidelinesDetection codeGuidelinesDetection;

        @NameInMap("isRequired")
        private Boolean isRequired;

        @NameInMap("sensitiveInfoDetection")
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
    public static class Result extends TeaModel {
        @NameInMap("allowMergeRoles")
        private java.util.List < Integer > allowMergeRoles;

        @NameInMap("allowMergeUserIds")
        private java.util.List < Long > allowMergeUserIds;

        @NameInMap("allowPushRoles")
        private java.util.List < Integer > allowPushRoles;

        @NameInMap("allowPushUserIds")
        private java.util.List < Long > allowPushUserIds;

        @NameInMap("branch")
        private String branch;

        @NameInMap("id")
        private Long id;

        @NameInMap("mergeRequestSetting")
        private MergeRequestSetting mergeRequestSetting;

        @NameInMap("testSettingDTO")
        private TestSettingDTO testSettingDTO;

        private Result(Builder builder) {
            this.allowMergeRoles = builder.allowMergeRoles;
            this.allowMergeUserIds = builder.allowMergeUserIds;
            this.allowPushRoles = builder.allowPushRoles;
            this.allowPushUserIds = builder.allowPushUserIds;
            this.branch = builder.branch;
            this.id = builder.id;
            this.mergeRequestSetting = builder.mergeRequestSetting;
            this.testSettingDTO = builder.testSettingDTO;
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
        public java.util.List < Integer > getAllowMergeRoles() {
            return this.allowMergeRoles;
        }

        /**
         * @return allowMergeUserIds
         */
        public java.util.List < Long > getAllowMergeUserIds() {
            return this.allowMergeUserIds;
        }

        /**
         * @return allowPushRoles
         */
        public java.util.List < Integer > getAllowPushRoles() {
            return this.allowPushRoles;
        }

        /**
         * @return allowPushUserIds
         */
        public java.util.List < Long > getAllowPushUserIds() {
            return this.allowPushUserIds;
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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

        public static final class Builder {
            private java.util.List < Integer > allowMergeRoles; 
            private java.util.List < Long > allowMergeUserIds; 
            private java.util.List < Integer > allowPushRoles; 
            private java.util.List < Long > allowPushUserIds; 
            private String branch; 
            private Long id; 
            private MergeRequestSetting mergeRequestSetting; 
            private TestSettingDTO testSettingDTO; 

            /**
             * allowMergeRoles.
             */
            public Builder allowMergeRoles(java.util.List < Integer > allowMergeRoles) {
                this.allowMergeRoles = allowMergeRoles;
                return this;
            }

            /**
             * allowMergeUserIds.
             */
            public Builder allowMergeUserIds(java.util.List < Long > allowMergeUserIds) {
                this.allowMergeUserIds = allowMergeUserIds;
                return this;
            }

            /**
             * allowPushRoles.
             */
            public Builder allowPushRoles(java.util.List < Integer > allowPushRoles) {
                this.allowPushRoles = allowPushRoles;
                return this;
            }

            /**
             * allowPushUserIds.
             */
            public Builder allowPushUserIds(java.util.List < Long > allowPushUserIds) {
                this.allowPushUserIds = allowPushUserIds;
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
